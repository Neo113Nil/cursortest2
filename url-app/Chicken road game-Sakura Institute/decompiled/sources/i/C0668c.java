package i;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0668c implements Iterator, Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public int f6908d;

    /* renamed from: e, reason: collision with root package name */
    public int f6909e = -1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6910i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0670e f6911j;

    public C0668c(C0670e c0670e) {
        this.f6911j = c0670e;
        this.f6908d = c0670e.f6895i - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f6910i) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f6909e;
        C0670e c0670e = this.f6911j;
        return Intrinsics.a(key, c0670e.f(i2)) && Intrinsics.a(entry.getValue(), c0670e.i(this.f6909e));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f6910i) {
            return this.f6911j.f(this.f6909e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f6910i) {
            return this.f6911j.i(this.f6909e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6909e < this.f6908d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f6910i) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f6909e;
        C0670e c0670e = this.f6911j;
        Object f4 = c0670e.f(i2);
        Object i4 = c0670e.i(this.f6909e);
        return (f4 == null ? 0 : f4.hashCode()) ^ (i4 != null ? i4.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6909e++;
        this.f6910i = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f6910i) {
            throw new IllegalStateException();
        }
        this.f6911j.g(this.f6909e);
        this.f6909e--;
        this.f6908d--;
        this.f6910i = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f6910i) {
            return this.f6911j.h(this.f6909e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
