package C;

import A.AbstractC0017m;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import Z.C0323u;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function2;
import m.Q;
import m.S;
import p.InterfaceC0934j;

/* renamed from: C.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111f implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1082a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1083b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0191c0 f1084c;

    public C0111f(boolean z4, float f4, InterfaceC0191c0 interfaceC0191c0) {
        this.f1082a = z4;
        this.f1083b = f4;
        this.f1084c = interfaceC0191c0;
    }

    @Override // m.Q
    public final S b(InterfaceC0934j interfaceC0934j, C0216p c0216p) {
        long a4;
        c0216p.S(988743187);
        z zVar = (z) c0216p.k(B.f1040a);
        InterfaceC0191c0 interfaceC0191c0 = this.f1084c;
        if (((C0323u) interfaceC0191c0.getValue()).f4549a != 16) {
            c0216p.S(-303571590);
            c0216p.q(false);
            a4 = ((C0323u) interfaceC0191c0.getValue()).f4549a;
        } else {
            c0216p.S(-303521246);
            a4 = zVar.a(c0216p);
            c0216p.q(false);
        }
        InterfaceC0191c0 N3 = C0192d.N(new C0323u(a4), c0216p);
        InterfaceC0191c0 N4 = C0192d.N(zVar.b(c0216p), c0216p);
        c0216p.S(331259447);
        ViewGroup b4 = C.b((View) c0216p.k(AndroidCompositionLocals_androidKt.f5217f));
        boolean f4 = c0216p.f(interfaceC0934j) | c0216p.f(this) | c0216p.f(b4);
        Object I3 = c0216p.I();
        Object obj = C0208l.f2826a;
        if (f4 || I3 == obj) {
            I3 = new C0106a(this.f1082a, this.f1083b, N3, N4, b4);
            c0216p.c0(I3);
        }
        C0106a c0106a = (C0106a) I3;
        c0216p.q(false);
        boolean f5 = c0216p.f(interfaceC0934j) | c0216p.h(c0106a);
        Object I4 = c0216p.I();
        if (f5 || I4 == obj) {
            I4 = new C0112g(interfaceC0934j, c0106a, null);
            c0216p.c0(I4);
        }
        C0192d.f(c0106a, interfaceC0934j, (Function2) I4, c0216p);
        c0216p.q(false);
        return c0106a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0111f)) {
            return false;
        }
        C0111f c0111f = (C0111f) obj;
        return this.f1082a == c0111f.f1082a && M0.e.a(this.f1083b, c0111f.f1083b) && this.f1084c.equals(c0111f.f1084c);
    }

    public final int hashCode() {
        return this.f1084c.hashCode() + AbstractC0017m.a(this.f1083b, Boolean.hashCode(this.f1082a) * 31, 31);
    }
}
