package com.onevcat.uniwebview.internal.obfuscated;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101r0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public C0101r0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0101r0)) {
            return false;
        }
        C0101r0 c0101r0 = (C0101r0) obj;
        return Float.compare(this.a, c0101r0.a) == 0 && Float.compare(this.b, c0101r0.b) == 0 && Float.compare(this.c, c0101r0.c) == 0 && Float.compare(this.d, c0101r0.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((Float.hashCode(this.c) + ((Float.hashCode(this.b) + (Float.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CornerRadius(topLeft=" + this.a + ", topRight=" + this.b + ", bottomLeft=" + this.c + ", bottomRight=" + this.d + ')';
    }
}
