package m0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p.b f3298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f3299b;

    public n(o oVar, p.b bVar) {
        this.f3299b = oVar;
        this.f3298a = bVar;
    }

    @Override // m0.j
    public final void c(l lVar) {
        ((ArrayList) this.f3298a.getOrDefault(this.f3299b.f3301b, null)).remove(lVar);
        lVar.x(this);
    }
}
