package z;

import A2.w;
import B0.AbstractC0008e;
import B0.C;
import B0.C0005b;
import B0.C0007d;
import B0.y;
import I2.l;
import M1.u;
import a.AbstractC0157a;
import b0.AbstractC0259J;
import b0.C0262M;
import b0.C0288u;
import b0.InterfaceC0285r;
import d0.AbstractC0322c;
import d0.C0325f;
import e2.AbstractC0381e;
import f2.InterfaceC0390e;
import h.AbstractC0416e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r0.AbstractC0830c;
import r0.B;
import r0.H;
import r0.z;
import r1.r;
import t0.AbstractC0898f;
import t0.F;
import t0.InterfaceC0907o;
import t0.InterfaceC0914w;
import t0.O;
import t0.n0;
import z0.C1076a;
import z0.q;
import z0.s;
import z0.t;

/* renamed from: z.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1072h extends U.k implements InterfaceC0914w, InterfaceC0907o, n0 {

    /* renamed from: A, reason: collision with root package name */
    public A2.g f8912A;
    public Y1.c B;
    public Map C;
    public C1068d D;

    /* renamed from: E, reason: collision with root package name */
    public C1071g f8913E;

    /* renamed from: F, reason: collision with root package name */
    public C1070f f8914F;

    /* renamed from: q, reason: collision with root package name */
    public C0007d f8915q;

    /* renamed from: r, reason: collision with root package name */
    public C f8916r;

    /* renamed from: s, reason: collision with root package name */
    public F0.e f8917s;

    /* renamed from: t, reason: collision with root package name */
    public Y1.c f8918t;

    /* renamed from: u, reason: collision with root package name */
    public int f8919u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8920v;

    /* renamed from: w, reason: collision with root package name */
    public int f8921w;

    /* renamed from: x, reason: collision with root package name */
    public int f8922x;

    /* renamed from: y, reason: collision with root package name */
    public List f8923y;

    /* renamed from: z, reason: collision with root package name */
    public Y1.c f8924z;

    @Override // t0.n0
    public final boolean L() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019f  */
    @Override // t0.InterfaceC0914w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B b(O o3, z zVar, long j3) {
        C1068d v0;
        long j4;
        int i3;
        B0.z zVar2;
        C1070f c1070f = this.f8914F;
        if (c1070f == null || !c1070f.f8908c || (v0 = c1070f.f8909d) == null) {
            v0 = v0();
            v0.a(o3);
        } else {
            v0.a(o3);
        }
        M0.j layoutDirection = o3.getLayoutDirection();
        boolean z3 = true;
        if (v0.f8883g > 1) {
            C1066b c1066b = v0.f8885i;
            C c3 = v0.f8878b;
            M0.b bVar = v0.f8887k;
            Z1.i.c(bVar);
            C1066b B = AbstractC0381e.B(c1066b, layoutDirection, c3, bVar, v0.f8879c);
            v0.f8885i = B;
            j4 = B.a(j3, v0.f8883g);
        } else {
            j4 = j3;
        }
        B0.z zVar3 = v0.f8890n;
        if (zVar3 != null) {
            B0.j jVar = zVar3.f395b;
            if (!jVar.f268a.a()) {
                y yVar = zVar3.f394a;
                if (layoutDirection == yVar.f391h) {
                    long j5 = yVar.f393j;
                    if (M0.a.b(j4, j5) || (M0.a.h(j4) == M0.a.h(j5) && M0.a.g(j4) >= jVar.f272e && !jVar.f270c)) {
                        B0.z zVar4 = v0.f8890n;
                        Z1.i.c(zVar4);
                        if (M0.a.b(j4, zVar4.f394a.f393j)) {
                            z3 = false;
                        } else {
                            B0.z zVar5 = v0.f8890n;
                            Z1.i.c(zVar5);
                            v0.f8890n = v0.b(layoutDirection, j4, zVar5.f395b);
                        }
                        zVar2 = v0.f8890n;
                        if (zVar2 != null) {
                            throw new IllegalStateException("You must call layoutWithConstraints first");
                        }
                        zVar2.f395b.f268a.a();
                        if (z3) {
                            AbstractC0898f.r(this, 2).H0();
                            Y1.c cVar = this.f8918t;
                            if (cVar != null) {
                                cVar.j(zVar2);
                            }
                            Map map = this.C;
                            if (map == null) {
                                map = new LinkedHashMap(2);
                            }
                            map.put(AbstractC0830c.f7138a, Integer.valueOf(Math.round(zVar2.f397d)));
                            map.put(AbstractC0830c.f7139b, Integer.valueOf(Math.round(zVar2.f398e)));
                            this.C = map;
                        }
                        Y1.c cVar2 = this.f8924z;
                        if (cVar2 != null) {
                            cVar2.j(zVar2.f399f);
                        }
                        long j6 = zVar2.f396c;
                        int i4 = (int) (j6 >> 32);
                        int i5 = (int) (j6 & 4294967295L);
                        int min = Math.min(i4, 262142);
                        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
                        int h3 = l.h(min2 == Integer.MAX_VALUE ? min : min2);
                        H b2 = zVar.b(l.a(min, min2, Math.min(h3, i5), i5 != Integer.MAX_VALUE ? Math.min(h3, i5) : Integer.MAX_VALUE));
                        Map map2 = this.C;
                        Z1.i.c(map2);
                        return o3.I(i4, i5, map2, new Y.g(b2, 8));
                    }
                }
            }
        }
        w wVar = v0.f8888l;
        if (wVar == null || layoutDirection != v0.f8889m || wVar.a()) {
            v0.f8889m = layoutDirection;
            C0007d c0007d = v0.f8877a;
            C O3 = l.O(v0.f8878b, layoutDirection);
            M0.b bVar2 = v0.f8887k;
            Z1.i.c(bVar2);
            F0.e eVar = v0.f8879c;
            List list = v0.f8884h;
            if (list == null) {
                list = u.f2803d;
            }
            wVar = new w(c0007d, O3, list, bVar2, eVar);
        }
        v0.f8888l = wVar;
        long r3 = AbstractC0416e.r(j4, v0.f8881e, v0.f8880d, wVar.b());
        boolean z4 = v0.f8881e;
        int i6 = v0.f8880d;
        int i7 = v0.f8882f;
        if (z4 || !AbstractC0157a.y(i6, 2)) {
            if (i7 < 1) {
                i7 = 1;
            }
            i3 = i7;
        } else {
            i3 = 1;
        }
        v0.f8890n = v0.b(layoutDirection, j4, new B0.j(wVar, r3, i3, AbstractC0157a.y(v0.f8880d, 2)));
        zVar2 = v0.f8890n;
        if (zVar2 != null) {
        }
    }

    @Override // t0.InterfaceC0907o
    public final void d(F f3) {
        C1068d v0;
        if (this.p) {
            InterfaceC0285r h3 = f3.f7748d.f4444e.h();
            C1070f c1070f = this.f8914F;
            if (c1070f == null || !c1070f.f8908c || (v0 = c1070f.f8909d) == null) {
                v0 = v0();
                v0.a(f3);
            } else {
                v0.a(f3);
            }
            B0.z zVar = v0.f8890n;
            if (zVar == null) {
                throw new IllegalStateException("You must call layoutWithConstraints first");
            }
            long j3 = zVar.f396c;
            float f4 = (int) (j3 >> 32);
            B0.j jVar = zVar.f395b;
            boolean z3 = ((f4 > jVar.f271d ? 1 : (f4 == jVar.f271d ? 0 : -1)) < 0 || jVar.f270c || (((float) ((int) (j3 & 4294967295L))) > jVar.f272e ? 1 : (((float) ((int) (j3 & 4294967295L))) == jVar.f272e ? 0 : -1)) < 0) && !AbstractC0157a.y(this.f8919u, 3);
            if (z3) {
                a0.d f5 = AbstractC0157a.f(0L, I2.d.h((int) (j3 >> 32), (int) (j3 & 4294967295L)));
                h3.f();
                InterfaceC0285r.d(h3, f5);
            }
            try {
                B0.w wVar = this.f8916r.f235a;
                L0.g gVar = wVar.f377m;
                if (gVar == null) {
                    gVar = L0.g.f2682b;
                }
                L0.g gVar2 = gVar;
                C0262M c0262m = wVar.f378n;
                if (c0262m == null) {
                    c0262m = C0262M.f4239d;
                }
                C0262M c0262m2 = c0262m;
                AbstractC0322c abstractC0322c = wVar.f379o;
                if (abstractC0322c == null) {
                    abstractC0322c = C0325f.f4448b;
                }
                AbstractC0322c abstractC0322c2 = abstractC0322c;
                AbstractC0259J c3 = wVar.f365a.c();
                if (c3 != null) {
                    B0.j.a(jVar, h3, c3, this.f8916r.f235a.f365a.a(), c0262m2, gVar2, abstractC0322c2);
                } else {
                    A2.g gVar3 = this.f8912A;
                    long o3 = gVar3 != null ? gVar3.o() : C0288u.f4296f;
                    if (o3 == 16) {
                        o3 = this.f8916r.b() != 16 ? this.f8916r.b() : C0288u.f4292b;
                    }
                    long j4 = o3;
                    h3.f();
                    ArrayList arrayList = jVar.f275h;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        B0.l lVar = (B0.l) arrayList.get(i3);
                        lVar.f278a.e(h3, j4, c0262m2, gVar2, abstractC0322c2, 3);
                        h3.r(0.0f, lVar.f278a.b());
                        i3++;
                        size = size;
                        arrayList = arrayList;
                    }
                    h3.a();
                }
                if (z3) {
                    h3.a();
                }
                C1070f c1070f2 = this.f8914F;
                if (c1070f2 == null || !c1070f2.f8908c) {
                    C0007d c0007d = this.f8915q;
                    int length = c0007d.f251a.length();
                    List list = c0007d.f254d;
                    if (list != null) {
                        int size2 = list.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            C0005b c0005b = (C0005b) list.get(i4);
                            if ((c0005b.f246a instanceof B0.i) && AbstractC0008e.b(0, length, c0005b.f247b, c0005b.f248c)) {
                                break;
                            }
                        }
                    }
                }
                List list2 = this.f8923y;
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                f3.b();
            } catch (Throwable th) {
                if (z3) {
                    h3.a();
                }
                throw th;
            }
        }
    }

    @Override // t0.n0
    public final void h(z0.i iVar) {
        C1071g c1071g = this.f8913E;
        if (c1071g == null) {
            c1071g = new C1071g(this, 0);
            this.f8913E = c1071g;
        }
        C0007d c0007d = this.f8915q;
        InterfaceC0390e[] interfaceC0390eArr = s.f9036a;
        iVar.d(q.f9028t, AbstractC0157a.M(c0007d));
        C1070f c1070f = this.f8914F;
        if (c1070f != null) {
            C0007d c0007d2 = c1070f.f8907b;
            t tVar = q.f9029u;
            InterfaceC0390e[] interfaceC0390eArr2 = s.f9036a;
            InterfaceC0390e interfaceC0390e = interfaceC0390eArr2[14];
            tVar.a(iVar, c0007d2);
            boolean z3 = c1070f.f8908c;
            t tVar2 = q.f9030v;
            InterfaceC0390e interfaceC0390e2 = interfaceC0390eArr2[15];
            tVar2.a(iVar, Boolean.valueOf(z3));
        }
        iVar.d(z0.h.f8966j, new C1076a(null, new C1071g(this, 1)));
        iVar.d(z0.h.f8967k, new C1076a(null, new C1071g(this, 2)));
        iVar.d(z0.h.f8968l, new C1076a(null, new r(9, this)));
        iVar.d(z0.h.f8957a, new C1076a(null, c1071g));
    }

    public final C1068d v0() {
        if (this.D == null) {
            this.D = new C1068d(this.f8915q, this.f8916r, this.f8917s, this.f8919u, this.f8920v, this.f8921w, this.f8922x, this.f8923y);
        }
        C1068d c1068d = this.D;
        Z1.i.c(c1068d);
        return c1068d;
    }
}
