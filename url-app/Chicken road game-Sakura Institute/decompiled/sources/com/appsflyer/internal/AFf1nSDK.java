package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class AFf1nSDK<Result> extends AFe1dSDK<AFe1jSDK<Result>> {
    protected final AFe1ySDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    public final AFg1wSDK f5911d;

    /* renamed from: e, reason: collision with root package name */
    protected final AFb1bSDK f5912e;
    public AFe1jSDK<Result> registerClient;
    private AFb1tSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private String f5913v;

    private AFf1nSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFe1ySDK aFe1ySDK, AFg1wSDK aFg1wSDK, AFb1bSDK aFb1bSDK, AFb1tSDK aFb1tSDK, String str) {
        super(aFf1zSDK, aFf1zSDKArr, str);
        this.AFLogger = aFe1ySDK;
        this.f5911d = aFg1wSDK;
        this.f5912e = aFb1bSDK;
        this.unregisterClient = aFb1tSDK;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public long AFInAppEventParameterName() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public void AFInAppEventType() {
        String str;
        if (this.values == AFe1bSDK.SUCCESS) {
            String str2 = this.f5913v;
            if (str2 != null) {
                this.unregisterClient.values(str2);
                return;
            }
            return;
        }
        if (valueOf() || (str = this.f5913v) == null) {
            return;
        }
        this.unregisterClient.values(str);
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public AFe1bSDK AFKeystoreWrapper() {
        if (a_() && this.f5911d.AFKeystoreWrapper()) {
            AppsFlyerRequestListener e4 = e();
            if (e4 != null) {
                e4.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFf1wSDK();
        }
        String str = this.f5911d.AFLogger;
        if (str == null || str.trim().isEmpty()) {
            AppsFlyerRequestListener e5 = e();
            if (e5 != null) {
                e5.onError(41, "No dev key");
            }
            throw new AFe1aSDK();
        }
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
        this.f5912e.AFKeystoreWrapper(AFKeystoreWrapper.AFInAppEventParameterName.values, AFInAppEventType.getStatusCode(), AFInAppEventType.getBody().toString());
        AppsFlyerRequestListener e6 = e();
        if (e6 != null) {
            if (AFInAppEventType.isSuccessful()) {
                e6.onSuccess();
            } else {
                StringBuilder sb = new StringBuilder("Status code failure ");
                sb.append(AFInAppEventType.getStatusCode());
                e6.onError(50, sb.toString());
            }
        }
        return AFInAppEventType.isSuccessful() ? AFe1bSDK.SUCCESS : AFe1bSDK.FAILURE;
    }

    public abstract AFe1sSDK<Result> AFKeystoreWrapper(String str);

    public boolean a_() {
        return true;
    }

    public abstract AppsFlyerRequestListener e();

    public abstract boolean i();

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
    public final void values() {
        String str;
        super.values();
        if (!i() || (str = this.f5911d.AFLogger) == null || str.trim().isEmpty()) {
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
    public final void AFInAppEventParameterName(Throwable th) {
        boolean z4 = !(th instanceof HttpException);
        if (th instanceof AFf1wSDK) {
            AFLogger.INSTANCE.e(AFg1aSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th, true, false);
        } else {
            AFLogger.INSTANCE.e(AFg1aSDK.HTTP_CLIENT, "Error while sending request to server: ".concat(String.valueOf(th)), th, true, true, z4);
        }
        AppsFlyerRequestListener e4 = e();
        if (e4 != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            e4.onError(40, message);
        }
    }

    public AFf1nSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFd1kSDK aFd1kSDK, String str) {
        this(aFf1zSDK, aFf1zSDKArr, aFd1kSDK.AFInAppEventParameterName(), aFd1kSDK.i(), aFd1kSDK.v(), aFd1kSDK.afErrorLog(), str);
    }

    private void values(AFe1nSDK aFe1nSDK) {
        String str = this.f5913v;
        this.f5913v = this.unregisterClient.AFInAppEventType(new AFb1qSDK(aFe1nSDK.values, aFe1nSDK.AFInAppEventParameterName(), "6.14.0", this.AFInAppEventType));
        if (str != null) {
            this.unregisterClient.values(str);
        }
    }

    public AFf1nSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFd1kSDK aFd1kSDK, String str, String str2) {
        this(aFf1zSDK, aFf1zSDKArr, aFd1kSDK.AFInAppEventParameterName(), aFd1kSDK.i(), aFd1kSDK.v(), aFd1kSDK.afErrorLog(), str);
        this.f5913v = str2;
    }
}
