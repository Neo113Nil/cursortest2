package k;

import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182a implements Iterable {

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f2644e = new WeakHashMap();

    public C0182a() {
        new HashMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0182a)) {
            return false;
        }
        C0182a c0182a = (C0182a) obj;
        c0182a.getClass();
        iterator();
        c0182a.iterator();
        return true;
    }

    public final int hashCode() {
        iterator();
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b();
        this.f2644e.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        iterator();
        sb.append("]");
        return sb.toString();
    }
}
