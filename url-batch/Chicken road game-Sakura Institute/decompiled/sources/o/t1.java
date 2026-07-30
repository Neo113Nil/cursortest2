package o;

import l.x1;
import l.y1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: f, reason: collision with root package name */
    public static final l.m f6747f = new l.m(0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final y1 f6748a;

    /* renamed from: b, reason: collision with root package name */
    public long f6749b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public l.m f6750c = f6747f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6751d;

    /* renamed from: e, reason: collision with root package name */
    public float f6752e;

    public t1(l.k kVar) {
        this.f6748a = kVar.a(x1.f5722a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
    
        if (r13 != 0.0f) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        if (g0.d.E(r1.getContext()).t(r0, r1) == r9) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r14v0, types: [m.h] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2, types: [o.t1] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v7, types: [q6.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a9 -> B:24:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c.h hVar, m.h hVar2, j6.c cVar) {
        r1 r1Var;
        int i7;
        r1 r1Var2;
        q6.a aVar;
        c.h hVar3;
        float f9;
        t1 t1Var;
        q6.a aVar2;
        t1 t1Var2;
        try {
            if (cVar instanceof r1) {
                r1Var = (r1) cVar;
                int i8 = r1Var.f6726l;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    r1Var.f6726l = i8 - Integer.MIN_VALUE;
                    Object obj = r1Var.f6724j;
                    i7 = r1Var.f6726l;
                    l.m mVar = f6747f;
                    i6.a aVar3 = i6.a.f4956f;
                    if (i7 != 0) {
                        d6.a.e(obj);
                        if (this.f6751d) {
                            throw new IllegalStateException("animateToZero called while previous animation is running");
                        }
                        s0.p pVar = (s0.p) r1Var.getContext().u(s0.b.f8092t);
                        float E = pVar != null ? pVar.E() : 1.0f;
                        this.f6751d = true;
                        r1Var2 = r1Var;
                        aVar = hVar2;
                        hVar3 = hVar;
                        f9 = E;
                        t1Var = this;
                        if (Math.abs(t1Var.f6752e) >= 0.01f) {
                            s1 s1Var = new s1(t1Var, f9, hVar3);
                            r1Var2.f6720f = t1Var;
                            r1Var2.f6721g = hVar3;
                            r1Var2.f6722h = aVar;
                            r1Var2.f6723i = f9;
                            r1Var2.f6726l = 1;
                            if (g0.d.E(r1Var2.getContext()).t(s1Var, r1Var2) == aVar3) {
                                return aVar3;
                            }
                            aVar.a();
                        }
                        t1 t1Var3 = t1Var;
                        c.h hVar4 = hVar3;
                        t1 t1Var4 = t1Var3;
                        aVar2 = aVar;
                        if (Math.abs(t1Var4.f6752e) == 0.0f) {
                            t1Var2 = t1Var4;
                            t1Var2.f6749b = Long.MIN_VALUE;
                            t1Var2.f6750c = mVar;
                            t1Var2.f6751d = false;
                            return d6.z.f2639a;
                        }
                        a0.y yVar = new a0.y(t1Var4, 28, hVar4);
                        r1Var2.f6720f = t1Var4;
                        r1Var2.f6721g = aVar2;
                        r1Var2.f6722h = null;
                        r1Var2.f6726l = 2;
                        hVar2 = t1Var4;
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (q6.a) r1Var.f6721g;
                            t1 t1Var5 = r1Var.f6720f;
                            d6.a.e(obj);
                            hVar2 = t1Var5;
                            aVar2.a();
                            t1Var2 = hVar2;
                            t1Var2.f6749b = Long.MIN_VALUE;
                            t1Var2.f6750c = mVar;
                            t1Var2.f6751d = false;
                            return d6.z.f2639a;
                        }
                        f9 = r1Var.f6723i;
                        q6.a aVar4 = r1Var.f6722h;
                        ?? r12 = (q6.c) r1Var.f6721g;
                        t1 t1Var6 = r1Var.f6720f;
                        try {
                            d6.a.e(obj);
                            r1 r1Var3 = r1Var;
                            aVar = aVar4;
                            hVar3 = r12;
                            r1Var2 = r1Var3;
                            t1Var = t1Var6;
                        } catch (Throwable th) {
                            th = th;
                            hVar2 = t1Var6;
                            hVar2.f6749b = Long.MIN_VALUE;
                            hVar2.f6750c = mVar;
                            hVar2.f6751d = false;
                            throw th;
                        }
                        try {
                            aVar.a();
                        } catch (Throwable th2) {
                            th = th2;
                            hVar2 = t1Var;
                            hVar2.f6749b = Long.MIN_VALUE;
                            hVar2.f6750c = mVar;
                            hVar2.f6751d = false;
                            throw th;
                        }
                    }
                }
            }
            if (i7 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        r1Var = new r1(this, cVar);
        Object obj2 = r1Var.f6724j;
        i7 = r1Var.f6726l;
        l.m mVar2 = f6747f;
        i6.a aVar32 = i6.a.f4956f;
    }
}
