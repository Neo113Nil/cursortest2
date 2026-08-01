package x1;

import a3.a0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import s.d0;
import s.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a2.n f10246a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10247b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10248c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10249d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10250e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f10251f = new d0();
    public final g g = new g();

    /* renamed from: h, reason: collision with root package name */
    public final z f10252h = new z(10);

    public b(a2.n nVar) {
        this.f10246a = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    public final void a(long j, List list, boolean z10) {
        z zVar;
        int i3;
        f fVar;
        f fVar2;
        int size = list.size();
        g gVar = this.g;
        g gVar2 = gVar;
        boolean z11 = true;
        int i10 = 0;
        while (true) {
            zVar = this.f10252h;
            if (i10 >= size) {
                break;
            }
            d1.k kVar = (d1.k) list.get(i10);
            if (kVar.B) {
                kVar.A = new a0(7, this, kVar);
                if (z11) {
                    o0.e eVar = gVar2.f10268a;
                    ?? r14 = eVar.f7317d;
                    int i11 = eVar.f7319i;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            fVar2 = 0;
                            break;
                        }
                        fVar2 = r14[i12];
                        if (Intrinsics.a(((f) fVar2).f10262c, kVar)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    fVar = fVar2;
                    if (fVar != null) {
                        fVar.f10267i = true;
                        fVar.f10263d.a(j);
                        if (z10) {
                            Object d10 = zVar.d(j);
                            if (d10 == null) {
                                d10 = new d0();
                                zVar.f(j, d10);
                            }
                            ((d0) d10).a(fVar);
                        }
                        gVar2 = fVar;
                    } else {
                        z11 = false;
                    }
                }
                fVar = new f(kVar);
                fVar.f10263d.a(j);
                if (z10) {
                    Object d11 = zVar.d(j);
                    if (d11 == null) {
                        d11 = new d0();
                        zVar.f(j, d11);
                    }
                    ((d0) d11).a(fVar);
                }
                gVar2.f10268a.b(fVar);
                gVar2 = fVar;
            }
            i10++;
        }
        if (z10) {
            long[] jArr = zVar.f8400b;
            Object[] objArr = zVar.f8401c;
            long[] jArr2 = zVar.f8399a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j3 = jArr2[i13];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((255 & j3) < 128) {
                                int i17 = (i13 << 3) + i16;
                                long j10 = jArr[i17];
                                d0 d0Var = (d0) objArr[i17];
                                i3 = i14;
                                o0.e eVar2 = gVar.f10268a;
                                Object[] objArr2 = eVar2.f7317d;
                                int i18 = eVar2.f7319i;
                                for (int i19 = 0; i19 < i18; i19++) {
                                    ((f) objArr2[i19]).f(j10, d0Var);
                                }
                            } else {
                                i3 = i14;
                            }
                            j3 >>= i3;
                            i16++;
                            i14 = i3;
                        }
                        if (i15 != i14) {
                            break;
                        }
                    }
                    if (i13 == length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        zVar.a();
    }

    public final boolean b(w7.m mVar, boolean z10) {
        s.p pVar = (s.p) mVar.f10130b;
        a2.n nVar = this.f10246a;
        g gVar = this.g;
        boolean a9 = gVar.a(pVar, nVar, mVar, z10);
        o0.e eVar = gVar.f10268a;
        if (!a9) {
            return false;
        }
        boolean z11 = true;
        this.f10247b = true;
        Object[] objArr = eVar.f7317d;
        int i3 = eVar.f7319i;
        boolean z12 = false;
        for (int i10 = 0; i10 < i3; i10++) {
            z12 = ((f) objArr[i10]).e(mVar, z10) || z12;
        }
        Object[] objArr2 = eVar.f7317d;
        int i11 = eVar.f7319i;
        boolean z13 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            z13 = ((f) objArr2[i12]).d(mVar) || z13;
        }
        gVar.b(mVar);
        if (!z13 && !z12) {
            z11 = false;
        }
        this.f10247b = false;
        if (this.f10250e) {
            this.f10250e = false;
            d0 d0Var = this.f10251f;
            int i13 = d0Var.f8285b;
            for (int i14 = 0; i14 < i13; i14++) {
                d((d1.k) d0Var.f(i14));
            }
            d0Var.d();
        }
        if (this.f10248c) {
            this.f10248c = false;
            c();
        }
        if (this.f10249d) {
            this.f10249d = false;
            gVar.f10268a.g();
        }
        return z11;
    }

    public final void c() {
        if (this.f10247b) {
            this.f10248c = true;
            return;
        }
        g gVar = this.g;
        o0.e eVar = gVar.f10268a;
        Object[] objArr = eVar.f7317d;
        int i3 = eVar.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            ((f) objArr[i10]).c();
        }
        if (this.f10249d) {
            this.f10249d = true;
        } else {
            gVar.f10268a.g();
        }
    }

    public final void d(d1.k kVar) {
        if (this.f10247b) {
            this.f10250e = true;
            this.f10251f.a(kVar);
            return;
        }
        g gVar = this.g;
        d0 d0Var = gVar.f10269b;
        d0Var.d();
        d0Var.a(gVar);
        while (d0Var.i()) {
            g gVar2 = (g) d0Var.k(d0Var.f8285b - 1);
            int i3 = 0;
            while (true) {
                o0.e eVar = gVar2.f10268a;
                if (i3 < eVar.f7319i) {
                    f fVar = (f) eVar.f7317d[i3];
                    if (Intrinsics.a(fVar.f10262c, kVar)) {
                        gVar2.f10268a.k(fVar);
                        fVar.c();
                    } else {
                        d0Var.a(fVar);
                        i3++;
                    }
                }
            }
        }
    }
}
