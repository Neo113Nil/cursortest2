package o;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l1 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6680g;

    /* renamed from: h, reason: collision with root package name */
    public int f6681h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q6.f f6682i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m0 f6683j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l1.v f6684k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(q6.f fVar, m0 m0Var, l1.v vVar, h6.d dVar, int i7) {
        super(2, dVar);
        this.f6680g = i7;
        this.f6682i = fVar;
        this.f6683j = m0Var;
        this.f6684k = vVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f6680g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new l1(this.f6682i, this.f6683j, this.f6684k, dVar, 0);
            default:
                return new l1(this.f6682i, this.f6683j, this.f6684k, dVar, 1);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f6680g) {
        }
        return ((l1) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6680g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f6681h;
                if (i7 == 0) {
                    d6.a.e(obj);
                    y0.c cVar = new y0.c(this.f6684k.f5832c);
                    this.f6681h = 1;
                    Object c4 = this.f6682i.c(this.f6683j, cVar, this);
                    i6.a aVar = i6.a.f4956f;
                    if (c4 == aVar) {
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
                int i8 = this.f6681h;
                if (i8 == 0) {
                    d6.a.e(obj);
                    y0.c cVar2 = new y0.c(this.f6684k.f5832c);
                    this.f6681h = 1;
                    Object c6 = this.f6682i.c(this.f6683j, cVar2, this);
                    i6.a aVar2 = i6.a.f4956f;
                    if (c6 == aVar2) {
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
