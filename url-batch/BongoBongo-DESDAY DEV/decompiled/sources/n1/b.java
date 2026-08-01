package n1;

import L.X;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f3385a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3386b;

    public b(d dVar, int i) {
        this.f3385a = dVar;
        this.f3386b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // n1.d
    public final Iterator iterator() {
        return new X(this);
    }
}
