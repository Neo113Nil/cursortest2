package n;

import a0.m;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f6467a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6468b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6469c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6470d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6471e;

    public a(long j8, long j9, long j10, long j11, long j12) {
        this.f6467a = j8;
        this.f6468b = j9;
        this.f6469c = j10;
        this.f6470d = j11;
        this.f6471e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return u.c(this.f6467a, aVar.f6467a) && u.c(this.f6468b, aVar.f6468b) && u.c(this.f6469c, aVar.f6469c) && u.c(this.f6470d, aVar.f6470d) && u.c(this.f6471e, aVar.f6471e);
    }

    public final int hashCode() {
        int i7 = u.f10058h;
        return Long.hashCode(this.f6471e) + m.d(m.d(m.d(Long.hashCode(this.f6467a) * 31, 31, this.f6468b), 31, this.f6469c), 31, this.f6470d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        m.r(this.f6467a, sb, ", textColor=");
        m.r(this.f6468b, sb, ", iconColor=");
        m.r(this.f6469c, sb, ", disabledTextColor=");
        m.r(this.f6470d, sb, ", disabledIconColor=");
        sb.append((Object) u.i(this.f6471e));
        sb.append(')');
        return sb.toString();
    }
}
