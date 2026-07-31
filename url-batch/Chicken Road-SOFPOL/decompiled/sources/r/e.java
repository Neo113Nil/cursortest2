package r;

import android.view.View;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import m0.y1;
import x1.d2;
import x1.f2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6277h = 0;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public int f6278j;

    /* renamed from: k, reason: collision with root package name */
    public Object f6279k;

    /* renamed from: l, reason: collision with root package name */
    public Object f6280l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f6281m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f6282n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f6283o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c7.g gVar, c cVar, m0.z0 z0Var, m0.z0 z0Var2, g6.c cVar2) {
        super(2, cVar2);
        this.f6280l = gVar;
        this.f6281m = cVar;
        this.f6282n = z0Var;
        this.f6283o = z0Var2;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        a7.u uVar = (a7.u) obj;
        g6.c cVar = (g6.c) obj2;
        switch (this.f6277h) {
        }
        return ((e) l(cVar, uVar)).p(c6.m.f1757a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [i6.i, p6.c] */
    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f6277h) {
            case 0:
                e eVar = new e((c7.g) this.f6280l, (c) this.f6281m, (m0.z0) this.f6282n, (m0.z0) this.f6283o, cVar);
                eVar.i = obj;
                return eVar;
            case 1:
                e eVar2 = new e((h0) this.f6282n, (i6.i) this.f6283o, cVar);
                eVar2.f6281m = obj;
                return eVar2;
            default:
                e eVar3 = new e((q6.s) this.f6279k, (y1) this.f6280l, (androidx.lifecycle.u) this.f6281m, (d2) this.f6282n, (View) this.f6283o, cVar);
                eVar3.i = obj;
                return eVar3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a9 A[Catch: all -> 0x0199, TryCatch #3 {all -> 0x0199, blocks: (B:54:0x0183, B:55:0x0185, B:57:0x018c, B:68:0x01a1, B:69:0x01a3, B:71:0x01a9, B:77:0x01b0), top: B:47:0x00cb }] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [p6.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x01f6 -> B:106:0x01f9). Please report as a decompilation issue!!! */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        c7.b it;
        a7.u uVar;
        h6.a aVar;
        g0 g0Var;
        ?? r12;
        i7.a aVar2;
        h0 h0Var;
        h0 h0Var2;
        Throwable th;
        g0 g0Var2;
        i7.a aVar3;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Throwable th2;
        a7.s0 s0Var;
        a7.h1 h1Var;
        switch (this.f6277h) {
            case 0:
                c7.g gVar = (c7.g) this.f6280l;
                int i = this.f6278j;
                if (i == 0) {
                    s6.a.K(obj);
                    a7.u uVar2 = (a7.u) this.i;
                    it = gVar.iterator();
                    uVar = uVar2;
                    this.i = uVar;
                    this.f6279k = it;
                    this.f6278j = 1;
                    obj = it.b(this);
                    aVar = h6.a.f3204d;
                    if (obj == aVar) {
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (c7.b) this.f6279k;
                    uVar = (a7.u) this.i;
                    s6.a.K(obj);
                    if (((Boolean) obj).booleanValue()) {
                        Object c8 = it.c();
                        Object s5 = gVar.s();
                        if (s5 instanceof c7.i) {
                            s5 = null;
                        }
                        a7.x.n(uVar, null, new c2.a(s5 == null ? c8 : s5, (c) this.f6281m, (m0.z0) this.f6282n, (m0.z0) this.f6283o, null, 4), 3);
                        this.i = uVar;
                        this.f6279k = it;
                        this.f6278j = 1;
                        obj = it.b(this);
                        aVar = h6.a.f3204d;
                        if (obj == aVar) {
                            return aVar;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            return c6.m.f1757a;
                        }
                    }
                }
            case 1:
                h0 h0Var3 = (h0) this.f6282n;
                int i8 = this.f6278j;
                h6.a aVar4 = h6.a.f3204d;
                try {
                    try {
                        if (i8 == 0) {
                            s6.a.K(obj);
                            g6.f l3 = ((a7.u) this.f6281m).h().l(a7.r.f297e);
                            q6.i.b(l3);
                            g0 g0Var3 = new g0((a7.s0) l3);
                            AtomicReference atomicReference3 = h0Var3.f6299a;
                            while (true) {
                                g0 g0Var4 = (g0) atomicReference3.get();
                                if (g0Var4 != null) {
                                    f0 f0Var = f0.f6290d;
                                    if (f0Var.compareTo(f0Var) < 0) {
                                        throw new CancellationException("Current mutation had a higher priority");
                                    }
                                }
                                while (!atomicReference3.compareAndSet(g0Var4, g0Var3)) {
                                    if (atomicReference3.get() != g0Var4) {
                                        break;
                                    }
                                }
                                if (g0Var4 != null) {
                                    g0Var4.f6295a.a(new e7.l("Mutation interrupted", 1));
                                }
                                i7.c cVar = h0Var3.f6300b;
                                i6.i iVar = (i6.i) this.f6283o;
                                this.f6281m = g0Var3;
                                this.f6279k = cVar;
                                this.i = iVar;
                                this.f6280l = h0Var3;
                                this.f6278j = 1;
                                if (cVar.d(this) == aVar4) {
                                    return aVar4;
                                }
                                g0Var = g0Var3;
                                r12 = iVar;
                                aVar2 = cVar;
                            }
                        } else {
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h0Var2 = (h0) this.i;
                                aVar3 = (i7.a) this.f6279k;
                                g0Var2 = (g0) this.f6281m;
                                try {
                                    s6.a.K(obj);
                                    atomicReference2 = h0Var2.f6299a;
                                    while (!atomicReference2.compareAndSet(g0Var2, null) && atomicReference2.get() == g0Var2) {
                                    }
                                    ((i7.c) aVar3).f(null);
                                    return obj;
                                } catch (Throwable th3) {
                                    th = th3;
                                    atomicReference = h0Var2.f6299a;
                                    while (!atomicReference.compareAndSet(g0Var2, null)) {
                                        if (atomicReference.get() != g0Var2) {
                                            throw th;
                                        }
                                    }
                                    throw th;
                                }
                            }
                            h0Var3 = (h0) this.f6280l;
                            p6.c cVar2 = (p6.c) this.i;
                            aVar2 = (i7.a) this.f6279k;
                            g0Var = (g0) this.f6281m;
                            s6.a.K(obj);
                            r12 = cVar2;
                        }
                        this.f6281m = g0Var;
                        this.f6279k = aVar2;
                        this.i = h0Var;
                        this.f6280l = null;
                        this.f6278j = 2;
                        Object i9 = r12.i(this);
                        if (i9 == aVar4) {
                            return aVar4;
                        }
                        h0Var2 = h0Var;
                        obj = i9;
                        aVar3 = aVar2;
                        g0Var2 = g0Var;
                        atomicReference2 = h0Var2.f6299a;
                        while (!atomicReference2.compareAndSet(g0Var2, null)) {
                        }
                        ((i7.c) aVar3).f(null);
                        return obj;
                    } catch (Throwable th4) {
                        h0Var2 = h0Var;
                        th = th4;
                        g0Var2 = g0Var;
                        atomicReference = h0Var2.f6299a;
                        while (!atomicReference.compareAndSet(g0Var2, null)) {
                        }
                        throw th;
                    }
                    h0Var = h0Var3;
                } catch (Throwable th5) {
                    ((i7.c) 2).f(null);
                    throw th5;
                }
            default:
                d2 d2Var = (d2) this.f6282n;
                androidx.lifecycle.u uVar3 = (androidx.lifecycle.u) this.f6281m;
                int i10 = this.f6278j;
                c6.m mVar = c6.m.f1757a;
                g6.c cVar3 = null;
                if (i10 == 0) {
                    s6.a.K(obj);
                    a7.u uVar4 = (a7.u) this.i;
                    try {
                        x1.m1 m1Var = (x1.m1) ((q6.s) this.f6279k).f6205d;
                        if (m1Var != null) {
                            d7.l0 a8 = f2.a(((View) this.f6283o).getContext().getApplicationContext());
                            m1Var.f8509d.h(((Number) a8.getValue()).floatValue());
                            h1Var = a7.x.n(uVar4, null, new b0.d(a8, m1Var, cVar3, 15), 3);
                        } else {
                            h1Var = null;
                        }
                        try {
                            y1 y1Var = (y1) this.f6280l;
                            this.i = h1Var;
                            this.f6278j = 1;
                            m0.x1 x1Var = new m0.x1(y1Var, null);
                            g6.h hVar = this.f3460e;
                            q6.i.b(hVar);
                            Object u7 = a7.x.u(y1Var.f5188a, new m0.v1(y1Var, x1Var, m0.b.o(hVar), (g6.c) null), this);
                            h6.a aVar5 = h6.a.f3204d;
                            if (u7 != aVar5) {
                                u7 = mVar;
                            }
                            if (u7 != aVar5) {
                                u7 = mVar;
                            }
                            if (u7 == aVar5) {
                                return aVar5;
                            }
                            s0Var = h1Var;
                        } catch (Throwable th6) {
                            th = th6;
                            s0Var = h1Var;
                            th2 = th;
                            if (s0Var != null) {
                                s0Var.a(null);
                            }
                            uVar3.g().f(d2Var);
                            throw th2;
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                        s0Var = null;
                        if (s0Var != null) {
                        }
                        uVar3.g().f(d2Var);
                        throw th2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s0Var = (a7.s0) this.i;
                    try {
                        s6.a.K(obj);
                    } catch (Throwable th8) {
                        th = th8;
                        th2 = th;
                        if (s0Var != null) {
                        }
                        uVar3.g().f(d2Var);
                        throw th2;
                    }
                }
                if (s0Var != null) {
                    s0Var.a(null);
                }
                uVar3.g().f(d2Var);
                return mVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q6.s sVar, y1 y1Var, androidx.lifecycle.u uVar, d2 d2Var, View view, g6.c cVar) {
        super(2, cVar);
        this.f6279k = sVar;
        this.f6280l = y1Var;
        this.f6281m = uVar;
        this.f6282n = d2Var;
        this.f6283o = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(h0 h0Var, p6.c cVar, g6.c cVar2) {
        super(2, cVar2);
        this.f6282n = h0Var;
        this.f6283o = (i6.i) cVar;
    }
}
