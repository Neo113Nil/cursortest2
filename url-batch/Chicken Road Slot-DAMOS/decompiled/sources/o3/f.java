package o3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f7391a;

    static {
        new f("", 0, 0);
    }

    public f(String str, int i3, int i10) {
        this.f7391a = new e(str, i3, i10);
    }

    public static f a(int i3, int i10, boolean z10, int i11, int i12, int i13, int i14) {
        String sb2;
        if (z10) {
            int i15 = i3 / 2;
            int i16 = i10 / 2;
            sb2 = "M0," + i16 + " A" + i15 + "," + i16 + " 0 1,1 " + i3 + "," + i16 + " A" + i15 + "," + i16 + " 0 1,1 0," + i16 + " Z";
        } else {
            StringBuilder sb3 = new StringBuilder("M ");
            int min = Math.min(i3 / 2, i10 / 2);
            int min2 = Math.min(min, i11);
            int min3 = Math.min(min, i12);
            int min4 = Math.min(min, i13);
            int min5 = Math.min(min, i14);
            sb3.append(min2);
            sb3.append(",0 L ");
            sb3.append(i3 - min3);
            sb3.append(",0");
            if (min3 > 0) {
                sb3.append(" A ");
                sb3.append(min3);
                sb3.append(",");
                sb3.append(min3);
                sb3.append(" 0 0,1 ");
                sb3.append(i3);
                sb3.append(",");
                sb3.append(min3);
            }
            sb3.append(" L ");
            sb3.append(i3);
            sb3.append(",");
            sb3.append(i10 - min4);
            if (min4 > 0) {
                sb3.append(" A ");
                sb3.append(min4);
                sb3.append(",");
                sb3.append(min4);
                sb3.append(" 0 0,1 ");
                sb3.append(i3 - min4);
                sb3.append(",");
                sb3.append(i10);
            }
            sb3.append(" L ");
            sb3.append(min5);
            sb3.append(",");
            sb3.append(i10);
            if (min5 > 0) {
                sb3.append(" A ");
                sb3.append(min5);
                sb3.append(",");
                sb3.append(min5);
                sb3.append(" 0 0,1 0,");
                sb3.append(i10 - min5);
            }
            if (min2 > 0) {
                sb3.append(" L 0,");
                sb3.append(min2);
                sb3.append(" A ");
                sb3.append(min2);
                sb3.append(",");
                sb3.append(min2);
                sb3.append(" 0 0,1 ");
                sb3.append(min2);
                sb3.append(",0");
            }
            sb3.append(" Z");
            sb2 = sb3.toString();
        }
        return new f(sb2, i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return this.f7391a.equals(((f) obj).f7391a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7391a.hashCode();
    }

    public final String toString() {
        return this.f7391a.toString();
    }
}
