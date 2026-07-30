package com.onevcat.uniwebview.internal.obfuscated;

import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class C3 {
    public static final C3 g = new C3(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;

    public C3(float f, float f2, float f3, float f4, float f5, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = i;
    }

    public final boolean a() {
        if (this.b > 0.0f) {
            return this.a > 0.0f || this.e > 0.0f;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3)) {
            return false;
        }
        C3 c3 = (C3) obj;
        return Float.compare(this.a, c3.a) == 0 && Float.compare(this.b, c3.b) == 0 && Float.compare(this.c, c3.c) == 0 && Float.compare(this.d, c3.d) == 0 && Float.compare(this.e, c3.e) == 0 && this.f == c3.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ((Float.hashCode(this.e) + ((Float.hashCode(this.d) + ((Float.hashCode(this.c) + ((Float.hashCode(this.b) + (Float.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ShadowStyle(radius=" + this.a + ", opacity=" + this.b + ", offsetX=" + this.c + ", offsetY=" + this.d + ", spread=" + this.e + ", color=" + this.f + ')';
    }
}
