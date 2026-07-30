package v0;

import android.webkit.WebMessagePort;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public final class B extends u0.p {

    /* renamed from: a, reason: collision with root package name */
    public WebMessagePort f8131a;

    /* renamed from: b, reason: collision with root package name */
    public WebMessagePortBoundaryInterface f8132b;

    public B(WebMessagePort webMessagePort) {
        this.f8131a = webMessagePort;
    }

    @Override // u0.p
    public final void a(u0.n nVar) {
        C0958b c0958b = F.f8168s;
        c0958b.getClass();
        int i2 = nVar.f8060d;
        if (i2 == 0) {
            AbstractC0962f.h(c(), AbstractC0962f.b(nVar));
        } else {
            if (!c0958b.b() || (i2 != 0 && (i2 != 1 || !F.f8170u.b()))) {
                throw F.a();
            }
            b().postMessage(new V6.a(new z(nVar)));
        }
    }

    public final WebMessagePortBoundaryInterface b() {
        if (this.f8132b == null) {
            J j = G.f8176a;
            this.f8132b = (WebMessagePortBoundaryInterface) V6.b.a(WebMessagePortBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) j.f8180b).convertWebMessagePort(this.f8131a));
        }
        return this.f8132b;
    }

    public final WebMessagePort c() {
        if (this.f8131a == null) {
            J j = G.f8176a;
            this.f8131a = (WebMessagePort) ((WebkitToCompatConverterBoundaryInterface) j.f8180b).convertWebMessagePort(Proxy.getInvocationHandler(this.f8132b));
        }
        return this.f8131a;
    }

    public B(InvocationHandler invocationHandler) {
        this.f8132b = (WebMessagePortBoundaryInterface) V6.b.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
