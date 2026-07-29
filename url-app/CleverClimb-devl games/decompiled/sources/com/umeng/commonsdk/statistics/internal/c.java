package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;

/* compiled from: NetworkHelper.java */
/* loaded from: classes2.dex */
public class c {
    private static boolean e;

    /* renamed from: a, reason: collision with root package name */
    private String f9208a = "10.0.0.172";

    /* renamed from: b, reason: collision with root package name */
    private int f9209b = 80;

    /* renamed from: c, reason: collision with root package name */
    private Context f9210c;

    /* renamed from: d, reason: collision with root package name */
    private b f9211d;

    public c(Context context) {
        this.f9210c = context;
    }

    public void a(b bVar) {
        this.f9211d = bVar;
    }

    private void a() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f9210c, "domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f9210c, "domain_s", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(imprintProperty2);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
    }

    private void b() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f9210c, "domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f9210c, "domain_s", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(imprintProperty2);
        }
        String imprintProperty3 = UMEnvelopeBuild.imprintProperty(this.f9210c, "oversea_domain_p", "");
        String imprintProperty4 = UMEnvelopeBuild.imprintProperty(this.f9210c, "oversea_domain_s", "");
        if (!TextUtils.isEmpty(imprintProperty3)) {
            UMServerURL.OVERSEA_DEFAULT_URL = DataHelper.assembleURL(imprintProperty3);
        }
        if (!TextUtils.isEmpty(imprintProperty4)) {
            UMServerURL.OVERSEA_SECONDARY_URL = DataHelper.assembleURL(imprintProperty4);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.OVERSEA_DEFAULT_URL, UMServerURL.OVERSEA_SECONDARY_URL};
        if (TextUtils.isEmpty(com.umeng.commonsdk.statistics.b.f9128b)) {
            return;
        }
        if (com.umeng.commonsdk.statistics.b.f9128b.startsWith("460") || com.umeng.commonsdk.statistics.b.f9128b.startsWith("461")) {
            AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
        }
    }

    public byte[] a(byte[] bArr, boolean z) {
        if (SdkVersion.SDK_TYPE == 0) {
            a();
        } else {
            UMServerURL.DEFAULT_URL = UMServerURL.OVERSEA_DEFAULT_URL;
            UMServerURL.SECONDARY_URL = UMServerURL.OVERSEA_SECONDARY_URL;
            b();
        }
        int i = 0;
        byte[] bArr2 = null;
        while (true) {
            if (i >= AnalyticsConstants.APPLOG_URL_LIST.length) {
                break;
            }
            bArr2 = a(bArr, AnalyticsConstants.APPLOG_URL_LIST[i]);
            if (bArr2 != null) {
                if (this.f9211d != null) {
                    this.f9211d.onRequestSucceed(z);
                }
            } else {
                if (this.f9211d != null) {
                    this.f9211d.onRequestFailed();
                }
                i++;
            }
        }
        return bArr2;
    }

    private boolean c() {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        if (this.f9210c.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f9210c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f9210c.getSystemService("connectivity");
            if (DeviceConfig.checkPermission(this.f9210c, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 1 && (extraInfo = activeNetworkInfo.getExtraInfo()) != null) {
                if (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap")) {
                    if (extraInfo.equals("uniwap")) {
                    }
                }
                return true;
            }
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(this.f9210c, th);
        }
        return false;
    }

    public byte[] a(byte[] bArr, String str) {
        HttpsURLConnection httpsURLConnection;
        OutputStream outputStream;
        OutputStream outputStream2;
        try {
            try {
                if (this.f9211d != null) {
                    this.f9211d.onRequestStart();
                }
                if (c()) {
                    httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.f9208a, this.f9209b)));
                } else {
                    httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (!e) {
                    HttpsURLConnection.setDefaultHostnameVerifier(org.apache.a.c.d.d.STRICT_HOSTNAME_VERIFIER);
                    SSLContext sSLContext = SSLContext.getInstance(org.apache.a.c.d.d.TLS);
                    sSLContext.init(null, null, new SecureRandom());
                    HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
                    e = true;
                }
                httpsURLConnection.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                httpsURLConnection.setRequestProperty("X-Umeng-Sdk", a.a(this.f9210c).b());
                httpsURLConnection.setRequestProperty(Constants.KEY_CONTENT_TYPE, a.a(this.f9210c).a());
                httpsURLConnection.setRequestProperty("Msg-Type", "envelope/json");
                httpsURLConnection.setConnectTimeout(30000);
                httpsURLConnection.setReadTimeout(30000);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setDoInput(true);
                boolean z = false;
                httpsURLConnection.setUseCaches(false);
                outputStream = httpsURLConnection.getOutputStream();
                try {
                    outputStream.write(bArr);
                    outputStream.flush();
                    httpsURLConnection.connect();
                    if (this.f9211d != null) {
                        this.f9211d.onRequestEnd();
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    String headerField = httpsURLConnection.getHeaderField(Constants.KEY_CONTENT_TYPE);
                    if (!TextUtils.isEmpty(headerField) && headerField.equalsIgnoreCase("application/thrift")) {
                        z = true;
                    }
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.i("status code : " + responseCode + "; isThrifit:" + z);
                    }
                    if (responseCode != 200 || !z) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e2) {
                                com.umeng.commonsdk.proguard.b.a(this.f9210c, e2);
                            }
                        }
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused) {
                            }
                            httpsURLConnection.disconnect();
                        }
                        return null;
                    }
                    MLog.i("Send message to server. status code is: " + responseCode);
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "Send message to server. status code is: " + responseCode + "; url = " + str);
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    try {
                        byte[] readStreamToByteArray = HelperUtils.readStreamToByteArray(inputStream);
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e3) {
                                com.umeng.commonsdk.proguard.b.a(this.f9210c, e3);
                            }
                        }
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused2) {
                            }
                            httpsURLConnection.disconnect();
                        }
                        return readStreamToByteArray;
                    } finally {
                        HelperUtils.safeClose(inputStream);
                    }
                } catch (UnknownHostException unused3) {
                    MLog.i("发送数据时发生java.net.UnknownHostException异常，导致友盟后端域名解析失败。请检查系统DNS服务器配置是否正确。详见链接 https://lark.alipay.com/yj131525/byt0wl/ufnf3i#A10200");
                    UMConfigure.umDebugLog.aq("A_10200", 2, "\\|");
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Exception e4) {
                            com.umeng.commonsdk.proguard.b.a(this.f9210c, e4);
                        }
                    }
                    if (httpsURLConnection != null) {
                        try {
                            httpsURLConnection.getInputStream().close();
                        } catch (IOException unused4) {
                        }
                        httpsURLConnection.disconnect();
                    }
                    return null;
                } catch (SSLHandshakeException unused5) {
                    MLog.i("发送数据时发生javax.net.sslHandshakeException异常，导致友盟后端对设备端证书验证失败。请确保设备端没有运行抓包代理类程序。详见链接 https://lark.alipay.com/yj131525/byt0wl/ufnf3i#A10200");
                    UMConfigure.umDebugLog.aq("A_10201", 2, "\\|");
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Exception e5) {
                            com.umeng.commonsdk.proguard.b.a(this.f9210c, e5);
                        }
                    }
                    if (httpsURLConnection != null) {
                        try {
                            httpsURLConnection.getInputStream().close();
                        } catch (IOException unused6) {
                        }
                        httpsURLConnection.disconnect();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    com.umeng.commonsdk.proguard.b.a(this.f9210c, th);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Exception e6) {
                            com.umeng.commonsdk.proguard.b.a(this.f9210c, e6);
                        }
                    }
                    if (httpsURLConnection != null) {
                        try {
                            httpsURLConnection.getInputStream().close();
                        } catch (IOException unused7) {
                        }
                        httpsURLConnection.disconnect();
                    }
                    return null;
                }
            } catch (UnknownHostException unused8) {
                outputStream = null;
            } catch (SSLHandshakeException unused9) {
                outputStream = null;
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
            }
        } catch (UnknownHostException unused10) {
            httpsURLConnection = null;
            outputStream = null;
        } catch (SSLHandshakeException unused11) {
            httpsURLConnection = null;
            outputStream = null;
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
            outputStream = null;
        }
    }
}
