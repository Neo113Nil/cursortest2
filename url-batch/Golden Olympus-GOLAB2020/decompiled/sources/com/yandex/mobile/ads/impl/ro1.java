package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ro1 implements qo1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private Long f31322a;

    @Override // com.yandex.mobile.ads.impl.qo1
    public final void a() {
        this.f31322a = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // com.yandex.mobile.ads.impl.qo1
    public final long b() {
        Long l4 = this.f31322a;
        if (l4 == null) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - l4.longValue();
    }
}
