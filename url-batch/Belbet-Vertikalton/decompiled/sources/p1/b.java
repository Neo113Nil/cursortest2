package p1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f3877a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3878b;

    public b(d dVar, int i) {
        this.f3877a = dVar;
        this.f3878b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // p1.d
    public final Iterator iterator() {
        return new X0.b(this);
    }
}
