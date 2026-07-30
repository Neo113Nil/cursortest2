package l2;

import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f5877b = new j(0);

    /* renamed from: c, reason: collision with root package name */
    public static final j f5878c = new j(1);

    /* renamed from: d, reason: collision with root package name */
    public static final j f5879d = new j(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f5880a;

    public j(int i7) {
        this.f5880a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f5880a == ((j) obj).f5880a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5880a;
    }

    public final String toString() {
        int i7 = this.f5880a;
        if (i7 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i7 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i7 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + a8.d.E(arrayList, ", ") + ']';
    }
}
