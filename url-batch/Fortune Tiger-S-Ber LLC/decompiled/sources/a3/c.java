package a3;

import java.util.Iterator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f72a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73b;

    public c(f fVar, int i4) {
        this.f72a = fVar;
        this.f73b = i4;
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i4 + '.').toString());
    }

    @Override // a3.f
    public final Iterator iterator() {
        return new b(this);
    }
}
