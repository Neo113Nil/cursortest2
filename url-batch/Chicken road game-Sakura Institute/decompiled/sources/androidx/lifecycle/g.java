package androidx.lifecycle;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f972f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Object f973g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f974h;

    public g(e eVar, t tVar) {
        r6.k.f(eVar, "defaultLifecycleObserver");
        this.f973g = eVar;
        this.f974h = tVar;
    }

    @Override // androidx.lifecycle.t
    public final void c(v vVar, n nVar) {
        switch (this.f972f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                e eVar = (e) this.f973g;
                switch (f.f962a[nVar.ordinal()]) {
                    case 1:
                        eVar.getClass();
                        break;
                    case 2:
                        eVar.n(vVar);
                        break;
                    case 3:
                        eVar.b(vVar);
                        break;
                    case 4:
                        eVar.getClass();
                        break;
                    case 5:
                        eVar.t(vVar);
                        break;
                    case 6:
                        eVar.getClass();
                        break;
                    case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                t tVar = (t) this.f974h;
                if (tVar != null) {
                    tVar.c(vVar, nVar);
                    return;
                }
                return;
            case 1:
                if (nVar == n.ON_START) {
                    ((x) this.f973g).f(this);
                    ((x3.e) this.f974h).d();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((b) this.f974h).f947a;
                List list = (List) hashMap.get(nVar);
                Object obj = this.f973g;
                b.a(list, vVar, nVar, obj);
                b.a((List) hashMap.get(n.ON_ANY), vVar, nVar, obj);
                return;
        }
    }

    public g(u uVar) {
        this.f973g = uVar;
        d dVar = d.f954c;
        Class<?> cls = uVar.getClass();
        b bVar = (b) dVar.f955a.get(cls);
        this.f974h = bVar == null ? dVar.a(cls, null) : bVar;
    }

    public g(x xVar, x3.e eVar) {
        this.f973g = xVar;
        this.f974h = eVar;
    }
}
