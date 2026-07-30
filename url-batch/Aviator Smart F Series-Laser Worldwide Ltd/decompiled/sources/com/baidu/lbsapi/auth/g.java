package com.baidu.lbsapi.auth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.HttpManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private Context f4330a;

    /* renamed from: e, reason: collision with root package name */
    private String f4334e;

    /* renamed from: g, reason: collision with root package name */
    private String f4336g;

    /* renamed from: h, reason: collision with root package name */
    private String f4337h;

    /* renamed from: b, reason: collision with root package name */
    private String f4331b = null;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, String> f4332c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f4333d = null;

    /* renamed from: f, reason: collision with root package name */
    private int f4335f = -1;

    class a extends Authenticator {
        a() {
        }

        @Override // java.net.Authenticator
        protected PasswordAuthentication getPasswordAuthentication() {
            if (!TextUtils.isEmpty(g.this.f4336g) && !TextUtils.isEmpty(g.this.f4337h)) {
                return new PasswordAuthentication(g.this.f4336g, g.this.f4337h.toCharArray());
            }
            com.baidu.lbsapi.auth.b.a("Proxy Username or Password is null");
            return null;
        }
    }

    class b implements HostnameVerifier {
        b() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            if ("api.map.baidu.com".equals(str)) {
                return true;
            }
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
        }
    }

    public g(Context context) {
        this.f4330a = context;
    }

    private String a(Context context) {
        Network activeNetwork;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                activeNetwork = connectivityManager.getActiveNetwork();
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities != null) {
                    return networkCapabilities.hasTransport(1) ? "WIFI" : networkCapabilities.hasTransport(0) ? "CELLULAR" : networkCapabilities.hasTransport(3) ? "ETHERNET" : networkCapabilities.hasTransport(6) ? "LoWPAN" : networkCapabilities.hasTransport(4) ? "VPN" : networkCapabilities.hasTransport(5) ? "WifiAware" : "wifi";
                }
                return "wifi";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                String extraInfo = activeNetworkInfo.getExtraInfo();
                return (extraInfo == null || !(extraInfo.trim().toLowerCase().equals("cmwap") || extraInfo.trim().toLowerCase().equals("uniwap") || extraInfo.trim().toLowerCase().equals("3gwap") || extraInfo.trim().toLowerCase().equals("ctwap"))) ? "wifi" : extraInfo.trim().toLowerCase().equals("ctwap") ? "ctwap" : "cmwap";
            }
            return null;
        } catch (Exception e8) {
            if (com.baidu.lbsapi.auth.b.f4311a) {
                e8.printStackTrace();
            }
            return null;
        }
    }

    private static String b(HashMap<String, String> hashMap) {
        StringBuilder sb = new StringBuilder();
        boolean z7 = true;
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (z7) {
                z7 = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode(entry.getKey(), cn.hutool.core.util.l.UTF_8));
            sb.append("=");
            sb.append(URLEncoder.encode(entry.getValue(), cn.hutool.core.util.l.UTF_8));
        }
        return sb.toString();
    }

    private HttpsURLConnection b() {
        String str;
        URLConnection openConnection;
        try {
            URL url = new URL(this.f4331b);
            com.baidu.lbsapi.auth.b.a("https URL: " + this.f4331b);
            String a8 = a(this.f4330a);
            if (a8 != null && !a8.equals("")) {
                if (TextUtils.isEmpty(this.f4334e) || this.f4335f == -1) {
                    com.baidu.lbsapi.auth.b.a("checkNetwork = " + a8);
                    openConnection = url.openConnection();
                } else {
                    com.baidu.lbsapi.auth.b.a("Proxy mProxyHost: = " + this.f4334e + " mProxyPort: " + this.f4335f);
                    Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(this.f4334e, this.f4335f));
                    Authenticator.setDefault(new a());
                    openConnection = url.openConnection(proxy);
                }
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setHostnameVerifier(new b());
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setRequestMethod(HttpManager.HTTP_POST);
                httpsURLConnection.setConnectTimeout(50000);
                httpsURLConnection.setReadTimeout(50000);
                return httpsURLConnection;
            }
            com.baidu.lbsapi.auth.b.b("Current network is not available.");
            this.f4333d = ErrorMessage.a(-10, "Current network is not available.");
            return null;
        } catch (MalformedURLException e8) {
            if (com.baidu.lbsapi.auth.b.f4311a) {
                e8.printStackTrace();
                com.baidu.lbsapi.auth.b.a(e8.getMessage());
            }
            str = "Auth server could not be parsed as a URL.";
            this.f4333d = ErrorMessage.a(-11, str);
            return null;
        } catch (Exception e9) {
            if (com.baidu.lbsapi.auth.b.f4311a) {
                e9.printStackTrace();
                com.baidu.lbsapi.auth.b.a(e9.getMessage());
            }
            str = "Init httpsurlconnection failed.";
            this.f4333d = ErrorMessage.a(-11, str);
            return null;
        }
    }

    protected String a(HashMap<String, String> hashMap, String str, int i8, String str2, String str3) {
        HashMap<String, String> a8 = a(hashMap);
        this.f4332c = a8;
        this.f4331b = a8.get("url");
        this.f4334e = str;
        this.f4335f = i8;
        this.f4336g = str2;
        this.f4337h = str3;
        HttpsURLConnection b8 = b();
        if (b8 == null) {
            com.baidu.lbsapi.auth.b.b("syncConnect failed,httpsURLConnection is null");
        } else {
            a(b8);
        }
        return this.f4333d;
    }

    private HashMap<String, String> a(HashMap<String, String> hashMap) {
        HashMap<String, String> hashMap2 = new HashMap<>();
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String str = it.next().toString();
            hashMap2.put(str, hashMap.get(str));
        }
        return hashMap2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b8, code lost:
    
        if (com.baidu.lbsapi.auth.b.f4311a == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0188, code lost:
    
        if (com.baidu.lbsapi.auth.b.f4311a == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x015a, code lost:
    
        if (com.baidu.lbsapi.auth.b.f4311a == false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0163 A[Catch: all -> 0x012a, TryCatch #8 {all -> 0x012a, blocks: (B:8:0x002e, B:123:0x012f, B:125:0x0133, B:126:0x0136, B:110:0x015f, B:112:0x0163, B:113:0x0166, B:97:0x018d, B:99:0x0191, B:100:0x0194), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0133 A[Catch: all -> 0x012a, TryCatch #8 {all -> 0x012a, blocks: (B:8:0x002e, B:123:0x012f, B:125:0x0133, B:126:0x0136, B:110:0x015f, B:112:0x0163, B:113:0x0166, B:97:0x018d, B:99:0x0191, B:100:0x0194), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd A[Catch: all -> 0x008b, TryCatch #9 {all -> 0x008b, blocks: (B:43:0x0061, B:57:0x00b9, B:59:0x00bd, B:60:0x00d8), top: B:9:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0191 A[Catch: all -> 0x012a, TryCatch #8 {all -> 0x012a, blocks: (B:8:0x002e, B:123:0x012f, B:125:0x0133, B:126:0x0136, B:110:0x015f, B:112:0x0163, B:113:0x0166, B:97:0x018d, B:99:0x0191, B:100:0x0194), top: B:7:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(HttpsURLConnection httpsURLConnection) {
        int i8;
        InputStream inputStream;
        boolean z7;
        BufferedReader bufferedReader;
        com.baidu.lbsapi.auth.b.a("https Post start,url:" + this.f4331b);
        if (this.f4332c == null) {
            this.f4333d = ErrorMessage.a("httpsPost request paramters is null.");
            return;
        }
        OutputStream outputStream = null;
        r4 = null;
        BufferedReader bufferedReader2 = null;
        BufferedReader bufferedReader3 = null;
        r4 = null;
        BufferedReader bufferedReader4 = null;
        OutputStream outputStream2 = null;
        OutputStream outputStream3 = null;
        OutputStream outputStream4 = null;
        boolean z8 = false;
        try {
            try {
                OutputStream outputStream5 = httpsURLConnection.getOutputStream();
                try {
                    try {
                        try {
                            try {
                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream5, cn.hutool.core.util.l.UTF_8));
                                bufferedWriter.write(b(this.f4332c));
                                com.baidu.lbsapi.auth.b.a(b(this.f4332c));
                                bufferedWriter.flush();
                                bufferedWriter.close();
                                httpsURLConnection.connect();
                                try {
                                    inputStream = httpsURLConnection.getInputStream();
                                } catch (IOException e8) {
                                    e = e8;
                                    inputStream = null;
                                } catch (Throwable th) {
                                    th = th;
                                    inputStream = null;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                                i8 = httpsURLConnection.getResponseCode();
                                if (200 == i8) {
                                    try {
                                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream, cn.hutool.core.util.l.UTF_8));
                                    } catch (IOException e9) {
                                        e = e9;
                                    }
                                    try {
                                        StringBuffer stringBuffer = new StringBuffer();
                                        while (true) {
                                            int read = bufferedReader.read();
                                            if (read == -1) {
                                                break;
                                            } else {
                                                stringBuffer.append((char) read);
                                            }
                                        }
                                        this.f4333d = stringBuffer.toString();
                                        bufferedReader2 = bufferedReader;
                                    } catch (IOException e10) {
                                        e = e10;
                                        bufferedReader3 = bufferedReader;
                                        if (com.baidu.lbsapi.auth.b.f4311a) {
                                        }
                                        this.f4333d = ErrorMessage.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                                        if (inputStream != null) {
                                            bufferedReader3.close();
                                            inputStream.close();
                                        }
                                        z7 = false;
                                        httpsURLConnection.disconnect();
                                        if (outputStream5 != null) {
                                        }
                                        z8 = z7;
                                        if (z8) {
                                        }
                                        if (this.f4333d != null) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bufferedReader4 = bufferedReader;
                                        if (inputStream != null) {
                                            bufferedReader4.close();
                                            inputStream.close();
                                        }
                                        httpsURLConnection.disconnect();
                                        throw th;
                                    }
                                }
                                if (inputStream != null && bufferedReader2 != null) {
                                    bufferedReader2.close();
                                    inputStream.close();
                                }
                                z7 = true;
                            } catch (IOException e11) {
                                e = e11;
                                i8 = -1;
                                if (com.baidu.lbsapi.auth.b.f4311a) {
                                    e.printStackTrace();
                                    com.baidu.lbsapi.auth.b.a("httpsPost parse failed;" + e.getMessage());
                                }
                                this.f4333d = ErrorMessage.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                                if (inputStream != null && bufferedReader3 != null) {
                                    bufferedReader3.close();
                                    inputStream.close();
                                }
                                z7 = false;
                                httpsURLConnection.disconnect();
                                if (outputStream5 != null) {
                                }
                                z8 = z7;
                                if (z8) {
                                }
                                if (this.f4333d != null) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                if (inputStream != null && bufferedReader4 != null) {
                                    bufferedReader4.close();
                                    inputStream.close();
                                }
                                httpsURLConnection.disconnect();
                                throw th;
                            }
                            httpsURLConnection.disconnect();
                            if (outputStream5 != null) {
                                try {
                                    outputStream5.close();
                                } catch (IOException e12) {
                                    e = e12;
                                    if (com.baidu.lbsapi.auth.b.f4311a) {
                                        z8 = z7;
                                        e.printStackTrace();
                                        if (z8) {
                                        }
                                        if (this.f4333d != null) {
                                        }
                                    }
                                }
                            }
                            z8 = z7;
                        } catch (Throwable th5) {
                            th = th5;
                            outputStream2 = outputStream5;
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (IOException e13) {
                                    if (com.baidu.lbsapi.auth.b.f4311a) {
                                        e13.printStackTrace();
                                    }
                                }
                            }
                            throw th;
                        }
                    } catch (MalformedURLException e14) {
                        e = e14;
                        outputStream3 = outputStream5;
                        if (com.baidu.lbsapi.auth.b.f4311a) {
                            e.printStackTrace();
                        }
                        this.f4333d = ErrorMessage.a(-11, "httpsPost failed,MalformedURLException:" + e.getMessage());
                        if (outputStream3 != null) {
                            try {
                                outputStream3.close();
                            } catch (IOException e15) {
                                e = e15;
                            }
                        }
                        if (z8) {
                        }
                        if (this.f4333d != null) {
                        }
                    } catch (IOException e16) {
                        e = e16;
                        outputStream4 = outputStream5;
                        if (com.baidu.lbsapi.auth.b.f4311a) {
                            e.printStackTrace();
                        }
                        this.f4333d = ErrorMessage.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                        if (outputStream4 != null) {
                            try {
                                outputStream4.close();
                            } catch (IOException e17) {
                                e = e17;
                            }
                        }
                        if (z8) {
                        }
                        if (this.f4333d != null) {
                        }
                    } catch (Exception e18) {
                        e = e18;
                        outputStream = outputStream5;
                        if (com.baidu.lbsapi.auth.b.f4311a) {
                            e.printStackTrace();
                        }
                        this.f4333d = ErrorMessage.a(-11, "httpsPost failed,Exception:" + e.getMessage());
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e19) {
                                e = e19;
                            }
                        }
                        if (z8) {
                        }
                        if (this.f4333d != null) {
                        }
                    }
                } catch (MalformedURLException e20) {
                    e = e20;
                    outputStream3 = outputStream5;
                    i8 = -1;
                    if (com.baidu.lbsapi.auth.b.f4311a) {
                    }
                    this.f4333d = ErrorMessage.a(-11, "httpsPost failed,MalformedURLException:" + e.getMessage());
                    if (outputStream3 != null) {
                    }
                    if (z8) {
                    }
                    if (this.f4333d != null) {
                    }
                } catch (IOException e21) {
                    e = e21;
                    outputStream4 = outputStream5;
                    i8 = -1;
                    if (com.baidu.lbsapi.auth.b.f4311a) {
                    }
                    this.f4333d = ErrorMessage.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                    if (outputStream4 != null) {
                    }
                    if (z8) {
                    }
                    if (this.f4333d != null) {
                    }
                } catch (Exception e22) {
                    e = e22;
                    outputStream = outputStream5;
                    i8 = -1;
                    if (com.baidu.lbsapi.auth.b.f4311a) {
                    }
                    this.f4333d = ErrorMessage.a(-11, "httpsPost failed,Exception:" + e.getMessage());
                    if (outputStream != null) {
                    }
                    if (z8) {
                    }
                    if (this.f4333d != null) {
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (MalformedURLException e23) {
            e = e23;
        } catch (IOException e24) {
            e = e24;
        } catch (Exception e25) {
            e = e25;
        }
        if (z8 || 200 == i8) {
            if (this.f4333d != null) {
                com.baidu.lbsapi.auth.b.a("httpsPost failed,mResult is null");
                this.f4333d = ErrorMessage.a(-1, "httpsPost failed,internal error");
                return;
            } else {
                com.baidu.lbsapi.auth.b.a("httpsPost success end,parse result = " + this.f4333d);
                return;
            }
        }
        com.baidu.lbsapi.auth.b.a("httpsPost failed,statusCode:" + i8);
        this.f4333d = ErrorMessage.a(-11, "httpsPost failed,statusCode:" + i8);
    }

    protected boolean a() {
        Network activeNetwork;
        com.baidu.lbsapi.auth.b.a("checkNetwork start");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f4330a.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                activeNetwork = connectivityManager.getActiveNetwork();
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                return networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            com.baidu.lbsapi.auth.b.a("checkNetwork end");
            return true;
        } catch (Exception e8) {
            if (com.baidu.lbsapi.auth.b.f4311a) {
                e8.printStackTrace();
            }
            return false;
        }
    }
}
