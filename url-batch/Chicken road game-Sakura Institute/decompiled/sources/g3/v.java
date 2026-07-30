package g3;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4203g;

    /* renamed from: h, reason: collision with root package name */
    public int f4204h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ boolean f4205i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0 f4206j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4207k;

    /* renamed from: l, reason: collision with root package name */
    public Object f4208l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(a0 a0Var, int i7, h6.d dVar, int i8) {
        super(2, dVar);
        this.f4203g = i8;
        this.f4206j = a0Var;
        this.f4207k = i7;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f4203g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                v vVar = new v(this.f4206j, this.f4207k, dVar, 0);
                vVar.f4205i = ((Boolean) obj).booleanValue();
                return vVar;
            default:
                v vVar2 = new v(this.f4206j, this.f4207k, dVar, 1);
                vVar2.f4205i = ((Boolean) obj).booleanValue();
                return vVar2;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        int i7 = this.f4203g;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        h6.d dVar = (h6.d) obj2;
        switch (i7) {
        }
        return ((v) create(bool, dVar)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        if (r7 == r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i7;
        i0 i0Var;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Object obj2;
        int i8;
        switch (this.f4203g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                boolean z12 = this.f4204h;
                a0 a0Var = this.f4206j;
                i6.a aVar = i6.a.f4956f;
                try {
                } catch (Throwable th2) {
                    if (z12 != 0) {
                        h0 e9 = a0Var.e();
                        this.f4208l = th2;
                        this.f4205i = z12;
                        this.f4204h = 2;
                        Integer a3 = e9.a();
                        if (a3 == aVar) {
                            return aVar;
                        }
                        th = th2;
                        obj = a3;
                        z10 = z12;
                    } else {
                        th = th2;
                        i7 = this.f4207k;
                        z9 = z12;
                    }
                }
                if (z12 == 0) {
                    d6.a.e(obj);
                    boolean z13 = this.f4205i;
                    this.f4205i = z13;
                    this.f4204h = 1;
                    obj = a0.c(a0Var, z13, this);
                    z12 = z13;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (z12 != 1) {
                        if (z12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z14 = this.f4205i;
                        th = (Throwable) this.f4208l;
                        d6.a.e(obj);
                        z10 = z14;
                        i7 = ((Number) obj).intValue();
                        z9 = z10;
                        i0Var = new d0(i7, th);
                        z8 = z9;
                        return new d6.j(i0Var, Boolean.valueOf(z8));
                    }
                    boolean z15 = this.f4205i;
                    d6.a.e(obj);
                    z12 = z15;
                }
                i0Var = (i0) obj;
                z8 = z12;
                return new d6.j(i0Var, Boolean.valueOf(z8));
            default:
                int i9 = this.f4204h;
                a0 a0Var2 = this.f4206j;
                Object obj3 = i6.a.f4956f;
                if (i9 == 0) {
                    d6.a.e(obj);
                    z11 = this.f4205i;
                    this.f4205i = z11;
                    this.f4204h = 1;
                    obj = a0Var2.g(this);
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f4208l;
                        d6.a.e(obj);
                        i8 = ((Number) obj).intValue();
                        obj3 = new c(obj2 != null ? obj2.hashCode() : 0, i8, obj2);
                        return obj3;
                    }
                    z11 = this.f4205i;
                    d6.a.e(obj);
                }
                if (!z11) {
                    obj2 = obj;
                    i8 = this.f4207k;
                    obj3 = new c(obj2 != null ? obj2.hashCode() : 0, i8, obj2);
                    return obj3;
                }
                h0 e10 = a0Var2.e();
                this.f4208l = obj;
                this.f4204h = 2;
                Integer a9 = e10.a();
                if (a9 != obj3) {
                    obj2 = obj;
                    obj = a9;
                    i8 = ((Number) obj).intValue();
                    obj3 = new c(obj2 != null ? obj2.hashCode() : 0, i8, obj2);
                }
                return obj3;
        }
    }
}
