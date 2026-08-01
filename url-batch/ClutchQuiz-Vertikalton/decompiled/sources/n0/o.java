package n0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f3186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f3187b;

    public o(p pVar, o.b bVar) {
        this.f3187b = pVar;
        this.f3186a = bVar;
    }

    @Override // n0.k
    public final void b(m mVar) {
        ((ArrayList) this.f3186a.getOrDefault(this.f3187b.f3189b, null)).remove(mVar);
        mVar.x(this);
    }
}
