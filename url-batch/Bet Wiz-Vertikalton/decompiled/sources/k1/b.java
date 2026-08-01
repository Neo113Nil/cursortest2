package k1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f2821a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2822b;

    public b(d dVar, int i) {
        this.f2821a = dVar;
        this.f2822b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // k1.d
    public final Iterator iterator() {
        return new W0.a(this);
    }
}
