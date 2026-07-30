package defpackage;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jj2 extends u0 implements Set, Serializable {
    public static final jj2 n;
    public final uh1 m;

    static {
        uh1.z.getClass();
        n = new jj2(uh1.A);
    }

    public jj2() {
        this.m = new uh1();
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        if (this.m.y) {
            return new ej2(1, this);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // defpackage.u0
    public final int a() {
        return this.m.u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.m.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.m.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.m.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.m.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.m.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        uh1 uh1Var = this.m;
        uh1Var.getClass();
        return new vh1(uh1Var, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        uh1 uh1Var = this.m;
        uh1Var.c();
        int g = uh1Var.g(obj);
        if (g < 0) {
            return false;
        }
        uh1Var.k(g);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.m.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.m.c();
        return super.retainAll(collection);
    }

    public jj2(uh1 uh1Var) {
        uh1Var.getClass();
        this.m = uh1Var;
    }

    public jj2(int i) {
        this.m = new uh1(i);
    }
}
