package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hct extends hcu {
    public static final hct a = new hct();
    private static final long serialVersionUID = 0;

    private hct() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.hcu
    /* renamed from: a */
    public final int compareTo(hcu hcuVar) {
        return hcuVar == this ? 0 : -1;
    }

    @Override // defpackage.hcu, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((hcu) obj);
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }
}
