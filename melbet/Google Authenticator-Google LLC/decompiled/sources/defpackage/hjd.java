package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hjd extends hin implements Serializable {
    static final hjd a = new hjd();
    private static final long serialVersionUID = 0;

    private hjd() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.hin
    public final hin c() {
        return hih.a;
    }

    @Override // defpackage.hin, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
