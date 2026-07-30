package k;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements g0.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5180a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5182c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5183d;

    public c(p0.f fVar, p0.g gVar, Object obj) {
        this.f5182c = fVar;
        this.f5183d = gVar;
        this.f5181b = obj;
    }

    @Override // g0.g0
    public final void a() {
        switch (this.f5180a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                q0.q qVar = (q0.q) this.f5182c;
                Object obj = this.f5181b;
                qVar.remove(obj);
                ((m) this.f5183d).f5242d.g(obj);
                break;
            case 1:
                p0.f fVar = (p0.f) this.f5182c;
                p0.g gVar = (p0.g) this.f5183d;
                Map map = gVar.f7003a;
                Object obj2 = fVar.f6999a;
                if (fVar.f7000b) {
                    Map c4 = fVar.f7001c.c();
                    if (c4.isEmpty()) {
                        map.remove(obj2);
                    } else {
                        map.put(obj2, c4);
                    }
                }
                gVar.f7004b.remove(this.f5181b);
                break;
            default:
                u3.p pVar = (u3.p) this.f5181b;
                t3.h hVar = (t3.h) this.f5183d;
                pVar.b().b(hVar);
                ((q0.q) this.f5182c).remove(hVar);
                break;
        }
    }

    public c(q0.q qVar, Object obj, m mVar) {
        this.f5182c = qVar;
        this.f5181b = obj;
        this.f5183d = mVar;
    }

    public c(u3.p pVar, t3.h hVar, q0.q qVar) {
        this.f5181b = pVar;
        this.f5183d = hVar;
        this.f5182c = qVar;
    }
}
