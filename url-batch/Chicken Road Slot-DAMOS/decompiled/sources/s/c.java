package s;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public int f8273d;

    /* renamed from: e, reason: collision with root package name */
    public int f8274e = -1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8275i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f8276r;

    public c(e eVar) {
        this.f8276r = eVar;
        this.f8273d = eVar.f8369i - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f8275i) {
            kotlin.collections.i0.l("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i3 = this.f8274e;
        e eVar = this.f8276r;
        return Intrinsics.a(key, eVar.e(i3)) && Intrinsics.a(entry.getValue(), eVar.h(this.f8274e));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f8275i) {
            return this.f8276r.e(this.f8274e);
        }
        kotlin.collections.i0.l("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f8275i) {
            return this.f8276r.h(this.f8274e);
        }
        kotlin.collections.i0.l("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8274e < this.f8273d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f8275i) {
            kotlin.collections.i0.l("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i3 = this.f8274e;
        e eVar = this.f8276r;
        Object e2 = eVar.e(i3);
        Object h10 = eVar.h(this.f8274e);
        return (e2 == null ? 0 : e2.hashCode()) ^ (h10 != null ? h10.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            kotlin.collections.i0.c();
            return null;
        }
        this.f8274e++;
        this.f8275i = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8275i) {
            throw new IllegalStateException();
        }
        this.f8276r.f(this.f8274e);
        this.f8274e--;
        this.f8273d--;
        this.f8275i = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f8275i) {
            return this.f8276r.g(this.f8274e, obj);
        }
        kotlin.collections.i0.l("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
