package q2;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f6056b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f6057c = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f6058a;

    public l(int i) {
        this.f6058a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f6058a == ((l) obj).f6058a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6058a;
    }

    public final String toString() {
        int i = this.f6058a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + t2.a.a(arrayList, ", ", null, 62) + ']';
    }
}
