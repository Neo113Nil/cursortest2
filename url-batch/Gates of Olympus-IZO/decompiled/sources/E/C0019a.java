package E;

import I.B0;
import I.C0089d;
import I.C0102j0;
import I.InterfaceC0088c0;
import I.X;
import android.view.ViewGroup;
import b0.AbstractC0272e;
import b0.C0288u;
import b0.InterfaceC0285r;
import d0.C0321b;
import java.util.LinkedHashMap;
import n.S;

/* renamed from: E.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019a implements B0, t, S {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f631d;

    /* renamed from: e, reason: collision with root package name */
    public final G f632e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f633f;

    /* renamed from: g, reason: collision with root package name */
    public final float f634g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0088c0 f635h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0088c0 f636i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewGroup f637j;

    /* renamed from: k, reason: collision with root package name */
    public s f638k;

    /* renamed from: l, reason: collision with root package name */
    public final C0102j0 f639l;

    /* renamed from: m, reason: collision with root package name */
    public final C0102j0 f640m;

    /* renamed from: n, reason: collision with root package name */
    public long f641n;

    /* renamed from: o, reason: collision with root package name */
    public int f642o;
    public final A2.l p;

    public C0019a(boolean z3, float f3, InterfaceC0088c0 interfaceC0088c0, InterfaceC0088c0 interfaceC0088c02, ViewGroup viewGroup) {
        this.f631d = z3;
        this.f632e = new G(z3, new w(interfaceC0088c02, 0));
        this.f633f = z3;
        this.f634g = f3;
        this.f635h = interfaceC0088c0;
        this.f636i = interfaceC0088c02;
        this.f637j = viewGroup;
        X x3 = X.f2228i;
        this.f639l = C0089d.J(null, x3);
        this.f640m = C0089d.J(Boolean.TRUE, x3);
        this.f641n = 0L;
        this.f642o = -1;
        this.p = new A2.l(2, this);
    }

    @Override // E.t
    public final void N() {
        this.f639l.setValue(null);
    }

    @Override // I.B0
    public final void a() {
        s sVar = this.f638k;
        if (sVar != null) {
            N();
            C2.c cVar = sVar.f695g;
            v vVar = (v) ((LinkedHashMap) cVar.f484e).get(this);
            if (vVar != null) {
                vVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f484e;
                v vVar2 = (v) linkedHashMap.get(this);
                if (vVar2 != null) {
                }
                linkedHashMap.remove(this);
                sVar.f694f.add(vVar);
            }
        }
    }

    @Override // I.B0
    public final void c() {
        s sVar = this.f638k;
        if (sVar != null) {
            N();
            C2.c cVar = sVar.f695g;
            v vVar = (v) ((LinkedHashMap) cVar.f484e).get(this);
            if (vVar != null) {
                vVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f484e;
                v vVar2 = (v) linkedHashMap.get(this);
                if (vVar2 != null) {
                }
                linkedHashMap.remove(this);
                sVar.f694f.add(vVar);
            }
        }
    }

    @Override // n.S
    public final void d(t0.F f3) {
        int k3;
        float F3;
        C0321b c0321b = f3.f7748d;
        this.f641n = c0321b.c();
        float f4 = this.f634g;
        if (Float.isNaN(f4)) {
            k3 = M1.B.M(r.a(f3, this.f633f, c0321b.c()));
        } else {
            k3 = c0321b.k(f4);
        }
        this.f642o = k3;
        long j3 = ((C0288u) this.f635h.getValue()).f4298a;
        float f5 = ((C0027i) this.f636i.getValue()).f663d;
        f3.b();
        if (Float.isNaN(f4)) {
            F3 = r.a(f3, this.f631d, c0321b.c());
        } else {
            F3 = f3.F(f4);
        }
        this.f632e.b(f3, F3, j3);
        InterfaceC0285r h3 = c0321b.f4444e.h();
        ((Boolean) this.f640m.getValue()).booleanValue();
        v vVar = (v) this.f639l.getValue();
        if (vVar != null) {
            vVar.e(c0321b.c(), j3, f5);
            vVar.draw(AbstractC0272e.a(h3));
        }
    }

    @Override // I.B0
    public final void b() {
    }
}
