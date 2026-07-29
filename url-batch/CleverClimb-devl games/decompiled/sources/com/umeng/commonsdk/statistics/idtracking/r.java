package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* compiled from: UUIDTracker.java */
/* loaded from: classes2.dex */
public class r extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9198a = "uuid";
    private static final String e = "yosuid";
    private static final String f = "23346339";

    /* renamed from: b, reason: collision with root package name */
    private Context f9199b;

    /* renamed from: c, reason: collision with root package name */
    private String f9200c;

    /* renamed from: d, reason: collision with root package name */
    private String f9201d;

    public r(Context context) {
        super(f9198a);
        this.f9199b = null;
        this.f9200c = null;
        this.f9201d = null;
        this.f9199b = context;
        this.f9200c = null;
        this.f9201d = null;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        try {
            if (TextUtils.isEmpty(a("ro.yunos.version", "")) || this.f9199b == null || (sharedPreferences = PreferenceWrapper.getDefault(this.f9199b)) == null) {
                return null;
            }
            String string = sharedPreferences.getString(e, "");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            this.f9201d = b(f);
            if (!TextUtils.isEmpty(this.f9201d) && this.f9199b != null && sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
                edit.putString(e, this.f9201d).commit();
            }
            return this.f9201d;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:15|16|17|18|19|(13:38|39|41|42|43|44|(2:45|(1:47)(1:48))|49|50|22|23|(2:32|33)|(2:28|29))|21|22|23|(0)|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f2, code lost:
    
        if (r0 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0121, code lost:
    
        r0.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x011f, code lost:
    
        if (r0 == null) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String b(String str) {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream;
        Throwable th;
        HttpsURLConnection httpsURLConnection2;
        InputStream inputStream2;
        ?? r3;
        InputStream inputStream3;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        this.f9201d = a("ro.yunos.openuuid", "");
        if (!TextUtils.isEmpty(this.f9201d)) {
            return this.f9201d;
        }
        this.f9200c = a("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(this.f9200c)) {
            this.f9200c = a("ro.sys.aliyun.clouduuid", "");
        }
        if (!TextUtils.isEmpty(this.f9200c)) {
            DataOutputStream dataOutputStream = null;
            InputStream inputStream4 = null;
            r7 = null;
            dataOutputStream = null;
            DataOutputStream dataOutputStream2 = null;
            try {
                httpsURLConnection2 = (HttpsURLConnection) new URL("https://cmnsguider.yunos.com:443/genDeviceToken").openConnection();
                try {
                    httpsURLConnection2.setConnectTimeout(30000);
                    httpsURLConnection2.setReadTimeout(30000);
                    httpsURLConnection2.setRequestMethod("POST");
                    httpsURLConnection2.setDoInput(true);
                    httpsURLConnection2.setDoOutput(true);
                    httpsURLConnection2.setUseCaches(false);
                    httpsURLConnection2.setRequestProperty(Constants.KEY_CONTENT_TYPE, "application/x-www-form-urlencoded");
                    httpsURLConnection2.setHostnameVerifier(new HostnameVerifier() { // from class: com.umeng.commonsdk.statistics.idtracking.r.1
                        @Override // javax.net.ssl.HostnameVerifier
                        public boolean verify(String str2, SSLSession sSLSession) {
                            return new org.apache.a.c.d.c().verify("cmnsguider.yunos.com", sSLSession);
                        }
                    });
                    String str2 = "appKey=" + URLEncoder.encode("23338940", "UTF-8") + "&uuid=" + URLEncoder.encode("FC1FE84794417B1BEF276234F6FB4E63", "UTF-8");
                    DataOutputStream dataOutputStream3 = new DataOutputStream(httpsURLConnection2.getOutputStream());
                    try {
                        try {
                            dataOutputStream3.writeBytes(str2);
                            dataOutputStream3.flush();
                            if (httpsURLConnection2.getResponseCode() == 200) {
                                try {
                                    InputStream inputStream5 = httpsURLConnection2.getInputStream();
                                    try {
                                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream5));
                                        try {
                                            StringBuffer stringBuffer = new StringBuffer();
                                            while (true) {
                                                String readLine = bufferedReader.readLine();
                                                if (readLine == null) {
                                                    break;
                                                }
                                                stringBuffer.append(readLine);
                                            }
                                            this.f9201d = stringBuffer.toString();
                                        } catch (Exception unused) {
                                        } catch (Throwable th2) {
                                            th = th2;
                                            dataOutputStream = dataOutputStream3;
                                            httpsURLConnection = httpsURLConnection2;
                                            inputStream2 = inputStream5;
                                            r3 = bufferedReader;
                                            if (dataOutputStream != null) {
                                            }
                                            if (r3 != 0) {
                                            }
                                            if (inputStream2 != null) {
                                            }
                                            if (httpsURLConnection != null) {
                                            }
                                        }
                                    } catch (Exception unused2) {
                                        bufferedReader = null;
                                    } catch (Throwable th3) {
                                        r3 = 0;
                                        dataOutputStream = dataOutputStream3;
                                        httpsURLConnection = httpsURLConnection2;
                                        inputStream2 = inputStream5;
                                        th = th3;
                                    }
                                    inputStream4 = inputStream5;
                                    bufferedReader2 = bufferedReader;
                                } catch (Exception unused3) {
                                }
                                dataOutputStream3.close();
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (Exception unused4) {
                                    }
                                }
                                if (inputStream4 != null) {
                                    try {
                                        inputStream4.close();
                                    } catch (Exception unused5) {
                                    }
                                }
                            }
                            bufferedReader2 = null;
                            dataOutputStream3.close();
                            if (bufferedReader2 != null) {
                            }
                            if (inputStream4 != null) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream3 = null;
                            dataOutputStream = dataOutputStream3;
                            httpsURLConnection = httpsURLConnection2;
                            inputStream = inputStream3;
                            inputStream2 = inputStream;
                            r3 = inputStream;
                            if (dataOutputStream != null) {
                                try {
                                    dataOutputStream.close();
                                } catch (Exception unused6) {
                                }
                            }
                            if (r3 != 0) {
                                try {
                                    r3.close();
                                } catch (Exception unused7) {
                                }
                            }
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Exception unused8) {
                                }
                            }
                            if (httpsURLConnection != null) {
                                throw th;
                            }
                            httpsURLConnection.disconnect();
                            throw th;
                        }
                    } catch (Exception unused9) {
                        dataOutputStream2 = dataOutputStream3;
                        if (dataOutputStream2 != null) {
                            try {
                                dataOutputStream2.close();
                            } catch (Exception unused10) {
                            }
                        }
                    }
                } catch (Exception unused11) {
                } catch (Throwable th5) {
                    th = th5;
                    inputStream3 = null;
                }
            } catch (Exception unused12) {
                httpsURLConnection2 = null;
            } catch (Throwable th6) {
                httpsURLConnection = null;
                inputStream = null;
                th = th6;
            }
        }
        return this.f9201d;
    }

    public static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }
}
