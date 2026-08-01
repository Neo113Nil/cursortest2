package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class e7 implements Iterator, Map.Entry {
    public int f;
    public int g = -1;
    public boolean h;
    public final /* synthetic */ g7 i;

    public e7(g7 g7Var) {
        this.i = g7Var;
        this.f = g7Var.h - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.h) {
            s9.u("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.g;
            g7 g7Var = this.i;
            if (mv.c(key, g7Var.f(i)) && mv.c(entry.getValue(), g7Var.i(this.g))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.h) {
            return this.i.f(this.g);
        }
        s9.u("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.h) {
            return this.i.i(this.g);
        }
        s9.u("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.h) {
            s9.u("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.g;
        g7 g7Var = this.i;
        Object f = g7Var.f(i);
        Object i2 = g7Var.i(this.g);
        return (f == null ? 0 : f.hashCode()) ^ (i2 != null ? i2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.g++;
        this.h = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            throw new IllegalStateException();
        }
        this.i.g(this.g);
        this.g--;
        this.f--;
        this.h = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.h) {
            return this.i.h(this.g, obj);
        }
        s9.u("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
