package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class q11 implements c32 {

    /* renamed from: b, reason: collision with root package name */
    private final List<uu> f30637b;

    public q11(ArrayList arrayList) {
        this.f30637b = Collections.unmodifiableList(arrayList);
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final int a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final List<uu> b(long j4) {
        return j4 >= 0 ? this.f30637b : Collections.EMPTY_LIST;
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
