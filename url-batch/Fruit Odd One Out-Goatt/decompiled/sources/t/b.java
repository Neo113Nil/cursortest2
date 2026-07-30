package t;

import android.graphics.Rect;
import f0.l;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1149a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1150b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1151c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1152d;

    public b(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        this.f1149a = i2;
        this.f1150b = i3;
        this.f1151c = i4;
        this.f1152d = i5;
        if (i2 > i4) {
            l.e("Left must be less than or equal to right, left: ", i2, ", right: ", i4);
            throw null;
        }
        if (i3 <= i5) {
            return;
        }
        l.e("top must be less than or equal to bottom, top: ", i3, ", bottom: ", i5);
        throw null;
    }

    public final Rect a() {
        return new Rect(this.f1149a, this.f1150b, this.f1151c, this.f1152d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        b bVar = (b) obj;
        return this.f1149a == bVar.f1149a && this.f1150b == bVar.f1150b && this.f1151c == bVar.f1151c && this.f1152d == bVar.f1152d;
    }

    public final int hashCode() {
        return (((((this.f1149a * 31) + this.f1150b) * 31) + this.f1151c) * 31) + this.f1152d;
    }

    public final String toString() {
        return b.class.getSimpleName() + " { [" + this.f1149a + ',' + this.f1150b + ',' + this.f1151c + ',' + this.f1152d + "] }";
    }
}
