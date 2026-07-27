package G1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final a f3141a;

    /* renamed from: b, reason: collision with root package name */
    public final E1.d f3142b;

    public /* synthetic */ m(a aVar, E1.d dVar) {
        this.f3141a = aVar;
        this.f3142b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof m)) {
            m mVar = (m) obj;
            if (H1.o.f(this.f3141a, mVar.f3141a) && H1.o.f(this.f3142b, mVar.f3142b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3141a, this.f3142b});
    }

    public final String toString() {
        y.t tVar = new y.t(this);
        tVar.h(this.f3141a, "key");
        tVar.h(this.f3142b, "feature");
        return tVar.toString();
    }
}
