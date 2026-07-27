package P0;

import A.AbstractC0017m;
import l.AbstractC0784j;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3768a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3769b = true;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3770c = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f3768a == wVar.f3768a && this.f3769b == wVar.f3769b && this.f3770c == wVar.f3770c;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0017m.d((AbstractC0784j.d(1) + AbstractC0017m.d(Boolean.hashCode(this.f3768a) * 31, 31, this.f3769b)) * 31, 31, this.f3770c);
    }
}
