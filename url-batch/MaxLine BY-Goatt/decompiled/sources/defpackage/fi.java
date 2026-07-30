package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fi implements Iterator, Map.Entry {
    public int m;
    public int n = -1;
    public boolean o;
    public final /* synthetic */ hi p;

    public fi(hi hiVar) {
        this.p = hiVar;
        this.m = hiVar.o - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.o) {
            lh.g("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.n;
            hi hiVar = this.p;
            if (Intrinsics.b(key, hiVar.e(i)) && Intrinsics.b(entry.getValue(), hiVar.h(this.n))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.o) {
            return this.p.e(this.n);
        }
        lh.g("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.o) {
            return this.p.h(this.n);
        }
        lh.g("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n < this.m;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.o) {
            lh.g("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.n;
        hi hiVar = this.p;
        Object e = hiVar.e(i);
        Object h = hiVar.h(this.n);
        return (e == null ? 0 : e.hashCode()) ^ (h != null ? h.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            b71.f();
            return null;
        }
        this.n++;
        this.o = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.o) {
            throw new IllegalStateException();
        }
        this.p.f(this.n);
        this.n--;
        this.m--;
        this.o = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.o) {
            return this.p.g(this.n, obj);
        }
        lh.g("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
