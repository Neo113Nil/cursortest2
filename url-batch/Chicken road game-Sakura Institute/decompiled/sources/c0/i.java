package c0;

import c7.a0;
import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1465g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1466h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f1467i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, h6.d dVar, int i7) {
        super(2, dVar);
        this.f1465g = i7;
        this.f1467i = jVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f1465g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i iVar = new i(this.f1467i, dVar, 0);
                iVar.f1466h = obj;
                return iVar;
            default:
                i iVar2 = new i(this.f1467i, dVar, 1);
                iVar2.f1466h = obj;
                return iVar2;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f1465g) {
        }
        return ((i) create(xVar, dVar)).invokeSuspend(z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1465g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.a.e(obj);
                c7.x xVar = (c7.x) this.f1466h;
                j jVar = this.f1467i;
                h6.d dVar = null;
                a0.p(xVar, null, null, new h(jVar, dVar, 0), 3);
                a0.p(xVar, null, null, new h(jVar, dVar, 1), 3);
                return a0.p(xVar, null, null, new h(jVar, dVar, 2), 3);
            default:
                d6.a.e(obj);
                return a0.p((c7.x) this.f1466h, null, null, new h(this.f1467i, null, 3), 3);
        }
    }
}
