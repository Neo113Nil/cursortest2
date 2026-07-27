package b0;

import A.AbstractC0017m;
import Z.K;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;

/* renamed from: b0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500h extends AbstractC0497e {

    /* renamed from: a, reason: collision with root package name */
    public final float f5608a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5609b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5610c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5611d;

    public C0500h(float f4, float f5, int i2, int i4, int i5) {
        f5 = (i5 & 2) != 0 ? 4.0f : f5;
        i2 = (i5 & 4) != 0 ? 0 : i2;
        i4 = (i5 & 8) != 0 ? 0 : i4;
        this.f5608a = f4;
        this.f5609b = f5;
        this.f5610c = i2;
        this.f5611d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0500h)) {
            return false;
        }
        C0500h c0500h = (C0500h) obj;
        return this.f5608a == c0500h.f5608a && this.f5609b == c0500h.f5609b && K.r(this.f5610c, c0500h.f5610c) && K.s(this.f5611d, c0500h.f5611d) && Intrinsics.a(null, null);
    }

    public final int hashCode() {
        return AbstractC0784j.c(this.f5611d, AbstractC0784j.c(this.f5610c, AbstractC0017m.a(this.f5609b, Float.hashCode(this.f5608a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f5608a);
        sb.append(", miter=");
        sb.append(this.f5609b);
        sb.append(", cap=");
        int i2 = this.f5610c;
        String str = "Unknown";
        sb.append((Object) (K.r(i2, 0) ? "Butt" : K.r(i2, 1) ? "Round" : K.r(i2, 2) ? "Square" : "Unknown"));
        sb.append(", join=");
        int i4 = this.f5611d;
        if (K.s(i4, 0)) {
            str = "Miter";
        } else if (K.s(i4, 1)) {
            str = "Round";
        } else if (K.s(i4, 2)) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
