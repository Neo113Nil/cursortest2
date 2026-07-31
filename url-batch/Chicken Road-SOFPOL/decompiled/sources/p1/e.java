package p1;

import a7.u;
import c5.x;
import d1.o;
import q6.s;
import r2.q;
import u.e1;
import w1.x1;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends l implements x1 {

    /* renamed from: r, reason: collision with root package name */
    public final k5.c f5725r;

    /* renamed from: s, reason: collision with root package name */
    public final x f5726s;

    /* renamed from: t, reason: collision with root package name */
    public e f5727t;

    /* renamed from: u, reason: collision with root package name */
    public final String f5728u = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public e(k5.c cVar, x xVar) {
        this.f5725r = cVar;
        this.f5726s = xVar;
    }

    @Override // y0.l
    public final void j0() {
        x xVar = this.f5726s;
        xVar.f1737d = this;
        xVar.f1738e = null;
        this.f5727t = null;
        xVar.f1739f = new o(6, this);
        xVar.f1740g = f0();
    }

    @Override // y0.l
    public final void k0() {
        s sVar = new s();
        w1.f.w(this, new f(sVar, 0));
        e eVar = (e) ((x1) sVar.f6205d);
        this.f5727t = eVar;
        x xVar = this.f5726s;
        xVar.f1738e = eVar;
        if (((e) xVar.f1737d) == this) {
            xVar.f1737d = null;
        }
    }

    @Override // w1.x1
    public final Object m() {
        return this.f5728u;
    }

    public final u r0() {
        e eVar = this.f8718q ? (e) w1.f.j(this) : null;
        u r02 = eVar != null ? eVar.r0() : null;
        if (r02 != null && a7.x.l(r02)) {
            return r02;
        }
        u uVar = (u) this.f5726s.f1740g;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s0(long j7, long j8, i6.c cVar) {
        c cVar2;
        int i;
        long j9;
        long j10;
        long j11;
        boolean z3;
        e eVar;
        long j12;
        long j13;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i8 = cVar2.f5721k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar2.f5721k = i8 - Integer.MIN_VALUE;
                c cVar3 = cVar2;
                Object obj = cVar3.i;
                i = cVar3.f5721k;
                h6.a aVar = h6.a.f3204d;
                if (i != 0) {
                    s6.a.K(obj);
                    cVar3.f5718g = j7;
                    cVar3.f5719h = j8;
                    cVar3.f5721k = 1;
                    obj = this.f5725r.c(j7, j8, cVar3);
                    if (obj != aVar) {
                        j9 = j7;
                        j10 = j8;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j13 = cVar3.f5718g;
                    s6.a.K(obj);
                    j12 = ((q) obj).f6537a;
                    j11 = j13;
                    return new q(q.e(j11, j12));
                }
                j10 = cVar3.f5719h;
                j9 = cVar3.f5718g;
                s6.a.K(obj);
                j11 = ((q) obj).f6537a;
                z3 = this.f8718q;
                if (z3) {
                    eVar = this.f5727t;
                } else {
                    eVar = null;
                    if (z3 && z3) {
                        eVar = (e) w1.f.j(this);
                    }
                }
                if (eVar != null) {
                    j12 = 0;
                    return new q(q.e(j11, j12));
                }
                long e8 = q.e(j9, j11);
                long d8 = q.d(j10, j11);
                cVar3.f5718g = j11;
                cVar3.f5721k = 2;
                obj = eVar.s0(e8, d8, cVar3);
                if (obj != aVar) {
                    j13 = j11;
                    j12 = ((q) obj).f6537a;
                    j11 = j13;
                    return new q(q.e(j11, j12));
                }
                return aVar;
            }
        }
        cVar2 = new c(this, cVar);
        c cVar32 = cVar2;
        Object obj2 = cVar32.i;
        i = cVar32.f5721k;
        h6.a aVar2 = h6.a.f3204d;
        if (i != 0) {
        }
        j11 = ((q) obj2).f6537a;
        z3 = this.f8718q;
        if (z3) {
        }
        if (eVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long t0(int i, long j7, long j8) {
        long j9;
        boolean z3;
        e eVar;
        k5.c cVar = this.f5725r;
        if (cVar.f4185a) {
            e1 e1Var = (e1) cVar.f4186b;
            if (!e1Var.f6962a.b()) {
                j9 = e1Var.h(e1Var.d(e1Var.f6962a.e(e1Var.d(e1Var.g(j8)))));
                z3 = this.f8718q;
                eVar = null;
                if (z3 && z3) {
                    eVar = (e) w1.f.j(this);
                }
                e eVar2 = eVar;
                return e1.b.e(j9, eVar2 != null ? eVar2.t0(i, e1.b.e(j7, j9), e1.b.d(j8, j9)) : 0L);
            }
        }
        j9 = 0;
        z3 = this.f8718q;
        eVar = null;
        if (z3) {
            eVar = (e) w1.f.j(this);
        }
        e eVar22 = eVar;
        return e1.b.e(j9, eVar22 != null ? eVar22.t0(i, e1.b.e(j7, j9), e1.b.d(j8, j9)) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (r14 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r14 == r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u0(long j7, g6.c cVar) {
        d dVar;
        int i;
        long j8;
        long j9;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i8 = dVar.f5724j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar.f5724j = i8 - Integer.MIN_VALUE;
                Object obj = dVar.f5723h;
                i = dVar.f5724j;
                h6.a aVar = h6.a.f3204d;
                if (i != 0) {
                    s6.a.K(obj);
                    boolean z3 = this.f8718q;
                    e eVar = null;
                    if (z3 && z3) {
                        eVar = (e) w1.f.j(this);
                    }
                    if (eVar != null) {
                        dVar.f5722g = j7;
                        dVar.f5724j = 1;
                        obj = eVar.u0(j7, dVar);
                    } else {
                        j8 = j7;
                        j9 = 0;
                        q.d(j8, j9);
                        dVar.f5722g = j9;
                        dVar.f5724j = 2;
                        obj = new q(0L);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j9 = dVar.f5722g;
                        s6.a.K(obj);
                        return new q(q.e(j9, ((q) obj).f6537a));
                    }
                    j7 = dVar.f5722g;
                    s6.a.K(obj);
                }
                j8 = j7;
                j9 = ((q) obj).f6537a;
                q.d(j8, j9);
                dVar.f5722g = j9;
                dVar.f5724j = 2;
                obj = new q(0L);
            }
        }
        dVar = new d(this, (i6.c) cVar);
        Object obj2 = dVar.f5723h;
        i = dVar.f5724j;
        h6.a aVar2 = h6.a.f3204d;
        if (i != 0) {
        }
        j8 = j7;
        j9 = ((q) obj2).f6537a;
        q.d(j8, j9);
        dVar.f5722g = j9;
        dVar.f5724j = 2;
        obj2 = new q(0L);
    }

    public final long v0(int i, long j7) {
        boolean z3 = this.f8718q;
        e eVar = null;
        if (z3 && z3) {
            eVar = (e) w1.f.j(this);
        }
        long v02 = eVar != null ? eVar.v0(i, j7) : 0L;
        e1.b.d(j7, v02);
        return e1.b.e(v02, 0L);
    }
}
