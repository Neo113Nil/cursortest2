package m;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6128g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f6129h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(q qVar, h6.d dVar, int i7) {
        super(2, dVar);
        this.f6128g = i7;
        this.f6129h = qVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f6128g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new d(this.f6129h, dVar, 0);
            default:
                return new d(this.f6129h, dVar, 1);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f6128g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d dVar2 = (d) create(xVar, dVar);
                d6.z zVar = d6.z.f2639a;
                dVar2.invokeSuspend(zVar);
                return zVar;
            default:
                d dVar3 = (d) create(xVar, dVar);
                d6.z zVar2 = d6.z.f2639a;
                dVar3.invokeSuspend(zVar2);
                return zVar2;
        }
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6128g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.a.e(obj);
                q qVar = this.f6129h;
                if (qVar.F == null) {
                    p.f fVar = new p.f();
                    p.j jVar = qVar.f6231u;
                    if (jVar != null) {
                        c7.a0.p(qVar.o0(), null, null, new a0.e0(jVar, fVar, null, 15), 3);
                    }
                    qVar.F = fVar;
                }
                break;
            default:
                d6.a.e(obj);
                q qVar2 = this.f6129h;
                p.f fVar2 = qVar2.F;
                if (fVar2 != null) {
                    p.g gVar = new p.g(fVar2);
                    p.j jVar2 = qVar2.f6231u;
                    h6.d dVar = null;
                    if (jVar2 != null) {
                        c7.a0.p(qVar2.o0(), null, null, new a0.e0(jVar2, gVar, dVar, 16), 3);
                    }
                    qVar2.F = null;
                }
                break;
        }
        return d6.z.f2639a;
    }
}
