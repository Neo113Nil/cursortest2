package defpackage;

import j$.util.Collection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hfh extends heb implements Collection, hic {
    private static final long serialVersionUID = 912559;
    private transient hel a;
    private transient hfm b;

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.hic
    @Deprecated
    public final int a(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.heb
    public final int c(Object[] objArr, int i) {
        hjr it = j().iterator();
        while (it.hasNext()) {
            hid hidVar = (hid) it.next();
            Arrays.fill(objArr, i, hidVar.a() + i, hidVar.a);
            i += hidVar.a();
        }
        return i;
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return b(obj) > 0;
    }

    @Override // defpackage.hic
    @Deprecated
    public final int d(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return hnu.v(this, obj);
    }

    @Override // defpackage.heb
    public final hel g() {
        hel helVar = this.a;
        if (helVar != null) {
            return helVar;
        }
        hel g = super.g();
        this.a = g;
        return g;
    }

    @Override // defpackage.hic
    @Deprecated
    public final boolean h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return hnu.h(j());
    }

    @Override // defpackage.hic
    public /* bridge */ /* synthetic */ Set i() {
        throw null;
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final hjr iterator() {
        return new hfd(j().iterator());
    }

    public abstract hfm n();

    @Override // defpackage.hic
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final hfm j() {
        hfm hfmVar = this.b;
        if (hfmVar == null) {
            hfmVar = isEmpty() ? hjb.a : new hff(this);
            this.b = hfmVar;
        }
        return hfmVar;
    }

    public abstract hid p(int i);

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }

    @Override // defpackage.heb
    public abstract Object writeReplace();
}
