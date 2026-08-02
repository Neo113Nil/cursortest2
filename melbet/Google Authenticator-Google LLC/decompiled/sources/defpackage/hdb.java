package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hdb implements Iterable {
    private final Iterable a;

    public hdb(Iterable iterable) {
        iterable.getClass();
        this.a = iterable;
    }

    public static hdb a(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new hda(iterableArr);
    }

    public static hdb c(Iterable iterable) {
        return iterable instanceof hdb ? (hdb) iterable : new hcy(iterable, iterable);
    }

    public final hdb b(gzr gzrVar) {
        return c(hnu.S(f(), gzrVar));
    }

    public final hdb d(gzf gzfVar) {
        return c(new hfz(f(), gzfVar));
    }

    public final hel e() {
        return hel.n(f());
    }

    public final Iterable f() {
        Iterable iterable = this.a;
        return iterable != null ? iterable : this;
    }

    public final Object g() {
        return hnu.X(f());
    }

    public final String toString() {
        Iterator it = f().iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    protected hdb() {
        this.a = null;
    }
}
