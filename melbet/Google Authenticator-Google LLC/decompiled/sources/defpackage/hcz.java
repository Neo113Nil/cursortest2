package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hcz extends hjs {
    final /* synthetic */ Iterable[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcz(Iterable[] iterableArr) {
        super(2, 0);
        this.a = iterableArr;
    }

    @Override // defpackage.hjs
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return this.a[i].iterator();
    }
}
