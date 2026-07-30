package o;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6759g;

    /* renamed from: h, reason: collision with root package name */
    public int f6760h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x0 f6761i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ long f6762j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(x0 x0Var, long j8, h6.d dVar, int i7) {
        super(2, dVar);
        this.f6759g = i7;
        this.f6761i = x0Var;
        this.f6762j = j8;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f6759g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new u0(this.f6761i, this.f6762j, dVar, 0);
            case 1:
                return new u0(this.f6761i, this.f6762j, dVar, 1);
            case 2:
                return new u0(this.f6761i, this.f6762j, dVar, 2);
            default:
                u0 u0Var = new u0(this.f6761i, dVar);
                u0Var.f6762j = ((y0.c) obj).f9778a;
                return u0Var;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f6759g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((u0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 1:
                return ((u0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 2:
                return ((u0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            default:
                long j8 = ((y0.c) obj).f9778a;
                u0 u0Var = new u0(this.f6761i, (h6.d) obj2);
                u0Var.f6762j = j8;
                return u0Var.invokeSuspend(d6.z.f2639a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
    
        if (r8 == r5) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f8, code lost:
    
        if (r8 != r5) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f6, code lost:
    
        if (r8 == r5) goto L58;
     */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invokeSuspend;
        switch (this.f6759g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f6760h;
                d6.z zVar = d6.z.f2639a;
                if (i7 == 0) {
                    d6.a.e(obj);
                    f1 f1Var = this.f6761i.H;
                    long j8 = this.f6762j;
                    this.f6760h = 1;
                    long a3 = f1Var.f6612d == j0.f6658g ? m2.o.a(j8, 0.0f, 0.0f, 1) : m2.o.a(j8, 0.0f, 0.0f, 2);
                    e1 e1Var = new e1(f1Var, null);
                    m.w0 w0Var = f1Var.f6610b;
                    i6.a aVar = i6.a.f4956f;
                    if (w0Var != null && (f1Var.f6609a.d() || f1Var.f6609a.a())) {
                        invokeSuspend = w0Var.c(a3, e1Var, this);
                        break;
                    } else {
                        e1 e1Var2 = new e1(e1Var.f6606j, this);
                        e1Var2.f6605i = a3;
                        invokeSuspend = e1Var2.invokeSuspend(zVar);
                        break;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
            case 1:
                int i8 = this.f6760h;
                if (i8 == 0) {
                    d6.a.e(obj);
                    f1 f1Var2 = this.f6761i.H;
                    v0 v0Var = new v0(this.f6762j, null, 0);
                    this.f6760h = 1;
                    Object e9 = f1Var2.e(m.p0.f6229g, v0Var, this);
                    i6.a aVar2 = i6.a.f4956f;
                    if (e9 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            case 2:
                int i9 = this.f6760h;
                if (i9 == 0) {
                    d6.a.e(obj);
                    f1 f1Var3 = this.f6761i.H;
                    v0 v0Var2 = new v0(this.f6762j, null, 1);
                    this.f6760h = 1;
                    Object e10 = f1Var3.e(m.p0.f6229g, v0Var2, this);
                    i6.a aVar3 = i6.a.f4956f;
                    if (e10 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            default:
                int i10 = this.f6760h;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return obj;
                }
                d6.a.e(obj);
                long j9 = this.f6762j;
                f1 f1Var4 = this.f6761i.H;
                this.f6760h = 1;
                Object a9 = androidx.compose.foundation.gestures.a.a(f1Var4, j9, this);
                i6.a aVar4 = i6.a.f4956f;
                return a9 == aVar4 ? aVar4 : a9;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(x0 x0Var, h6.d dVar) {
        super(2, dVar);
        this.f6759g = 3;
        this.f6761i = x0Var;
    }
}
