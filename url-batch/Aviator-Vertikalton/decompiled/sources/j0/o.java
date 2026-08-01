package j0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f2950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f2951b;

    public o(p pVar, o.b bVar) {
        this.f2951b = pVar;
        this.f2950a = bVar;
    }

    @Override // j0.k
    public final void d(m mVar) {
        ((ArrayList) this.f2950a.getOrDefault(this.f2951b.f2953b, null)).remove(mVar);
        mVar.x(this);
    }
}
