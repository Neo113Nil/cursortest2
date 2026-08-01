package k0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f2789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f2790b;

    public o(p pVar, o.b bVar) {
        this.f2790b = pVar;
        this.f2789a = bVar;
    }

    @Override // k0.k
    public final void b(m mVar) {
        ((ArrayList) this.f2789a.getOrDefault(this.f2790b.f2792b, null)).remove(mVar);
        mVar.x(this);
    }
}
