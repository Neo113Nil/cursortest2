package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class AFf1fSDK extends AFe1dSDK<AFf1gSDK> {
    public AFh1aSDK AFLogger;
    private final AFg1wSDK afInfoLog;
    public AFf1gSDK d;
    private final AFg1ySDK e;
    private final AFg1zSDK force;
    private final AFg1xSDK i;
    public final AFf1eSDK registerClient;
    private final AFd1sSDK unregisterClient;
    private final String v;
    private final AFe1ySDK w;

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    public AFf1fSDK(AFg1ySDK aFg1ySDK, AFd1sSDK aFd1sSDK, AFg1wSDK aFg1wSDK, AFg1xSDK aFg1xSDK, AFe1ySDK aFe1ySDK, AFg1zSDK aFg1zSDK, String str, AFf1eSDK aFf1eSDK) {
        super(AFf1zSDK.RC_CDN, new AFf1zSDK[0], "UpdateRemoteConfiguration");
        this.d = null;
        this.e = aFg1ySDK;
        this.unregisterClient = aFd1sSDK;
        this.afInfoLog = aFg1wSDK;
        this.i = aFg1xSDK;
        this.w = aFe1ySDK;
        this.force = aFg1zSDK;
        this.v = str;
        this.registerClient = aFf1eSDK;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() throws Exception {
        try {
            AFf1gSDK registerClient = registerClient();
            this.d = registerClient;
            if (registerClient == AFf1gSDK.FAILURE) {
                return AFe1bSDK.FAILURE;
            }
            return AFe1bSDK.SUCCESS;
        } catch (InterruptedException e) {
            e = e;
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.d = AFf1gSDK.FAILURE;
            return AFe1bSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.d = AFf1gSDK.FAILURE;
            return AFe1bSDK.TIMEOUT;
        } catch (InterruptedIOException e2) {
            e = e2;
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.d = AFf1gSDK.FAILURE;
            return AFe1bSDK.TIMEOUT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFf1gSDK registerClient() throws InterruptedException, InterruptedIOException {
        String str;
        AFh1gSDK aFh1gSDK;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.v;
        String str3 = this.afInfoLog.AFLogger;
        if (str3 == null || str3.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFg1aSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else if (str2 == null) {
            AFLogger.INSTANCE.w(AFg1aSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
        } else {
            str = AFb1lSDK.AFKeystoreWrapper(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str2, this.unregisterClient.valueOf.AFKeystoreWrapper.getPackageName()}), str3);
            if (str != null) {
                AFLogger.INSTANCE.v(AFg1aSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1gSDK.FAILURE;
            }
            try {
                if (this.force.AFInAppEventParameterName()) {
                    AFLogger.INSTANCE.i(AFg1aSDK.REMOTE_CONTROL, "Cached config is expired, updating...");
                    AFe1jSDK<AFi1zSDK> AFInAppEventType = this.w.AFInAppEventType(this.force.values(), this.force.AFKeystoreWrapper(), str, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).AFInAppEventType();
                    if (AFInAppEventType.isSuccessful()) {
                        AFi1zSDK body = AFInAppEventType.getBody();
                        String AFInAppEventParameterName = AFInAppEventType.AFInAppEventParameterName("x-amz-meta-af-auth-v1");
                        String AFInAppEventParameterName2 = AFInAppEventType.AFInAppEventParameterName("X-Af-Date");
                        String AFInAppEventParameterName3 = AFInAppEventType.AFInAppEventParameterName("CF-Cache-Status");
                        String str4 = this.afInfoLog.AFLogger;
                        boolean AFKeystoreWrapper = new AFf1aSDK().AFKeystoreWrapper(AFInAppEventParameterName2);
                        if (str4 != null && str4.trim().length() != 0) {
                            AFh1dSDK valueOf = this.e.valueOf(body, AFInAppEventParameterName, str, str4);
                            if (valueOf.AFInAppEventParameterName()) {
                                if ((true ^ AFKeystoreWrapper) && (aFh1gSDK = body.AFInAppEventParameterName) != null) {
                                    aFh1gSDK.AFInAppEventType = null;
                                }
                                long AFInAppEventType2 = this.force.AFInAppEventType();
                                AFLogger.INSTANCE.v(AFg1aSDK.REMOTE_CONTROL, new StringBuilder("using max-age fallback: ").append(AFInAppEventType2).append(" seconds").toString());
                                long currentTimeMillis2 = System.currentTimeMillis();
                                AFg1xSDK aFg1xSDK = this.i;
                                aFg1xSDK.AFKeystoreWrapper.AFInAppEventParameterName("af_remote_config", Base64.encodeToString(body.values.getBytes(Charset.defaultCharset()), 2));
                                aFg1xSDK.values = aFg1xSDK.valueOf;
                                aFg1xSDK.AFKeystoreWrapper.AFKeystoreWrapper("af_rc_timestamp", currentTimeMillis2);
                                aFg1xSDK.AFKeystoreWrapper.AFKeystoreWrapper("af_rc_max_age", AFInAppEventType2);
                                aFg1xSDK.valueOf = body;
                                aFg1xSDK.AFInAppEventType = currentTimeMillis2;
                                aFg1xSDK.AFInAppEventParameterName = AFInAppEventType2;
                                AFLogger.INSTANCE.d(AFg1aSDK.REMOTE_CONTROL, new StringBuilder("Config successfully updated, timeToLive: ").append(AFInAppEventType2).append(" seconds").toString());
                                AFInAppEventParameterName(str, currentTimeMillis, valueOf.valueOf, AFInAppEventParameterName3, AFInAppEventType);
                                return AFf1gSDK.SUCCESS;
                            }
                            AFInAppEventParameterName(str, currentTimeMillis, valueOf.valueOf, AFInAppEventParameterName3, AFInAppEventType);
                            AFLogger.INSTANCE.w(AFg1aSDK.REMOTE_CONTROL, "fetched config is not valid (MITM?) refuse to use it.");
                            return AFf1gSDK.FAILURE;
                        }
                        AFLogger.INSTANCE.w(AFg1aSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
                        return AFf1gSDK.FAILURE;
                    }
                    AFInAppEventParameterName(str, currentTimeMillis, null, null, AFInAppEventType);
                    AFLogger.INSTANCE.w(AFg1aSDK.REMOTE_CONTROL, new StringBuilder("failed to fetch remote config from CDN with status code: ").append(AFInAppEventType.getStatusCode()).toString());
                    return AFf1gSDK.FAILURE;
                }
                AFLogger.INSTANCE.d(AFg1aSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                return AFf1gSDK.USE_CACHED;
            } catch (IOException e) {
                AFLogger.INSTANCE.e(AFg1aSDK.REMOTE_CONTROL, new StringBuilder("failed to fetch remote config: ").append(e.getMessage()).toString(), e, true, false, false);
                AFInAppEventParameterName(str, currentTimeMillis, e instanceof ParsingException ? ((ParsingException) e).getRawResponse() : null, null, null, null, e);
                if (e.getCause() instanceof InterruptedIOException) {
                    throw ((InterruptedIOException) e.getCause());
                }
                return AFf1gSDK.FAILURE;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1aSDK.REMOTE_CONTROL, new StringBuilder("failed to update remote config: ").append(th.getMessage()).toString(), th, true, false, false);
                AFInAppEventParameterName(str, currentTimeMillis, null, null, null, null, th);
                if (th.getCause() instanceof InterruptedException) {
                    throw ((InterruptedException) th.getCause());
                }
                return AFf1gSDK.FAILURE;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    private void AFInAppEventParameterName(String str, long j, AFh1bSDK aFh1bSDK, String str2, AFe1jSDK<AFi1zSDK> aFe1jSDK) {
        AFInAppEventParameterName(str, j, aFe1jSDK, aFe1jSDK != null ? aFe1jSDK.getBody() : null, aFh1bSDK, str2 != null ? str2 : null, null);
    }

    private void AFInAppEventParameterName(String str, long j, AFe1jSDK<?> aFe1jSDK, AFi1zSDK aFi1zSDK, AFh1bSDK aFh1bSDK, String str2, Throwable th) {
        long j2;
        int i;
        Throwable th2;
        long j3;
        if (aFe1jSDK != null) {
            j2 = aFe1jSDK.AFInAppEventParameterName.AFKeystoreWrapper;
            i = aFe1jSDK.getStatusCode();
        } else {
            j2 = 0;
            i = 0;
        }
        int i2 = i;
        if (th instanceof HttpException) {
            th2 = th.getCause();
            j3 = ((HttpException) th).getMetrics().AFKeystoreWrapper;
        } else {
            th2 = th;
            j3 = j2;
        }
        this.AFLogger = new AFh1aSDK(aFi1zSDK != null ? aFi1zSDK.AFKeystoreWrapper : null, str, j3, System.currentTimeMillis() - j, i2, aFh1bSDK, str2, th2);
    }
}
