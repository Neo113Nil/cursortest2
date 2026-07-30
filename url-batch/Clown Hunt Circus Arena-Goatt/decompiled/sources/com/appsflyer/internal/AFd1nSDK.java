package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class AFd1nSDK<Result> extends AFd1uSDK<AFc1gSDK<Result>> {
    public AFc1gSDK<Result> AFLogger;
    protected final AFb1wSDK afDebugLog;
    protected final AFc1qSDK afErrorLog;
    private AFa1fSDK afInfoLog;
    public final AFe1xSDK afRDLog;
    private String afWarnLog;

    @Override // com.appsflyer.internal.AFd1uSDK
    public long AFKeystoreWrapper() {
        return 60000L;
    }

    protected abstract AFc1nSDK<Result> AFKeystoreWrapper(String str);

    protected abstract AppsFlyerRequestListener afDebugLog();

    protected abstract boolean afRDLog();

    protected boolean afWarnLog() {
        return true;
    }

    private AFd1nSDK(AFd1vSDK aFd1vSDK, AFd1vSDK[] aFd1vSDKArr, AFc1qSDK aFc1qSDK, AFe1xSDK aFe1xSDK, AFb1wSDK aFb1wSDK, AFa1fSDK aFa1fSDK, String str) {
        super(aFd1vSDK, aFd1vSDKArr, str);
        this.afErrorLog = aFc1qSDK;
        this.afRDLog = aFe1xSDK;
        this.afDebugLog = aFb1wSDK;
        this.afInfoLog = aFa1fSDK;
    }

    public AFd1nSDK(AFd1vSDK aFd1vSDK, AFd1vSDK[] aFd1vSDKArr, AFc1zSDK aFc1zSDK, String str) {
        this(aFd1vSDK, aFd1vSDKArr, aFc1zSDK.AFInAppEventType(), aFc1zSDK.AFVersionDeclaration(), aFc1zSDK.afErrorLogForExcManagerOnly(), aFc1zSDK.AppsFlyer2dXConversionCallback(), str);
    }

    public AFd1nSDK(AFd1vSDK aFd1vSDK, AFd1vSDK[] aFd1vSDKArr, AFc1zSDK aFc1zSDK, String str, String str2) {
        this(aFd1vSDK, aFd1vSDKArr, aFc1zSDK.AFInAppEventType(), aFc1zSDK.AFVersionDeclaration(), aFc1zSDK.afErrorLogForExcManagerOnly(), aFc1zSDK.AppsFlyer2dXConversionCallback(), str);
        this.afWarnLog = str2;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFInAppEventParameterName() {
        String str;
        super.AFInAppEventParameterName();
        if (!afRDLog() || (str = this.afRDLog.AFInAppEventType) == null || str.trim().isEmpty()) {
            return;
        }
        valueOf(AFKeystoreWrapper(str).valueOf);
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public AFd1ySDK values() throws Exception {
        if (afWarnLog() && this.afRDLog.values()) {
            AppsFlyerRequestListener afDebugLog = afDebugLog();
            if (afDebugLog != null) {
                afDebugLog.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFd1rSDK();
        }
        String str = this.afRDLog.AFInAppEventType;
        if (str != null && !str.trim().isEmpty()) {
            AFc1nSDK<Result> AFKeystoreWrapper = AFKeystoreWrapper(str);
            if (afRDLog()) {
                valueOf(AFKeystoreWrapper.valueOf);
            }
            AFc1gSDK<Result> AFInAppEventParameterName = AFKeystoreWrapper.AFInAppEventParameterName();
            this.AFLogger = AFInAppEventParameterName;
            this.afDebugLog.values(AFKeystoreWrapper.valueOf.AFInAppEventParameterName, AFInAppEventParameterName.getStatusCode(), AFInAppEventParameterName.getBody().toString());
            AppsFlyerRequestListener afDebugLog2 = afDebugLog();
            if (afDebugLog2 != null) {
                if (AFInAppEventParameterName.isSuccessful()) {
                    afDebugLog2.onSuccess();
                } else {
                    afDebugLog2.onError(50, new StringBuilder("Status code failure ").append(AFInAppEventParameterName.getStatusCode()).toString());
                }
            }
            if (AFInAppEventParameterName.isSuccessful()) {
                return AFd1ySDK.SUCCESS;
            }
            return AFd1ySDK.FAILURE;
        }
        AppsFlyerRequestListener afDebugLog3 = afDebugLog();
        if (afDebugLog3 != null) {
            afDebugLog3.onError(41, "No dev key");
        }
        throw new AFd1wSDK();
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public boolean AFInAppEventType() {
        if (afInfoLog() instanceof AFd1rSDK) {
            return false;
        }
        if (this.AFKeystoreWrapper == AFd1ySDK.TIMEOUT) {
            return true;
        }
        Throwable afInfoLog = afInfoLog();
        return (afInfoLog instanceof IOException) && !(afInfoLog instanceof ParsingException);
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void valueOf(Throwable th) {
        AFLogger.afErrorLog("Error while sending request to server: ".concat(String.valueOf(th)), th, true, !(th instanceof HttpException));
        AppsFlyerRequestListener afDebugLog = afDebugLog();
        if (afDebugLog != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            afDebugLog.onError(40, message);
        }
    }

    private void valueOf(AFb1ySDK aFb1ySDK) {
        String str = this.afWarnLog;
        this.afWarnLog = this.afInfoLog.valueOf(new AFa1rSDK(aFb1ySDK.AFInAppEventParameterName, aFb1ySDK.values(), "6.12.1", this.values));
        if (str != null) {
            this.afInfoLog.valueOf(str);
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public void valueOf() {
        String str;
        if (this.AFKeystoreWrapper != AFd1ySDK.SUCCESS) {
            if (AFInAppEventType() || (str = this.afWarnLog) == null) {
                return;
            }
            this.afInfoLog.valueOf(str);
            return;
        }
        String str2 = this.afWarnLog;
        if (str2 != null) {
            this.afInfoLog.valueOf(str2);
        }
    }
}
