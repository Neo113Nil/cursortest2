package k1;

import androidx.lifecycle.r0;
import c7.x;
import m2.o;
import m4.z;
import o.f1;
import r1.f;
import r1.q1;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends n implements q1 {

    /* renamed from: s, reason: collision with root package name */
    public final z f5338s;

    /* renamed from: t, reason: collision with root package name */
    public final b1.b f5339t;

    /* renamed from: u, reason: collision with root package name */
    public final String f5340u = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public e(z zVar, b1.b bVar) {
        this.f5338s = zVar;
        this.f5339t = bVar;
    }

    public final x A0() {
        e eVar = this.f8116r ? (e) f.k(this) : null;
        if (eVar != null) {
            return eVar.A0();
        }
        x xVar = (x) this.f5339t.f1232i;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B0(long j8, long j9, j6.c cVar) {
        c cVar2;
        int i7;
        e eVar;
        long j10;
        long j11;
        long j12;
        e eVar2;
        long j13;
        long j14;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i8 = cVar2.f5332k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar2.f5332k = i8 - Integer.MIN_VALUE;
                c cVar3 = cVar2;
                Object obj = cVar3.f5330i;
                i7 = cVar3.f5332k;
                i6.a aVar = i6.a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj);
                    cVar3.f5327f = this;
                    cVar3.f5328g = j8;
                    cVar3.f5329h = j9;
                    cVar3.f5332k = 1;
                    obj = this.f5338s.a(j8, j9, cVar3);
                    if (obj != aVar) {
                        eVar = this;
                        j10 = j8;
                        j11 = j9;
                    }
                    return aVar;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j14 = cVar3.f5328g;
                    d6.a.e(obj);
                    j13 = ((o) obj).f6330a;
                    j12 = j14;
                    return new o(o.e(j12, j13));
                }
                j11 = cVar3.f5329h;
                j10 = cVar3.f5328g;
                eVar = cVar3.f5327f;
                d6.a.e(obj);
                j12 = ((o) obj).f6330a;
                boolean z8 = eVar.f8116r;
                eVar2 = (z8 || !z8) ? null : (e) f.k(eVar);
                if (eVar2 != null) {
                    j13 = 0;
                    return new o(o.e(j12, j13));
                }
                long e9 = o.e(j10, j12);
                long d8 = o.d(j11, j12);
                cVar3.f5327f = null;
                cVar3.f5328g = j12;
                cVar3.f5332k = 2;
                obj = eVar2.B0(e9, d8, cVar3);
                if (obj != aVar) {
                    j14 = j12;
                    j13 = ((o) obj).f6330a;
                    j12 = j14;
                    return new o(o.e(j12, j13));
                }
                return aVar;
            }
        }
        cVar2 = new c(this, cVar);
        c cVar32 = cVar2;
        Object obj2 = cVar32.f5330i;
        i7 = cVar32.f5332k;
        i6.a aVar2 = i6.a.f4956f;
        if (i7 != 0) {
        }
        j12 = ((o) obj2).f6330a;
        boolean z82 = eVar.f8116r;
        if (z82) {
        }
        if (eVar2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long C0(long j8, long j9, int i7) {
        long j10;
        boolean z8;
        e eVar;
        z zVar = this.f5338s;
        if (zVar.f6422a) {
            f1 f1Var = (f1) zVar.f6423b;
            if (!f1Var.f6609a.c()) {
                j10 = f1Var.g(f1Var.c(f1Var.f6609a.e(f1Var.c(f1Var.f(j9)))));
                z8 = this.f8116r;
                eVar = null;
                if (z8 && z8) {
                    eVar = (e) f.k(this);
                }
                e eVar2 = eVar;
                return y0.c.h(j10, eVar2 != null ? eVar2.C0(y0.c.h(j8, j10), y0.c.g(j9, j10), i7) : 0L);
            }
        }
        j10 = 0;
        z8 = this.f8116r;
        eVar = null;
        if (z8) {
            eVar = (e) f.k(this);
        }
        e eVar22 = eVar;
        return y0.c.h(j10, eVar22 != null ? eVar22.C0(y0.c.h(j8, j10), y0.c.g(j9, j10), i7) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (r15 == r7) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D0(long j8, h6.d dVar) {
        d dVar2;
        int i7;
        e eVar;
        long j9;
        long j10;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i8 = dVar2.f5337j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar2.f5337j = i8 - Integer.MIN_VALUE;
                Object obj = dVar2.f5335h;
                i7 = dVar2.f5337j;
                i6.a aVar = i6.a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj);
                    boolean z8 = this.f8116r;
                    e eVar2 = (z8 && z8) ? (e) f.k(this) : null;
                    if (eVar2 != null) {
                        dVar2.f5333f = this;
                        dVar2.f5334g = j8;
                        dVar2.f5337j = 1;
                        obj = eVar2.D0(j8, dVar2);
                        if (obj != aVar) {
                            eVar = this;
                        }
                        return aVar;
                    }
                    eVar = this;
                    j9 = j8;
                    j10 = 0;
                    z zVar = eVar.f5338s;
                    o.d(j9, j10);
                    dVar2.f5333f = null;
                    dVar2.f5334g = j10;
                    dVar2.f5337j = 2;
                    obj = new o(0L);
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j10 = dVar2.f5334g;
                        d6.a.e(obj);
                        return new o(o.e(j10, ((o) obj).f6330a));
                    }
                    j8 = dVar2.f5334g;
                    eVar = dVar2.f5333f;
                    d6.a.e(obj);
                }
                j9 = j8;
                j10 = ((o) obj).f6330a;
                z zVar2 = eVar.f5338s;
                o.d(j9, j10);
                dVar2.f5333f = null;
                dVar2.f5334g = j10;
                dVar2.f5337j = 2;
                obj = new o(0L);
            }
        }
        dVar2 = new d(this, (j6.c) dVar);
        Object obj2 = dVar2.f5335h;
        i7 = dVar2.f5337j;
        i6.a aVar2 = i6.a.f4956f;
        if (i7 != 0) {
        }
        j9 = j8;
        j10 = ((o) obj2).f6330a;
        z zVar22 = eVar.f5338s;
        o.d(j9, j10);
        dVar2.f5333f = null;
        dVar2.f5334g = j10;
        dVar2.f5337j = 2;
        obj2 = new o(0L);
    }

    public final long E0(long j8, int i7) {
        boolean z8 = this.f8116r;
        e eVar = null;
        if (z8 && z8) {
            eVar = (e) f.k(this);
        }
        long E0 = eVar != null ? eVar.E0(j8, i7) : 0L;
        y0.c.g(j8, E0);
        return y0.c.h(E0, 0L);
    }

    @Override // r1.q1
    public final Object o() {
        return this.f5340u;
    }

    @Override // s0.n
    public final void s0() {
        b1.b bVar = this.f5339t;
        bVar.f1230g = this;
        bVar.f1231h = new r0(14, this);
        bVar.f1232i = o0();
    }

    @Override // s0.n
    public final void t0() {
        b1.b bVar = this.f5339t;
        if (((e) bVar.f1230g) == this) {
            bVar.f1230g = null;
        }
    }
}
