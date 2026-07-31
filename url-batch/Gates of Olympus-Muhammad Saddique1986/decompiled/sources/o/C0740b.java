package o;

import b0.C0352v;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740b {

    /* renamed from: a, reason: collision with root package name */
    public final long f7380a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7381b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7382c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7383d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7384e;

    public C0740b(long j3, long j4, long j5, long j6, long j7) {
        this.f7380a = j3;
        this.f7381b = j4;
        this.f7382c = j5;
        this.f7383d = j6;
        this.f7384e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0740b)) {
            return false;
        }
        C0740b c0740b = (C0740b) obj;
        return C0352v.c(this.f7380a, c0740b.f7380a) && C0352v.c(this.f7381b, c0740b.f7381b) && C0352v.c(this.f7382c, c0740b.f7382c) && C0352v.c(this.f7383d, c0740b.f7383d) && C0352v.c(this.f7384e, c0740b.f7384e);
    }

    public final int hashCode() {
        int i3 = C0352v.f5440h;
        return Long.hashCode(this.f7384e) + A.k.c(A.k.c(A.k.c(Long.hashCode(this.f7380a) * 31, 31, this.f7381b), 31, this.f7382c), 31, this.f7383d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        A.k.p(this.f7380a, sb, ", textColor=");
        A.k.p(this.f7381b, sb, ", iconColor=");
        A.k.p(this.f7382c, sb, ", disabledTextColor=");
        A.k.p(this.f7383d, sb, ", disabledIconColor=");
        sb.append((Object) C0352v.i(this.f7384e));
        sb.append(')');
        return sb.toString();
    }
}
