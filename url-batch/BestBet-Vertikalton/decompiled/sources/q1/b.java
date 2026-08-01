package q1;

import K.V;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f3813a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3814b;

    public b(d dVar, int i) {
        this.f3813a = dVar;
        this.f3814b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // q1.d
    public final Iterator iterator() {
        return new V(this);
    }
}
