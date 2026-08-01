package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class v6 implements Iterator, Map.Entry {
    public int f;
    public int g = -1;
    public boolean h;
    public final /* synthetic */ x6 i;

    public v6(x6 x6Var) {
        this.i = x6Var;
        this.f = x6Var.h - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.h) {
            g9.s("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.g;
            x6 x6Var = this.i;
            if (kr.b(key, x6Var.f(i)) && kr.b(entry.getValue(), x6Var.i(this.g))) {
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
        g9.s("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.h) {
            return this.i.i(this.g);
        }
        g9.s("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.h) {
            g9.s("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.g;
        x6 x6Var = this.i;
        Object f = x6Var.f(i);
        Object i2 = x6Var.i(this.g);
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
        g9.s("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
