package o;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i1 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6648g;

    /* renamed from: h, reason: collision with root package name */
    public int f6649h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m0 f6650i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(m0 m0Var, h6.d dVar, int i7) {
        super(2, dVar);
        this.f6648g = i7;
        this.f6650i = m0Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f6648g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new i1(this.f6650i, dVar, 0);
            case 1:
                return new i1(this.f6650i, dVar, 1);
            default:
                return new i1(this.f6650i, dVar, 2);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f6648g) {
        }
        return ((i1) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6648g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f6649h;
                if (i7 == 0) {
                    d6.a.e(obj);
                    this.f6649h = 1;
                    Object b9 = this.f6650i.b(this);
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
            case 1:
                int i8 = this.f6649h;
                if (i8 == 0) {
                    d6.a.e(obj);
                    this.f6649h = 1;
                    Object b10 = this.f6650i.b(this);
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
            default:
                int i9 = this.f6649h;
                if (i9 == 0) {
                    d6.a.e(obj);
                    this.f6649h = 1;
                    Object b11 = this.f6650i.b(this);
                    i6.a aVar3 = i6.a.f4956f;
                    if (b11 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
        }
    }
}
