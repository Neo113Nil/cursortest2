package v0;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public final class t extends u0.f {

    /* renamed from: a, reason: collision with root package name */
    public SafeBrowsingResponse f8198a;

    /* renamed from: b, reason: collision with root package name */
    public SafeBrowsingResponseBoundaryInterface f8199b;

    @Override // u0.f
    public final void a(boolean z7) {
        C0958b c0958b = F.f8167r;
        if (c0958b.a()) {
            AbstractC0966j.e(c(), z7);
        } else {
            if (!c0958b.b()) {
                throw F.a();
            }
            b().showInterstitial(z7);
        }
    }

    public final SafeBrowsingResponseBoundaryInterface b() {
        if (this.f8199b == null) {
            J j = G.f8176a;
            this.f8199b = (SafeBrowsingResponseBoundaryInterface) V6.b.a(SafeBrowsingResponseBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) j.f8180b).convertSafeBrowsingResponse(this.f8198a));
        }
        return this.f8199b;
    }

    public final SafeBrowsingResponse c() {
        if (this.f8198a == null) {
            J j = G.f8176a;
            this.f8198a = AbstractC0965i.b(((WebkitToCompatConverterBoundaryInterface) j.f8180b).convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.f8199b)));
        }
        return this.f8198a;
    }
}
