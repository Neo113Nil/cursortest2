package androidx.lifecycle;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.x1;
import g0.g1;
import g0.k2;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import l.p1;
import l.v1;
import o.f1;
import o.n1;
import o.t1;
import s1.o1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f975g;

    /* renamed from: h, reason: collision with root package name */
    public int f976h;

    /* renamed from: i, reason: collision with root package name */
    public Object f977i;

    /* renamed from: j, reason: collision with root package name */
    public Object f978j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f979k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f980l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(x xVar, o oVar, a0.a0 a0Var, h6.d dVar) {
        super(2, dVar);
        this.f975g = 1;
        this.f979k = xVar;
        this.f980l = oVar;
        this.f977i = a0Var;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r1v3, types: [f7.w, g7.b] */
    /* JADX WARN: Type inference failed for: r5v5, types: [f7.w, g7.b] */
    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f975g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new g0((k7.c) this.f980l, (a0.a0) this.f979k, dVar);
            case 1:
                g0 g0Var = new g0((x) this.f979k, (o) this.f980l, (a0.a0) this.f977i, dVar);
                g0Var.f978j = obj;
                return g0Var;
            case 2:
                g0 g0Var2 = new g0((androidx.room.u) this.f977i, (String[]) this.f979k, (Callable) this.f980l, dVar, 2);
                g0Var2.f978j = obj;
                return g0Var2;
            case 3:
                return new g0((c.e) this.f977i, (q6.e) this.f979k, (a0.s0) this.f980l, dVar, 3);
            case 4:
                g0 g0Var3 = new g0((f7.f) this.f977i, (f7.w) this.f979k, this.f980l, dVar);
                g0Var3.f978j = obj;
                return g0Var3;
            case 5:
                return new g0((f7.n0) this.f978j, (f7.f) this.f977i, (f7.w) this.f979k, this.f980l, dVar);
            case 6:
                return new g0(this.f978j, (l.d) this.f977i, (g0.z0) this.f979k, (g0.z0) this.f980l, dVar, 6);
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                g0 g0Var4 = new g0((g0.z0) this.f979k, (l.h0) this.f980l, dVar);
                g0Var4.f977i = obj;
                return g0Var4;
            case 8:
                g0 g0Var5 = new g0((o.i) this.f977i, (t1) this.f979k, (o.d) this.f980l, dVar, 8);
                g0Var5.f978j = obj;
                return g0Var5;
            case q.c.f7259c /* 9 */:
                g0 g0Var6 = new g0((l1.d0) this.f977i, (q6.f) this.f979k, (w.j) this.f980l, dVar, 9);
                g0Var6.f978j = obj;
                return g0Var6;
            case q.c.f7261e /* 10 */:
                g0 g0Var7 = new g0((q6.c) this.f977i, (AtomicReference) this.f979k, (q6.e) this.f980l, dVar);
                g0Var7.f978j = obj;
                return g0Var7;
            case 11:
                g0 g0Var8 = new g0((l.x0) this.f977i, (t3.h) this.f979k, (p1) this.f980l, dVar, 11);
                g0Var8.f978j = obj;
                return g0Var8;
            case 12:
                return new g0((x1.e) this.f978j, (ScrollCaptureSession) this.f977i, (Rect) this.f979k, (Consumer) this.f980l, dVar, 12);
            default:
                g0 g0Var9 = new g0((q6.c) this.f977i, (y.d) this.f979k, (y.q) this.f980l, dVar, 13);
                g0Var9.f978j = obj;
                return g0Var9;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f975g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((g0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 1:
                return ((g0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 2:
                return ((g0) create((f7.g) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 3:
                return ((g0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 4:
                return ((g0) create((f7.h0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 5:
                return ((g0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 6:
                return ((g0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((g0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
                return i6.a.f4956f;
            case 8:
                return ((g0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case q.c.f7259c /* 9 */:
                return ((g0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case q.c.f7261e /* 10 */:
                return ((g0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 11:
                return ((g0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 12:
                return ((g0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            default:
                ((g0) create((s1.p0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
                return i6.a.f4956f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0296, code lost:
    
        if (g0.d.E(getContext()).t(r11, r22) == r9) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02c0, code lost:
    
        if (f7.f0.k(r0, r1, r22) == r9) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02c2, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x036b, code lost:
    
        if (f7.f0.k(r1, r7, r22) == r9) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0526, code lost:
    
        if (c7.a0.d(r5, r22) == r9) goto L261;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v39, types: [f7.f] */
    /* JADX WARN: Type inference failed for: r0v45, types: [f7.f] */
    /* JADX WARN: Type inference failed for: r11v10, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v7, types: [k7.c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f7.g, f7.w, g7.b] */
    /* JADX WARN: Type inference failed for: r5v4, types: [f7.g, f7.w, g7.b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x029e -> B:116:0x026b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x02c0 -> B:116:0x026b). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a0.a0 a0Var;
        k7.a aVar;
        r6.r rVar;
        c7.x xVar;
        r6.s sVar;
        s0.q qVar;
        Object d8;
        s0.q qVar2;
        Object obj2;
        Object a3;
        int i7 = this.f975g;
        ?? r12 = 0;
        s0.q qVar3 = null;
        Object obj3 = null;
        ?? r22 = 0;
        ?? r23 = 0;
        ?? r24 = 0;
        CancellationException cancellationException = null;
        int i8 = 2;
        Object obj4 = d6.z.f2639a;
        Object obj5 = this.f980l;
        Object obj6 = this.f979k;
        i6.a aVar2 = i6.a.f4956f;
        boolean z8 = true;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i9 = this.f976h;
                try {
                    if (i9 == 0) {
                        d6.a.e(obj);
                        k7.c cVar = (k7.c) obj5;
                        a0Var = (a0.a0) obj6;
                        this.f978j = cVar;
                        this.f977i = a0Var;
                        this.f976h = 1;
                        if (cVar.c(this) != aVar2) {
                            aVar = cVar;
                        }
                        return aVar2;
                    }
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (k7.a) this.f978j;
                        d6.a.e(obj);
                        return obj4;
                    }
                    a0Var = (a0.a0) this.f977i;
                    aVar = (k7.a) this.f978j;
                    d6.a.e(obj);
                    a0.e0 e0Var = new a0.e0(a0Var, (h6.d) (r22 == true ? 1 : 0), i8);
                    this.f978j = aVar;
                    this.f977i = null;
                    this.f976h = 2;
                    break;
                } finally {
                    ((k7.c) r12).e(null);
                }
            case 1:
                int i10 = this.f976h;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return obj4;
                }
                d6.a.e(obj);
                c7.x xVar2 = (c7.x) this.f978j;
                j7.e eVar = c7.g0.f1696a;
                d7.e eVar2 = h7.m.f4700a.f2648k;
                i0 i0Var = new i0((x) obj6, (o) obj5, xVar2, (a0.a0) this.f977i, (h6.d) null, 0);
                this.f976h = 1;
                return c7.a0.x(eVar2, i0Var, this) == aVar2 ? aVar2 : obj4;
            case 2:
                int i11 = this.f976h;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return obj4;
                }
                d6.a.e(obj);
                androidx.room.d dVar = new androidx.room.d((androidx.room.u) this.f977i, (f7.g) this.f978j, (String[]) obj6, (Callable) obj5, null, 0);
                this.f976h = 1;
                return c7.a0.d(dVar, this) == aVar2 ? aVar2 : obj4;
            case 3:
                int i12 = this.f976h;
                if (i12 == 0) {
                    d6.a.e(obj);
                    if (!((c.e) this.f977i).f1220a) {
                        return obj4;
                    }
                    rVar = new r6.r();
                    f7.k kVar = new f7.k(new f7.b((e7.e) ((a0.s0) obj5).f137c, z8), new c.d(rVar, r23 == true ? 1 : 0, r12));
                    this.f978j = rVar;
                    this.f976h = 1;
                    if (((q6.e) obj6).d(kVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (r6.r) this.f978j;
                    d6.a.e(obj);
                }
                if (rVar.f7964f) {
                    return obj4;
                }
                throw new IllegalStateException("You must collect the progress flow");
            case 4:
                ?? r52 = (g7.b) obj6;
                int i13 = this.f976h;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return obj4;
                }
                d6.a.e(obj);
                int ordinal = ((f7.h0) this.f978j).ordinal();
                if (ordinal == 0) {
                    ?? r02 = (f7.f) this.f977i;
                    this.f976h = 1;
                    return r02.b(r52, this) == aVar2 ? aVar2 : obj4;
                }
                if (ordinal == 1) {
                    return obj4;
                }
                if (ordinal != 2) {
                    throw new b4.c();
                }
                if (obj5 == f7.f0.f3469a) {
                    r52.h();
                    return obj4;
                }
                r52.i(obj5);
                return obj4;
            case 5:
                ?? r03 = (f7.f) this.f977i;
                ?? r53 = (g7.b) obj6;
                int i14 = this.f976h;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            d6.a.e(obj);
                        } else if (i14 != 3 && i14 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    d6.a.e(obj);
                    return obj4;
                }
                d6.a.e(obj);
                f7.n0 n0Var = (f7.n0) this.f978j;
                if (n0Var == f7.j0.f3496a) {
                    this.f976h = 1;
                    if (r03.b(r53, this) != aVar2) {
                        return obj4;
                    }
                } else if (n0Var == f7.j0.f3497b) {
                    g7.a0 g9 = r53.g();
                    f7.u uVar = new f7.u(2, null);
                    this.f976h = 2;
                    break;
                } else {
                    g7.a0 g10 = r53.g();
                    f7.l0 l0Var = new f7.l0(n0Var, null);
                    int i15 = f7.q.f3542a;
                    h6.j jVar = h6.j.f4661f;
                    e7.a aVar3 = e7.a.f2833f;
                    f7.f h3 = f7.f0.h(f7.f0.h(new e0.e(new g7.k(l0Var, g10, jVar, -2, aVar3), i8, new f7.m0(2, null, 0))));
                    g0 g0Var = new g0((f7.f) r03, (f7.w) r53, obj5, (h6.d) null);
                    this.f976h = 4;
                    Object b9 = f7.f0.f(new g7.k(new f7.p(g0Var, r24 == true ? 1 : 0, r12), h3, jVar, -2, aVar3), 0).b(g7.u.f4525f, this);
                    if (b9 != aVar2) {
                        b9 = obj4;
                    }
                    if (b9 != aVar2) {
                        b9 = obj4;
                    }
                    if (b9 != aVar2) {
                        return obj4;
                    }
                }
                return aVar2;
                this.f976h = 3;
                if (r03.b(r53, this) != aVar2) {
                    return obj4;
                }
                return aVar2;
            case 6:
                l.d dVar2 = (l.d) this.f977i;
                int i16 = this.f976h;
                if (i16 == 0) {
                    d6.a.e(obj);
                    if (r6.k.a(this.f978j, dVar2.f5429e.getValue())) {
                        return obj4;
                    }
                    l.d dVar3 = (l.d) this.f977i;
                    Object obj7 = this.f978j;
                    l.a1 a1Var = l.f.f5472a;
                    l.k kVar2 = (l.k) ((g0.z0) obj6).getValue();
                    this.f976h = 1;
                    if (l.d.c(dVar3, obj7, kVar2, null, this, 12) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                l.a1 a1Var2 = l.f.f5472a;
                q6.c cVar2 = (q6.c) ((g0.z0) obj5).getValue();
                if (cVar2 == null) {
                    return obj4;
                }
                cVar2.f(dVar2.d());
                return obj4;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                int i17 = this.f976h;
                if (i17 == 0) {
                    d6.a.e(obj);
                    c7.x xVar3 = (c7.x) this.f977i;
                    r6.s sVar2 = new r6.s();
                    sVar2.f7965f = 1.0f;
                    xVar = xVar3;
                    sVar = sVar2;
                } else if (i17 == 1) {
                    r6.s sVar3 = (r6.s) this.f978j;
                    c7.x xVar4 = (c7.x) this.f977i;
                    d6.a.e(obj);
                    sVar = sVar3;
                    xVar = xVar4;
                    if (sVar.f7965f == 0.0f) {
                        f7.a0 a0Var2 = new f7.a0(new k2(new r0(17, xVar), null));
                        l.g0 g0Var2 = new l.g0(2, null);
                        this.f977i = xVar;
                        this.f978j = sVar;
                        this.f976h = 2;
                        break;
                    }
                } else {
                    if (i17 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r6.s sVar4 = (r6.s) this.f978j;
                    c7.x xVar5 = (c7.x) this.f977i;
                    d6.a.e(obj);
                    sVar = sVar4;
                    xVar = xVar5;
                }
                l.a aVar4 = new l.a((g0.z0) obj6, (l.h0) obj5, sVar, xVar, 1);
                this.f977i = xVar;
                this.f978j = sVar;
                this.f976h = 1;
                if (getContext().u(o1.f8336f) == null) {
                    break;
                } else {
                    throw new ClassCastException();
                }
            case 8:
                o.i iVar = (o.i) this.f977i;
                l1.i iVar2 = iVar.f6638v;
                int i18 = this.f976h;
                try {
                    try {
                        if (i18 == 0) {
                            d6.a.e(obj);
                            c7.x0 j8 = c7.a0.j(((c7.x) this.f978j).k());
                            iVar.A = true;
                            f1 f1Var = iVar.f6636t;
                            m.p0 p0Var = m.p0.f6228f;
                            androidx.room.d dVar4 = new androidx.room.d((t1) obj6, iVar, (o.d) obj5, j8, null, 5);
                            this.f976h = 1;
                            if (f1Var.e(p0Var, dVar4, this) == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            d6.a.e(obj);
                        }
                        iVar2.e();
                        return obj4;
                    } finally {
                        iVar.A = false;
                        iVar2.b(null);
                        iVar.f6641y = false;
                    }
                } catch (CancellationException e9) {
                    throw e9;
                }
            case q.c.f7259c /* 9 */:
                l1.d0 d0Var = (l1.d0) this.f977i;
                int i19 = this.f976h;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return obj4;
                }
                d6.a.e(obj);
                n1 n1Var = new n1((c7.x) this.f978j, (q6.f) obj6, (w.j) obj5, new o.m0(d0Var), null);
                this.f976h = 1;
                return t6.a.r(d0Var, n1Var, this) == aVar2 ? aVar2 : obj4;
            case q.c.f7261e /* 10 */:
                AtomicReference atomicReference = (AtomicReference) obj6;
                int i20 = this.f976h;
                try {
                    if (i20 == 0) {
                        d6.a.e(obj);
                        c7.x xVar6 = (c7.x) this.f978j;
                        qVar3 = new s0.q(c7.a0.j(xVar6.k()), ((r6.l) this.f977i).f(xVar6));
                        s0.q qVar4 = (s0.q) atomicReference.getAndSet(qVar3);
                        if (qVar4 != null) {
                            c7.x0 x0Var = qVar4.f8117a;
                            this.f978j = qVar3;
                            this.f976h = 1;
                            x0Var.c(null);
                            Object N = x0Var.N(this);
                            if (N == aVar2) {
                                obj4 = N;
                            }
                            if (obj4 == aVar2) {
                                return aVar2;
                            }
                            qVar = qVar3;
                        }
                        Object obj8 = qVar3.f8118b;
                        this.f978j = qVar3;
                        this.f976h = 2;
                        d8 = ((q6.e) obj5).d(obj8, this);
                        if (d8 == aVar2) {
                            return aVar2;
                        }
                        qVar2 = qVar3;
                        while (!atomicReference.compareAndSet(qVar2, null)) {
                        }
                        return d8;
                    }
                    if (i20 != 1) {
                        if (i20 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        qVar3 = (s0.q) this.f978j;
                        d6.a.e(obj);
                        d8 = obj;
                        qVar2 = qVar3;
                        while (!atomicReference.compareAndSet(qVar2, null) && atomicReference.get() == qVar2) {
                        }
                        return d8;
                    }
                    qVar = (s0.q) this.f978j;
                    d6.a.e(obj);
                    qVar3 = qVar;
                    Object obj82 = qVar3.f8118b;
                    this.f978j = qVar3;
                    this.f976h = 2;
                    d8 = ((q6.e) obj5).d(obj82, this);
                    if (d8 == aVar2) {
                    }
                    qVar2 = qVar3;
                    while (!atomicReference.compareAndSet(qVar2, null)) {
                    }
                    return d8;
                } catch (Throwable th) {
                    while (!atomicReference.compareAndSet(qVar3, null) && atomicReference.get() == qVar3) {
                    }
                    throw th;
                }
            case 11:
                t3.h hVar = (t3.h) obj6;
                l.x0 x0Var2 = (l.x0) this.f977i;
                int i21 = this.f976h;
                if (i21 != 0) {
                    if (i21 != 1 && i21 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return obj4;
                }
                d6.a.e(obj);
                c7.x xVar7 = (c7.x) this.f978j;
                g1 g1Var = x0Var2.f5707c;
                g0.c1 c1Var = x0Var2.f5712h;
                if (r6.k.a(g1Var.getValue(), hVar)) {
                    long longValue = ((Number) ((p1) obj5).f5621l.getValue()).longValue() / 1000000;
                    float e10 = c1Var.e();
                    v1 l8 = l.e.l((int) (c1Var.e() * longValue), 6, null);
                    x1 x1Var = new x1(xVar7, x0Var2, hVar, 6);
                    this.f976h = 2;
                    if (l.e.c(e10, 0.0f, l8, x1Var, this, 4) != aVar2) {
                        return obj4;
                    }
                } else {
                    this.f976h = 1;
                    p1 p1Var = x0Var2.f5709e;
                    if (p1Var == null || (obj2 = l.o0.a(x0Var2.f5715k, new l.r0(p1Var, x0Var2, hVar, (h6.d) null), this)) != aVar2) {
                        obj2 = obj4;
                    }
                    if (obj2 != aVar2) {
                        return obj4;
                    }
                }
                return aVar2;
            case 12:
                int i22 = this.f976h;
                if (i22 == 0) {
                    d6.a.e(obj);
                    x1.e eVar3 = (x1.e) this.f978j;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.f977i;
                    Rect rect = (Rect) obj6;
                    m2.i iVar3 = new m2.i(rect.left, rect.top, rect.right, rect.bottom);
                    this.f976h = 1;
                    a3 = x1.e.a(eVar3, scrollCaptureSession, iVar3, this);
                    if (a3 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    a3 = obj;
                }
                ((Consumer) obj5).accept(z0.l0.t((m2.i) a3));
                return obj4;
            default:
                int i23 = this.f976h;
                if (i23 == 0) {
                    d6.a.e(obj);
                    androidx.room.d dVar5 = new androidx.room.d((s1.p0) this.f978j, (q6.c) this.f977i, (y.d) obj6, (y.q) obj5, null, 12);
                    this.f976h = 1;
                    if (c7.a0.d(dVar5, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                throw new b4.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(f7.f fVar, f7.w wVar, Object obj, h6.d dVar) {
        super(2, dVar);
        this.f975g = 4;
        this.f977i = fVar;
        this.f979k = (g7.b) wVar;
        this.f980l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(f7.n0 n0Var, f7.f fVar, f7.w wVar, Object obj, h6.d dVar) {
        super(2, dVar);
        this.f975g = 5;
        this.f978j = n0Var;
        this.f977i = fVar;
        this.f979k = (g7.b) wVar;
        this.f980l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(g0.z0 z0Var, l.h0 h0Var, h6.d dVar) {
        super(2, dVar);
        this.f975g = 7;
        this.f979k = z0Var;
        this.f980l = h0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, h6.d dVar, int i7) {
        super(2, dVar);
        this.f975g = i7;
        this.f977i = obj;
        this.f979k = obj2;
        this.f980l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, Object obj4, h6.d dVar, int i7) {
        super(2, dVar);
        this.f975g = i7;
        this.f978j = obj;
        this.f977i = obj2;
        this.f979k = obj3;
        this.f980l = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(k7.c cVar, a0.a0 a0Var, h6.d dVar) {
        super(2, dVar);
        this.f975g = 0;
        this.f980l = cVar;
        this.f979k = a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(q6.c cVar, AtomicReference atomicReference, q6.e eVar, h6.d dVar) {
        super(2, dVar);
        this.f975g = 10;
        this.f977i = (r6.l) cVar;
        this.f979k = atomicReference;
        this.f980l = eVar;
    }
}
