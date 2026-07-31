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

/* loaded from: classes3.dex */
public final class AFf1lSDK extends AFe1dSDK<AFf1kSDK> {
    private final AFf1fSDK AFLogger;
    private final AFf1cSDK afInfoLog;
    public AFf1kSDK d;
    public final AFf1jSDK e;
    private final AFf1gSDK force;
    private final String i;
    private final AFd1pSDK registerClient;
    public AFh1jSDK unregisterClient;
    private final AFe1wSDK v;
    private final AFg1xSDK w;

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean AFKeystoreWrapper() {
        return false;
    }

    public AFf1lSDK(AFf1fSDK aFf1fSDK, AFd1pSDK aFd1pSDK, AFg1xSDK aFg1xSDK, AFf1cSDK aFf1cSDK, AFe1wSDK aFe1wSDK, AFf1gSDK aFf1gSDK, String str, AFf1jSDK aFf1jSDK) {
        super(AFe1eSDK.RC_CDN, new AFe1eSDK[0], "UpdateRemoteConfiguration");
        this.d = null;
        this.AFLogger = aFf1fSDK;
        this.registerClient = aFd1pSDK;
        this.w = aFg1xSDK;
        this.afInfoLog = aFf1cSDK;
        this.v = aFe1wSDK;
        this.force = aFf1gSDK;
        this.i = str;
        this.e = aFf1jSDK;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK values() throws Exception {
        try {
            AFf1kSDK unregisterClient = unregisterClient();
            this.d = unregisterClient;
            if (unregisterClient == AFf1kSDK.FAILURE) {
                return AFe1bSDK.FAILURE;
            }
            return AFe1bSDK.SUCCESS;
        } catch (SocketTimeoutException unused) {
            this.d = AFf1kSDK.FAILURE;
            return AFe1bSDK.TIMEOUT;
        } catch (InterruptedIOException | InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.d = AFf1kSDK.FAILURE;
            return AFe1bSDK.TIMEOUT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFf1kSDK unregisterClient() throws InterruptedException, InterruptedIOException {
        String str;
        AFh1qSDK aFh1qSDK;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.i;
        String str3 = this.w.unregisterClient;
        if (str3 == null || str3.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFg1jSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else if (str2 == null) {
            AFLogger.INSTANCE.w(AFg1jSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
        } else {
            str = AFb1lSDK.AFInAppEventParameterName(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str2, this.registerClient.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName()}), str3);
            if (str != null) {
                AFLogger.INSTANCE.v(AFg1jSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1kSDK.FAILURE;
            }
            try {
                if (this.force.AFInAppEventParameterName()) {
                    AFLogger.INSTANCE.i(AFg1jSDK.REMOTE_CONTROL, "Cached config is expired, updating...");
                    AFe1pSDK<AFh1oSDK> AFInAppEventType = this.v.AFInAppEventType(this.force.values(), this.force.AFKeystoreWrapper(), str, 1500).AFInAppEventType();
                    if (AFInAppEventType.isSuccessful()) {
                        AFh1oSDK body = AFInAppEventType.getBody();
                        String valueOf = AFInAppEventType.valueOf("x-amz-meta-af-auth-v1");
                        String valueOf2 = AFInAppEventType.valueOf("X-Af-Date");
                        String valueOf3 = AFInAppEventType.valueOf("CF-Cache-Status");
                        String str4 = this.w.unregisterClient;
                        boolean AFInAppEventParameterName = new AFf1dSDK().AFInAppEventParameterName(valueOf2);
                        if (str4 != null && str4.trim().length() != 0) {
                            AFh1nSDK AFInAppEventType2 = this.AFLogger.AFInAppEventType(body, valueOf, str, str4);
                            if (AFInAppEventType2.AFInAppEventType()) {
                                if (!AFInAppEventParameterName && (aFh1qSDK = body.AFInAppEventParameterName) != null) {
                                    aFh1qSDK.values = null;
                                }
                                long AFInAppEventType3 = this.force.AFInAppEventType();
                                AFLogger.INSTANCE.v(AFg1jSDK.REMOTE_CONTROL, new StringBuilder("using max-age fallback: ").append(AFInAppEventType3).append(" seconds").toString());
                                long currentTimeMillis2 = System.currentTimeMillis();
                                AFf1cSDK aFf1cSDK = this.afInfoLog;
                                aFf1cSDK.AFInAppEventParameterName.valueOf("af_remote_config", Base64.encodeToString(body.AFInAppEventType.getBytes(Charset.defaultCharset()), 2));
                                aFf1cSDK.AFKeystoreWrapper = aFf1cSDK.valueOf;
                                aFf1cSDK.AFInAppEventParameterName.AFInAppEventParameterName("af_rc_timestamp", currentTimeMillis2);
                                aFf1cSDK.AFInAppEventParameterName.AFInAppEventParameterName("af_rc_max_age", AFInAppEventType3);
                                aFf1cSDK.valueOf = body;
                                aFf1cSDK.AFInAppEventType = currentTimeMillis2;
                                aFf1cSDK.values = AFInAppEventType3;
                                AFLogger.INSTANCE.d(AFg1jSDK.REMOTE_CONTROL, new StringBuilder("Config successfully updated, timeToLive: ").append(AFInAppEventType3).append(" seconds").toString());
                                AFInAppEventType(str, currentTimeMillis, AFInAppEventType2.values, valueOf3, AFInAppEventType);
                                return AFf1kSDK.SUCCESS;
                            }
                            AFInAppEventType(str, currentTimeMillis, AFInAppEventType2.values, valueOf3, AFInAppEventType);
                            AFLogger.INSTANCE.w(AFg1jSDK.REMOTE_CONTROL, "fetched config is not valid (MITM?) refuse to use it.");
                            return AFf1kSDK.FAILURE;
                        }
                        AFLogger.INSTANCE.w(AFg1jSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
                        return AFf1kSDK.FAILURE;
                    }
                    AFInAppEventType(str, currentTimeMillis, null, null, AFInAppEventType);
                    AFLogger.INSTANCE.w(AFg1jSDK.REMOTE_CONTROL, new StringBuilder("failed to fetch remote config from CDN with status code: ").append(AFInAppEventType.getStatusCode()).toString());
                    return AFf1kSDK.FAILURE;
                }
                AFLogger.INSTANCE.d(AFg1jSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                return AFf1kSDK.USE_CACHED;
            } catch (IOException e) {
                AFLogger.INSTANCE.e(AFg1jSDK.REMOTE_CONTROL, new StringBuilder("failed to fetch remote config: ").append(e.getMessage()).toString(), e, true, false, false);
                values(str, currentTimeMillis, e instanceof ParsingException ? ((ParsingException) e).getRawResponse() : null, null, null, null, e);
                if (e.getCause() instanceof InterruptedIOException) {
                    throw ((InterruptedIOException) e.getCause());
                }
                return AFf1kSDK.FAILURE;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1jSDK.REMOTE_CONTROL, new StringBuilder("failed to update remote config: ").append(th.getMessage()).toString(), th, true, false, false);
                values(str, currentTimeMillis, null, null, null, null, th);
                if (th.getCause() instanceof InterruptedException) {
                    throw ((InterruptedException) th.getCause());
                }
                return AFf1kSDK.FAILURE;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    private void AFInAppEventType(String str, long j, AFh1kSDK aFh1kSDK, String str2, AFe1pSDK<AFh1oSDK> aFe1pSDK) {
        values(str, j, aFe1pSDK, aFe1pSDK != null ? aFe1pSDK.getBody() : null, aFh1kSDK, str2 != null ? str2 : null, null);
    }

    private void values(String str, long j, AFe1pSDK<?> aFe1pSDK, AFh1oSDK aFh1oSDK, AFh1kSDK aFh1kSDK, String str2, Throwable th) {
        long j2;
        int i;
        Throwable th2;
        if (aFe1pSDK != null) {
            j2 = aFe1pSDK.AFInAppEventType.AFInAppEventType;
            i = aFe1pSDK.getStatusCode();
        } else {
            j2 = 0;
            i = 0;
        }
        int i2 = i;
        if (th instanceof HttpException) {
            Throwable cause = th.getCause();
            j2 = ((HttpException) th).getMetrics().AFInAppEventType;
            th2 = cause;
        } else {
            th2 = th;
        }
        this.unregisterClient = new AFh1jSDK(aFh1oSDK != null ? aFh1oSDK.valueOf : null, str, j2, System.currentTimeMillis() - j, i2, aFh1kSDK, str2, th2);
    }
}
