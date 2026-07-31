package i0;

import a0.a0;
import a0.g1;
import a7.x;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m0;
import f1.q;
import f1.s;
import j0.l0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import o.e0;
import v.k;
import v.n;
import w1.h0;
import w1.j;
import w1.m;
import w1.u;
import x1.k0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends l implements j, m, u {
    public d B;
    public e C;

    /* renamed from: r, reason: collision with root package name */
    public final v.i f3256r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f3257s;

    /* renamed from: t, reason: collision with root package name */
    public final float f3258t;

    /* renamed from: u, reason: collision with root package name */
    public final b1.b f3259u;

    /* renamed from: v, reason: collision with root package name */
    public final l0 f3260v;

    /* renamed from: w, reason: collision with root package name */
    public h f3261w;

    /* renamed from: x, reason: collision with root package name */
    public float f3262x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3264z;

    /* renamed from: y, reason: collision with root package name */
    public long f3263y = 0;
    public final e0 A = new e0();

    public a(v.i iVar, boolean z3, float f6, b1.b bVar, l0 l0Var) {
        this.f3256r = iVar;
        this.f3257s = z3;
        this.f3258t = f6;
        this.f3259u = bVar;
        this.f3260v = l0Var;
    }

    @Override // w1.m
    public final void A(h0 h0Var) {
        h1.b bVar = h0Var.f7680d;
        h0Var.a();
        h hVar = this.f3261w;
        if (hVar != null) {
            float f6 = this.f3262x;
            long u7 = this.f3259u.u();
            float floatValue = ((Number) ((r.c) hVar.f3284c).d()).floatValue();
            if (floatValue > 0.0f) {
                long b8 = s.b(u7, floatValue);
                if (hVar.f3282a) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (bVar.c() >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.c() & 4294967295L));
                    g1 g1Var = bVar.f3075e;
                    long u8 = g1Var.u();
                    g1Var.m().h();
                    try {
                        ((g1) ((b1.b) g1Var.f84b).f1050e).m().c(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, 1);
                        h1.d.w(h0Var, b8, f6, 0L, 124);
                    } finally {
                        g1Var.m().f();
                        g1Var.M(u8);
                    }
                } else {
                    h1.d.w(h0Var, b8, f6, 0L, 124);
                }
            }
        }
        q m7 = bVar.f3075e.m();
        e eVar = this.C;
        if (eVar != null) {
            long j7 = this.f3263y;
            int B = s6.a.B(this.f3262x);
            long u9 = this.f3259u.u();
            this.f3260v.b();
            eVar.e(B, j7, u9);
            eVar.draw(f1.c.a(m7));
        }
    }

    @Override // y0.l
    public final boolean g0() {
        return false;
    }

    @Override // y0.l
    public final void j0() {
        x.n(f0(), null, new b0.d(this, (g6.c) null, 6), 3);
    }

    @Override // y0.l
    public final void k0() {
        d dVar = this.B;
        if (dVar != null) {
            this.C = null;
            w1.f.l(this);
            a0 a0Var = dVar.f3269g;
            e eVar = (e) ((LinkedHashMap) a0Var.f11e).get(this);
            if (eVar != null) {
                eVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) a0Var.f11e;
                e eVar2 = (e) linkedHashMap.get(this);
                if (eVar2 != null) {
                }
                linkedHashMap.remove(this);
                dVar.f3268f.add(eVar);
            }
        }
    }

    @Override // w1.u
    public final void o(long j7) {
        float u7;
        this.f3264z = true;
        r2.c cVar = w1.f.u(this).f7659y;
        this.f3263y = m.a.R(j7);
        float f6 = this.f3258t;
        if (Float.isNaN(f6)) {
            long j8 = this.f3263y;
            float f8 = c.f3265a;
            float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
            u7 = e1.b.c((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)) / 2.0f;
            if (this.f3257s) {
                u7 += cVar.u(c.f3265a);
            }
        } else {
            u7 = cVar.u(f6);
        }
        this.f3262x = u7;
        e0 e0Var = this.A;
        Object[] objArr = e0Var.f5442a;
        int i = e0Var.f5443b;
        for (int i8 = 0; i8 < i; i8++) {
            r0((n) objArr[i8]);
        }
        e0Var.c();
    }

    public final void r0(n nVar) {
        e eVar;
        if (!(nVar instanceof v.l)) {
            if (nVar instanceof v.m) {
                e eVar2 = this.C;
                if (eVar2 != null) {
                    eVar2.d();
                    return;
                }
                return;
            }
            if (!(nVar instanceof k) || (eVar = this.C) == null) {
                return;
            }
            eVar.d();
            return;
        }
        v.l lVar = (v.l) nVar;
        long j7 = this.f3263y;
        float f6 = this.f3262x;
        d dVar = this.B;
        if (dVar == null) {
            Object obj = (View) w1.f.i(this, k0.f8491e);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    d dVar2 = new d(viewGroup.getContext());
                    viewGroup.addView(dVar2);
                    dVar = dVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof d) {
                        dVar = (d) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.B = dVar;
        }
        ArrayList arrayList = dVar.f3267e;
        a0 a0Var = dVar.f3269g;
        LinkedHashMap linkedHashMap = (LinkedHashMap) a0Var.f11e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) a0Var.f11e;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) a0Var.f12f;
        e eVar3 = (e) linkedHashMap.get(this);
        if (eVar3 == null) {
            ArrayList arrayList2 = dVar.f3268f;
            q6.i.e(arrayList2, "<this>");
            eVar3 = (e) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (eVar3 == null) {
                if (dVar.f3270h > s6.a.t(arrayList)) {
                    eVar3 = new e(dVar.getContext());
                    dVar.addView(eVar3);
                    arrayList.add(eVar3);
                } else {
                    eVar3 = (e) arrayList.get(dVar.f3270h);
                    a aVar = (a) linkedHashMap3.get(eVar3);
                    if (aVar != null) {
                        aVar.C = null;
                        w1.f.l(aVar);
                        e eVar4 = (e) linkedHashMap2.get(aVar);
                        if (eVar4 != null) {
                        }
                        linkedHashMap2.remove(aVar);
                        eVar3.c();
                    }
                }
                int i8 = dVar.f3270h;
                if (i8 < dVar.f3266d - 1) {
                    dVar.f3270h = i8 + 1;
                } else {
                    dVar.f3270h = 0;
                }
            }
            linkedHashMap2.put(this, eVar3);
            linkedHashMap3.put(eVar3, this);
        }
        e eVar5 = eVar3;
        int B = s6.a.B(f6);
        long u7 = this.f3259u.u();
        this.f3260v.b();
        eVar5.b(lVar, this.f3257s, j7, B, u7, new m0(4, this));
        this.C = eVar5;
        w1.f.l(this);
    }
}
