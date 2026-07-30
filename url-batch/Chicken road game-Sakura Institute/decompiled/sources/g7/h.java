package g7;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4487g = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f4488h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4489i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f4490j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f7.g f4491k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, f7.g gVar, h6.d dVar) {
        super(2, dVar);
        this.f4490j = kVar;
        this.f4491k = gVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f4487g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new h(this.f4490j, this.f4491k, this.f4489i, dVar);
            default:
                h hVar = new h(this.f4490j, this.f4491k, dVar);
                hVar.f4489i = obj;
                return hVar;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f4487g) {
        }
        return ((h) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [j6.i, q6.f] */
    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4487g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f4488h;
                if (i7 == 0) {
                    d6.a.e(obj);
                    ?? r9 = this.f4490j.f4502j;
                    Object obj2 = this.f4489i;
                    this.f4488h = 1;
                    Object c4 = r9.c(this.f4491k, obj2, this);
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
                int i8 = this.f4488h;
                if (i8 == 0) {
                    d6.a.e(obj);
                    c7.x xVar = (c7.x) this.f4489i;
                    r6.v vVar = new r6.v();
                    k kVar = this.f4490j;
                    f7.f fVar = kVar.f4486i;
                    j jVar = new j(vVar, xVar, kVar, this.f4491k, 0);
                    this.f4488h = 1;
                    Object b9 = fVar.b(jVar, this);
                    i6.a aVar2 = i6.a.f4956f;
                    if (b9 == aVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, f7.g gVar, Object obj, h6.d dVar) {
        super(2, dVar);
        this.f4490j = kVar;
        this.f4491k = gVar;
        this.f4489i = obj;
    }
}
