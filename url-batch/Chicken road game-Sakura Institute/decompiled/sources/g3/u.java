package g3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u extends j6.i implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public Throwable f4200g;

    /* renamed from: h, reason: collision with root package name */
    public int f4201h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0 f4202i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a0 a0Var, h6.d dVar) {
        super(1, dVar);
        this.f4202i = a0Var;
    }

    @Override // j6.a
    public final h6.d create(h6.d dVar) {
        return new u(this.f4202i, dVar);
    }

    @Override // q6.c
    public final Object f(Object obj) {
        return ((u) create((h6.d) obj)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r6 != r4) goto L22;
     */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        i0 i0Var;
        int i7 = this.f4201h;
        a0 a0Var = this.f4202i;
        i6.a aVar = i6.a.f4956f;
        try {
        } catch (Throwable th2) {
            th = th2;
            h0 e9 = a0Var.e();
            this.f4200g = th;
            this.f4201h = 2;
            obj = e9.a();
        }
        if (i7 == 0) {
            d6.a.e(obj);
            this.f4201h = 1;
            obj = a0.c(a0Var, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f4200g;
                d6.a.e(obj);
                i0Var = new d0(((Number) obj).intValue(), th);
                return new d6.j(i0Var, Boolean.TRUE);
            }
            d6.a.e(obj);
        }
        i0Var = (i0) obj;
        return new d6.j(i0Var, Boolean.TRUE);
    }
}
