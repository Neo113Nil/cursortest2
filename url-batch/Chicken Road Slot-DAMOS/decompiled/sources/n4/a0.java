package n4;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7023a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7024b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7025c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7026d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7027e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7028f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public Object f7029h;

    public a0(boolean z10, boolean z11, int i3, boolean z12, boolean z13, int i10, int i11) {
        this.f7023a = z10;
        this.f7024b = z11;
        this.f7025c = i3;
        this.f7026d = z12;
        this.f7027e = z13;
        this.f7028f = i10;
        this.g = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f7023a == a0Var.f7023a && this.f7024b == a0Var.f7024b && this.f7025c == a0Var.f7025c && Intrinsics.a(this.f7029h, a0Var.f7029h) && this.f7026d == a0Var.f7026d && this.f7027e == a0Var.f7027e && this.f7028f == a0Var.f7028f && this.g == a0Var.g;
    }

    public final int hashCode() {
        int i3 = (((((this.f7023a ? 1 : 0) * 31) + (this.f7024b ? 1 : 0)) * 31) + this.f7025c) * 29791;
        return ((((((((((((i3 + (this.f7029h != null ? r1.hashCode() : 0)) * 31) + (this.f7026d ? 1 : 0)) * 31) + (this.f7027e ? 1 : 0)) * 31) + this.f7028f) * 31) + this.g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a0.class.getSimpleName());
        sb2.append("(");
        if (this.f7023a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f7024b) {
            sb2.append("restoreState ");
        }
        int i3 = this.g;
        int i10 = this.f7028f;
        if (i10 != -1 || i3 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i10));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i3));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(-1));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(-1));
            sb2.append(")");
        }
        return sb2.toString();
    }
}
