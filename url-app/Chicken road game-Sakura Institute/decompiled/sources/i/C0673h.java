package i;

import A.AbstractC0017m;

/* renamed from: i.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0673h {

    /* renamed from: a, reason: collision with root package name */
    public final long f6920a;

    public static long a(int i2, int i4) {
        return (i4 & 4294967295L) | (i2 << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0673h) {
            return this.f6920a == ((C0673h) obj).f6920a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6920a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j4 = this.f6920a;
        sb.append((int) (j4 >> 32));
        sb.append(", ");
        return AbstractC0017m.l(sb, (int) (j4 & 4294967295L), ')');
    }
}
