package S0;

import D.y;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f2918a;

    /* renamed from: b, reason: collision with root package name */
    public int f2919b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.h.a(this.f2918a, oVar.f2918a) && this.f2919b == oVar.f2919b;
    }

    public final int hashCode() {
        return AbstractC5088e.d(this.f2919b) + (this.f2918a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f2918a + ", state=" + y.t(this.f2919b) + ')';
    }
}
