package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ax implements InterfaceC4043v3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f23932a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23933b;

    public Ax(float f6, float f9) {
        boolean z8 = false;
        if (f6 >= -90.0f && f6 <= 90.0f && f9 >= -180.0f && f9 <= 180.0f) {
            z8 = true;
        }
        PA.u("Invalid latitude or longitude", z8);
        this.f23932a = f6;
        this.f23933b = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Ax.class == obj.getClass()) {
            Ax ax = (Ax) obj;
            if (this.f23932a == ax.f23932a && this.f23933b == ax.f23933b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23933b) + ((Float.hashCode(this.f23932a) + 527) * 31);
    }

    public final String toString() {
        float f6 = this.f23932a;
        int length = String.valueOf(f6).length();
        float f9 = this.f23933b;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(f9).length());
        sb.append("xyz: latitude=");
        sb.append(f6);
        sb.append(", longitude=");
        sb.append(f9);
        return sb.toString();
    }
}
