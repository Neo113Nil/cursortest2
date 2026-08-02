package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hev extends hfx {
    private final her a;

    public hev(her herVar) {
        this.a = herVar;
    }

    @Override // defpackage.hfx
    public final Object a(int i) {
        return ((Map.Entry) this.a.entrySet().g().get(i)).getKey();
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.hfx, defpackage.hfm, defpackage.heb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // defpackage.hfx, defpackage.hfm, defpackage.heb
    /* renamed from: k */
    public final hjr iterator() {
        return this.a.bL();
    }

    @Override // defpackage.heb
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.hfx, defpackage.hfm, defpackage.heb
    public Object writeReplace() {
        return new heu(this.a);
    }
}
