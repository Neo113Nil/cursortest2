package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class d93 {
    static int a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 += next != null ? next.hashCode() : 0;
        }
        return i7;
    }

    static boolean b(Set<?> set, Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof p83) {
            collection = ((p83) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return c(set, collection.iterator());
        }
        Iterator<?> it = set.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    static boolean c(Set<?> set, Iterator<?> it) {
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= set.remove(it.next());
        }
        return z6;
    }
}
