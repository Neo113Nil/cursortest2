package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class n32 implements Comparator {
    public final /* synthetic */ int PxuCJdSBwIXG = 0;
    public final /* synthetic */ Comparator lS5Rgt96tfkO;

    public n32(n32 n32Var) {
        this.lS5Rgt96tfkO = n32Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.PxuCJdSBwIXG;
        Comparator comparator = this.lS5Rgt96tfkO;
        switch (i) {
            case 0:
                int compare = comparator.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return vw0.JHNfcAUfKc4G.compare(((d32) obj).TSizfFm2Yiuu, ((d32) obj2).TSizfFm2Yiuu);
            default:
                int compare2 = ((n32) comparator).compare(obj, obj2);
                return compare2 != 0 ? compare2 : zv.QrzZRwfaDlRX(Integer.valueOf(((d32) obj).a92UlCVFR9N8), Integer.valueOf(((d32) obj2).a92UlCVFR9N8));
        }
    }

    public n32(Comparator comparator) {
        this.lS5Rgt96tfkO = comparator;
    }
}
