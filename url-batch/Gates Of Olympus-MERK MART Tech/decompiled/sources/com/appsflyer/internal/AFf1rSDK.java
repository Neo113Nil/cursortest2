package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;
import kotlin.time.DurationKt;

/* loaded from: classes3.dex */
public abstract class AFf1rSDK<Result> extends AFe1dSDK<AFe1pSDK<Result>> {
    protected final AFe1wSDK AFLogger;
    private String afInfoLog;
    public AFe1pSDK<Result> d;
    private AFb1uSDK e;
    protected final AFb1bSDK registerClient;
    public final AFg1xSDK unregisterClient;

    @Override // com.appsflyer.internal.AFe1dSDK
    public long AFInAppEventParameterName() {
        return DurationKt.MILLIS_IN_MINUTE;
    }

    protected boolean afInfoLog() {
        return true;
    }

    protected abstract AppsFlyerRequestListener registerClient();

    protected abstract boolean unregisterClient();

    protected abstract AFe1xSDK<Result> values(String str);

    private AFf1rSDK(AFe1eSDK aFe1eSDK, AFe1eSDK[] aFe1eSDKArr, AFe1wSDK aFe1wSDK, AFg1xSDK aFg1xSDK, AFb1bSDK aFb1bSDK, AFb1uSDK aFb1uSDK, String str) {
        super(aFe1eSDK, aFe1eSDKArr, str);
        this.AFLogger = aFe1wSDK;
        this.unregisterClient = aFg1xSDK;
        this.registerClient = aFb1bSDK;
        this.e = aFb1uSDK;
    }

    public AFf1rSDK(AFe1eSDK aFe1eSDK, AFe1eSDK[] aFe1eSDKArr, AFd1mSDK aFd1mSDK, String str) {
        this(aFe1eSDK, aFe1eSDKArr, aFd1mSDK.AFKeystoreWrapper(), aFd1mSDK.force(), aFd1mSDK.afInfoLog(), aFd1mSDK.afWarnLog(), str);
    }

    public AFf1rSDK(AFe1eSDK aFe1eSDK, AFe1eSDK[] aFe1eSDKArr, AFd1mSDK aFd1mSDK, String str, String str2) {
        this(aFe1eSDK, aFe1eSDKArr, aFd1mSDK.AFKeystoreWrapper(), aFd1mSDK.force(), aFd1mSDK.afInfoLog(), aFd1mSDK.afWarnLog(), str);
        this.afInfoLog = str2;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final void valueOf() {
        String str;
        super.valueOf();
        if (!unregisterClient() || (str = this.unregisterClient.unregisterClient) == null || str.trim().isEmpty()) {
            return;
        }
        AFe1xSDK<Result> values = values(str);
        if (values != null) {
            AFKeystoreWrapper(values.values);
        } else {
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public AFe1bSDK values() throws Exception {
        if (afInfoLog() && this.unregisterClient.AFInAppEventType()) {
            AppsFlyerRequestListener registerClient = registerClient();
            if (registerClient != null) {
                registerClient.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFf1xSDK();
        }
        String str = this.unregisterClient.unregisterClient;
        if (str != null && !str.trim().isEmpty()) {
            AFe1xSDK<Result> values = values(str);
            if (values == null) {
                AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
                return AFe1bSDK.FAILURE;
            }
            if (unregisterClient()) {
                AFKeystoreWrapper(values.values);
            }
            AFe1pSDK<Result> AFInAppEventType = values.AFInAppEventType();
            this.d = AFInAppEventType;
            this.registerClient.AFInAppEventParameterName(values.values.valueOf, AFInAppEventType.getStatusCode(), AFInAppEventType.getBody().toString());
            AppsFlyerRequestListener registerClient2 = registerClient();
            if (registerClient2 != null) {
                if (AFInAppEventType.isSuccessful()) {
                    registerClient2.onSuccess();
                } else {
                    registerClient2.onError(50, new StringBuilder("Status code failure ").append(AFInAppEventType.getStatusCode()).toString());
                }
            }
            if (AFInAppEventType.isSuccessful()) {
                return AFe1bSDK.SUCCESS;
            }
            return AFe1bSDK.FAILURE;
        }
        AppsFlyerRequestListener registerClient3 = registerClient();
        if (registerClient3 != null) {
            registerClient3.onError(41, "No dev key");
        }
        throw new AFf1wSDK();
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public boolean AFKeystoreWrapper() {
        if (AFLogger() instanceof AFf1xSDK) {
            return false;
        }
        if (this.AFKeystoreWrapper == AFe1bSDK.TIMEOUT) {
            return true;
        }
        Throwable AFLogger = AFLogger();
        return (AFLogger instanceof IOException) && !(AFLogger instanceof ParsingException);
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType(Throwable th) {
        Throwable th2;
        boolean z = !(th instanceof HttpException);
        if (th instanceof AFf1xSDK) {
            th2 = th;
            AFLogger.INSTANCE.e(AFg1jSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th2, true, false);
        } else {
            th2 = th;
            AFLogger.INSTANCE.e(AFg1jSDK.HTTP_CLIENT, "Error while sending request to server: ".concat(String.valueOf(th2)), th2, true, true, z);
        }
        AppsFlyerRequestListener registerClient = registerClient();
        if (registerClient != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            registerClient.onError(40, message);
        }
    }

    private void AFKeystoreWrapper(AFe1nSDK aFe1nSDK) {
        String str = this.afInfoLog;
        this.afInfoLog = this.e.AFInAppEventType(new AFb1mSDK(aFe1nSDK.valueOf, aFe1nSDK.AFInAppEventType(), "6.12.6", this.AFInAppEventType));
        if (str != null) {
            this.e.AFInAppEventType(str);
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public void AFInAppEventType() {
        String str;
        if (this.AFKeystoreWrapper != AFe1bSDK.SUCCESS) {
            if (AFKeystoreWrapper() || (str = this.afInfoLog) == null) {
                return;
            }
            this.e.AFInAppEventType(str);
            return;
        }
        String str2 = this.afInfoLog;
        if (str2 != null) {
            this.e.AFInAppEventType(str2);
        }
    }
}
