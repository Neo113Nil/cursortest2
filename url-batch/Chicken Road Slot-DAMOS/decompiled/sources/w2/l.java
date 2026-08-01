package w2;

import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f10044b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f10045c = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f10046a;

    public l(int i3) {
        this.f10046a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f10046a == ((l) obj).f10046a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10046a;
    }

    public final String toString() {
        int i3 = this.f10046a;
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
        if (arrayList.size() != 1) {
            return n0.l.h(new StringBuilder("TextDecoration["), z2.a.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
