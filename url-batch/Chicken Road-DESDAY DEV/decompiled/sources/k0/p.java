package k0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f2756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f2757b;

    public p(q qVar, o.b bVar) {
        this.f2757b = qVar;
        this.f2756a = bVar;
    }

    @Override // k0.l
    public final void b(n nVar) {
        ((ArrayList) this.f2756a.getOrDefault(this.f2757b.f2759b, null)).remove(nVar);
        nVar.x(this);
    }
}
