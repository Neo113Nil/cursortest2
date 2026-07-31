package c0;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f1742a;

    public n(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f1742a = webkitToCompatConverterBoundaryInterface;
    }

    public SafeBrowsingResponse a(InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.f1742a.convertSafeBrowsingResponse(invocationHandler);
    }

    public InvocationHandler b(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f1742a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    public WebMessagePort c(InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f1742a.convertWebMessagePort(invocationHandler);
    }

    public WebResourceError d(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f1742a.convertWebResourceError(invocationHandler);
    }

    public InvocationHandler e(WebResourceError webResourceError) {
        return this.f1742a.convertWebResourceError(webResourceError);
    }
}
