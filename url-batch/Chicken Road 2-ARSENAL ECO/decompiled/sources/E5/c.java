package E5;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f690a;

    /* renamed from: b, reason: collision with root package name */
    public final int f691b;

    public c(f fVar, int i7) {
        this.f690a = fVar;
        this.f691b = i7;
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
    }

    @Override // E5.f
    public final Iterator iterator() {
        return new b(this);
    }
}
