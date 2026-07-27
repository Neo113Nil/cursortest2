package G1;

import java.util.Set;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final F1.a f3146a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3147b;

    /* renamed from: c, reason: collision with root package name */
    public final H1.d f3148c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Set f3149d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3150e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f3151f;

    public o(d dVar, F1.a aVar, a aVar2) {
        this.f3151f = dVar;
        this.f3146a = aVar;
        this.f3147b = aVar2;
    }

    public final void a(E1.b bVar) {
        this.f3151f.f3122m.post(new n(this, 0, bVar));
    }

    public final void b(E1.b bVar) {
        l lVar = (l) this.f3151f.f3119j.get(this.f3147b);
        if (lVar != null) {
            H1.o.a(lVar.f3140k.f3122m);
            F1.a aVar = lVar.f3131b;
            aVar.k("onSignInFailed for " + aVar.getClass().getName() + " with " + String.valueOf(bVar));
            lVar.o(bVar, null);
        }
    }
}
