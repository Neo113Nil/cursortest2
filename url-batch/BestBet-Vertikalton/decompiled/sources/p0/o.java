package p0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f3696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f3697b;

    public o(p pVar, o.b bVar) {
        this.f3697b = pVar;
        this.f3696a = bVar;
    }

    @Override // p0.k
    public final void c(m mVar) {
        ((ArrayList) this.f3696a.getOrDefault(this.f3697b.f3699b, null)).remove(mVar);
        mVar.x(this);
    }
}
