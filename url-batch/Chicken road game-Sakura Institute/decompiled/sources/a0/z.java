package a0;

import com.android.installreferrer.api.InstallReferrerClient;
import o.p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z extends j6.h implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f201g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f202h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f203i;

    /* renamed from: j, reason: collision with root package name */
    public Object f204j;

    /* renamed from: k, reason: collision with root package name */
    public Object f205k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f206l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b6.c cVar, l lVar, w.n0 n0Var, h6.d dVar) {
        super(2, dVar);
        this.f204j = cVar;
        this.f205k = lVar;
        this.f206l = n0Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f201g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                z zVar = new z((b6.c) this.f204j, (l) this.f205k, (w.n0) this.f206l, dVar);
                zVar.f203i = obj;
                return zVar;
            default:
                z zVar2 = new z((x.a) this.f206l, dVar);
                zVar2.f203i = obj;
                return zVar2;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        l1.c0 c0Var = (l1.c0) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f201g) {
        }
        return ((z) create(c0Var, dVar)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0156, code lost:
    
        if (r4 != r8) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ca, code lost:
    
        if (r11 != r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0063, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0061, code lost:
    
        if (r10 == r9) goto L16;
     */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0156 -> B:9:0x015a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ca -> B:31:0x00cd). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        l1.c0 c0Var;
        Object J;
        l1.c0 c0Var2;
        Object b9;
        l1.c0 c0Var3;
        l1.k kVar;
        l1.v vVar;
        i6.a aVar;
        Object b10;
        i6.a aVar2;
        Object obj2;
        l1.v vVar2;
        l1.c0 c0Var4;
        Object obj3;
        Object b11;
        Object obj4;
        switch (this.f201g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f202h;
                i6.a aVar3 = i6.a.f4956f;
                if (i7 == 0) {
                    d6.a.e(obj);
                    c0Var = (l1.c0) this.f203i;
                    this.f203i = c0Var;
                    this.f202h = 1;
                    J = j1.c.J(c0Var, this);
                    if (J == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2 && i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                        return d6.z.f2639a;
                    }
                    c0Var = (l1.c0) this.f203i;
                    d6.a.e(obj);
                    J = obj;
                }
                l1.j jVar = (l1.j) J;
                if (j1.c.g0(jVar) && (jVar.f5813b & 33) != 0) {
                    ?? r62 = jVar.f5812a;
                    int size = r62.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        if (!((l1.v) r62.get(i8)).b()) {
                        }
                    }
                    b6.c cVar = (b6.c) this.f204j;
                    l lVar = (l) this.f205k;
                    this.f203i = null;
                    this.f202h = 2;
                    if (j1.c.K(c0Var, cVar, lVar, jVar, this) == aVar3) {
                        return aVar3;
                    }
                    return d6.z.f2639a;
                }
                if (!j1.c.g0(jVar)) {
                    w.n0 n0Var = (w.n0) this.f206l;
                    this.f203i = null;
                    this.f202h = 3;
                    if (j1.c.L(c0Var, n0Var, jVar, this) == aVar3) {
                        return aVar3;
                    }
                }
                return d6.z.f2639a;
            default:
                x.a aVar4 = (x.a) this.f206l;
                int i9 = this.f202h;
                int i10 = 2;
                l1.k kVar2 = l1.k.f5815f;
                i6.a aVar5 = i6.a.f4956f;
                if (i9 == 0) {
                    d6.a.e(obj);
                    c0Var2 = (l1.c0) this.f203i;
                    this.f203i = c0Var2;
                    this.f202h = 1;
                    b9 = p1.b(c0Var2, true, kVar2, this);
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            vVar2 = (l1.v) this.f204j;
                            c0Var4 = (l1.c0) this.f203i;
                            d6.a.e(obj);
                            b11 = obj;
                            aVar = aVar5;
                            obj3 = null;
                            ?? r42 = ((l1.j) b11).f5812a;
                            int size2 = r42.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    obj4 = r42.get(i11);
                                    l1.v vVar3 = (l1.v) obj4;
                                    if (vVar3.b() || !l1.u.a(vVar3.f5830a, vVar2.f5830a) || !vVar3.f5833d) {
                                        i11++;
                                    }
                                } else {
                                    obj4 = obj3;
                                }
                            }
                            l1.v vVar4 = (l1.v) obj4;
                            if (vVar4 != null) {
                                vVar4.a();
                                aVar2 = aVar;
                                this.f203i = c0Var4;
                                this.f204j = vVar2;
                                obj3 = null;
                                this.f205k = null;
                                this.f202h = 3;
                                b11 = c0Var4.b(kVar2, this);
                                aVar = aVar2;
                                break;
                            }
                            return d6.z.f2639a;
                        }
                        kVar = (l1.k) this.f205k;
                        vVar = (l1.v) this.f204j;
                        c0Var3 = (l1.c0) this.f203i;
                        d6.a.e(obj);
                        b10 = obj;
                        ?? r11 = ((l1.j) b10).f5812a;
                        int size3 = r11.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size3) {
                                obj2 = r11.get(i12);
                                l1.v vVar5 = (l1.v) obj2;
                                if (vVar5.b()) {
                                    aVar2 = aVar5;
                                } else {
                                    aVar2 = aVar5;
                                    if (l1.u.a(vVar5.f5830a, vVar.f5830a) && vVar5.f5833d) {
                                    }
                                }
                                i12++;
                                aVar5 = aVar2;
                            } else {
                                aVar2 = aVar5;
                                obj2 = null;
                            }
                        }
                        l1.v vVar6 = (l1.v) obj2;
                        if (vVar6 != null && vVar6.f5831b - vVar.f5831b < c0Var3.e().c()) {
                            if (y0.c.c(y0.c.g(vVar6.f5832c, vVar.f5832c)) <= c0Var3.e().e()) {
                                aVar5 = aVar2;
                                i10 = 2;
                                this.f203i = c0Var3;
                                this.f204j = vVar;
                                this.f205k = kVar;
                                this.f202h = i10;
                                b10 = c0Var3.b(kVar, this);
                                break;
                            }
                        } else {
                            vVar6 = null;
                        }
                        if (vVar6 != null && ((Boolean) aVar4.f9589u.a()).booleanValue()) {
                            vVar6.a();
                            vVar2 = vVar;
                            c0Var4 = c0Var3;
                            this.f203i = c0Var4;
                            this.f204j = vVar2;
                            obj3 = null;
                            this.f205k = null;
                            this.f202h = 3;
                            b11 = c0Var4.b(kVar2, this);
                            aVar = aVar2;
                        }
                        return d6.z.f2639a;
                    }
                    c0Var2 = (l1.c0) this.f203i;
                    d6.a.e(obj);
                    b9 = obj;
                }
                l1.v vVar7 = (l1.v) b9;
                int i13 = vVar7.f5838i;
                long j8 = vVar7.f5832c;
                if (i13 == 3 || i13 == 4) {
                    c0Var3 = c0Var2;
                    kVar = (aVar4.f9590v || (y0.c.d(j8) >= 0.0f && y0.c.d(j8) < ((float) ((int) (c0Var2.f5784j.A >> 32))) && y0.c.e(j8) >= 0.0f && y0.c.e(j8) < ((float) ((int) (c0Var2.f5784j.A & 4294967295L))))) ? kVar2 : l1.k.f5816g;
                    vVar = vVar7;
                    this.f203i = c0Var3;
                    this.f204j = vVar;
                    this.f205k = kVar;
                    this.f202h = i10;
                    b10 = c0Var3.b(kVar, this);
                }
                return d6.z.f2639a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x.a aVar, h6.d dVar) {
        super(2, dVar);
        this.f206l = aVar;
    }
}
