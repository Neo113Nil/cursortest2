package com.onevcat.uniwebview.internal.obfuscated;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093p {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public C0093p(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0093p)) {
            return false;
        }
        C0093p c0093p = (C0093p) obj;
        return Float.compare(this.a, c0093p.a) == 0 && Float.compare(this.b, c0093p.b) == 0 && Float.compare(this.c, c0093p.c) == 0 && Float.compare(this.d, c0093p.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((Float.hashCode(this.c) + ((Float.hashCode(this.b) + (Float.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Color(r=" + this.a + ", g=" + this.b + ", b=" + this.c + ", a=" + this.d + ')';
    }
}
