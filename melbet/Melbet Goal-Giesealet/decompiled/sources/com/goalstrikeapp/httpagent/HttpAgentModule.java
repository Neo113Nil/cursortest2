package com.goalstrikeapp.httpagent;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpAgentModule.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/goalstrikeapp/httpagent/HttpAgentModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getHttpAgent", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpAgentModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpAgentModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "HttpAgent";
    }

    @ReactMethod
    public final void getHttpAgent(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(System.getProperty("http.agent"));
        } catch (Exception e) {
            promise.reject("HTTP_AGENT_ERROR", e);
        }
    }
}
