package B0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: b, reason: collision with root package name */
    public static final long f231b = I2.d.i(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f232c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f233a;

    public static String a(long j3) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j3 >> 32));
        sb.append(", ");
        return AbstractC0080b.k(sb, (int) (j3 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            return this.f233a == ((B) obj).f233a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f233a);
    }

    public final String toString() {
        return a(this.f233a);
    }
}
