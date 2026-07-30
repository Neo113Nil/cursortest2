package x0;

import C4.p;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0995b {

    /* renamed from: a, reason: collision with root package name */
    public final int f8292a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8294c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8295d;

    public C0995b(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        int i2 = rect.left;
        int i5 = rect.top;
        int i7 = rect.right;
        int i8 = rect.bottom;
        this.f8292a = i2;
        this.f8293b = i5;
        this.f8294c = i7;
        this.f8295d = i8;
        if (i2 > i7) {
            throw new IllegalArgumentException(p.j("Left must be less than or equal to right, left: ", ", right: ", i2, i7).toString());
        }
        if (i5 > i8) {
            throw new IllegalArgumentException(p.j("top must be less than or equal to bottom, top: ", ", bottom: ", i5, i8).toString());
        }
    }

    public final Rect a() {
        return new Rect(this.f8292a, this.f8293b, this.f8294c, this.f8295d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0995b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C0995b c0995b = (C0995b) obj;
        return this.f8292a == c0995b.f8292a && this.f8293b == c0995b.f8293b && this.f8294c == c0995b.f8294c && this.f8295d == c0995b.f8295d;
    }

    public final int hashCode() {
        return (((((this.f8292a * 31) + this.f8293b) * 31) + this.f8294c) * 31) + this.f8295d;
    }

    public final String toString() {
        return C0995b.class.getSimpleName() + " { [" + this.f8292a + ',' + this.f8293b + ',' + this.f8294c + ',' + this.f8295d + "] }";
    }
}
