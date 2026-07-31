package c0;

import android.webkit.SafeBrowsingResponse;
import c0.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

/* loaded from: classes.dex */
public class g extends b0.a {

    /* renamed from: a, reason: collision with root package name */
    private SafeBrowsingResponse f1707a;

    /* renamed from: b, reason: collision with root package name */
    private SafeBrowsingResponseBoundaryInterface f1708b;

    public g(SafeBrowsingResponse safeBrowsingResponse) {
        this.f1707a = safeBrowsingResponse;
    }

    public g(InvocationHandler invocationHandler) {
        this.f1708b = (SafeBrowsingResponseBoundaryInterface) s6.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface b() {
        if (this.f1708b == null) {
            this.f1708b = (SafeBrowsingResponseBoundaryInterface) s6.a.a(SafeBrowsingResponseBoundaryInterface.class, k.c().b(this.f1707a));
        }
        return this.f1708b;
    }

    private SafeBrowsingResponse c() {
        if (this.f1707a == null) {
            this.f1707a = k.c().a(Proxy.getInvocationHandler(this.f1708b));
        }
        return this.f1707a;
    }

    @Override // b0.a
    public void a(boolean z6) {
        a.f fVar = j.f1738z;
        if (fVar.c()) {
            c.e(c(), z6);
        } else {
            if (!fVar.d()) {
                throw j.a();
            }
            b().showInterstitial(z6);
        }
    }
}
