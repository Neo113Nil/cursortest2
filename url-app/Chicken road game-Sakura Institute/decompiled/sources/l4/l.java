package l4;

import b3.z;
import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final k4.a f5987a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5988b;

    /* renamed from: c, reason: collision with root package name */
    public final m4.d f5989c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Set f5990d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5991e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f5992f;

    public l(d dVar, k4.a aVar, a aVar2) {
        this.f5992f = dVar;
        this.f5987a = aVar;
        this.f5988b = aVar2;
    }

    public final void a(j4.b bVar) {
        this.f5992f.f5971m.post(new z(8, (Object) this, (Object) bVar, false));
    }

    public final void b(j4.b bVar) {
        j jVar = (j) this.f5992f.f5968j.get(this.f5988b);
        if (jVar != null) {
            m4.o.a(jVar.f5984m.f5971m);
            k4.a aVar = jVar.f5975d;
            aVar.d("onSignInFailed for " + aVar.getClass().getName() + " with " + String.valueOf(bVar));
            jVar.o(bVar, null);
        }
    }
}
