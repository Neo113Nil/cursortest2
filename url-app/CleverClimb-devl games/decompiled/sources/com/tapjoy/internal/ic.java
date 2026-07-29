package com.tapjoy.internal;

/* loaded from: classes2.dex */
public final class ic {

    /* renamed from: a, reason: collision with root package name */
    public float f8358a;

    /* renamed from: b, reason: collision with root package name */
    public int f8359b;

    public static ic a(String str) {
        if (jr.c(str)) {
            return null;
        }
        try {
            ic icVar = new ic();
            int length = str.length() - 1;
            char charAt = str.charAt(length);
            if (charAt == 'w') {
                icVar.f8358a = Float.valueOf(str.substring(0, length)).floatValue();
                icVar.f8359b = 1;
            } else if (charAt == 'h') {
                icVar.f8358a = Float.valueOf(str.substring(0, length)).floatValue();
                icVar.f8359b = 2;
            } else {
                icVar.f8358a = Float.valueOf(str).floatValue();
                icVar.f8359b = 0;
            }
            return icVar;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final float a(float f, float f2) {
        if (this.f8359b == 1) {
            return (this.f8358a * f) / 100.0f;
        }
        if (this.f8359b == 2) {
            return (this.f8358a * f2) / 100.0f;
        }
        return this.f8358a;
    }
}
