package l5;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f6031b;

    public /* synthetic */ h(i iVar, int i7) {
        this.f6030a = i7;
        this.f6031b = iVar;
    }

    public final void a(q5.i iVar, t tVar, x xVar, x xVar2) {
        switch (this.f6030a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f6031b.e(new g(this, iVar, xVar2));
                break;
            default:
                j5.n nVar = this.f6031b.f6034c;
                ArrayList a3 = iVar.f7535a.a();
                HashMap a9 = iVar.f7536b.a();
                Long valueOf = tVar != null ? Long.valueOf(tVar.f6080a) : null;
                androidx.room.c cVar = new androidx.room.c(19, this, xVar2, false);
                HashMap hashMap = nVar.f5090o;
                j5.m mVar = new j5.m(a3, a9);
                b1.b bVar = nVar.f5099x;
                if (bVar.v()) {
                    bVar.d("Listening on " + mVar, null, new Object[0]);
                }
                a.a.z(!hashMap.containsKey(mVar), "listen() called twice for same QuerySpec.", new Object[0]);
                if (bVar.v()) {
                    bVar.d("Adding listen query: " + mVar, null, new Object[0]);
                }
                j5.k kVar = new j5.k(cVar, mVar, valueOf, xVar);
                hashMap.put(mVar, kVar);
                if (nVar.a()) {
                    nVar.j(kVar);
                }
                nVar.b();
                break;
        }
    }

    public final void b(q5.i iVar) {
        switch (this.f6030a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            default:
                j5.n nVar = this.f6031b.f6034c;
                ArrayList a3 = iVar.f7535a.a();
                HashMap a9 = iVar.f7536b.a();
                nVar.getClass();
                j5.m mVar = new j5.m(a3, a9);
                b1.b bVar = nVar.f5099x;
                if (bVar.v()) {
                    bVar.d("unlistening on " + mVar, null, new Object[0]);
                }
                j5.k f9 = nVar.f(mVar);
                if (f9 != null) {
                    j5.m mVar2 = f9.f5067b;
                    if (nVar.a()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("p", a.a.D(mVar2.f5074a));
                        Long l8 = f9.f5069d;
                        if (l8 != null) {
                            hashMap.put("q", mVar2.f5075b);
                            hashMap.put("t", l8);
                        }
                        nVar.l("n", false, hashMap, null);
                    }
                }
                nVar.b();
                break;
        }
    }

    private final void c(q5.i iVar) {
    }
}
