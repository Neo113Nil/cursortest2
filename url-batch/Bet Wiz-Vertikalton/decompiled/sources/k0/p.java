package k0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f2805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f2806b;

    public p(q qVar, o.b bVar) {
        this.f2806b = qVar;
        this.f2805a = bVar;
    }

    @Override // k0.l
    public final void b(n nVar) {
        ((ArrayList) this.f2805a.getOrDefault(this.f2806b.f2808b, null)).remove(nVar);
        nVar.x(this);
    }
}
