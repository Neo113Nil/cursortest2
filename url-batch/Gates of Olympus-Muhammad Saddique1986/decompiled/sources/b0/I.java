package b0;

import a0.C0239d;

/* loaded from: classes.dex */
public final class I extends K {

    /* renamed from: a, reason: collision with root package name */
    public final C0239d f5352a;

    public I(C0239d c0239d) {
        this.f5352a = c0239d;
    }

    @Override // b0.K
    public final C0239d a() {
        return this.f5352a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            return f2.j.a(this.f5352a, ((I) obj).f5352a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5352a.hashCode();
    }
}
