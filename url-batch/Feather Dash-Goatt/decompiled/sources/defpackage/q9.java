package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class q9 implements Iterator, Map.Entry {
    public int d;
    public int e = -1;
    public boolean g;
    public final /* synthetic */ s9 h;

    public q9(s9 s9Var) {
        this.h = s9Var;
        this.d = s9Var.g - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.g) {
            dd0.j("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.e;
            s9 s9Var = this.h;
            if (Intrinsics.a(key, s9Var.e(i)) && Intrinsics.a(entry.getValue(), s9Var.h(this.e))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.g) {
            return this.h.e(this.e);
        }
        dd0.j("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.g) {
            return this.h.h(this.e);
        }
        dd0.j("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.g) {
            dd0.j("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.e;
        s9 s9Var = this.h;
        Object e = s9Var.e(i);
        Object h = s9Var.h(this.e);
        return (e == null ? 0 : e.hashCode()) ^ (h != null ? h.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            dd0.c();
            return null;
        }
        this.e++;
        this.g = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException();
        }
        this.h.f(this.e);
        this.e--;
        this.d--;
        this.g = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.g) {
            return this.h.g(this.e, obj);
        }
        dd0.j("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
