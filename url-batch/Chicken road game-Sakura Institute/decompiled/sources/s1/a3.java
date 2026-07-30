package s1;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a3 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8132g;

    /* renamed from: h, reason: collision with root package name */
    public int f8133h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c3 f8134i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(c3 c3Var, h6.d dVar, int i7) {
        super(2, dVar);
        this.f8132g = i7;
        this.f8134i = c3Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f8132g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new a3(this.f8134i, dVar, 0);
            default:
                return new a3(this.f8134i, dVar, 1);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f8132g) {
        }
        return ((a3) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8132g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f8133h;
                d6.z zVar = d6.z.f2639a;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                r rVar = this.f8134i.f8188f;
                this.f8133h = 1;
                Object d8 = rVar.f8387r.d(this);
                i6.a aVar = i6.a.f4956f;
                if (d8 != aVar) {
                    d8 = zVar;
                }
                return d8 == aVar ? aVar : zVar;
            default:
                int i8 = this.f8133h;
                d6.z zVar2 = d6.z.f2639a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar2;
                }
                d6.a.e(obj);
                r rVar2 = this.f8134i.f8188f;
                this.f8133h = 1;
                Object a3 = rVar2.f8389s.a(this);
                i6.a aVar2 = i6.a.f4956f;
                if (a3 != aVar2) {
                    a3 = zVar2;
                }
                return a3 == aVar2 ? aVar2 : zVar2;
        }
    }
}
