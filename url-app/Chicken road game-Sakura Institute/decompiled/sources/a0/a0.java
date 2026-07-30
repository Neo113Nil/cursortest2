package a0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.RootActivity;
import d0.i1;
import g0.i2;
import g0.j2;
import g0.k2;
import g0.l1;
import g0.m2;
import g0.s1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import l.p1;
import l.t1;
import l.u1;
import s1.m1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6g;

    /* renamed from: h, reason: collision with root package name */
    public int f7h;

    /* renamed from: i, reason: collision with root package name */
    public Object f8i;

    /* renamed from: j, reason: collision with root package name */
    public Object f9j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f10k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(g3.a0 a0Var, q6.e eVar, h6.d dVar) {
        super(2, dVar);
        this.f6g = 9;
        this.f9j = a0Var;
        this.f10k = (j6.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r12v19, types: [j6.i, q6.f] */
    /* JADX WARN: Type inference failed for: r1v15, types: [j6.i, q6.e] */
    /* JADX WARN: Type inference failed for: r1v25, types: [j6.i, q6.e] */
    /* JADX WARN: Type inference failed for: r1v29, types: [q6.a, r6.l] */
    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f6g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                a0 a0Var = new a0((b6.c) this.f9j, (w.n0) this.f10k, dVar, 0);
                a0Var.f8i = obj;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0((m2) this.f9j, (l.d) this.f10k, dVar, 1);
                a0Var2.f8i = obj;
                return a0Var2;
            case 2:
                return new a0((c0.j) this.f8i, (c0.c) this.f9j, (p.l) this.f10k, dVar, 2);
            case 3:
                a0 a0Var3 = new a0((p.i) this.f9j, (c0.a) this.f10k, dVar, 3);
                a0Var3.f8i = obj;
                return a0Var3;
            case 4:
                a0 a0Var4 = new a0((p.i) this.f9j, (i1) this.f10k, dVar, 4);
                a0Var4.f8i = obj;
                return a0Var4;
            case 5:
                return new a0((f4.g) this.f9j, (g0.g1) this.f10k, dVar, 5);
            case 6:
                a0 a0Var5 = new a0((s1) this.f9j, (g0.u0) this.f10k, dVar, 6);
                a0Var5.f8i = obj;
                return a0Var5;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                a0 a0Var6 = new a0((h6.i) this.f9j, (f7.f) this.f10k, dVar, 7);
                a0Var6.f8i = obj;
                return a0Var6;
            case 8:
                a0 a0Var7 = new a0((g3.a0) this.f10k, dVar, 8);
                a0Var7.f8i = obj;
                return a0Var7;
            case q.c.f7259c /* 9 */:
                a0 a0Var8 = new a0((g3.a0) this.f9j, (q6.e) this.f10k, dVar);
                a0Var8.f8i = obj;
                return a0Var8;
            case q.c.f7261e /* 10 */:
                a0 a0Var9 = new a0((f7.g) this.f9j, (g7.e) this.f10k, dVar, 10);
                a0Var9.f8i = obj;
                return a0Var9;
            case 11:
                a0 a0Var10 = new a0((p1) this.f9j, (g0.z0) this.f10k, dVar, 11);
                a0Var10.f8i = obj;
                return a0Var10;
            case 12:
                return new a0((u1) this.f10k, dVar, 12);
            case 13:
                return new a0((p.j) this.f8i, (p.h) this.f9j, (c7.i0) this.f10k, dVar, 13);
            case 14:
                a0 a0Var11 = new a0((o.m) this.f9j, (q6.e) this.f10k, dVar, 14);
                a0Var11.f8i = obj;
                return a0Var11;
            case q.c.f7263g /* 15 */:
                return new a0((o.m) this.f8i, (m.p0) this.f9j, (q6.e) this.f10k, dVar, 15);
            case 16:
                a0 a0Var12 = new a0((o.e0) this.f9j, (o.f1) this.f10k, dVar, 16);
                a0Var12.f8i = obj;
                return a0Var12;
            case 17:
                a0 a0Var13 = new a0((o.f1) this.f9j, (q6.e) this.f10k, dVar);
                a0Var13.f8i = obj;
                return a0Var13;
            case 18:
                return new a0((q6.f) this.f8i, (o.m0) this.f9j, (l1.v) this.f10k, dVar);
            case 19:
                return new a0((h6.i) this.f8i, (f7.f) this.f9j, (l1) this.f10k, dVar, 19);
            case 20:
                return new a0((e7.e) this.f10k, dVar, 20);
            case 21:
                return new a0((t.g) this.f8i, (r1.a1) this.f9j, (q6.a) this.f10k, dVar);
            case 22:
                return new a0((l.x0) this.f8i, (g0.z0) this.f9j, (g0.c1) this.f10k, dVar, 22);
            default:
                a0 a0Var14 = new a0((w.n0) this.f10k, (x0) this.f9j, dVar);
                a0Var14.f8i = obj;
                return a0Var14;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f6g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((a0) create((l1.d0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 1:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 2:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 3:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 4:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 5:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 6:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((a0) create((l1) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 8:
                return ((a0) create((f7.g) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case q.c.f7259c /* 9 */:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case q.c.f7261e /* 10 */:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 11:
                return ((a0) create((l1) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 12:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 13:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 14:
                return ((a0) create((o.n0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case q.c.f7263g /* 15 */:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 16:
                return ((a0) create((o.d1) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 17:
                return ((a0) create((o.n0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 18:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 19:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 20:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 21:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 22:
                return ((a0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            default:
                return ((a0) create((l1.d0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:313:0x0578, code lost:
    
        if (r7.k(r8, r12) == r6) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x015b, code lost:
    
        if (r13 == r2) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a5 A[Catch: all -> 0x0177, TryCatch #1 {all -> 0x0177, blocks: (B:75:0x0173, B:76:0x019d, B:78:0x01a5, B:79:0x01b2, B:86:0x01cb, B:88:0x0190, B:92:0x01ce, B:96:0x01d2, B:97:0x01d3, B:104:0x018a, B:81:0x01b3, B:83:0x01bf), top: B:71:0x0167, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d4  */
    /* JADX WARN: Type inference failed for: r13v116, types: [j6.i, q6.e] */
    /* JADX WARN: Type inference failed for: r13v120, types: [j6.i, q6.f] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v24, types: [d6.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v39, types: [e7.t] */
    /* JADX WARN: Type inference failed for: r2v41, types: [e7.e] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v43, types: [e7.t] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r7v19, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r8v3, types: [j6.i, q6.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x019a -> B:69:0x019d). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g0.g1 g1Var;
        f7.g gVar;
        Object obj2;
        k7.c cVar;
        e7.b bVar;
        boolean z8;
        Object obj3;
        int i7 = 3;
        ?? r22 = 2;
        char c4 = 2;
        char c6 = 2;
        int i8 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i9 = 1;
        switch (this.f6g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i6.a aVar = i6.a.f4956f;
                int i10 = this.f7h;
                if (i10 == 0) {
                    d6.a.e(obj);
                    l1.d0 d0Var = (l1.d0) this.f8i;
                    d0Var.getClass();
                    z zVar = new z((b6.c) this.f9j, new l(r1.f.t(d0Var).f7737x), (w.n0) this.f10k, null);
                    this.f7h = 1;
                    if (t6.a.r(d0Var, zVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            case 1:
                i6.a aVar2 = i6.a.f4956f;
                int i11 = this.f7h;
                if (i11 == 0) {
                    d6.a.e(obj);
                    c7.x xVar = (c7.x) this.f8i;
                    f7.a0 a0Var = new f7.a0(new k2(new i0((m2) this.f9j, i9), null));
                    l0 l0Var = new l0((l.d) this.f10k, i8, xVar);
                    this.f7h = 1;
                    if (a0Var.b(l0Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            case 2:
                p.l lVar = (p.l) this.f10k;
                c0.c cVar2 = (c0.c) this.f9j;
                i.x xVar2 = cVar2.C;
                i6.a aVar3 = i6.a.f4956f;
                int i12 = this.f7h;
                try {
                    if (i12 == 0) {
                        d6.a.e(obj);
                        c0.j jVar = (c0.j) this.f8i;
                        this.f7h = 1;
                        if (jVar.a(this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                    }
                    xVar2.g(lVar);
                    r1.f.m(cVar2);
                    return d6.z.f2639a;
                } catch (Throwable th) {
                    xVar2.g(lVar);
                    r1.f.m(cVar2);
                    throw th;
                }
            case 3:
                i6.a aVar4 = i6.a.f4956f;
                int i13 = this.f7h;
                if (i13 == 0) {
                    d6.a.e(obj);
                    c7.x xVar3 = (c7.x) this.f8i;
                    f7.f a3 = ((p.i) this.f9j).a();
                    l0 l0Var2 = new l0((c0.a) this.f10k, i9, xVar3);
                    this.f7h = 1;
                    if (a3.b(l0Var2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            case 4:
                i6.a aVar5 = i6.a.f4956f;
                int i14 = this.f7h;
                if (i14 == 0) {
                    d6.a.e(obj);
                    c7.x xVar4 = (c7.x) this.f8i;
                    ArrayList arrayList = new ArrayList();
                    f7.f a9 = ((p.i) this.f9j).a();
                    d0.e1 e1Var = new d0.e1(arrayList, xVar4, (i1) this.f10k, i8);
                    this.f7h = 1;
                    if (a9.b(e1Var, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            case 5:
                i6.a aVar6 = i6.a.f4956f;
                int i15 = this.f7h;
                if (i15 == 0) {
                    d6.a.e(obj);
                    g0.g1 g1Var2 = (g0.g1) this.f10k;
                    f4.g gVar2 = (f4.g) this.f9j;
                    this.f8i = g1Var2;
                    this.f7h = 1;
                    Object a10 = gVar2.a(this);
                    if (a10 == aVar6) {
                        return aVar6;
                    }
                    g1Var = g1Var2;
                    obj = a10;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g1Var = (g0.g1) this.f8i;
                    d6.a.e(obj);
                }
                int i16 = RootActivity.f1765z;
                g1Var.setValue((f4.w) obj);
                return d6.z.f2639a;
            case 6:
                i6.a aVar7 = i6.a.f4956f;
                int i17 = this.f7h;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return d6.z.f2639a;
                }
                d6.a.e(obj);
                c7.x xVar5 = (c7.x) this.f8i;
                s1 s1Var = (s1) this.f9j;
                g0.u0 u0Var = (g0.u0) this.f10k;
                this.f7h = 1;
                s1Var.c(xVar5, u0Var, this);
                return aVar7;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                f7.f fVar = (f7.f) this.f10k;
                h6.i iVar = (h6.i) this.f9j;
                i6.a aVar8 = i6.a.f4956f;
                int i18 = this.f7h;
                if (i18 == 0) {
                    d6.a.e(obj);
                    l1 l1Var = (l1) this.f8i;
                    if (r6.k.a(iVar, h6.j.f4661f)) {
                        i2 i2Var = new i2(l1Var, 0);
                        this.f7h = 1;
                        if (fVar.b(i2Var, this) == aVar8) {
                            return aVar8;
                        }
                    } else {
                        j2 j2Var = new j2(fVar, l1Var, z9 ? 1 : 0, i8);
                        this.f7h = 2;
                        if (c7.a0.x(iVar, j2Var, this) == aVar8) {
                            return aVar8;
                        }
                    }
                } else {
                    if (i18 != 1 && i18 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            case 8:
                g3.a0 a0Var2 = (g3.a0) this.f10k;
                d6.z zVar2 = d6.z.f2639a;
                i6.a aVar9 = i6.a.f4956f;
                int i19 = this.f7h;
                if (i19 == 0) {
                    d6.a.e(obj);
                    f7.g gVar3 = (f7.g) this.f8i;
                    this.f8i = gVar3;
                    this.f7h = 1;
                    Object x8 = c7.a0.x(a0Var2.f4091h.k(), new g3.n(a0Var2, z10 ? 1 : 0, i9), this);
                    if (x8 != aVar9) {
                        gVar = gVar3;
                        obj = x8;
                    }
                    return aVar9;
                }
                if (i19 != 1) {
                    if (i19 != 2) {
                        if (i19 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                        return zVar2;
                    }
                    obj2 = (g3.c) this.f9j;
                    gVar = (f7.g) this.f8i;
                    d6.a.e(obj);
                    e0.e eVar = new e0.e((f7.q0) a0Var2.f4095l.f1394g, i7, new f7.m0(c6, z12 ? 1 : 0, c4));
                    androidx.lifecycle.p pVar = new androidx.lifecycle.p(obj2, z11 ? 1 : 0, 4);
                    this.f8i = null;
                    this.f9j = null;
                    this.f7h = 3;
                    if (!(gVar instanceof f7.s0)) {
                        throw ((f7.s0) gVar).f3555f;
                    }
                    Object b9 = eVar.b(new d0.e1(new r6.r(), new d0.y(i7, gVar), pVar), this);
                    if (b9 != aVar9) {
                        b9 = zVar2;
                    }
                    if (b9 != aVar9) {
                        b9 = zVar2;
                    }
                    if (b9 != aVar9) {
                        b9 = zVar2;
                    }
                    if (b9 != aVar9) {
                        return zVar2;
                    }
                    return aVar9;
                }
                f7.g gVar4 = (f7.g) this.f8i;
                d6.a.e(obj);
                gVar = gVar4;
                obj2 = (g3.i0) obj;
                if (obj2 instanceof g3.c) {
                    g3.c cVar3 = (g3.c) obj2;
                    Object obj4 = cVar3.f4101b;
                    this.f8i = gVar;
                    this.f9j = cVar3;
                    this.f7h = 2;
                    break;
                } else {
                    if (obj2 instanceof g3.k0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    if (obj2 instanceof g3.d0) {
                        throw ((g3.d0) obj2).f4111b;
                    }
                    if (obj2 instanceof g3.b0) {
                        return zVar2;
                    }
                }
                e0.e eVar2 = new e0.e((f7.q0) a0Var2.f4095l.f1394g, i7, new f7.m0(c6, z12 ? 1 : 0, c4));
                androidx.lifecycle.p pVar2 = new androidx.lifecycle.p(obj2, z11 ? 1 : 0, 4);
                this.f8i = null;
                this.f9j = null;
                this.f7h = 3;
                if (!(gVar instanceof f7.s0)) {
                }
            case q.c.f7259c /* 9 */:
                g3.a0 a0Var3 = (g3.a0) this.f9j;
                i6.a aVar10 = i6.a.f4956f;
                int i20 = this.f7h;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return obj;
                }
                d6.a.e(obj);
                c7.x xVar6 = (c7.x) this.f8i;
                c7.n nVar = new c7.n(true);
                nVar.K(null);
                g3.c0 c0Var = new g3.c0((j6.i) this.f10k, nVar, a0Var3.f4095l.p(), xVar6.k());
                g3.k kVar = a0Var3.f4099p;
                Object e9 = ((e7.e) kVar.f4162i).e(c0Var);
                if (e9 instanceof e7.j) {
                    Throwable th2 = ((e7.j) e9).f2879a;
                    if (th2 == null) {
                        throw new e7.o("Channel was closed normally");
                    }
                    throw th2;
                }
                if (e9 instanceof e7.k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (((AtomicInteger) ((b6.c) kVar.f4163j).f1394g).getAndIncrement() == 0) {
                    c7.a0.p((c7.x) kVar.f4160g, null, null, new e0((Object) kVar, (h6.d) (z13 ? 1 : 0), 10), 3);
                }
                this.f7h = 1;
                Object d02 = nVar.d0(this);
                return d02 == aVar10 ? aVar10 : d02;
            case q.c.f7261e /* 10 */:
                d6.z zVar3 = d6.z.f2639a;
                i6.a aVar11 = i6.a.f4956f;
                int i21 = this.f7h;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar3;
                }
                d6.a.e(obj);
                c7.x xVar7 = (c7.x) this.f8i;
                f7.g gVar5 = (f7.g) this.f9j;
                e7.t g9 = ((g7.e) this.f10k).g(xVar7);
                this.f7h = 1;
                Object i22 = f7.f0.i(gVar5, g9, true, this);
                if (i22 != aVar11) {
                    i22 = zVar3;
                }
                return i22 == aVar11 ? aVar11 : zVar3;
            case 11:
                p1 p1Var = (p1) this.f9j;
                i6.a aVar12 = i6.a.f4956f;
                int i23 = this.f7h;
                if (i23 == 0) {
                    d6.a.e(obj);
                    l1 l1Var2 = (l1) this.f8i;
                    f7.a0 a0Var4 = new f7.a0(new k2(new k.p(p1Var, 0), null));
                    d0.e1 e1Var2 = new d0.e1(l1Var2, p1Var, (g0.z0) this.f10k, i7);
                    this.f7h = 1;
                    if (a0Var4.b(e1Var2, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            case 12:
                u1 u1Var = (u1) this.f10k;
                i6.a aVar13 = i6.a.f4956f;
                int i24 = this.f7h;
                if (i24 == 0) {
                    d6.a.e(obj);
                    l.x0 x0Var = (l.x0) u1Var;
                    x0Var.getClass();
                    ((q0.t) t1.f5666a.getValue()).c(x0Var, l.h1.f5506j, x0Var.f5711g);
                    k7.c cVar4 = x0Var.f5714j;
                    this.f8i = cVar4;
                    this.f9j = u1Var;
                    this.f7h = 1;
                    if (cVar4.c(this) == aVar13) {
                        return aVar13;
                    }
                    cVar = cVar4;
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u1Var = (u1) this.f9j;
                    cVar = (k7.c) this.f8i;
                    d6.a.e(obj);
                }
                try {
                    ((l.x0) u1Var).f5708d = u1Var.b();
                    c7.h hVar = ((l.x0) u1Var).f5713i;
                    if (hVar != null) {
                        hVar.resumeWith(u1Var.b());
                    }
                    ((l.x0) u1Var).f5713i = null;
                    cVar.e(null);
                    return d6.z.f2639a;
                } catch (Throwable th3) {
                    cVar.e(null);
                    throw th3;
                }
            case 13:
                i6.a aVar14 = i6.a.f4956f;
                int i25 = this.f7h;
                if (i25 == 0) {
                    d6.a.e(obj);
                    p.j jVar2 = (p.j) this.f8i;
                    p.h hVar2 = (p.h) this.f9j;
                    this.f7h = 1;
                    if (jVar2.b(hVar2, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                c7.i0 i0Var = (c7.i0) this.f10k;
                if (i0Var != null) {
                    i0Var.a();
                }
                return d6.z.f2639a;
            case 14:
                g0.g1 g1Var3 = ((o.m) this.f9j).f6688d;
                i6.a aVar15 = i6.a.f4956f;
                int i26 = this.f7h;
                try {
                    if (i26 == 0) {
                        d6.a.e(obj);
                        o.n0 n0Var = (o.n0) this.f8i;
                        g1Var3.setValue(Boolean.TRUE);
                        q6.e eVar3 = (q6.e) this.f10k;
                        this.f7h = 1;
                        if (eVar3.d(n0Var, this) == aVar15) {
                            return aVar15;
                        }
                    } else {
                        if (i26 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                    }
                    g1Var3.setValue(Boolean.FALSE);
                    return d6.z.f2639a;
                } catch (Throwable th4) {
                    g1Var3.setValue(Boolean.FALSE);
                    throw th4;
                }
            case q.c.f7263g /* 15 */:
                i6.a aVar16 = i6.a.f4956f;
                int i27 = this.f7h;
                if (i27 == 0) {
                    d6.a.e(obj);
                    o.m mVar = (o.m) this.f8i;
                    m.s0 s0Var = mVar.f6687c;
                    o.l lVar2 = mVar.f6686b;
                    m.p0 p0Var = (m.p0) this.f9j;
                    a0 a0Var5 = new a0((Object) mVar, this.f10k, (h6.d) (z14 ? 1 : 0), 14);
                    this.f7h = 1;
                    s0Var.getClass();
                    if (c7.a0.d(new m.r0(p0Var, s0Var, a0Var5, lVar2, null), this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            case 16:
                i6.a aVar17 = i6.a.f4956f;
                int i28 = this.f7h;
                if (i28 == 0) {
                    d6.a.e(obj);
                    o.d1 d1Var = (o.d1) this.f8i;
                    o.e0 e0Var = (o.e0) this.f9j;
                    y yVar = new y(d1Var, 27, (o.f1) this.f10k);
                    this.f7h = 1;
                    if (e0Var.d(yVar, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            case 17:
                i6.a aVar18 = i6.a.f4956f;
                int i29 = this.f7h;
                if (i29 == 0) {
                    d6.a.e(obj);
                    o.n0 n0Var2 = (o.n0) this.f8i;
                    o.f1 f1Var = (o.f1) this.f9j;
                    f1Var.f6616h = n0Var2;
                    ?? r13 = (j6.i) this.f10k;
                    o.d1 d1Var2 = f1Var.f6617i;
                    this.f7h = 1;
                    if (r13.d(d1Var2, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            case 18:
                i6.a aVar19 = i6.a.f4956f;
                int i30 = this.f7h;
                if (i30 == 0) {
                    d6.a.e(obj);
                    ?? r132 = (j6.i) this.f8i;
                    o.m0 m0Var = (o.m0) this.f9j;
                    y0.c cVar5 = new y0.c(((l1.v) this.f10k).f5832c);
                    this.f7h = 1;
                    if (r132.c(m0Var, cVar5, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            case 19:
                l1 l1Var3 = (l1) this.f10k;
                f7.f fVar2 = (f7.f) this.f9j;
                h6.i iVar2 = (h6.i) this.f8i;
                i6.a aVar20 = i6.a.f4956f;
                int i31 = this.f7h;
                if (i31 == 0) {
                    d6.a.e(obj);
                    if (r6.k.a(iVar2, h6.j.f4661f)) {
                        i2 i2Var2 = new i2(l1Var3, 2);
                        this.f7h = 1;
                        if (fVar2.b(i2Var2, this) == aVar20) {
                            return aVar20;
                        }
                    } else {
                        j2 j2Var2 = new j2(fVar2, l1Var3, z15 ? 1 : 0, i9);
                        this.f7h = 2;
                        if (c7.a0.x(iVar2, j2Var2, this) == aVar20) {
                            return aVar20;
                        }
                    }
                } else {
                    if (i31 != 1 && i31 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            case 20:
                i6.a aVar21 = i6.a.f4956f;
                int i32 = this.f7h;
                try {
                    if (i32 == 0) {
                        d6.a.e(obj);
                        r22 = (e7.e) this.f10k;
                        bVar = new e7.b(r22);
                        this.f8i = r22;
                        this.f9j = bVar;
                        this.f7h = 1;
                        obj = bVar.b(this);
                        r22 = r22;
                        if (obj == aVar21) {
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i32 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (e7.b) this.f9j;
                        e7.t tVar = (e7.t) this.f8i;
                        d6.a.e(obj);
                        r22 = tVar;
                        if (((Boolean) obj).booleanValue()) {
                            m1.f8288b.set(false);
                            synchronized (q0.n.f7427b) {
                                i.b0 b0Var = ((q0.b) q0.n.f7434i.get()).f7390h;
                                z8 = b0Var != null && b0Var.h();
                            }
                            if (z8) {
                                q0.n.a();
                            }
                            this.f8i = r22;
                            this.f9j = bVar;
                            this.f7h = 1;
                            obj = bVar.b(this);
                            r22 = r22;
                            if (obj == aVar21) {
                                return aVar21;
                            }
                            if (((Boolean) obj).booleanValue()) {
                                r22.c(null);
                                return d6.z.f2639a;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        CancellationException cancellationException = th5 instanceof CancellationException ? th5 : null;
                        if (cancellationException == null) {
                            cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException.initCause(th5);
                        }
                        r22.c(cancellationException);
                        throw th6;
                    }
                }
                break;
            case 21:
                d6.z zVar4 = d6.z.f2639a;
                t.g gVar6 = (t.g) this.f8i;
                i6.a aVar22 = i6.a.f4956f;
                int i33 = this.f7h;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar4;
                }
                d6.a.e(obj);
                o.i iVar3 = gVar6.f8726s;
                t.e eVar4 = new t.e(gVar6, (r1.a1) this.f9j, (r6.l) this.f10k);
                this.f7h = 1;
                iVar3.getClass();
                y0.d dVar = (y0.d) eVar4.a();
                if (dVar != null && !iVar3.C0(dVar, iVar3.f6642z)) {
                    c7.h hVar3 = new c7.h(1, a8.m.A(this));
                    hVar3.r();
                    o.h hVar4 = new o.h(eVar4, hVar3);
                    l1.i iVar4 = iVar3.f6638v;
                    i0.d dVar2 = iVar4.f5811a;
                    y0.d dVar3 = (y0.d) eVar4.a();
                    if (dVar3 == null) {
                        hVar3.resumeWith(zVar4);
                    } else {
                        hVar3.t(new y(iVar4, 25, hVar4));
                        int i34 = new w6.d(0, dVar2.f4842h - 1, 1).f9522g;
                        if (i34 >= 0) {
                            while (true) {
                                y0.d dVar4 = (y0.d) ((o.h) dVar2.f4840f[i34]).f6627a.a();
                                if (dVar4 != null) {
                                    y0.d d8 = dVar3.d(dVar4);
                                    if (d8.equals(dVar3)) {
                                        dVar2.a(i34 + 1, hVar4);
                                    } else if (!d8.equals(dVar4)) {
                                        CancellationException cancellationException2 = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                        int i35 = dVar2.f4842h - 1;
                                        if (i35 <= i34) {
                                            while (true) {
                                                ((o.h) dVar2.f4840f[i34]).f6628b.g(cancellationException2);
                                                if (i35 != i34) {
                                                    i35++;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (i34 != 0) {
                                    i34--;
                                }
                            }
                            if (!iVar3.A) {
                                iVar3.D0();
                            }
                        }
                        dVar2.a(0, hVar4);
                        if (!iVar3.A) {
                        }
                    }
                    obj3 = hVar3.q();
                    break;
                }
                obj3 = zVar4;
                return obj3 == aVar22 ? aVar22 : zVar4;
            case 22:
                g0.z0 z0Var = (g0.z0) this.f9j;
                i6.a aVar23 = i6.a.f4956f;
                int i36 = this.f7h;
                if (i36 == 0) {
                    d6.a.e(obj);
                    t3.h hVar5 = (t3.h) ((List) z0Var.getValue()).get(((List) z0Var.getValue()).size() - 2);
                    l.x0 x0Var2 = (l.x0) this.f8i;
                    float e10 = ((g0.c1) this.f10k).e();
                    this.f7h = 1;
                    if (x0Var2.m(e10, hVar5, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            default:
                i6.a aVar24 = i6.a.f4956f;
                int i37 = this.f7h;
                if (i37 == 0) {
                    d6.a.e(obj);
                    f4.x xVar8 = new f4.x((l1.d0) this.f8i, (w.n0) this.f10k, (x0) this.f9j, (h6.d) null, 2);
                    this.f7h = 1;
                    if (c7.a0.d(xVar8, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, h6.d dVar, int i7) {
        super(2, dVar);
        this.f6g = i7;
        this.f10k = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, Object obj2, h6.d dVar, int i7) {
        super(2, dVar);
        this.f6g = i7;
        this.f9j = obj;
        this.f10k = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, h6.d dVar, int i7) {
        super(2, dVar);
        this.f6g = i7;
        this.f8i = obj;
        this.f9j = obj2;
        this.f10k = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(o.f1 f1Var, q6.e eVar, h6.d dVar) {
        super(2, dVar);
        this.f6g = 17;
        this.f9j = f1Var;
        this.f10k = (j6.i) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(q6.f fVar, o.m0 m0Var, l1.v vVar, h6.d dVar) {
        super(2, dVar);
        this.f6g = 18;
        this.f8i = (j6.i) fVar;
        this.f9j = m0Var;
        this.f10k = vVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(t.g gVar, r1.a1 a1Var, q6.a aVar, h6.d dVar) {
        super(2, dVar);
        this.f6g = 21;
        this.f8i = gVar;
        this.f9j = a1Var;
        this.f10k = (r6.l) aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(w.n0 n0Var, x0 x0Var, h6.d dVar) {
        super(2, dVar);
        this.f6g = 23;
        this.f10k = n0Var;
        this.f9j = x0Var;
    }
}
