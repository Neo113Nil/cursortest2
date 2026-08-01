package f1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f2254a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2255b;

    public b(d dVar, int i) {
        this.f2254a = dVar;
        this.f2255b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // f1.d
    public final Iterator iterator() {
        return new R0.a(this);
    }
}
