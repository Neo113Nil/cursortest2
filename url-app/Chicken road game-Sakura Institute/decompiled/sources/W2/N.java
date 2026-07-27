package W2;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class N implements Z {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4229d;

    public N(boolean z4) {
        this.f4229d = z4;
    }

    @Override // W2.Z
    public final boolean b() {
        return this.f4229d;
    }

    @Override // W2.Z
    public final m0 d() {
        return null;
    }

    public final String toString() {
        return AbstractC0017m.m(new StringBuilder("Empty{"), this.f4229d ? "Active" : "New", '}');
    }
}
