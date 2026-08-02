package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hiy extends hfx {
    final /* synthetic */ hja a;

    public hiy(hja hjaVar) {
        this.a = hjaVar;
    }

    @Override // defpackage.hfx
    public final Object a(int i) {
        return this.a.b.h(i);
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.heb
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b.c;
    }

    @Override // defpackage.hfx, defpackage.hfm, defpackage.heb
    public Object writeReplace() {
        return super.writeReplace();
    }
}
