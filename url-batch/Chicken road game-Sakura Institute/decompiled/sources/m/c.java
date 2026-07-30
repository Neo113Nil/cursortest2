package m;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6120g;

    /* renamed from: h, reason: collision with root package name */
    public int f6121h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f6122i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p.l f6123j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(q qVar, p.l lVar, h6.d dVar, int i7) {
        super(2, dVar);
        this.f6120g = i7;
        this.f6122i = qVar;
        this.f6123j = lVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f6120g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new c(this.f6122i, this.f6123j, dVar, 0);
            default:
                return new c(this.f6122i, this.f6123j, dVar, 1);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f6120g) {
        }
        return ((c) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6120g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f6121h;
                if (i7 == 0) {
                    d6.a.e(obj);
                    p.j jVar = this.f6122i.f6231u;
                    if (jVar != null) {
                        this.f6121h = 1;
                        Object b9 = jVar.b(this.f6123j, this);
                        i6.a aVar = i6.a.f4956f;
                        if (b9 == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            default:
                int i8 = this.f6121h;
                if (i8 == 0) {
                    d6.a.e(obj);
                    p.j jVar2 = this.f6122i.f6231u;
                    if (jVar2 != null) {
                        p.m mVar = new p.m(this.f6123j);
                        this.f6121h = 1;
                        Object b10 = jVar2.b(mVar, this);
                        i6.a aVar2 = i6.a.f4956f;
                        if (b10 == aVar2) {
                            return aVar2;
                        }
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
