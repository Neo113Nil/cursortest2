package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;

/* compiled from: UMSLNetWorkSenderHelper.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private String f9117a = "10.0.0.172";

    /* renamed from: b, reason: collision with root package name */
    private int f9118b = 80;

    /* renamed from: c, reason: collision with root package name */
    private Context f9119c;

    public e(Context context) {
        this.f9119c = context;
    }

    private void a() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f9119c, "sl_domain_p", "");
        if (TextUtils.isEmpty(imprintProperty)) {
            return;
        }
        a.g = DataHelper.assembleStatelessURL(imprintProperty);
    }

    private void b() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f9119c, "sl_domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f9119c, "oversea_sl_domain_p", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            a.f = DataHelper.assembleStatelessURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            a.h = DataHelper.assembleStatelessURL(imprintProperty2);
        }
        a.g = a.h;
        if (TextUtils.isEmpty(com.umeng.commonsdk.statistics.b.f9128b)) {
            return;
        }
        if (com.umeng.commonsdk.statistics.b.f9128b.startsWith("460") || com.umeng.commonsdk.statistics.b.f9128b.startsWith("461")) {
            a.g = a.f;
        }
    }

    private boolean c() {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        if (this.f9119c == null || this.f9119c.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f9119c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f9119c.getSystemService("connectivity");
            if (DeviceConfig.checkPermission(this.f9119c, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 1 && (extraInfo = activeNetworkInfo.getExtraInfo()) != null) {
                if (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap")) {
                    if (extraInfo.equals("uniwap")) {
                    }
                }
                return true;
            }
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(this.f9119c, th);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v19 */
    public boolean a(byte[] bArr, String str) {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream;
        OutputStream outputStream;
        ?? r2;
        boolean z = false;
        if (bArr == null || str == null) {
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] sendMessage, envelopeByte == null || path == null ");
            return false;
        }
        if (SdkVersion.SDK_TYPE == 0) {
            a();
        } else {
            a.f = a.h;
            b();
        }
        OutputStream outputStream2 = null;
        r2 = null;
        r2 = null;
        OutputStream outputStream3 = null;
        outputStream2 = null;
        OutputStream outputStream4 = null;
        try {
            try {
                try {
                    if (c()) {
                        httpsURLConnection = (HttpsURLConnection) new URL(a.g + "/" + str).openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.f9117a, this.f9118b)));
                    } else {
                        httpsURLConnection = (HttpsURLConnection) new URL(a.g + "/" + str).openConnection();
                    }
                    try {
                        HttpsURLConnection.setDefaultHostnameVerifier(org.apache.a.c.d.d.STRICT_HOSTNAME_VERIFIER);
                        SSLContext sSLContext = SSLContext.getInstance(org.apache.a.c.d.d.TLS);
                        sSLContext.init(null, null, new SecureRandom());
                        HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
                        httpsURLConnection.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                        httpsURLConnection.setRequestProperty("Msg-Type", "envelope/json");
                        httpsURLConnection.setConnectTimeout(30000);
                        httpsURLConnection.setReadTimeout(30000);
                        httpsURLConnection.setRequestMethod("POST");
                        httpsURLConnection.setDoOutput(true);
                        httpsURLConnection.setDoInput(true);
                        httpsURLConnection.setUseCaches(false);
                        outputStream = httpsURLConnection.getOutputStream();
                    } catch (SSLHandshakeException e) {
                        e = e;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException unused) {
                }
            } catch (SSLHandshakeException e2) {
                e = e2;
                httpsURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                httpsURLConnection = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            outputStream.write(bArr);
            outputStream.flush();
            httpsURLConnection.connect();
            r2 = 200;
            if (httpsURLConnection.getResponseCode() == 200) {
                StringBuilder sb = new StringBuilder();
                sb.append("--->>> send stateless message success : ");
                sb.append(a.g);
                sb.append("/");
                sb.append(str);
                UMRTLog.i(UMRTLog.RTLOG_TAG, sb.toString());
                z = true;
                r2 = sb;
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
        } catch (SSLHandshakeException e3) {
            e = e3;
            outputStream3 = outputStream;
            MLog.e("SSLHandshakeException, Failed to send message.", e);
            if (outputStream3 != null) {
                try {
                    outputStream3.close();
                } catch (Exception unused3) {
                }
            }
            if (httpsURLConnection != null) {
                inputStream = httpsURLConnection.getInputStream();
                outputStream2 = outputStream3;
                inputStream.close();
                httpsURLConnection.disconnect();
            }
            return z;
        } catch (Throwable th4) {
            th = th4;
            outputStream4 = outputStream;
            MLog.e("Exception,Failed to send message.", th);
            com.umeng.commonsdk.proguard.b.a(this.f9119c, th);
            if (outputStream4 != null) {
                try {
                    outputStream4.close();
                } catch (Exception unused4) {
                }
            }
            if (httpsURLConnection != null) {
                inputStream = httpsURLConnection.getInputStream();
                outputStream2 = outputStream4;
                inputStream.close();
                httpsURLConnection.disconnect();
            }
            return z;
        }
        if (httpsURLConnection != null) {
            inputStream = httpsURLConnection.getInputStream();
            outputStream2 = r2;
            inputStream.close();
            httpsURLConnection.disconnect();
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        if (r9 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        r9.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        if (r9 == 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.net.HttpURLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(byte[] bArr, String str) {
        OutputStream outputStream;
        if (bArr == null || str == 0) {
            return false;
        }
        OutputStream outputStream2 = null;
        try {
            try {
                if (c()) {
                    str = (HttpURLConnection) new URL(a.g + "/" + ((String) str)).openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.f9117a, this.f9118b)));
                } else {
                    str = (HttpURLConnection) new URL(a.g + "/" + ((String) str)).openConnection();
                }
                try {
                    str.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                    str.setRequestProperty("Msg-Type", "envelope/json");
                    str.setConnectTimeout(30000);
                    str.setReadTimeout(30000);
                    str.setRequestMethod("POST");
                    str.setDoOutput(true);
                    str.setDoInput(true);
                    str.setUseCaches(false);
                    outputStream = str.getOutputStream();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            str = 0;
        }
        try {
            outputStream.write(bArr);
            outputStream.flush();
            str.connect();
            r0 = str.getResponseCode() == 200;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream2 = outputStream;
            if (outputStream2 != null) {
                try {
                    outputStream2.close();
                } catch (Exception unused2) {
                }
            }
            if (str == 0) {
                throw th;
            }
            str.disconnect();
            throw th;
        }
    }
}
