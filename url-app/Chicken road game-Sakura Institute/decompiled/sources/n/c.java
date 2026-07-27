package n;

import A.AbstractC0017m;
import Z.C0323u;
import y2.y;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f8501a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8502b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8503c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8504d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8505e;

    public c(long j4, long j5, long j6, long j7, long j8) {
        this.f8501a = j4;
        this.f8502b = j5;
        this.f8503c = j6;
        this.f8504d = j7;
        this.f8505e = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C0323u.c(this.f8501a, cVar.f8501a) && C0323u.c(this.f8502b, cVar.f8502b) && C0323u.c(this.f8503c, cVar.f8503c) && C0323u.c(this.f8504d, cVar.f8504d) && C0323u.c(this.f8505e, cVar.f8505e);
    }

    public final int hashCode() {
        int i2 = C0323u.f4548h;
        y.a aVar = y.f11688e;
        return Long.hashCode(this.f8505e) + AbstractC0017m.c(AbstractC0017m.c(AbstractC0017m.c(Long.hashCode(this.f8501a) * 31, 31, this.f8502b), 31, this.f8503c), 31, this.f8504d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        AbstractC0017m.s(this.f8501a, sb, ", textColor=");
        AbstractC0017m.s(this.f8502b, sb, ", iconColor=");
        AbstractC0017m.s(this.f8503c, sb, ", disabledTextColor=");
        AbstractC0017m.s(this.f8504d, sb, ", disabledIconColor=");
        sb.append((Object) C0323u.i(this.f8505e));
        sb.append(')');
        return sb.toString();
    }
}
