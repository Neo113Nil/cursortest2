package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class AFf1nSDK<Result> extends AFe1dSDK<AFe1jSDK<Result>> {
    protected final AFe1ySDK AFLogger;
    public final AFg1wSDK d;
    protected final AFb1bSDK e;
    public AFe1jSDK<Result> registerClient;
    private AFb1tSDK unregisterClient;
    private String v;

    @Override // com.appsflyer.internal.AFe1dSDK
    public long AFInAppEventParameterName() {
        return 60000L;
    }

    protected abstract AFe1sSDK<Result> AFKeystoreWrapper(String str);

    protected boolean a_() {
        return true;
    }

    protected abstract AppsFlyerRequestListener e();

    protected abstract boolean i();

    private AFf1nSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFe1ySDK aFe1ySDK, AFg1wSDK aFg1wSDK, AFb1bSDK aFb1bSDK, AFb1tSDK aFb1tSDK, String str) {
        super(aFf1zSDK, aFf1zSDKArr, str);
        this.AFLogger = aFe1ySDK;
        this.d = aFg1wSDK;
        this.e = aFb1bSDK;
        this.unregisterClient = aFb1tSDK;
    }

    public AFf1nSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFd1kSDK aFd1kSDK, String str) {
        this(aFf1zSDK, aFf1zSDKArr, aFd1kSDK.AFInAppEventParameterName(), aFd1kSDK.i(), aFd1kSDK.v(), aFd1kSDK.afErrorLog(), str);
    }

    public AFf1nSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFd1kSDK aFd1kSDK, String str, String str2) {
        this(aFf1zSDK, aFf1zSDKArr, aFd1kSDK.AFInAppEventParameterName(), aFd1kSDK.i(), aFd1kSDK.v(), aFd1kSDK.afErrorLog(), str);
        this.v = str2;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final void values() {
        String str;
        super.values();
        if (!i() || (str = this.d.AFLogger) == null || str.trim().isEmpty()) {
            return;
        }
        AFe1sSDK<Result> AFKeystoreWrapper = AFKeystoreWrapper(str);
        if (AFKeystoreWrapper != null) {
            values(AFKeystoreWrapper.AFInAppEventParameterName);
        } else {
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public AFe1bSDK AFKeystoreWrapper() throws Exception {
        if (a_() && this.d.AFKeystoreWrapper()) {
            AppsFlyerRequestListener e = e();
            if (e != null) {
                e.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFf1wSDK();
        }
        String str = this.d.AFLogger;
        if (str != null && !str.trim().isEmpty()) {
            AFe1sSDK<Result> AFKeystoreWrapper = AFKeystoreWrapper(str);
            if (AFKeystoreWrapper == null) {
                AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
                return AFe1bSDK.FAILURE;
            }
            if (i()) {
                values(AFKeystoreWrapper.AFInAppEventParameterName);
            }
            AFe1jSDK<Result> AFInAppEventType = AFKeystoreWrapper.AFInAppEventType();
            this.registerClient = AFInAppEventType;
            this.e.AFKeystoreWrapper(AFKeystoreWrapper.AFInAppEventParameterName.values, AFInAppEventType.getStatusCode(), AFInAppEventType.getBody().toString());
            AppsFlyerRequestListener e2 = e();
            if (e2 != null) {
                if (AFInAppEventType.isSuccessful()) {
                    e2.onSuccess();
                } else {
                    e2.onError(50, new StringBuilder("Status code failure ").append(AFInAppEventType.getStatusCode()).toString());
                }
            }
            if (AFInAppEventType.isSuccessful()) {
                return AFe1bSDK.SUCCESS;
            }
            return AFe1bSDK.FAILURE;
        }
        AppsFlyerRequestListener e3 = e();
        if (e3 != null) {
            e3.onError(41, "No dev key");
        }
        throw new AFe1aSDK();
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public boolean valueOf() {
        if (unregisterClient() instanceof AFf1wSDK) {
            return false;
        }
        if (this.values == AFe1bSDK.TIMEOUT) {
            return true;
        }
        Throwable unregisterClient = unregisterClient();
        return (unregisterClient instanceof IOException) && !(unregisterClient instanceof ParsingException);
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventParameterName(Throwable th) {
        boolean z = !(th instanceof HttpException);
        if (th instanceof AFf1wSDK) {
            AFLogger.INSTANCE.e(AFg1aSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th, true, false);
        } else {
            AFLogger.INSTANCE.e(AFg1aSDK.HTTP_CLIENT, "Error while sending request to server: ".concat(String.valueOf(th)), th, true, true, z);
        }
        AppsFlyerRequestListener e = e();
        if (e != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            e.onError(40, message);
        }
    }

    private void values(AFe1nSDK aFe1nSDK) {
        String str = this.v;
        this.v = this.unregisterClient.AFInAppEventType(new AFb1qSDK(aFe1nSDK.values, aFe1nSDK.AFInAppEventParameterName(), "6.14.0", this.AFInAppEventType));
        if (str != null) {
            this.unregisterClient.values(str);
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public void AFInAppEventType() {
        String str;
        if (this.values != AFe1bSDK.SUCCESS) {
            if (valueOf() || (str = this.v) == null) {
                return;
            }
            this.unregisterClient.values(str);
            return;
        }
        String str2 = this.v;
        if (str2 != null) {
            this.unregisterClient.values(str2);
        }
    }
}
