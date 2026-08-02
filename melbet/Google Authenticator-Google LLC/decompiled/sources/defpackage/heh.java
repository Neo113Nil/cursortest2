package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class heh extends hjs {
    private final hel a;

    public heh(hel helVar, int i) {
        super(helVar.size(), i);
        this.a = helVar;
    }

    @Override // defpackage.hjs
    public final Object a(int i) {
        return this.a.get(i);
    }
}
