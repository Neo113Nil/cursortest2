package g3;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4171g;

    /* renamed from: h, reason: collision with root package name */
    public int f4172h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0 f4173i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(a0 a0Var, h6.d dVar, int i7) {
        super(2, dVar);
        this.f4171g = i7;
        this.f4173i = a0Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f4171g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new n(this.f4173i, dVar, 0);
            case 1:
                return new n(this.f4173i, dVar, 1);
            default:
                return new n(this.f4173i, dVar, 2);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f4171g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((n) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
                return i6.a.f4956f;
            case 1:
                return ((n) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            default:
                return ((n) create((f7.g) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        if (r7 == r5) goto L20;
     */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        switch (this.f4171g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f4172h;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    throw new b4.c();
                }
                d6.a.e(obj);
                f7.y yVar = this.f4173i.f4092i;
                this.f4172h = 1;
                yVar.f3565f.b(m.f4168f, this);
                return i6.a.f4956f;
            case 1:
                a0 a0Var = this.f4173i;
                b6.c cVar = a0Var.f4095l;
                int i8 = this.f4172h;
                i6.a aVar = i6.a.f4956f;
                try {
                    if (i8 == 0) {
                        d6.a.e(obj);
                        if (cVar.p() instanceof b0) {
                            return cVar.p();
                        }
                        this.f4172h = 1;
                        if (a0Var.f(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            d6.a.e(obj);
                            return (i0) obj;
                        }
                        d6.a.e(obj);
                    }
                    this.f4172h = 2;
                    obj = a0.b(a0Var, false, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    return (i0) obj;
                } catch (Throwable th) {
                    return new d0(-1, th);
                }
            default:
                int i9 = this.f4172h;
                d6.z zVar = d6.z.f2639a;
                a0 a0Var2 = this.f4173i;
                i6.a aVar2 = i6.a.f4956f;
                if (i9 == 0) {
                    d6.a.e(obj);
                    k kVar = a0Var2.f4096m;
                    this.f4172h = 1;
                    Object d02 = ((c7.n) kVar.f4161h).d0(this);
                    if (d02 != aVar2) {
                        d02 = zVar;
                        break;
                    }
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                        return zVar;
                    }
                    d6.a.e(obj);
                }
                f7.f f9 = f7.f0.f(a0Var2.e().f4142c, -1);
                d0.y yVar2 = new d0.y(4, a0Var2);
                this.f4172h = 2;
                if (f9.b(yVar2, this) != aVar2) {
                    return zVar;
                }
                return aVar2;
        }
    }
}
