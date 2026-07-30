package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class xo1 implements Comparator<Comparable<? super Object>> {
    public static final xo1 a = new xo1();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable;
        Comparable<? super Object> comparable4 = comparable2;
        comparable3.getClass();
        comparable4.getClass();
        return comparable3.compareTo(comparable4);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return ja2.a;
    }
}
