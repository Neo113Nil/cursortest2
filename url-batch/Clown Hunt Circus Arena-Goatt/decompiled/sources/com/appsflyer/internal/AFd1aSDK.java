package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class AFd1aSDK extends AFd1uSDK<AFe1zSDK> {
    private final AFb1cSDK AFLogger;
    private final String AFLogger$LogLevel;
    private final AFc1qSDK AFVersionDeclaration;
    private final AFd1bSDK afDebugLog;
    public AFe1zSDK afErrorLog;
    private final AFb1tSDK afErrorLogForExcManagerOnly;
    public AFf1uSDK afInfoLog;
    public final AFd1cSDK afRDLog;
    private final AFe1xSDK afWarnLog;
    private final AFe1vSDK getLevel;

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final long AFKeystoreWrapper() {
        return 1500L;
    }

    public AFd1aSDK(AFd1bSDK aFd1bSDK, AFb1cSDK aFb1cSDK, AFe1xSDK aFe1xSDK, AFb1tSDK aFb1tSDK, AFc1qSDK aFc1qSDK, AFe1vSDK aFe1vSDK, String str, AFd1cSDK aFd1cSDK) {
        super(AFd1vSDK.RC_CDN, new AFd1vSDK[0], "UpdateRemoteConfiguration");
        this.afErrorLog = null;
        this.afDebugLog = aFd1bSDK;
        this.AFLogger = aFb1cSDK;
        this.afWarnLog = aFe1xSDK;
        this.afErrorLogForExcManagerOnly = aFb1tSDK;
        this.AFVersionDeclaration = aFc1qSDK;
        this.getLevel = aFe1vSDK;
        this.AFLogger$LogLevel = str;
        this.afRDLog = aFd1cSDK;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final AFd1ySDK values() throws Exception {
        try {
            AFe1zSDK afDebugLog = afDebugLog();
            this.afErrorLog = afDebugLog;
            if (afDebugLog == AFe1zSDK.FAILURE) {
                return AFd1ySDK.FAILURE;
            }
            return AFd1ySDK.SUCCESS;
        } catch (InterruptedIOException | InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.afErrorLog = AFe1zSDK.FAILURE;
            return AFd1ySDK.TIMEOUT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFe1zSDK afDebugLog() throws InterruptedException, InterruptedIOException {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.AFLogger$LogLevel;
        String str3 = this.afWarnLog.AFInAppEventType;
        if (str3 == null || str3.trim().length() == 0) {
            AFLogger.afWarnLog("CFG: Dev key is not set, SDK is not started.");
        } else if (str2 == null) {
            AFLogger.afWarnLog("CFG: Can't create CDN token, domain or version is not provided.");
        } else {
            str = AFb1zSDK.AFKeystoreWrapper(AFb1zSDK.values("appsflyersdk.com", str2, this.AFLogger.values.AFInAppEventParameterName.getPackageName()), str3);
            if (str != null) {
                AFLogger.afRDLog("CFG: can't create CDN token, skipping fetch config");
                return AFe1zSDK.FAILURE;
            }
            try {
                if (this.getLevel.AFInAppEventType()) {
                    AFLogger.afInfoLog("CFG: Cached config is expired, updating...");
                    AFc1gSDK<AFf1vSDK> AFInAppEventParameterName = this.AFVersionDeclaration.AFInAppEventType(this.getLevel.values(), this.getLevel.valueOf(), str, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).AFInAppEventParameterName();
                    if (AFInAppEventParameterName.isSuccessful()) {
                        AFf1vSDK body = AFInAppEventParameterName.getBody();
                        String AFInAppEventType = AFInAppEventParameterName.AFInAppEventType("x-amz-meta-af-auth-v1");
                        String AFInAppEventType2 = AFInAppEventParameterName.AFInAppEventType("CF-Cache-Status");
                        String str4 = this.afWarnLog.AFInAppEventType;
                        if (str4 != null && str4.trim().length() != 0) {
                            AFf1rSDK AFKeystoreWrapper = this.afDebugLog.AFKeystoreWrapper(body, AFInAppEventType, str, str4);
                            if (AFKeystoreWrapper.valueOf()) {
                                long AFInAppEventParameterName2 = this.getLevel.AFInAppEventParameterName();
                                AFLogger.afRDLog(new StringBuilder("CFG: using max-age fallback: ").append(AFInAppEventParameterName2).append(" seconds").toString());
                                long currentTimeMillis2 = System.currentTimeMillis();
                                AFb1tSDK aFb1tSDK = this.afErrorLogForExcManagerOnly;
                                aFb1tSDK.AFKeystoreWrapper.values("af_remote_config", Base64.encodeToString(body.AFInAppEventParameterName.getBytes(Charset.defaultCharset()), 2));
                                aFb1tSDK.AFKeystoreWrapper.AFInAppEventType("af_rc_timestamp", currentTimeMillis2);
                                aFb1tSDK.AFKeystoreWrapper.AFInAppEventType("af_rc_max_age", AFInAppEventParameterName2);
                                aFb1tSDK.AFInAppEventParameterName = body;
                                aFb1tSDK.values = currentTimeMillis2;
                                aFb1tSDK.AFInAppEventType = AFInAppEventParameterName2;
                                AFLogger.afDebugLog(new StringBuilder("CFG: Config successfully updated, timeToLive: ").append(AFInAppEventParameterName2).append(" seconds").toString());
                                AFInAppEventType(str, currentTimeMillis, AFKeystoreWrapper.valueOf, AFInAppEventType2, AFInAppEventParameterName);
                                return AFe1zSDK.SUCCESS;
                            }
                            AFInAppEventType(str, currentTimeMillis, AFKeystoreWrapper.valueOf, AFInAppEventType2, AFInAppEventParameterName);
                            AFLogger.afWarnLog("CFG: fetched config is not valid (MITM?) refuse to use it.");
                            return AFe1zSDK.FAILURE;
                        }
                        AFLogger.afWarnLog("CFG: Dev key is not set, SDK is not started.");
                        return AFe1zSDK.FAILURE;
                    }
                    AFInAppEventType(str, currentTimeMillis, null, null, AFInAppEventParameterName);
                    AFLogger.afWarnLog(new StringBuilder("CFG: failed to fetch remote config from CDN with status code: ").append(AFInAppEventParameterName.getStatusCode()).toString());
                    return AFe1zSDK.FAILURE;
                }
                AFLogger.afDebugLog("CFG: active config is valid, skipping fetch");
                return AFe1zSDK.USE_CACHED;
            } catch (IOException e) {
                AFLogger.afErrorLog(new StringBuilder("CFG: failed to fetch remote config: ").append(e.getMessage()).toString(), e, true, false, false);
                AFInAppEventParameterName(str, currentTimeMillis, e instanceof ParsingException ? ((ParsingException) e).getRawResponse() : null, null, null, null, e);
                if (e.getCause() instanceof InterruptedIOException) {
                    throw ((InterruptedIOException) e.getCause());
                }
                return AFe1zSDK.FAILURE;
            } catch (Throwable th) {
                AFLogger.afErrorLog(new StringBuilder("CFG: failed to update remote config: ").append(th.getMessage()).toString(), th, true, false, false);
                AFInAppEventParameterName(str, currentTimeMillis, null, null, null, null, th);
                if (th.getCause() instanceof InterruptedException) {
                    throw ((InterruptedException) th.getCause());
                }
                return AFe1zSDK.FAILURE;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    private void AFInAppEventType(String str, long j, AFf1sSDK aFf1sSDK, String str2, AFc1gSDK<AFf1vSDK> aFc1gSDK) {
        AFInAppEventParameterName(str, j, aFc1gSDK, aFc1gSDK != null ? aFc1gSDK.getBody() : null, aFf1sSDK, str2 != null ? str2 : null, null);
    }

    private void AFInAppEventParameterName(String str, long j, AFc1gSDK<?> aFc1gSDK, AFf1vSDK aFf1vSDK, AFf1sSDK aFf1sSDK, String str2, Throwable th) {
        long j2;
        int i;
        Throwable th2;
        if (aFc1gSDK != null) {
            j2 = aFc1gSDK.AFInAppEventParameterName.AFInAppEventType;
            i = aFc1gSDK.getStatusCode();
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
        this.afInfoLog = new AFf1uSDK(aFf1vSDK != null ? aFf1vSDK.values : null, str, j2, System.currentTimeMillis() - j, i2, aFf1sSDK, str2, th2);
    }
}
