package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class AFf1fSDK extends AFe1dSDK<AFf1gSDK> {
    public AFh1aSDK AFLogger;
    private final AFg1wSDK afInfoLog;

    /* renamed from: d, reason: collision with root package name */
    public AFf1gSDK f5895d;

    /* renamed from: e, reason: collision with root package name */
    private final AFg1ySDK f5896e;
    private final AFg1zSDK force;

    /* renamed from: i, reason: collision with root package name */
    private final AFg1xSDK f5897i;
    public final AFf1eSDK registerClient;
    private final AFd1sSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private final String f5898v;

    /* renamed from: w, reason: collision with root package name */
    private final AFe1ySDK f5899w;

    public AFf1fSDK(AFg1ySDK aFg1ySDK, AFd1sSDK aFd1sSDK, AFg1wSDK aFg1wSDK, AFg1xSDK aFg1xSDK, AFe1ySDK aFe1ySDK, AFg1zSDK aFg1zSDK, String str, AFf1eSDK aFf1eSDK) {
        super(AFf1zSDK.RC_CDN, new AFf1zSDK[0], "UpdateRemoteConfiguration");
        this.f5895d = null;
        this.f5896e = aFg1ySDK;
        this.unregisterClient = aFd1sSDK;
        this.afInfoLog = aFg1wSDK;
        this.f5897i = aFg1xSDK;
        this.f5899w = aFe1ySDK;
        this.force = aFg1zSDK;
        this.f5898v = str;
        this.registerClient = aFf1eSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFf1gSDK registerClient() {
        String str;
        String str2;
        String str3;
        AFh1gSDK aFh1gSDK;
        long currentTimeMillis = System.currentTimeMillis();
        String str4 = this.f5898v;
        String str5 = this.afInfoLog.AFLogger;
        if (str5 == null || str5.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFg1aSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else if (str4 == null) {
            AFLogger.INSTANCE.w(AFg1aSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
        } else {
            str = AFb1lSDK.AFKeystoreWrapper(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str4, this.unregisterClient.valueOf.AFKeystoreWrapper.getPackageName()}), str5);
            if (str != null) {
                AFLogger.INSTANCE.v(AFg1aSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1gSDK.FAILURE;
            }
            try {
                try {
                    if (!this.force.AFInAppEventParameterName()) {
                        AFLogger.INSTANCE.d(AFg1aSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                        return AFf1gSDK.USE_CACHED;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1aSDK aFg1aSDK = AFg1aSDK.REMOTE_CONTROL;
                    aFLogger.i(aFg1aSDK, "Cached config is expired, updating...");
                    AFe1jSDK<AFi1zSDK> AFInAppEventType = this.f5899w.AFInAppEventType(this.force.values(), this.force.AFKeystoreWrapper(), str, 1500).AFInAppEventType();
                    if (!AFInAppEventType.isSuccessful()) {
                        AFInAppEventParameterName(str, currentTimeMillis, null, null, AFInAppEventType);
                        StringBuilder sb = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                        sb.append(AFInAppEventType.getStatusCode());
                        aFLogger.w(aFg1aSDK, sb.toString());
                        return AFf1gSDK.FAILURE;
                    }
                    AFi1zSDK body = AFInAppEventType.getBody();
                    String AFInAppEventParameterName = AFInAppEventType.AFInAppEventParameterName("x-amz-meta-af-auth-v1");
                    String AFInAppEventParameterName2 = AFInAppEventType.AFInAppEventParameterName("X-Af-Date");
                    String AFInAppEventParameterName3 = AFInAppEventType.AFInAppEventParameterName("CF-Cache-Status");
                    String str6 = this.afInfoLog.AFLogger;
                    boolean AFKeystoreWrapper = new AFf1aSDK().AFKeystoreWrapper(AFInAppEventParameterName2);
                    if (str6 == null || str6.trim().length() == 0) {
                        aFLogger.w(aFg1aSDK, "Dev key is not set, SDK is not started.");
                        return AFf1gSDK.FAILURE;
                    }
                    AFh1dSDK valueOf = this.f5896e.valueOf(body, AFInAppEventParameterName, str, str6);
                    if (!valueOf.AFInAppEventParameterName()) {
                        AFInAppEventParameterName(str, currentTimeMillis, valueOf.valueOf, AFInAppEventParameterName3, AFInAppEventType);
                        aFLogger.w(aFg1aSDK, "fetched config is not valid (MITM?) refuse to use it.");
                        return AFf1gSDK.FAILURE;
                    }
                    if (!AFKeystoreWrapper && (aFh1gSDK = body.AFInAppEventParameterName) != null) {
                        aFh1gSDK.AFInAppEventType = null;
                    }
                    long AFInAppEventType2 = this.force.AFInAppEventType();
                    StringBuilder sb2 = new StringBuilder("using max-age fallback: ");
                    sb2.append(AFInAppEventType2);
                    sb2.append(" seconds");
                    aFLogger.v(aFg1aSDK, sb2.toString());
                    String str7 = str;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    AFg1xSDK aFg1xSDK = this.f5897i;
                    aFg1xSDK.AFKeystoreWrapper.AFInAppEventParameterName("af_remote_config", Base64.encodeToString(body.values.getBytes(Charset.defaultCharset()), 2));
                    aFg1xSDK.values = aFg1xSDK.valueOf;
                    aFg1xSDK.AFKeystoreWrapper.AFKeystoreWrapper("af_rc_timestamp", currentTimeMillis2);
                    aFg1xSDK.AFKeystoreWrapper.AFKeystoreWrapper("af_rc_max_age", AFInAppEventType2);
                    aFg1xSDK.valueOf = body;
                    aFg1xSDK.AFInAppEventType = currentTimeMillis2;
                    aFg1xSDK.AFInAppEventParameterName = AFInAppEventType2;
                    StringBuilder sb3 = new StringBuilder("Config successfully updated, timeToLive: ");
                    sb3.append(AFInAppEventType2);
                    sb3.append(" seconds");
                    aFLogger.d(aFg1aSDK, sb3.toString());
                    AFInAppEventParameterName(str7, currentTimeMillis, valueOf.valueOf, AFInAppEventParameterName3, AFInAppEventType);
                    return AFf1gSDK.SUCCESS;
                } catch (IOException e4) {
                    e = e4;
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1aSDK aFg1aSDK2 = AFg1aSDK.REMOTE_CONTROL;
                    StringBuilder sb4 = new StringBuilder("failed to fetch remote config: ");
                    sb4.append(e.getMessage());
                    aFLogger2.e(aFg1aSDK2, sb4.toString(), e, true, false, false);
                    AFInAppEventParameterName(str3, currentTimeMillis, e instanceof ParsingException ? ((ParsingException) e).getRawResponse() : null, null, null, null, e);
                    if (e.getCause() instanceof InterruptedIOException) {
                        throw ((InterruptedIOException) e.getCause());
                    }
                    return AFf1gSDK.FAILURE;
                } catch (Throwable th) {
                    th = th;
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFg1aSDK aFg1aSDK3 = AFg1aSDK.REMOTE_CONTROL;
                    StringBuilder sb5 = new StringBuilder("failed to update remote config: ");
                    sb5.append(th.getMessage());
                    aFLogger3.e(aFg1aSDK3, sb5.toString(), th, true, false, false);
                    AFInAppEventParameterName(str2, currentTimeMillis, null, null, null, null, th);
                    if (th.getCause() instanceof InterruptedException) {
                        throw ((InterruptedException) th.getCause());
                    }
                    return AFf1gSDK.FAILURE;
                }
            } catch (IOException e5) {
                e = e5;
                str3 = str;
            } catch (Throwable th2) {
                th = th2;
                str2 = str;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        try {
            AFf1gSDK registerClient = registerClient();
            this.f5895d = registerClient;
            return registerClient == AFf1gSDK.FAILURE ? AFe1bSDK.FAILURE : AFe1bSDK.SUCCESS;
        } catch (InterruptedException e4) {
            e = e4;
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.f5895d = AFf1gSDK.FAILURE;
            return AFe1bSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.f5895d = AFf1gSDK.FAILURE;
            return AFe1bSDK.TIMEOUT;
        } catch (InterruptedIOException e5) {
            e = e5;
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.f5895d = AFf1gSDK.FAILURE;
            return AFe1bSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    private void AFInAppEventParameterName(String str, long j4, AFh1bSDK aFh1bSDK, String str2, AFe1jSDK<AFi1zSDK> aFe1jSDK) {
        AFInAppEventParameterName(str, j4, aFe1jSDK, aFe1jSDK != null ? aFe1jSDK.getBody() : null, aFh1bSDK, str2 != null ? str2 : null, null);
    }

    private void AFInAppEventParameterName(String str, long j4, AFe1jSDK<?> aFe1jSDK, AFi1zSDK aFi1zSDK, AFh1bSDK aFh1bSDK, String str2, Throwable th) {
        long j5;
        int i2;
        Throwable th2;
        long j6;
        if (aFe1jSDK != null) {
            j5 = aFe1jSDK.AFInAppEventParameterName.AFKeystoreWrapper;
            i2 = aFe1jSDK.getStatusCode();
        } else {
            j5 = 0;
            i2 = 0;
        }
        int i4 = i2;
        if (th instanceof HttpException) {
            th2 = th.getCause();
            j6 = ((HttpException) th).getMetrics().AFKeystoreWrapper;
        } else {
            th2 = th;
            j6 = j5;
        }
        this.AFLogger = new AFh1aSDK(aFi1zSDK != null ? aFi1zSDK.AFKeystoreWrapper : null, str, j6, System.currentTimeMillis() - j4, i4, aFh1bSDK, str2, th2);
    }
}
