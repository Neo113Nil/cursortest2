package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C2277ug;
import com.yandex.mobile.ads.impl.m32;
import com.yandex.mobile.ads.impl.ou0;

/* loaded from: classes3.dex */
public final class uz implements ou0.b {
    @Override // com.yandex.mobile.ads.impl.ou0.b
    public final ou0 a(ou0.a aVar) {
        int i4 = u82.f32873a;
        if (i4 < 23 || i4 < 31) {
            return new m32.a().a(aVar);
        }
        int c4 = i01.c(aVar.f30203c.f34991m);
        ms0.c("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + u82.d(c4));
        return new C2277ug.a(c4).a(aVar);
    }
}
