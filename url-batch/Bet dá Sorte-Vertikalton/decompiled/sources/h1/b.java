package h1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f2489a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2490b;

    public b(d dVar, int i) {
        this.f2489a = dVar;
        this.f2490b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // h1.d
    public final Iterator iterator() {
        return new T0.a(this);
    }
}
