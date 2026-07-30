package com.google.android.gms.internal.ads;

import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.v5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4045v5 {

    /* renamed from: d, reason: collision with root package name */
    public static final C4045v5 f34711d = new C4045v5(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f34712a;

    /* renamed from: b, reason: collision with root package name */
    public final float f34713b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34714c;

    static {
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C4045v5(float f6, float f9) {
        PA.n(f6 > 0.0f);
        PA.n(f9 > 0.0f);
        this.f34712a = f6;
        this.f34713b = f9;
        this.f34714c = Math.round(f6 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4045v5.class == obj.getClass()) {
            C4045v5 c4045v5 = (C4045v5) obj;
            if (this.f34712a == c4045v5.f34712a && this.f34713b == c4045v5.f34713b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f34713b) + ((Float.floatToRawIntBits(this.f34712a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f34712a), Float.valueOf(this.f34713b)};
        String str = AbstractC3548lu.f32613a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
