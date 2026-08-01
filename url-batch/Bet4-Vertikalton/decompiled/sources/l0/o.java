package l0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f3103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f3104b;

    public o(p pVar, o.b bVar) {
        this.f3104b = pVar;
        this.f3103a = bVar;
    }

    @Override // l0.k
    public final void c(m mVar) {
        ((ArrayList) this.f3103a.getOrDefault(this.f3104b.f3106b, null)).remove(mVar);
        mVar.x(this);
    }
}
