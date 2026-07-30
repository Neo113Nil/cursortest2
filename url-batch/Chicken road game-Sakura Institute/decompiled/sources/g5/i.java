package g5;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import l.v;
import l5.o;
import l5.w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f4469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f4470h;

    public /* synthetic */ i(c cVar, w wVar, int i7) {
        this.f4468f = i7;
        this.f4470h = cVar;
        this.f4469g = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List o2;
        List list;
        switch (this.f4468f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                l5.i iVar = this.f4470h.f4458a;
                iVar.getClass();
                t5.c cVar = l5.c.f6008a;
                w wVar = this.f4469g;
                q5.i iVar2 = wVar.f6090f;
                if (cVar.equals(iVar2.f7535a.z())) {
                    v vVar = iVar.f6042k;
                    vVar.getClass();
                    o2 = vVar.o(iVar2, wVar, null);
                } else {
                    v vVar2 = iVar.f6043l;
                    vVar2.getClass();
                    o2 = vVar2.o(iVar2, wVar, null);
                }
                iVar.b(o2);
                break;
            default:
                l5.i iVar3 = this.f4470h.f4458a;
                iVar3.getClass();
                w wVar2 = this.f4469g;
                t5.c z8 = wVar2.f6090f.f7535a.z();
                if (z8 == null || !z8.equals(l5.c.f6008a)) {
                    v vVar3 = iVar3.f6043l;
                    list = (List) ((n5.a) vVar3.f5686g).a(new o(vVar3, wVar2, 0));
                } else {
                    v vVar4 = iVar3.f6042k;
                    list = (List) ((n5.a) vVar4.f5686g).a(new o(vVar4, wVar2, 0));
                }
                iVar3.b(list);
                break;
        }
    }
}
