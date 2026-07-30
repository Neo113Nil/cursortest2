package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e1 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public long f6603g;

    /* renamed from: h, reason: collision with root package name */
    public int f6604h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ long f6605i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f1 f6606j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, h6.d dVar) {
        super(2, dVar);
        this.f6606j = f1Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        e1 e1Var = new e1(this.f6606j, dVar);
        e1Var.f6605i = ((m2.o) obj).f6330a;
        return e1Var;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        long j8 = ((m2.o) obj).f6330a;
        e1 e1Var = new e1(this.f6606j, (h6.d) obj2);
        e1Var.f6605i = j8;
        return e1Var.invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j8;
        long j9;
        long j10;
        long j11;
        int i7 = this.f6604h;
        f1 f1Var = this.f6606j;
        i6.a aVar = i6.a.f4956f;
        if (i7 == 0) {
            d6.a.e(obj);
            j8 = this.f6605i;
            b1.b bVar = f1Var.f6614f;
            this.f6605i = j8;
            this.f6604h = 1;
            obj = bVar.g(j8, this);
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = this.f6603g;
                    j10 = this.f6605i;
                    d6.a.e(obj);
                    return new m2.o(m2.o.d(j10, m2.o.d(j11, ((m2.o) obj).f6330a)));
                }
                j9 = this.f6603g;
                j8 = this.f6605i;
                d6.a.e(obj);
                long j12 = ((m2.o) obj).f6330a;
                b1.b bVar2 = f1Var.f6614f;
                long d8 = m2.o.d(j9, j12);
                this.f6605i = j8;
                this.f6603g = j12;
                this.f6604h = 3;
                obj = bVar2.f(d8, j12, this);
                if (obj != aVar) {
                    j10 = j8;
                    j11 = j12;
                    return new m2.o(m2.o.d(j10, m2.o.d(j11, ((m2.o) obj).f6330a)));
                }
                return aVar;
            }
            j8 = this.f6605i;
            d6.a.e(obj);
        }
        long d9 = m2.o.d(j8, ((m2.o) obj).f6330a);
        this.f6605i = j8;
        this.f6603g = d9;
        this.f6604h = 2;
        obj = f1Var.b(d9, this);
        if (obj != aVar) {
            j9 = d9;
            long j122 = ((m2.o) obj).f6330a;
            b1.b bVar22 = f1Var.f6614f;
            long d82 = m2.o.d(j9, j122);
            this.f6605i = j8;
            this.f6603g = j122;
            this.f6604h = 3;
            obj = bVar22.f(d82, j122, this);
            if (obj != aVar) {
            }
        }
        return aVar;
    }
}
