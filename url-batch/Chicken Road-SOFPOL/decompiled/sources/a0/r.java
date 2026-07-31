package a0;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r extends y0.l implements w1.m {

    /* renamed from: r, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.b f134r;

    @Override // w1.m
    public final void A(w1.h0 h0Var) {
        ArrayList arrayList = this.f134r.f520h;
        if (arrayList.size() <= 0) {
            h0Var.a();
        } else {
            q.q(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && q6.i.a(this.f134r, ((r) obj).f134r);
    }

    public final int hashCode() {
        return this.f134r.hashCode();
    }

    @Override // y0.l
    public final void j0() {
        this.f134r.getClass();
    }

    @Override // y0.l
    public final void k0() {
        androidx.compose.foundation.lazy.layout.b bVar = this.f134r;
        bVar.c();
        bVar.f514b = null;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f134r + ')';
    }
}
