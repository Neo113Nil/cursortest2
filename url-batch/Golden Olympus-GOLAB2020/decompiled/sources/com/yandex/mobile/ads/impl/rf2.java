package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;

/* loaded from: classes3.dex */
public final class rf2 implements InterfaceC2259tl {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f31176f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f31177b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31178c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31179d;

    /* renamed from: e, reason: collision with root package name */
    public final float f31180e;

    static {
        new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Oc
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                rf2 a4;
                a4 = rf2.a(bundle);
                return a4;
            }
        };
    }

    public rf2(int i4, int i5, int i6, float f4) {
        this.f31177b = i4;
        this.f31178c = i5;
        this.f31179d = i6;
        this.f31180e = f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static rf2 a(Bundle bundle) {
        return new rf2(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0), bundle.getFloat(Integer.toString(3, 36), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rf2) {
            rf2 rf2Var = (rf2) obj;
            if (this.f31177b == rf2Var.f31177b && this.f31178c == rf2Var.f31178c && this.f31179d == rf2Var.f31179d && this.f31180e == rf2Var.f31180e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f31180e) + ((((((this.f31177b + 217) * 31) + this.f31178c) * 31) + this.f31179d) * 31);
    }
}
