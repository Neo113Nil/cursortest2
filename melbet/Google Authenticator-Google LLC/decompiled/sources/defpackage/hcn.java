package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hcn extends hcp {
    @Override // defpackage.hcp
    public final int a() {
        return 0;
    }

    @Override // defpackage.hcp
    public final hcp b(Comparable comparable, Comparable comparable2) {
        int compareTo = comparable.compareTo(comparable2);
        return compareTo < 0 ? hcp.c : compareTo > 0 ? hcp.d : hcp.b;
    }
}
