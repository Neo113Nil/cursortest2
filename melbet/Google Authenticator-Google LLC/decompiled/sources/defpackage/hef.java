package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hef extends hfm {
    private final transient EnumSet a;
    private transient int b;

    public hef(EnumSet enumSet) {
        this.a = enumSet;
    }

    public static hfm a(EnumSet enumSet) {
        int size = enumSet.size();
        return size != 0 ? size != 1 ? new hef(enumSet) : new hjn((Enum) hnu.X(enumSet)) : hjb.a;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.hfm
    public final boolean b() {
        return true;
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof hef) {
            collection = ((hef) collection).a;
        }
        return this.a.containsAll(collection);
    }

    @Override // defpackage.hfm, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hef) {
            obj = ((hef) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.hfm, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.a.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.hfm, defpackage.heb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final hjr iterator() {
        return hnu.J(this.a.iterator());
    }

    @Override // defpackage.heb
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.hfm, defpackage.heb
    public Object writeReplace() {
        return new hee(this.a);
    }
}
