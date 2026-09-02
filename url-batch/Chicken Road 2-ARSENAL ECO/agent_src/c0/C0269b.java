package c0;

import android.graphics.Rect;
import kotlin.jvm.internal.i;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269b {

    /* renamed from: a, reason: collision with root package name */
    public final int f3751a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3752b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3753c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3754d;

    public C0269b(Rect rect) {
        int i7 = rect.left;
        int i8 = rect.top;
        int i9 = rect.right;
        int i10 = rect.bottom;
        this.f3751a = i7;
        this.f3752b = i8;
        this.f3753c = i9;
        this.f3754d = i10;
        if (i7 > i9) {
            throw new IllegalArgumentException(C1.c.f(i7, i9, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i8 > i10) {
            throw new IllegalArgumentException(C1.c.f(i8, i10, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final Rect a() {
        return new Rect(this.f3751a, this.f3752b, this.f3753c, this.f3754d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0269b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        i.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C0269b c0269b = (C0269b) obj;
        return this.f3751a == c0269b.f3751a && this.f3752b == c0269b.f3752b && this.f3753c == c0269b.f3753c && this.f3754d == c0269b.f3754d;
    }

    public final int hashCode() {
        return (((((this.f3751a * 31) + this.f3752b) * 31) + this.f3753c) * 31) + this.f3754d;
    }

    public final String toString() {
        return C0269b.class.getSimpleName() + " { [" + this.f3751a + ',' + this.f3752b + ',' + this.f3753c + ',' + this.f3754d + "] }";
    }
}
