package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class w0 extends h0 {
    public abstract w0 b(int i, Object obj);

    public abstract w0 c(Object obj);

    @Override // defpackage.b0, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.b0, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public w0 d(Collection collection) {
        f12 e = e();
        e.addAll(collection);
        return e.c();
    }

    public abstract f12 e();

    public abstract w0 f(v0 v0Var);

    public abstract w0 g(int i);

    @Override // defpackage.h0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract w0 j(int i, Object obj);

    @Override // defpackage.h0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.h0, java.util.List
    public final List subList(int i, int i2) {
        return new j11(this, i, i2);
    }
}
