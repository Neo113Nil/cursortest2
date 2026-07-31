package k2;

/* renamed from: k2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572d extends C0570b {

    /* renamed from: g, reason: collision with root package name */
    public static final C0572d f6426g = new C0572d(1, 0, 1);

    @Override // k2.C0570b
    public final boolean equals(Object obj) {
        if (obj instanceof C0572d) {
            if (!isEmpty() || !((C0572d) obj).isEmpty()) {
                C0572d c0572d = (C0572d) obj;
                if (this.f6419d == c0572d.f6419d) {
                    if (this.f6420e == c0572d.f6420e) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // k2.C0570b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f6419d * 31) + this.f6420e;
    }

    @Override // k2.C0570b
    public final boolean isEmpty() {
        return this.f6419d > this.f6420e;
    }

    @Override // k2.C0570b
    public final String toString() {
        return this.f6419d + ".." + this.f6420e;
    }
}
