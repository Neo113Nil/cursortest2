package c0;

import android.webkit.WebResourceError;
import c0.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* loaded from: classes.dex */
public class i extends b0.e {

    /* renamed from: a, reason: collision with root package name */
    private WebResourceError f1711a;

    /* renamed from: b, reason: collision with root package name */
    private WebResourceErrorBoundaryInterface f1712b;

    public i(WebResourceError webResourceError) {
        this.f1711a = webResourceError;
    }

    public i(InvocationHandler invocationHandler) {
        this.f1712b = (WebResourceErrorBoundaryInterface) s6.a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceErrorBoundaryInterface c() {
        if (this.f1712b == null) {
            this.f1712b = (WebResourceErrorBoundaryInterface) s6.a.a(WebResourceErrorBoundaryInterface.class, k.c().e(this.f1711a));
        }
        return this.f1712b;
    }

    private WebResourceError d() {
        if (this.f1711a == null) {
            this.f1711a = k.c().d(Proxy.getInvocationHandler(this.f1712b));
        }
        return this.f1711a;
    }

    @Override // b0.e
    public CharSequence a() {
        a.b bVar = j.f1734v;
        if (bVar.c()) {
            return b.e(d());
        }
        if (bVar.d()) {
            return c().getDescription();
        }
        throw j.a();
    }

    @Override // b0.e
    public int b() {
        a.b bVar = j.f1735w;
        if (bVar.c()) {
            return b.f(d());
        }
        if (bVar.d()) {
            return c().getErrorCode();
        }
        throw j.a();
    }
}
