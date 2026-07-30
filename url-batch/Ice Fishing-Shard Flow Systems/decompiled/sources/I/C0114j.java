package I;

import java.util.Objects;

/* renamed from: I.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114j {

    /* renamed from: a, reason: collision with root package name */
    public final C0113i f1211a;

    static {
        new C0114j("", 0, 0);
    }

    public C0114j(String str, int i2, int i5) {
        this.f1211a = new C0113i(str, i2, i5);
    }

    public static C0114j a(int i2, int i5, boolean z7, int i7, int i8, int i9, int i10) {
        String sb;
        if (z7) {
            int i11 = i2 / 2;
            int i12 = i5 / 2;
            sb = "M0," + i12 + " A" + i11 + "," + i12 + " 0 1,1 " + i2 + "," + i12 + " A" + i11 + "," + i12 + " 0 1,1 0," + i12 + " Z";
        } else {
            StringBuilder sb2 = new StringBuilder("M ");
            int min = Math.min(i2 / 2, i5 / 2);
            int min2 = Math.min(min, i7);
            int min3 = Math.min(min, i8);
            int min4 = Math.min(min, i9);
            int min5 = Math.min(min, i10);
            sb2.append(min2);
            sb2.append(",0 L ");
            sb2.append(i2 - min3);
            sb2.append(",0");
            if (min3 > 0) {
                sb2.append(" A ");
                sb2.append(min3);
                sb2.append(",");
                sb2.append(min3);
                sb2.append(" 0 0,1 ");
                sb2.append(i2);
                sb2.append(",");
                sb2.append(min3);
            }
            sb2.append(" L ");
            sb2.append(i2);
            sb2.append(",");
            sb2.append(i5 - min4);
            if (min4 > 0) {
                sb2.append(" A ");
                sb2.append(min4);
                sb2.append(",");
                sb2.append(min4);
                sb2.append(" 0 0,1 ");
                sb2.append(i2 - min4);
                sb2.append(",");
                sb2.append(i5);
            }
            sb2.append(" L ");
            sb2.append(min5);
            sb2.append(",");
            sb2.append(i5);
            if (min5 > 0) {
                sb2.append(" A ");
                sb2.append(min5);
                sb2.append(",");
                sb2.append(min5);
                sb2.append(" 0 0,1 0,");
                sb2.append(i5 - min5);
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
        return new C0114j(sb, i2, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0114j) {
            return Objects.equals(this.f1211a, ((C0114j) obj).f1211a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f1211a);
    }

    public final String toString() {
        return this.f1211a.toString();
    }
}
