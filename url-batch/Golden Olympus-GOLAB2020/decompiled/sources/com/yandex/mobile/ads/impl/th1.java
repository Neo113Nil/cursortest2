package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class th1 implements InterfaceC2259tl {

    /* renamed from: e, reason: collision with root package name */
    public static final th1 f32439e = new th1(1.0f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final float f32440b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32441c;

    /* renamed from: d, reason: collision with root package name */
    private final int f32442d;

    static {
        new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Ie
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                th1 a4;
                a4 = th1.a(bundle);
                return a4;
            }
        };
    }

    public th1(float f4, float f5) {
        C2253tf.a(f4 > 0.0f);
        C2253tf.a(f5 > 0.0f);
        this.f32440b = f4;
        this.f32441c = f5;
        this.f32442d = Math.round(f4 * 1000.0f);
    }

    public final long a(long j4) {
        return j4 * this.f32442d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && th1.class == obj.getClass()) {
            th1 th1Var = (th1) obj;
            if (this.f32440b == th1Var.f32440b && this.f32441c == th1Var.f32441c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f32441c) + ((Float.floatToRawIntBits(this.f32440b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f32440b), Float.valueOf(this.f32441c)};
        int i4 = u82.f32873a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static th1 a(Bundle bundle) {
        return new th1(bundle.getFloat(Integer.toString(0, 36), 1.0f), bundle.getFloat(Integer.toString(1, 36), 1.0f));
    }
}
