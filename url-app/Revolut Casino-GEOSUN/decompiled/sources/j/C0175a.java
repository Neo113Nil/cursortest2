package j;

import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175a implements Iterable {

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f2641e = new WeakHashMap();

    public C0175a() {
        new HashMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0175a)) {
            return false;
        }
        C0175a c0175a = (C0175a) obj;
        c0175a.getClass();
        iterator();
        c0175a.iterator();
        return true;
    }

    public final int hashCode() {
        iterator();
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0176b c0176b = new C0176b();
        this.f2641e.put(c0176b, Boolean.FALSE);
        return c0176b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        iterator();
        sb.append("]");
        return sb.toString();
    }
}
