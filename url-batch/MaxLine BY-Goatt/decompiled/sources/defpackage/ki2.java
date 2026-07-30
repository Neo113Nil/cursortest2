package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ki2 implements Comparator {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Comparator b;

    public ki2(ki2 ki2Var) {
        this.b = ki2Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Comparator comparator = this.b;
        switch (i) {
            case 0:
                int compare = comparator.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return i91.b0.compare(((ai2) obj).c, ((ai2) obj2).c);
            default:
                int compare2 = ((ki2) comparator).compare(obj, obj2);
                return compare2 != 0 ? compare2 : bx.a(Integer.valueOf(((ai2) obj).g), Integer.valueOf(((ai2) obj2).g));
        }
    }

    public ki2(Comparator comparator) {
        this.b = comparator;
    }
}
