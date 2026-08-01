package k1;

import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q.f f2366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f2367b;

    public p(q qVar, q.f fVar) {
        this.f2367b = qVar;
        this.f2366a = fVar;
    }

    @Override // k1.l
    public final void d(n nVar) {
        ((ArrayList) this.f2366a.get(this.f2367b.f2369g)).remove(nVar);
        nVar.x(this);
    }
}
