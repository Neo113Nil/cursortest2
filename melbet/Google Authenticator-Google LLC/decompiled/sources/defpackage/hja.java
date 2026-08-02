package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hja extends hfh {
    static final hja a = new hja(new hik());
    final transient hik b;
    private final transient int c;
    private transient hfm d;

    public hja(hik hikVar) {
        this.b = hikVar;
        long j = 0;
        for (int i = 0; i < hikVar.c; i++) {
            j += hikVar.c(i);
        }
        this.c = hnu.ba(j);
    }

    @Override // defpackage.hic
    public final int b(Object obj) {
        return this.b.b(obj);
    }

    @Override // defpackage.heb
    public final boolean l() {
        throw null;
    }

    @Override // defpackage.hfh, defpackage.hic
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final hfm i() {
        hfm hfmVar = this.d;
        if (hfmVar != null) {
            return hfmVar;
        }
        hiy hiyVar = new hiy(this);
        this.d = hiyVar;
        return hiyVar;
    }

    @Override // defpackage.hfh
    public final hid p(int i) {
        return this.b.p(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.hic
    public final int size() {
        return this.c;
    }

    @Override // defpackage.hfh, defpackage.heb
    public Object writeReplace() {
        return new hiz(this);
    }
}
