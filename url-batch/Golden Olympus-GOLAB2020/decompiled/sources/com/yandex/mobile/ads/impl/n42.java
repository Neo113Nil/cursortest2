package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class n42 extends en1 {

    /* renamed from: e, reason: collision with root package name */
    public static final InterfaceC2259tl.a<n42> f29436e = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Na
        @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
        public final InterfaceC2259tl fromBundle(Bundle bundle) {
            n42 b4;
            b4 = n42.b(bundle);
            return b4;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29437c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29438d;

    public n42() {
        this.f29437c = false;
        this.f29438d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n42 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 3) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new n42(bundle.getBoolean(Integer.toString(2, 36), false)) : new n42();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n42)) {
            return false;
        }
        n42 n42Var = (n42) obj;
        return this.f29438d == n42Var.f29438d && this.f29437c == n42Var.f29437c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f29437c), Boolean.valueOf(this.f29438d)});
    }

    public n42(boolean z4) {
        this.f29437c = true;
        this.f29438d = z4;
    }
}
