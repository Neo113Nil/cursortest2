package m0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q.b f3191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f3192b;

    public o(p pVar, q.b bVar) {
        this.f3192b = pVar;
        this.f3191a = bVar;
    }

    @Override // m0.k
    public final void c(m mVar) {
        ((ArrayList) this.f3191a.getOrDefault(this.f3192b.f3194b, null)).remove(mVar);
        mVar.x(this);
    }
}
