package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g0 implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f3867d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3868e;

    /* renamed from: f, reason: collision with root package name */
    public Iterator f3869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0192b0 f3870g;

    public g0(C0192b0 c0192b0) {
        this.f3870g = c0192b0;
    }

    public final Iterator a() {
        if (this.f3869f == null) {
            this.f3869f = this.f3870g.f3846f.entrySet().iterator();
        }
        return this.f3869f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3 = this.f3867d + 1;
        C0192b0 c0192b0 = this.f3870g;
        if (i3 >= c0192b0.f3845e.size()) {
            return !c0192b0.f3846f.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f3868e = true;
        int i3 = this.f3867d + 1;
        this.f3867d = i3;
        C0192b0 c0192b0 = this.f3870g;
        return i3 < c0192b0.f3845e.size() ? (Map.Entry) c0192b0.f3845e.get(this.f3867d) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3868e) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f3868e = false;
        int i3 = C0192b0.f3843j;
        C0192b0 c0192b0 = this.f3870g;
        c0192b0.b();
        if (this.f3867d >= c0192b0.f3845e.size()) {
            a().remove();
            return;
        }
        int i4 = this.f3867d;
        this.f3867d = i4 - 1;
        c0192b0.g(i4);
    }
}
