package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes15.dex */
public class WebkitToCompatConverter {
    private final WebkitToCompatConverterBoundaryInterface mImpl;

    public WebkitToCompatConverter(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.mImpl = webkitToCompatConverterBoundaryInterface;
    }

    public InvocationHandler convertWebResourceError(WebResourceError webResourceError) {
        return this.mImpl.convertWebResourceError(webResourceError);
    }

    public WebResourceError convertWebResourceError(InvocationHandler invocationHandler) {
        return (WebResourceError) this.mImpl.convertWebResourceError(invocationHandler);
    }

    public InvocationHandler convertSafeBrowsingResponse(SafeBrowsingResponse safeBrowsingResponse) {
        return this.mImpl.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    public SafeBrowsingResponse convertSafeBrowsingResponse(InvocationHandler invocationHandler) {
        return WebkitToCompatConverter$$ExternalSyntheticApiModelOutline0.m(this.mImpl.convertSafeBrowsingResponse(invocationHandler));
    }

    public InvocationHandler convertWebMessagePort(WebMessagePort webMessagePort) {
        return this.mImpl.convertWebMessagePort(webMessagePort);
    }
}
