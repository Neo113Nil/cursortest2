package j0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f2954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f2955b;

    public o(p pVar, o.b bVar) {
        this.f2955b = pVar;
        this.f2954a = bVar;
    }

    @Override // j0.k
    public final void d(m mVar) {
        ((ArrayList) this.f2954a.getOrDefault(this.f2955b.f2957b, null)).remove(mVar);
        mVar.x(this);
    }
}
