package A0;

import A.AbstractC0017m;
import l.AbstractC0784j;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final I0.c f373a;

    /* renamed from: b, reason: collision with root package name */
    public final int f374b;

    /* renamed from: c, reason: collision with root package name */
    public final int f375c;

    public s(I0.c cVar, int i2, int i4) {
        this.f373a = cVar;
        this.f374b = i2;
        this.f375c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f373a.equals(sVar.f373a) && this.f374b == sVar.f374b && this.f375c == sVar.f375c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f375c) + AbstractC0784j.c(this.f374b, this.f373a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f373a);
        sb.append(", startIndex=");
        sb.append(this.f374b);
        sb.append(", endIndex=");
        return AbstractC0017m.l(sb, this.f375c, ')');
    }
}
