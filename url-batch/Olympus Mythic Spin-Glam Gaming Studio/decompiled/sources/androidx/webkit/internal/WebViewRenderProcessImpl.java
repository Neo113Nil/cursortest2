package androidx.webkit.internal;

import androidx.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes11.dex */
public class WebViewRenderProcessImpl extends WebViewRenderProcess {
    private static final WeakHashMap sFrameworkMap = new WeakHashMap();
    private WebViewRendererBoundaryInterface mBoundaryInterface;
    private WeakReference mFrameworkObject;

    public WebViewRenderProcessImpl(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.mBoundaryInterface = webViewRendererBoundaryInterface;
    }

    public WebViewRenderProcessImpl(android.webkit.WebViewRenderProcess webViewRenderProcess) {
        this.mFrameworkObject = new WeakReference(webViewRenderProcess);
    }

    public static WebViewRenderProcessImpl forInvocationHandler(InvocationHandler invocationHandler) {
        final WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (WebViewRenderProcessImpl) webViewRendererBoundaryInterface.getOrCreatePeer(new Callable() { // from class: androidx.webkit.internal.WebViewRenderProcessImpl$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object lambda$forInvocationHandler$0;
                lambda$forInvocationHandler$0 = WebViewRenderProcessImpl.lambda$forInvocationHandler$0(WebViewRendererBoundaryInterface.this);
                return lambda$forInvocationHandler$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$forInvocationHandler$0(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        return new WebViewRenderProcessImpl(webViewRendererBoundaryInterface);
    }

    public static WebViewRenderProcessImpl forFrameworkObject(android.webkit.WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap weakHashMap = sFrameworkMap;
        WebViewRenderProcessImpl webViewRenderProcessImpl = (WebViewRenderProcessImpl) weakHashMap.get(webViewRenderProcess);
        if (webViewRenderProcessImpl != null) {
            return webViewRenderProcessImpl;
        }
        WebViewRenderProcessImpl webViewRenderProcessImpl2 = new WebViewRenderProcessImpl(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, webViewRenderProcessImpl2);
        return webViewRenderProcessImpl2;
    }
}
