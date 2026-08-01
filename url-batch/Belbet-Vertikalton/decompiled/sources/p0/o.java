package p0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q.b f3861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f3862b;

    public o(p pVar, q.b bVar) {
        this.f3862b = pVar;
        this.f3861a = bVar;
    }

    @Override // p0.k
    public final void c(m mVar) {
        ((ArrayList) this.f3861a.getOrDefault(this.f3862b.f3864b, null)).remove(mVar);
        mVar.x(this);
    }
}
