package z7;

import c6.s;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r extends p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w7.g f10947e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x7.e f10948i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f10949r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(d dVar, w7.g gVar, w7.g gVar2, x7.e eVar) {
        super(gVar);
        this.f10949r = dVar;
        this.f10947e = gVar2;
        this.f10948i = eVar;
    }

    @Override // z7.p
    public final void b() {
        synchronized (this.f10949r.f10929f) {
            try {
                d dVar = this.f10949r;
                w7.g gVar = this.f10947e;
                dVar.f10928e.add(gVar);
                gVar.f10117a.addOnCompleteListener(new s(dVar, gVar));
                if (this.f10949r.f10933l.getAndIncrement() > 0) {
                    this.f10949r.f10925b.a("Already connected to the service.", new Object[0]);
                }
                d.b(this.f10949r, this.f10948i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
