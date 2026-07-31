package E;

import I.A0;
import I.C0143d;
import I.C0156j0;
import I.InterfaceC0142c0;
import I.W;
import android.view.ViewGroup;
import b0.AbstractC0335d;
import b0.C0352v;
import d0.C0401b;
import h2.AbstractC0508a;
import java.util.LinkedHashMap;
import n.V;
import z.C1256t;

/* renamed from: E.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073a implements A0, s, V {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f932d;

    /* renamed from: e, reason: collision with root package name */
    public final F f933e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f934f;

    /* renamed from: g, reason: collision with root package name */
    public final float f935g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0142c0 f936h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0142c0 f937i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewGroup f938j;

    /* renamed from: k, reason: collision with root package name */
    public r f939k;

    /* renamed from: l, reason: collision with root package name */
    public final C0156j0 f940l;

    /* renamed from: m, reason: collision with root package name */
    public final C0156j0 f941m;

    /* renamed from: n, reason: collision with root package name */
    public long f942n;

    /* renamed from: o, reason: collision with root package name */
    public int f943o;

    /* renamed from: p, reason: collision with root package name */
    public final A.h f944p;

    public C0073a(boolean z3, float f3, InterfaceC0142c0 interfaceC0142c0, InterfaceC0142c0 interfaceC0142c02, ViewGroup viewGroup) {
        this.f932d = z3;
        this.f933e = new F(new v(interfaceC0142c02, 0), z3);
        this.f934f = z3;
        this.f935g = f3;
        this.f936h = interfaceC0142c0;
        this.f937i = interfaceC0142c02;
        this.f938j = viewGroup;
        W w2 = W.f2783i;
        this.f940l = C0143d.K(null, w2);
        this.f941m = C0143d.K(Boolean.TRUE, w2);
        this.f942n = 0L;
        this.f943o = -1;
        this.f944p = new A.h(3, this);
    }

    @Override // E.s
    public final void Q() {
        this.f940l.setValue(null);
    }

    @Override // I.A0
    public final void a() {
        r rVar = this.f939k;
        if (rVar != null) {
            Q();
            C1256t c1256t = rVar.f995g;
            u uVar = (u) ((LinkedHashMap) c1256t.f10466e).get(this);
            if (uVar != null) {
                uVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c1256t.f10466e;
                u uVar2 = (u) linkedHashMap.get(this);
                if (uVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f994f.add(uVar);
            }
        }
    }

    @Override // I.A0
    public final void c() {
        r rVar = this.f939k;
        if (rVar != null) {
            Q();
            C1256t c1256t = rVar.f995g;
            u uVar = (u) ((LinkedHashMap) c1256t.f10466e).get(this);
            if (uVar != null) {
                uVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c1256t.f10466e;
                u uVar2 = (u) linkedHashMap.get(this);
                if (uVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f994f.add(uVar);
            }
        }
    }

    @Override // n.V
    public final void e(t0.G g3) {
        int l3;
        float J3;
        C0401b c0401b = g3.f8573d;
        this.f942n = c0401b.d();
        float f3 = this.f935g;
        if (Float.isNaN(f3)) {
            l3 = AbstractC0508a.Q(q.a(g3, this.f934f, c0401b.d()));
        } else {
            l3 = c0401b.l(f3);
        }
        this.f943o = l3;
        long j3 = ((C0352v) this.f936h.getValue()).f5441a;
        float f4 = ((C0080h) this.f937i.getValue()).f963d;
        g3.b();
        if (Float.isNaN(f3)) {
            J3 = q.a(g3, this.f932d, c0401b.d());
        } else {
            J3 = g3.J(f3);
        }
        this.f933e.b(g3, J3, j3);
        b0.r h3 = c0401b.f5649e.h();
        ((Boolean) this.f941m.getValue()).booleanValue();
        u uVar = (u) this.f940l.getValue();
        if (uVar != null) {
            uVar.e(c0401b.d(), j3, f4);
            uVar.draw(AbstractC0335d.a(h3));
        }
    }

    @Override // I.A0
    public final void b() {
    }
}
