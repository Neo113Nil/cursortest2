package l0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f3131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f3132b;

    public o(p pVar, o.b bVar) {
        this.f3132b = pVar;
        this.f3131a = bVar;
    }

    @Override // l0.k
    public final void c(m mVar) {
        ((ArrayList) this.f3131a.getOrDefault(this.f3132b.f3134b, null)).remove(mVar);
        mVar.x(this);
    }
}
