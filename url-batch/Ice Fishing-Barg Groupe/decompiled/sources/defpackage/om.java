package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class om implements Comparator {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final /* synthetic */ Object lS5Rgt96tfkO;

    public /* synthetic */ om(int i, Object obj) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.PxuCJdSBwIXG;
        Object obj3 = this.lS5Rgt96tfkO;
        switch (i) {
            case 0:
                for (le0 le0Var : (le0[]) obj3) {
                    int QrzZRwfaDlRX = zv.QrzZRwfaDlRX((Comparable) le0Var.OPXfSBeufaJ8(obj), (Comparable) le0Var.OPXfSBeufaJ8(obj2));
                    if (QrzZRwfaDlRX != 0) {
                        return QrzZRwfaDlRX;
                    }
                }
                return 0;
            default:
                return ((Number) ((pe0) obj3).rtx2ld2ELZv4(obj, obj2)).intValue();
        }
    }
}
