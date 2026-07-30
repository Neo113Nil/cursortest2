package g0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j2 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3765g;

    /* renamed from: h, reason: collision with root package name */
    public int f3766h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f7.f f3767i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l1 f3768j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(f7.f fVar, l1 l1Var, h6.d dVar, int i7) {
        super(2, dVar);
        this.f3765g = i7;
        this.f3767i = fVar;
        this.f3768j = l1Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f3765g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new j2(this.f3767i, this.f3768j, dVar, 0);
            default:
                return new j2(this.f3767i, this.f3768j, dVar, 1);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f3765g) {
        }
        return ((j2) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3765g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f3766h;
                if (i7 == 0) {
                    d6.a.e(obj);
                    i2 i2Var = new i2(this.f3768j, 1);
                    this.f3766h = 1;
                    Object b9 = this.f3767i.b(i2Var, this);
                    i6.a aVar = i6.a.f4956f;
                    if (b9 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            default:
                int i8 = this.f3766h;
                if (i8 == 0) {
                    d6.a.e(obj);
                    i2 i2Var2 = new i2(this.f3768j, 3);
                    this.f3766h = 1;
                    Object b10 = this.f3767i.b(i2Var2, this);
                    i6.a aVar2 = i6.a.f4956f;
                    if (b10 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
        }
    }
}
