package L0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f2682b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f2683c = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f2684a;

    public g(int i3) {
        this.f2684a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f2684a == ((g) obj).f2684a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2684a;
    }

    public final String toString() {
        int i3 = this.f2684a;
        if (i3 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i3 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i3 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + I2.d.w(arrayList, ", ") + ']';
    }
}
