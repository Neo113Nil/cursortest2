package v0;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.IsomorphicObjectBoundaryInterface;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* loaded from: classes.dex */
public final class q implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ IsomorphicObjectBoundaryInterface f8195e;

    public /* synthetic */ q(IsomorphicObjectBoundaryInterface isomorphicObjectBoundaryInterface, int i2) {
        this.f8194d = i2;
        this.f8195e = isomorphicObjectBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8194d) {
            case 0:
                JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) this.f8195e;
                r rVar = new r();
                rVar.f8196a = jsReplyProxyBoundaryInterface;
                return rVar;
            default:
                WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) this.f8195e;
                L l7 = new L();
                l7.f8183a = webViewRendererBoundaryInterface;
                return l7;
        }
    }
}
