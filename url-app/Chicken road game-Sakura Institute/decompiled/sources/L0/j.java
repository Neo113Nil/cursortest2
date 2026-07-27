package L0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f3510b = new j(0);

    /* renamed from: c, reason: collision with root package name */
    public static final j f3511c = new j(1);

    /* renamed from: d, reason: collision with root package name */
    public static final j f3512d = new j(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f3513a;

    public j(int i2) {
        this.f3513a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f3513a == ((j) obj).f3513a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3513a;
    }

    public final String toString() {
        int i2 = this.f3513a;
        if (i2 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i2 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i2 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + j0.c.x(arrayList, ", ") + ']';
    }
}
