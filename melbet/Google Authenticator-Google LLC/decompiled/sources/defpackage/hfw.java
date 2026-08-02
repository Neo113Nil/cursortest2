package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hfw extends hel {
    final /* synthetic */ hfx a;

    public hfw(hfx hfxVar) {
        this.a = hfxVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.heb
    public final boolean l() {
        return this.a.l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.hel, defpackage.heb
    public Object writeReplace() {
        return super.writeReplace();
    }
}
