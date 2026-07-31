package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class n72 implements c32 {

    /* renamed from: c, reason: collision with root package name */
    public static final n72 f29467c = new n72();

    /* renamed from: b, reason: collision with root package name */
    private final List<uu> f29468b;

    private n72() {
        this.f29468b = Collections.EMPTY_LIST;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final int a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final List<uu> b(long j4) {
        return j4 >= 0 ? this.f29468b : Collections.EMPTY_LIST;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final int a(long j4) {
        return j4 < 0 ? 0 : -1;
    }

    public n72(uu uuVar) {
        this.f29468b = Collections.singletonList(uuVar);
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final long a(int i4) {
        if (i4 == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }
}
