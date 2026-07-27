package s1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10470a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10471b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10472c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10473d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10474e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10475f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10476g;

    /* renamed from: h, reason: collision with root package name */
    public String f10477h;

    public E(boolean z4, boolean z5, int i2, boolean z6, boolean z7, int i4, int i5) {
        this.f10470a = z4;
        this.f10471b = z5;
        this.f10472c = i2;
        this.f10473d = z6;
        this.f10474e = z7;
        this.f10475f = i4;
        this.f10476g = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof E)) {
            return false;
        }
        E e4 = (E) obj;
        return this.f10470a == e4.f10470a && this.f10471b == e4.f10471b && this.f10472c == e4.f10472c && Intrinsics.a(this.f10477h, e4.f10477h) && Intrinsics.a(null, null) && Intrinsics.a(null, null) && this.f10473d == e4.f10473d && this.f10474e == e4.f10474e && this.f10475f == e4.f10475f && this.f10476g == e4.f10476g;
    }

    public final int hashCode() {
        int i2 = (((((this.f10470a ? 1 : 0) * 31) + (this.f10471b ? 1 : 0)) * 31) + this.f10472c) * 31;
        return ((((((((((((i2 + (this.f10477h != null ? r1.hashCode() : 0)) * 29791) + (this.f10473d ? 1 : 0)) * 31) + (this.f10474e ? 1 : 0)) * 31) + this.f10475f) * 31) + this.f10476g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(E.class.getSimpleName());
        sb.append("(");
        if (this.f10470a) {
            sb.append("launchSingleTop ");
        }
        if (this.f10471b) {
            sb.append("restoreState ");
        }
        String str = this.f10477h;
        if ((str != null || this.f10472c != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.f10473d) {
                sb.append(" inclusive");
            }
            if (this.f10474e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i2 = this.f10476g;
        int i4 = this.f10475f;
        if (i4 != -1 || i2 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
