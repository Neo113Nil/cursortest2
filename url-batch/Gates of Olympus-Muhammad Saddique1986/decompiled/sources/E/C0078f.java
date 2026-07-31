package E;

import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.InterfaceC0142c0;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.C0352v;
import e2.InterfaceC0426e;
import n.U;
import n.V;

/* renamed from: E.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078f implements U {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f953a;

    /* renamed from: b, reason: collision with root package name */
    public final float f954b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0142c0 f955c;

    public C0078f(boolean z3, float f3, InterfaceC0142c0 interfaceC0142c0) {
        this.f953a = z3;
        this.f954b = f3;
        this.f955c = interfaceC0142c0;
    }

    @Override // n.U
    public final V a(q.j jVar, C0167p c0167p) {
        long b3;
        c0167p.Q(988743187);
        z zVar = (z) c0167p.k(B.f911a);
        InterfaceC0142c0 interfaceC0142c0 = this.f955c;
        if (((C0352v) interfaceC0142c0.getValue()).f5441a != 16) {
            c0167p.Q(-303571590);
            c0167p.p(false);
            b3 = ((C0352v) interfaceC0142c0.getValue()).f5441a;
        } else {
            c0167p.Q(-303521246);
            b3 = zVar.b(c0167p);
            c0167p.p(false);
        }
        InterfaceC0142c0 N3 = C0143d.N(new C0352v(b3), c0167p);
        InterfaceC0142c0 N4 = C0143d.N(zVar.a(c0167p), c0167p);
        c0167p.Q(331259447);
        ViewGroup b4 = C.b((View) c0167p.k(AndroidCompositionLocals_androidKt.f4942f));
        boolean f3 = c0167p.f(jVar) | c0167p.f(this) | c0167p.f(b4);
        Object G3 = c0167p.G();
        Object obj = C0159l.f2829a;
        if (f3 || G3 == obj) {
            G3 = new C0073a(this.f953a, this.f954b, N3, N4, b4);
            c0167p.a0(G3);
        }
        C0073a c0073a = (C0073a) G3;
        c0167p.p(false);
        boolean f4 = c0167p.f(jVar) | c0167p.h(c0073a);
        Object G4 = c0167p.G();
        if (f4 || G4 == obj) {
            G4 = new C0079g(jVar, c0073a, null);
            c0167p.a0(G4);
        }
        C0143d.f(c0073a, jVar, (InterfaceC0426e) G4, c0167p);
        c0167p.p(false);
        return c0073a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0078f)) {
            return false;
        }
        C0078f c0078f = (C0078f) obj;
        return this.f953a == c0078f.f953a && O0.e.a(this.f954b, c0078f.f954b) && this.f955c.equals(c0078f.f955c);
    }

    public final int hashCode() {
        return this.f955c.hashCode() + A.k.a(this.f954b, Boolean.hashCode(this.f953a) * 31, 31);
    }
}
