package n0;

import java.util.Objects;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final j f2791a;

    static {
        new k("", 0, 0);
    }

    public k(String str, int i, int i4) {
        this.f2791a = new j(str, i, i4);
    }

    public static k a(int i, int i4, boolean z4, int i5, int i6, int i7, int i8) {
        String sb;
        if (z4) {
            int i9 = i / 2;
            int i10 = i4 / 2;
            sb = "M0," + i10 + " A" + i9 + "," + i10 + " 0 1,1 " + i + "," + i10 + " A" + i9 + "," + i10 + " 0 1,1 0," + i10 + " Z";
        } else {
            StringBuilder sb2 = new StringBuilder("M ");
            int min = Math.min(i / 2, i4 / 2);
            int min2 = Math.min(min, i5);
            int min3 = Math.min(min, i6);
            int min4 = Math.min(min, i7);
            int min5 = Math.min(min, i8);
            sb2.append(min2);
            sb2.append(",0 L ");
            sb2.append(i - min3);
            sb2.append(",0");
            if (min3 > 0) {
                sb2.append(" A ");
                sb2.append(min3);
                sb2.append(",");
                sb2.append(min3);
                sb2.append(" 0 0,1 ");
                sb2.append(i);
                sb2.append(",");
                sb2.append(min3);
            }
            sb2.append(" L ");
            sb2.append(i);
            sb2.append(",");
            sb2.append(i4 - min4);
            if (min4 > 0) {
                sb2.append(" A ");
                sb2.append(min4);
                sb2.append(",");
                sb2.append(min4);
                sb2.append(" 0 0,1 ");
                sb2.append(i - min4);
                sb2.append(",");
                sb2.append(i4);
            }
            sb2.append(" L ");
            sb2.append(min5);
            sb2.append(",");
            sb2.append(i4);
            if (min5 > 0) {
                sb2.append(" A ");
                sb2.append(min5);
                sb2.append(",");
                sb2.append(min5);
                sb2.append(" 0 0,1 0,");
                sb2.append(i4 - min5);
            }
            if (min2 > 0) {
                sb2.append(" L 0,");
                sb2.append(min2);
                sb2.append(" A ");
                sb2.append(min2);
                sb2.append(",");
                sb2.append(min2);
                sb2.append(" 0 0,1 ");
                sb2.append(min2);
                sb2.append(",0");
            }
            sb2.append(" Z");
            sb = sb2.toString();
        }
        return new k(sb, i, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return Objects.equals(this.f2791a, ((k) obj).f2791a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2791a);
    }

    public final String toString() {
        return this.f2791a.toString();
    }
}
