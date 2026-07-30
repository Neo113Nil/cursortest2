package y6;

import e6.a0;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements f, c {

    /* renamed from: a, reason: collision with root package name */
    public final f f9903a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9904b;

    public b(f fVar, int i7) {
        r6.k.f(fVar, "sequence");
        this.f9903a = fVar;
        this.f9904b = i7;
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
    }

    @Override // y6.c
    public final f a(int i7) {
        int i8 = this.f9904b + i7;
        return i8 < 0 ? new b(this, i7) : new b(this.f9903a, i8);
    }

    @Override // y6.f
    public final Iterator iterator() {
        return new a0(this);
    }
}
