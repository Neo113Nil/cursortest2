package d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022a implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f463b = new WeakHashMap();

    public C0022a() {
        new HashMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0022a)) {
            return false;
        }
        C0022a c0022a = (C0022a) obj;
        c0022a.getClass();
        iterator();
        c0022a.iterator();
        return true;
    }

    public final int hashCode() {
        iterator();
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0023b c0023b = new C0023b();
        this.f463b.put(c0023b, Boolean.FALSE);
        return c0023b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        iterator();
        sb.append("]");
        return sb.toString();
    }
}
