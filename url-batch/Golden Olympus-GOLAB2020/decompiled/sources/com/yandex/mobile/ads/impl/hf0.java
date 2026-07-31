package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class hf0 extends en1 {

    /* renamed from: e, reason: collision with root package name */
    public static final InterfaceC2259tl.a<hf0> f26727e = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.K6
        @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
        public final InterfaceC2259tl fromBundle(Bundle bundle) {
            hf0 b4;
            b4 = hf0.b(bundle);
            return b4;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26728c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f26729d;

    public hf0() {
        this.f26728c = false;
        this.f26729d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static hf0 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 0) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new hf0(bundle.getBoolean(Integer.toString(2, 36), false)) : new hf0();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hf0)) {
            return false;
        }
        hf0 hf0Var = (hf0) obj;
        return this.f26729d == hf0Var.f26729d && this.f26728c == hf0Var.f26728c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f26728c), Boolean.valueOf(this.f26729d)});
    }

    public hf0(boolean z4) {
        this.f26728c = true;
        this.f26729d = z4;
    }
}
