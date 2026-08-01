package k0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f2743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f2744b;

    public o(p pVar, o.b bVar) {
        this.f2744b = pVar;
        this.f2743a = bVar;
    }

    @Override // k0.k
    public final void b(m mVar) {
        ((ArrayList) this.f2743a.getOrDefault(this.f2744b.f2746b, null)).remove(mVar);
        mVar.x(this);
    }
}
