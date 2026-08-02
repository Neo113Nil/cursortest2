package y0;

import E.AbstractC0005f;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final z f16222a;

    /* renamed from: b, reason: collision with root package name */
    public final z f16223b;

    public x(z zVar, z zVar2) {
        this.f16222a = zVar;
        this.f16223b = zVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (this.f16222a.equals(xVar.f16222a) && this.f16223b.equals(xVar.f16223b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16223b.hashCode() + (this.f16222a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        z zVar = this.f16222a;
        sb.append(zVar);
        z zVar2 = this.f16223b;
        if (zVar.equals(zVar2)) {
            str = "";
        } else {
            str = ", " + zVar2;
        }
        return AbstractC0005f.q(sb, str, "]");
    }
}
