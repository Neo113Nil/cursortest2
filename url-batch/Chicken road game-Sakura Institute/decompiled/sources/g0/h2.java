package g0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h2 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3743g;

    /* renamed from: h, reason: collision with root package name */
    public int f3744h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3745i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q6.e f3746j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z0 f3747k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(q6.e eVar, z0 z0Var, h6.d dVar, int i7) {
        super(2, dVar);
        this.f3743g = i7;
        this.f3746j = eVar;
        this.f3747k = z0Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f3743g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                h2 h2Var = new h2(this.f3746j, this.f3747k, dVar, 0);
                h2Var.f3745i = obj;
                return h2Var;
            case 1:
                h2 h2Var2 = new h2(this.f3746j, this.f3747k, dVar, 1);
                h2Var2.f3745i = obj;
                return h2Var2;
            default:
                h2 h2Var3 = new h2(this.f3746j, this.f3747k, dVar, 2);
                h2Var3.f3745i = obj;
                return h2Var3;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f3743g) {
        }
        return ((h2) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3743g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f3744h;
                if (i7 == 0) {
                    d6.a.e(obj);
                    l1 l1Var = new l1(this.f3747k, ((c7.x) this.f3745i).k());
                    this.f3744h = 1;
                    Object d8 = this.f3746j.d(l1Var, this);
                    i6.a aVar = i6.a.f4956f;
                    if (d8 == aVar) {
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
                int i8 = this.f3744h;
                if (i8 == 0) {
                    d6.a.e(obj);
                    l1 l1Var2 = new l1(this.f3747k, ((c7.x) this.f3745i).k());
                    this.f3744h = 1;
                    Object d9 = this.f3746j.d(l1Var2, this);
                    i6.a aVar2 = i6.a.f4956f;
                    if (d9 == aVar2) {
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
                int i9 = this.f3744h;
                if (i9 == 0) {
                    d6.a.e(obj);
                    l1 l1Var3 = new l1(this.f3747k, ((c7.x) this.f3745i).k());
                    this.f3744h = 1;
                    Object d10 = this.f3746j.d(l1Var3, this);
                    i6.a aVar3 = i6.a.f4956f;
                    if (d10 == aVar3) {
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
