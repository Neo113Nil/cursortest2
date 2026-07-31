package m0;

import A.h;
import G1.m;
import O0.o;
import U.p;
import a0.C0238c;
import p.C0756c0;
import p.C0793v0;
import q2.InterfaceC0835w;
import t0.AbstractC0993f;
import t0.r0;

/* loaded from: classes.dex */
public final class e extends p implements r0 {

    /* renamed from: q, reason: collision with root package name */
    public final C0756c0 f6932q;

    /* renamed from: r, reason: collision with root package name */
    public final m f6933r;

    /* renamed from: s, reason: collision with root package name */
    public final String f6934s = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public e(C0756c0 c0756c0, m mVar) {
        this.f6932q = c0756c0;
        this.f6933r = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long A0(long j3, long j4, int i3) {
        long j5;
        boolean z3;
        e eVar;
        C0756c0 c0756c0 = this.f6932q;
        if (c0756c0.f7650a) {
            C0793v0 c0793v0 = (C0793v0) c0756c0.f7651b;
            if (!c0793v0.f7778a.e()) {
                j5 = c0793v0.g(c0793v0.c(c0793v0.f7778a.b(c0793v0.c(c0793v0.f(j4)))));
                z3 = this.f4501p;
                eVar = null;
                if (z3 && z3) {
                    eVar = (e) AbstractC0993f.k(this);
                }
                e eVar2 = eVar;
                return C0238c.h(j5, eVar2 != null ? eVar2.A0(C0238c.h(j3, j5), C0238c.g(j4, j5), i3) : 0L);
            }
        }
        j5 = 0;
        z3 = this.f4501p;
        eVar = null;
        if (z3) {
            eVar = (e) AbstractC0993f.k(this);
        }
        e eVar22 = eVar;
        return C0238c.h(j5, eVar22 != null ? eVar22.A0(C0238c.h(j3, j5), C0238c.g(j4, j5), i3) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B0(long j3, V1.d dVar) {
        d dVar2;
        Object obj;
        W1.a aVar;
        int i3;
        e eVar;
        long j4;
        long j5;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i4 = dVar2.f6931k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar2.f6931k = i4 - Integer.MIN_VALUE;
                obj = dVar2.f6929i;
                aVar = W1.a.f4608d;
                i3 = dVar2.f6931k;
                if (i3 != 0) {
                    R1.a.e(obj);
                    boolean z3 = this.f4501p;
                    e eVar2 = (z3 && z3) ? (e) AbstractC0993f.k(this) : null;
                    if (eVar2 == null) {
                        eVar = this;
                        j4 = j3;
                        j5 = 0;
                        C0756c0 c0756c0 = eVar.f6932q;
                        o.d(j4, j5);
                        dVar2.f6927g = null;
                        dVar2.f6928h = j5;
                        dVar2.f6931k = 2;
                        obj = new o(0L);
                        if (obj == aVar) {
                            return aVar;
                        }
                        return new o(o.e(j5, ((o) obj).f3749a));
                    }
                    dVar2.f6927g = this;
                    dVar2.f6928h = j3;
                    dVar2.f6931k = 1;
                    obj = eVar2.B0(j3, dVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                    eVar = this;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j5 = dVar2.f6928h;
                        R1.a.e(obj);
                        return new o(o.e(j5, ((o) obj).f3749a));
                    }
                    j3 = dVar2.f6928h;
                    eVar = dVar2.f6927g;
                    R1.a.e(obj);
                }
                long j6 = j3;
                j5 = ((o) obj).f3749a;
                j4 = j6;
                C0756c0 c0756c02 = eVar.f6932q;
                o.d(j4, j5);
                dVar2.f6927g = null;
                dVar2.f6928h = j5;
                dVar2.f6931k = 2;
                obj = new o(0L);
                if (obj == aVar) {
                }
                return new o(o.e(j5, ((o) obj).f3749a));
            }
        }
        dVar2 = new d(this, (X1.c) dVar);
        obj = dVar2.f6929i;
        aVar = W1.a.f4608d;
        i3 = dVar2.f6931k;
        if (i3 != 0) {
        }
        long j62 = j3;
        j5 = ((o) obj).f3749a;
        j4 = j62;
        C0756c0 c0756c022 = eVar.f6932q;
        o.d(j4, j5);
        dVar2.f6927g = null;
        dVar2.f6928h = j5;
        dVar2.f6931k = 2;
        obj = new o(0L);
        if (obj == aVar) {
        }
        return new o(o.e(j5, ((o) obj).f3749a));
    }

    public final long C0(long j3, int i3) {
        boolean z3 = this.f4501p;
        e eVar = null;
        if (z3 && z3) {
            eVar = (e) AbstractC0993f.k(this);
        }
        long C02 = eVar != null ? eVar.C0(j3, i3) : 0L;
        C0238c.g(j3, C02);
        return C0238c.h(C02, 0L);
    }

    @Override // U.p
    public final void q0() {
        m mVar = this.f6933r;
        mVar.f2116b = this;
        mVar.f2117c = new h(23, this);
        mVar.f2118d = m0();
    }

    @Override // U.p
    public final void r0() {
        m mVar = this.f6933r;
        if (((e) mVar.f2116b) == this) {
            mVar.f2116b = null;
        }
    }

    @Override // t0.r0
    public final Object w() {
        return this.f6934s;
    }

    public final InterfaceC0835w y0() {
        e eVar = this.f4501p ? (e) AbstractC0993f.k(this) : null;
        if (eVar != null) {
            return eVar.y0();
        }
        InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f6933r.f2118d;
        if (interfaceC0835w != null) {
            return interfaceC0835w;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z0(long j3, long j4, X1.c cVar) {
        c cVar2;
        int i3;
        long j5;
        long j6;
        e eVar;
        e eVar2;
        long j7;
        long j8;
        long j9;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i4 = cVar2.f6926l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cVar2.f6926l = i4 - Integer.MIN_VALUE;
                Object obj = cVar2.f6924j;
                W1.a aVar = W1.a.f4608d;
                i3 = cVar2.f6926l;
                if (i3 != 0) {
                    R1.a.e(obj);
                    cVar2.f6921g = this;
                    j5 = j3;
                    cVar2.f6922h = j5;
                    j6 = j4;
                    cVar2.f6923i = j6;
                    cVar2.f6926l = 1;
                    obj = this.f6932q.a(j3, j4, cVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                    eVar = this;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j9 = cVar2.f6922h;
                        R1.a.e(obj);
                        j8 = ((o) obj).f3749a;
                        j7 = j9;
                        return new o(o.e(j7, j8));
                    }
                    long j10 = cVar2.f6923i;
                    long j11 = cVar2.f6922h;
                    eVar = cVar2.f6921g;
                    R1.a.e(obj);
                    j6 = j10;
                    j5 = j11;
                }
                long j12 = ((o) obj).f3749a;
                boolean z3 = eVar.f4501p;
                eVar2 = (z3 || !z3) ? null : (e) AbstractC0993f.k(eVar);
                if (eVar2 != null) {
                    j7 = j12;
                    j8 = 0;
                    return new o(o.e(j7, j8));
                }
                long e3 = o.e(j5, j12);
                long d3 = o.d(j6, j12);
                cVar2.f6921g = null;
                cVar2.f6922h = j12;
                cVar2.f6926l = 2;
                obj = eVar2.z0(e3, d3, cVar2);
                if (obj == aVar) {
                    return aVar;
                }
                j9 = j12;
                j8 = ((o) obj).f3749a;
                j7 = j9;
                return new o(o.e(j7, j8));
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f6924j;
        W1.a aVar2 = W1.a.f4608d;
        i3 = cVar2.f6926l;
        if (i3 != 0) {
        }
        long j122 = ((o) obj2).f3749a;
        boolean z32 = eVar.f4501p;
        if (z32) {
        }
        if (eVar2 != null) {
        }
    }
}
