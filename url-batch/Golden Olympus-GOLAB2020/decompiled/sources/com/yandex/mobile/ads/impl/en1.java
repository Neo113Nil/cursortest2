package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;

/* loaded from: classes3.dex */
public abstract class en1 implements InterfaceC2259tl {

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC2259tl.a<en1> f25366b = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.U1
        @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
        public final InterfaceC2259tl fromBundle(Bundle bundle) {
            en1 a4;
            a4 = en1.a(bundle);
            return a4;
        }
    };

    en1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static en1 a(Bundle bundle) {
        int i4 = bundle.getInt(Integer.toString(0, 36), -1);
        if (i4 == 0) {
            return hf0.f26727e.fromBundle(bundle);
        }
        if (i4 == 1) {
            return kg1.f28196d.fromBundle(bundle);
        }
        if (i4 == 2) {
            return c22.f24033e.fromBundle(bundle);
        }
        if (i4 == 3) {
            return n42.f29436e.fromBundle(bundle);
        }
        throw new IllegalArgumentException(C1877de.a("Unknown RatingType: ", i4));
    }
}
