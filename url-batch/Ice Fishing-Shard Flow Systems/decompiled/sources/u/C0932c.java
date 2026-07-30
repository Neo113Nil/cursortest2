package u;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0932c implements Iterator, Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public int f8020d;

    /* renamed from: e, reason: collision with root package name */
    public int f8021e = -1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8022i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0934e f8023l;

    public C0932c(C0934e c0934e) {
        this.f8023l = c0934e;
        this.f8020d = c0934e.f8045i - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f8022i) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f8021e;
        C0934e c0934e = this.f8023l;
        return Intrinsics.a(key, c0934e.e(i2)) && Intrinsics.a(entry.getValue(), c0934e.h(this.f8021e));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f8022i) {
            return this.f8023l.e(this.f8021e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f8022i) {
            return this.f8023l.h(this.f8021e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8021e < this.f8020d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f8022i) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f8021e;
        C0934e c0934e = this.f8023l;
        Object e7 = c0934e.e(i2);
        Object h7 = c0934e.h(this.f8021e);
        return (e7 == null ? 0 : e7.hashCode()) ^ (h7 != null ? h7.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8021e++;
        this.f8022i = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8022i) {
            throw new IllegalStateException();
        }
        this.f8023l.f(this.f8021e);
        this.f8021e--;
        this.f8020d--;
        this.f8022i = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f8022i) {
            return this.f8023l.g(this.f8021e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
