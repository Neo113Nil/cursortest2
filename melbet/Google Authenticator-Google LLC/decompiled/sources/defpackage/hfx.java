package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hfx extends hfm {
    public abstract Object a(int i);

    @Override // defpackage.heb
    public final int c(Object[] objArr, int i) {
        return g().c(objArr, i);
    }

    @Override // defpackage.hfm
    public final hel h() {
        return new hfw(this);
    }

    @Override // defpackage.hfm, defpackage.heb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public hjr iterator() {
        return g().listIterator(0);
    }

    @Override // defpackage.hfm, defpackage.heb
    public Object writeReplace() {
        return super.writeReplace();
    }
}
