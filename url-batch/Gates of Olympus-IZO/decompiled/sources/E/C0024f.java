package E;

import H2.AbstractC0080b;
import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.InterfaceC0088c0;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.C0288u;
import n.Q;
import n.S;

/* renamed from: E.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024f implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f650a;

    /* renamed from: b, reason: collision with root package name */
    public final float f651b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0088c0 f652c;

    public C0024f(boolean z3, float f3, InterfaceC0088c0 interfaceC0088c0) {
        this.f650a = z3;
        this.f651b = f3;
        this.f652c = interfaceC0088c0;
    }

    @Override // n.Q
    public final S a(q.i iVar, C0113p c0113p) {
        long b2;
        c0113p.Q(988743187);
        A a3 = (A) c0113p.k(C.f610a);
        InterfaceC0088c0 interfaceC0088c0 = this.f652c;
        if (((C0288u) interfaceC0088c0.getValue()).f4298a != 16) {
            c0113p.Q(-303571590);
            c0113p.p(false);
            b2 = ((C0288u) interfaceC0088c0.getValue()).f4298a;
        } else {
            c0113p.Q(-303521246);
            b2 = a3.b(c0113p);
            c0113p.p(false);
        }
        InterfaceC0088c0 M3 = C0089d.M(new C0288u(b2), c0113p);
        InterfaceC0088c0 M4 = C0089d.M(a3.a(c0113p), c0113p);
        c0113p.Q(331259447);
        ViewGroup b3 = D.b((View) c0113p.k(AndroidCompositionLocals_androidKt.f3742f));
        boolean f3 = c0113p.f(iVar) | c0113p.f(this) | c0113p.f(b3);
        Object G3 = c0113p.G();
        Object obj = C0105l.f2272a;
        if (f3 || G3 == obj) {
            G3 = new C0019a(this.f650a, this.f651b, M3, M4, b3);
            c0113p.a0(G3);
        }
        C0019a c0019a = (C0019a) G3;
        c0113p.p(false);
        boolean f4 = c0113p.f(iVar) | c0113p.h(c0019a);
        Object G4 = c0113p.G();
        if (f4 || G4 == obj) {
            G4 = new C0026h(iVar, c0019a, null);
            c0113p.a0(G4);
        }
        C0089d.f(c0019a, iVar, (Y1.e) G4, c0113p);
        c0113p.p(false);
        return c0019a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0024f)) {
            return false;
        }
        C0024f c0024f = (C0024f) obj;
        return this.f650a == c0024f.f650a && M0.e.a(this.f651b, c0024f.f651b) && this.f652c.equals(c0024f.f652c);
    }

    public final int hashCode() {
        return this.f652c.hashCode() + AbstractC0080b.a(this.f651b, Boolean.hashCode(this.f650a) * 31, 31);
    }
}
