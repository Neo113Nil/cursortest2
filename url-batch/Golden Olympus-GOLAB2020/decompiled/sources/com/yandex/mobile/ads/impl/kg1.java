package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class kg1 extends en1 {

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC2259tl.a<kg1> f28196d = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.V8
        @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
        public final InterfaceC2259tl fromBundle(Bundle bundle) {
            kg1 b4;
            b4 = kg1.b(bundle);
            return b4;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final float f28197c;

    public kg1() {
        this.f28197c = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static kg1 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 1) {
            throw new IllegalArgumentException();
        }
        float f4 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
        return f4 == -1.0f ? new kg1() : new kg1(f4);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kg1) && this.f28197c == ((kg1) obj).f28197c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f28197c)});
    }

    public kg1(float f4) {
        C2253tf.a("percent must be in the range of [0, 100]", f4 >= 0.0f && f4 <= 100.0f);
        this.f28197c = f4;
    }
}
