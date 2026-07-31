package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class c22 extends en1 {

    /* renamed from: e, reason: collision with root package name */
    public static final InterfaceC2259tl.a<c22> f24033e = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.E0
        @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
        public final InterfaceC2259tl fromBundle(Bundle bundle) {
            c22 b4;
            b4 = c22.b(bundle);
            return b4;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final int f24034c;

    /* renamed from: d, reason: collision with root package name */
    private final float f24035d;

    public c22(int i4) {
        C2253tf.a("maxStars must be a positive integer", i4 > 0);
        this.f24034c = i4;
        this.f24035d = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c22 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 2) {
            throw new IllegalArgumentException();
        }
        int i4 = bundle.getInt(Integer.toString(1, 36), 5);
        float f4 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f4 == -1.0f ? new c22(i4) : new c22(i4, f4);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c22)) {
            return false;
        }
        c22 c22Var = (c22) obj;
        return this.f24034c == c22Var.f24034c && this.f24035d == c22Var.f24035d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24034c), Float.valueOf(this.f24035d)});
    }

    public c22(int i4, float f4) {
        boolean z4 = false;
        C2253tf.a("maxStars must be a positive integer", i4 > 0);
        if (f4 >= 0.0f && f4 <= i4) {
            z4 = true;
        }
        C2253tf.a("starRating is out of range [0, maxStars]", z4);
        this.f24034c = i4;
        this.f24035d = f4;
    }
}
