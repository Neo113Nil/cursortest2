package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mh1 {
    public static final long b = ka0.b(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof mh1) {
            return this.a == ((mh1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextRange(");
        long j = this.a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return qy0.m(sb, (int) (j & 4294967295L), ')');
    }
}
