package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class ln implements c32 {

    /* renamed from: b, reason: collision with root package name */
    private final List<uu> f28666b;

    public ln(List<uu> list) {
        this.f28666b = list;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final int a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final List<uu> b(long j4) {
        return j4 >= 0 ? this.f28666b : Collections.EMPTY_LIST;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final int a(long j4) {
        return j4 < 0 ? 0 : -1;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final long a(int i4) {
        if (i4 == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }
}
