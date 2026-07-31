package o;

import F.D0;
import I.C0089d;
import m.C0604n;
import m.InterfaceC0602l;

/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: f, reason: collision with root package name */
    public static final C0604n f6407f = new C0604n(0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final m.A0 f6408a;

    /* renamed from: b, reason: collision with root package name */
    public long f6409b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public C0604n f6410c = f6407f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6411d;

    /* renamed from: e, reason: collision with root package name */
    public float f6412e;

    public A0(InterfaceC0602l interfaceC0602l) {
        this.f6408a = interfaceC0602l.a(m.z0.f5885a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        if (r13 != 0.0f) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r12v4, types: [Y1.a] */
    /* JADX WARN: Type inference failed for: r13v4, types: [Y1.c] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [P1.d, o.y0] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [o.A0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b3 -> B:24:0x00b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(R.h hVar, E2.j jVar, R1.c cVar) {
        ?? r22;
        int i3;
        float f3;
        A0 a02;
        y0 y0Var;
        R.h hVar2;
        E2.j jVar2;
        Y1.a aVar;
        A0 a03;
        try {
            if (cVar instanceof y0) {
                y0 y0Var2 = (y0) cVar;
                int i4 = y0Var2.f6671j;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    y0Var2.f6671j = i4 - Integer.MIN_VALUE;
                    r22 = y0Var2;
                    Object obj = r22.f6669h;
                    Q1.a aVar2 = Q1.a.f3113d;
                    i3 = r22.f6671j;
                    C0604n c0604n = f6407f;
                    if (i3 != 0) {
                        I2.l.Q(obj);
                        if (this.f6411d) {
                            throw new IllegalStateException("animateToZero called while previous animation is running");
                        }
                        U.n nVar = (U.n) r22.getContext().k(U.a.f3292q);
                        float z3 = nVar != null ? nVar.z() : 1.0f;
                        this.f6411d = true;
                        f3 = z3;
                        a02 = this;
                        y0Var = r22;
                        hVar2 = hVar;
                        jVar2 = jVar;
                        if (Math.abs(a02.f6412e) >= 0.01f) {
                            z0 z0Var = new z0(a02, f3, hVar2);
                            y0Var.f6665d = a02;
                            y0Var.f6666e = hVar2;
                            y0Var.f6667f = jVar2;
                            y0Var.f6668g = f3;
                            y0Var.f6671j = 1;
                            if (C0089d.F(y0Var.getContext()).j(z0Var, y0Var) == aVar2) {
                                return aVar2;
                            }
                            jVar2.b();
                        }
                        A0 a04 = a02;
                        E2.j jVar3 = jVar2;
                        A0 a05 = a04;
                        if (Math.abs(a05.f6412e) == 0.0f) {
                            a03 = a05;
                            a03.f6409b = Long.MIN_VALUE;
                            a03.f6410c = c0604n;
                            a03.f6411d = false;
                            return L1.z.f2729a;
                        }
                        D0 d02 = new D0(a05, 24, hVar2);
                        y0Var.f6665d = a05;
                        y0Var.f6666e = jVar3;
                        y0Var.f6667f = null;
                        y0Var.f6671j = 2;
                        if (C0089d.F(y0Var.getContext()).j(d02, y0Var) == aVar2) {
                            return aVar2;
                        }
                        aVar = jVar3;
                        r22 = a05;
                        aVar.b();
                        a03 = r22;
                        a03.f6409b = Long.MIN_VALUE;
                        a03.f6410c = c0604n;
                        a03.f6411d = false;
                        return L1.z.f2729a;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (Y1.a) r22.f6666e;
                        A0 a06 = r22.f6665d;
                        I2.l.Q(obj);
                        r22 = a06;
                        aVar.b();
                        a03 = r22;
                        a03.f6409b = Long.MIN_VALUE;
                        a03.f6410c = c0604n;
                        a03.f6411d = false;
                        return L1.z.f2729a;
                    }
                    float f4 = r22.f6668g;
                    ?? r12 = r22.f6667f;
                    ?? r13 = (Y1.c) r22.f6666e;
                    A0 a07 = r22.f6665d;
                    try {
                        I2.l.Q(obj);
                        hVar2 = r13;
                        f3 = f4;
                        a02 = a07;
                        y0Var = r22;
                        jVar2 = r12;
                        try {
                            jVar2.b();
                        } catch (Throwable th) {
                            th = th;
                            r22 = a02;
                            r22.f6409b = Long.MIN_VALUE;
                            r22.f6410c = c0604n;
                            r22.f6411d = false;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r22 = a07;
                        r22.f6409b = Long.MIN_VALUE;
                        r22.f6410c = c0604n;
                        r22.f6411d = false;
                        throw th;
                    }
                }
            }
            if (i3 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        r22 = new y0(this, cVar);
        Object obj2 = r22.f6669h;
        Q1.a aVar22 = Q1.a.f3113d;
        i3 = r22.f6671j;
        C0604n c0604n2 = f6407f;
    }
}
