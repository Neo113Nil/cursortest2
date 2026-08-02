package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* loaded from: classes.dex */
public interface JsReplyProxyBoundaryInterface extends IsomorphicObjectBoundaryInterface {
    void executeJavaScript(String str, InvocationHandler invocationHandler);

    void postMessage(String str);

    void postMessageWithPayload(InvocationHandler invocationHandler);
}
