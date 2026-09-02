package W;

import E.AbstractC0005f;

/* loaded from: classes.dex */
public final class C extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final int f3252a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3253b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C(int i4, int i5) {
        super(r0);
        String k4;
        if (i4 == 0) {
            k4 = AbstractC0005f.k(i5, "Player stuck buffering and not loading for ", " ms");
        } else if (i4 == 1) {
            k4 = AbstractC0005f.k(i5, "Player stuck buffering with no progress for ", " ms");
        } else if (i4 == 2) {
            k4 = AbstractC0005f.k(i5, "Player stuck playing with no progress for ", " ms");
        } else if (i4 == 3) {
            k4 = AbstractC0005f.k(i5, "Player stuck playing without ending for ", " ms");
        } else {
            if (i4 != 4) {
                throw new IllegalStateException();
            }
            k4 = AbstractC0005f.k(i5, "Player stuck suppressed for ", " ms");
        }
        this.f3252a = i4;
        this.f3253b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        C c4 = (C) obj;
        return this.f3252a == c4.f3252a && this.f3253b == c4.f3253b;
    }

    public final int hashCode() {
        return ((527 + this.f3252a) * 31) + this.f3253b;
    }
}
