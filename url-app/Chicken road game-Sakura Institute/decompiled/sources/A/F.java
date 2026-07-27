package A;

import l.AbstractC0784j;
import w.EnumC1256E;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1256E f17a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20d;

    public F(EnumC1256E enumC1256E, long j4, int i2, boolean z4) {
        this.f17a = enumC1256E;
        this.f18b = j4;
        this.f19c = i2;
        this.f20d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f4 = (F) obj;
        return this.f17a == f4.f17a && Y.c.b(this.f18b, f4.f18b) && this.f19c == f4.f19c && this.f20d == f4.f20d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20d) + ((AbstractC0784j.d(this.f19c) + AbstractC0017m.c(this.f17a.hashCode() * 31, 31, this.f18b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f17a);
        sb.append(", position=");
        sb.append((Object) Y.c.j(this.f18b));
        sb.append(", anchor=");
        int i2 = this.f19c;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "Right" : "Middle" : "Left");
        sb.append(", visible=");
        sb.append(this.f20d);
        sb.append(')');
        return sb.toString();
    }
}
