package d1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f1906a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1907b;

    public b(d dVar, int i) {
        this.f1906a = dVar;
        this.f1907b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // d1.d
    public final Iterator iterator() {
        return new Q0.a(this);
    }
}
