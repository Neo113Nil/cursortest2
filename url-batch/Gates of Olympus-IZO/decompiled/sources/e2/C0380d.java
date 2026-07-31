package e2;

/* renamed from: e2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380d extends C0378b {

    /* renamed from: g, reason: collision with root package name */
    public static final C0380d f4775g = new C0380d(1, 0, 1);

    @Override // e2.C0378b
    public final boolean equals(Object obj) {
        if (obj instanceof C0380d) {
            if (!isEmpty() || !((C0380d) obj).isEmpty()) {
                C0380d c0380d = (C0380d) obj;
                if (this.f4768d == c0380d.f4768d) {
                    if (this.f4769e == c0380d.f4769e) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // e2.C0378b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f4768d * 31) + this.f4769e;
    }

    @Override // e2.C0378b
    public final boolean isEmpty() {
        return this.f4768d > this.f4769e;
    }

    @Override // e2.C0378b
    public final String toString() {
        return this.f4768d + ".." + this.f4769e;
    }
}
