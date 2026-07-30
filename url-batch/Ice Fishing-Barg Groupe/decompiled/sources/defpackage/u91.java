package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class u91 implements Comparator {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public static final u91 lS5Rgt96tfkO = new u91(0);
    public static final u91 TSizfFm2Yiuu = new u91(1);

    public /* synthetic */ u91(int i) {
        this.PxuCJdSBwIXG = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.PxuCJdSBwIXG) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                comparable4.getClass();
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.PxuCJdSBwIXG) {
            case 0:
                return TSizfFm2Yiuu;
            default:
                return lS5Rgt96tfkO;
        }
    }
}
