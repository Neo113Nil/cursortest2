package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u extends j6.h implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public l1.j f6753g;

    /* renamed from: h, reason: collision with root package name */
    public int f6754h;

    /* renamed from: i, reason: collision with root package name */
    public int f6755i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6756j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r6.v f6757k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r6.v f6758l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r6.v vVar, r6.v vVar2, h6.d dVar) {
        super(2, dVar);
        this.f6757k = vVar;
        this.f6758l = vVar2;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        u uVar = new u(this.f6757k, this.f6758l, dVar);
        uVar.f6756j = obj;
        return uVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((u) create((l1.c0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r8 == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3 A[EDGE_INSN: B:67:0x00c3->B:13:0x00c3 BREAK  A[LOOP:0: B:7:0x00b0->B:10:0x00c0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b2  */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00a4 -> B:6:0x00a7). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        l1.c0 c0Var;
        int i7;
        Object obj2;
        Object b9;
        l1.c0 c0Var2;
        l1.j jVar;
        int size;
        int i8;
        boolean d8;
        Object obj3;
        Object obj4;
        int i9 = this.f6755i;
        int i10 = 2;
        l1.j jVar2 = null;
        i6.a aVar = i6.a.f4956f;
        if (i9 == 0) {
            d6.a.e(obj);
            c0Var = (l1.c0) this.f6756j;
            i7 = 0;
            if (i7 == 0) {
            }
        } else {
            if (i9 == 1) {
                i7 = this.f6754h;
                c0Var = (l1.c0) this.f6756j;
                d6.a.e(obj);
                obj2 = obj;
                l1.j jVar3 = (l1.j) obj2;
                ?? r9 = jVar3.f5812a;
                int size2 = r9.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        i7 = 1;
                        break;
                    }
                    if (!l1.t.c((l1.v) r9.get(i11))) {
                        break;
                    }
                    i11++;
                }
                ?? r92 = jVar3.f5812a;
                int size3 = r92.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    l1.v vVar = (l1.v) r92.get(i12);
                    if (vVar.b() || l1.t.e(vVar, c0Var.f5784j.A, c0Var.c())) {
                        break;
                    }
                }
                this.f6756j = c0Var;
                this.f6753g = jVar3;
                this.f6754h = i7;
                this.f6755i = i10;
                b9 = c0Var.b(l1.k.f5817h, this);
                if (b9 != aVar) {
                    c0Var2 = c0Var;
                    jVar = jVar3;
                    ?? r32 = ((l1.j) b9).f5812a;
                    size = r32.size();
                    i8 = 0;
                    while (true) {
                        if (i8 >= size) {
                        }
                        i8++;
                    }
                    r6.v vVar2 = this.f6757k;
                    d8 = y.d(jVar, ((l1.v) vVar2.f7968f).f5830a);
                    ?? r72 = jVar.f5812a;
                    r6.v vVar3 = this.f6758l;
                    if (d8) {
                    }
                    c0Var = c0Var2;
                    i10 = 2;
                    jVar2 = null;
                    if (i7 == 0) {
                    }
                }
                return aVar;
            }
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i7 = this.f6754h;
            jVar = this.f6753g;
            c0Var2 = (l1.c0) this.f6756j;
            d6.a.e(obj);
            b9 = obj;
            ?? r322 = ((l1.j) b9).f5812a;
            size = r322.size();
            i8 = 0;
            while (true) {
                if (i8 >= size) {
                    break;
                }
                if (((l1.v) r322.get(i8)).b()) {
                    i7 = 1;
                    break;
                }
                i8++;
            }
            r6.v vVar22 = this.f6757k;
            d8 = y.d(jVar, ((l1.v) vVar22.f7968f).f5830a);
            ?? r722 = jVar.f5812a;
            r6.v vVar32 = this.f6758l;
            if (d8) {
                int size4 = r722.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size4) {
                        obj3 = null;
                        break;
                    }
                    obj3 = r722.get(i13);
                    r6.v vVar4 = vVar22;
                    if (l1.u.a(((l1.v) obj3).f5830a, ((l1.v) vVar22.f7968f).f5830a)) {
                        break;
                    }
                    i13++;
                    vVar22 = vVar4;
                }
                vVar32.f7968f = obj3;
            } else {
                int size5 = r722.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = r722.get(i14);
                    if (((l1.v) obj4).f5833d) {
                        break;
                    }
                    i14++;
                }
                l1.v vVar5 = (l1.v) obj4;
                if (vVar5 != null) {
                    vVar22.f7968f = vVar5;
                    vVar32.f7968f = vVar5;
                } else {
                    i7 = 1;
                    c0Var = c0Var2;
                    jVar2 = null;
                    if (i7 == 0) {
                        return d6.z.f2639a;
                    }
                    this.f6756j = c0Var;
                    this.f6753g = jVar2;
                    this.f6754h = i7;
                    this.f6755i = 1;
                    obj2 = c0Var.b(l1.k.f5816g, this);
                }
            }
            c0Var = c0Var2;
            i10 = 2;
            jVar2 = null;
            if (i7 == 0) {
            }
        }
    }
}
