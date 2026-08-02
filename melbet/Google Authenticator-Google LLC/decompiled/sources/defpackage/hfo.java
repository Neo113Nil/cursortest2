package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hfo extends hel {
    final /* synthetic */ hfp a;

    public hfo(hfp hfpVar) {
        this.a = hfpVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        hfs hfsVar = this.a.a;
        return new AbstractMap.SimpleImmutableEntry(hfsVar.c.d.get(i), hfsVar.d.get(i));
    }

    @Override // defpackage.heb
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.a.size();
    }

    @Override // defpackage.hel, defpackage.heb
    public Object writeReplace() {
        return super.writeReplace();
    }
}
