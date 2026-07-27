package C;

import G.A0;
import G.C0192d;
import G.C0205j0;
import G.InterfaceC0191c0;
import G.W;
import Z.AbstractC0307d;
import Z.C0323u;
import android.view.ViewGroup;
import b0.C0494b;
import java.util.LinkedHashMap;
import m.S;

/* renamed from: C.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106a implements A0, s, S {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1061d;

    /* renamed from: e, reason: collision with root package name */
    public final F f1062e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1063i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1064j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0191c0 f1065k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0191c0 f1066l;

    /* renamed from: m, reason: collision with root package name */
    public final ViewGroup f1067m;

    /* renamed from: n, reason: collision with root package name */
    public r f1068n;

    /* renamed from: o, reason: collision with root package name */
    public final C0205j0 f1069o;

    /* renamed from: p, reason: collision with root package name */
    public final C0205j0 f1070p;

    /* renamed from: q, reason: collision with root package name */
    public long f1071q;

    /* renamed from: r, reason: collision with root package name */
    public int f1072r;

    /* renamed from: s, reason: collision with root package name */
    public final A3.e f1073s;

    public C0106a(boolean z4, float f4, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, ViewGroup viewGroup) {
        this.f1061d = z4;
        this.f1062e = new F(new v(0, interfaceC0191c02), z4);
        this.f1063i = z4;
        this.f1064j = f4;
        this.f1065k = interfaceC0191c0;
        this.f1066l = interfaceC0191c02;
        this.f1067m = viewGroup;
        W w4 = W.f2779l;
        this.f1069o = C0192d.K(null, w4);
        this.f1070p = C0192d.K(Boolean.TRUE, w4);
        this.f1071q = 0L;
        this.f1072r = -1;
        this.f1073s = new A3.e(1, this);
    }

    @Override // C.s
    public final void W() {
        this.f1069o.setValue(null);
    }

    @Override // G.A0
    public final void a() {
        r rVar = this.f1068n;
        if (rVar != null) {
            W();
            y.t tVar = rVar.f1124j;
            u uVar = (u) ((LinkedHashMap) tVar.f11494e).get(this);
            if (uVar != null) {
                uVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) tVar.f11494e;
                u uVar2 = (u) linkedHashMap.get(this);
                if (uVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f1123i.add(uVar);
            }
        }
    }

    @Override // G.A0
    public final void b() {
    }

    @Override // m.S
    public final void c(r0.G g4) {
        int l4;
        float L3;
        C0494b c0494b = g4.f9624d;
        this.f1071q = c0494b.h();
        float f4 = this.f1064j;
        if (Float.isNaN(f4)) {
            l4 = O2.c.a(q.a(g4, this.f1063i, c0494b.h()));
        } else {
            l4 = c0494b.l(f4);
        }
        this.f1072r = l4;
        long j4 = ((C0323u) this.f1065k.getValue()).f4549a;
        float f5 = ((C0113h) this.f1066l.getValue()).f1092d;
        g4.a();
        if (Float.isNaN(f4)) {
            L3 = q.a(g4, this.f1061d, c0494b.h());
        } else {
            L3 = g4.L(f4);
        }
        this.f1062e.b(g4, L3, j4);
        Z.r k4 = c0494b.f5603e.k();
        ((Boolean) this.f1070p.getValue()).booleanValue();
        u uVar = (u) this.f1069o.getValue();
        if (uVar != null) {
            uVar.e(c0494b.h(), j4, f5);
            uVar.draw(AbstractC0307d.a(k4));
        }
    }

    @Override // G.A0
    public final void d() {
        r rVar = this.f1068n;
        if (rVar != null) {
            W();
            y.t tVar = rVar.f1124j;
            u uVar = (u) ((LinkedHashMap) tVar.f11494e).get(this);
            if (uVar != null) {
                uVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) tVar.f11494e;
                u uVar2 = (u) linkedHashMap.get(this);
                if (uVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f1123i.add(uVar);
            }
        }
    }
}
