package N0;

import h2.AbstractC0508a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f3548b = new j(0);

    /* renamed from: c, reason: collision with root package name */
    public static final j f3549c = new j(1);

    /* renamed from: d, reason: collision with root package name */
    public static final j f3550d = new j(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f3551a;

    public j(int i3) {
        this.f3551a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f3551a == ((j) obj).f3551a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3551a;
    }

    public final String toString() {
        int i3 = this.f3551a;
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
        return "TextDecoration[" + AbstractC0508a.z(arrayList, ", ") + ']';
    }
}
