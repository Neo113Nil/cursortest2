package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g0 implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f5342d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5343e;

    /* renamed from: i, reason: collision with root package name */
    public Iterator f5344i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0437b0 f5345j;

    public g0(C0437b0 c0437b0) {
        this.f5345j = c0437b0;
    }

    public final Iterator a() {
        if (this.f5344i == null) {
            this.f5344i = this.f5345j.f5321i.entrySet().iterator();
        }
        return this.f5344i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f5342d + 1;
        C0437b0 c0437b0 = this.f5345j;
        if (i2 >= c0437b0.f5320e.size()) {
            return !c0437b0.f5321i.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f5343e = true;
        int i2 = this.f5342d + 1;
        this.f5342d = i2;
        C0437b0 c0437b0 = this.f5345j;
        return i2 < c0437b0.f5320e.size() ? (Map.Entry) c0437b0.f5320e.get(this.f5342d) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5343e) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f5343e = false;
        int i2 = C0437b0.f5318m;
        C0437b0 c0437b0 = this.f5345j;
        c0437b0.c();
        if (this.f5342d >= c0437b0.f5320e.size()) {
            a().remove();
            return;
        }
        int i4 = this.f5342d;
        this.f5342d = i4 - 1;
        c0437b0.h(i4);
    }
}
