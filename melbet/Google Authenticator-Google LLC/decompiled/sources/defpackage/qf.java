package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qf implements Iterator, Map.Entry {
    int a;
    int b = -1;
    boolean c;
    final /* synthetic */ qi d;

    public qf(qi qiVar) {
        this.d = qiVar;
        this.a = qiVar.d - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        qi qiVar = this.d;
        return ksp.b(key, qiVar.c(this.b)) && ksp.b(entry.getValue(), qiVar.f(this.b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.c) {
            return this.d.c(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.c) {
            return this.d.f(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        qi qiVar = this.d;
        Object c = qiVar.c(this.b);
        Object f = qiVar.f(this.b);
        return (c == null ? 0 : c.hashCode()) ^ (f != null ? f.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b++;
        this.c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException();
        }
        this.d.d(this.b);
        this.b--;
        this.a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.c) {
            return this.d.e(this.b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return String.valueOf(getKey()) + "=" + String.valueOf(getValue());
    }
}
