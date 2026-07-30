package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class if2 {
    public final int PxuCJdSBwIXG;
    public static final hf2 Companion = new hf2();
    public static final if2 lS5Rgt96tfkO = new if2(0);
    public static final if2 TSizfFm2Yiuu = new if2(1);
    public static final if2 Y1f8riQaR6yg = new if2(2);

    public if2(int i) {
        this.PxuCJdSBwIXG = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof if2) {
            return this.PxuCJdSBwIXG == ((if2) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG;
    }

    public final String toString() {
        int i = this.PxuCJdSBwIXG;
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
        if (arrayList.size() != 1) {
            return o0.QrzZRwfaDlRX(new StringBuilder("TextDecoration["), c21.PxuCJdSBwIXG(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
