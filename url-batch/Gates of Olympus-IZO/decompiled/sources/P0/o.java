package P0;

import H2.AbstractC0080b;
import m.AbstractC0600j;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3054a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3055b = true;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3056c = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f3054a == oVar.f3054a && this.f3055b == oVar.f3055b && this.f3056c == oVar.f3056c;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0080b.f((AbstractC0600j.a(1) + AbstractC0080b.f(Boolean.hashCode(this.f3054a) * 31, 31, this.f3055b)) * 31, 31, this.f3056c);
    }
}
