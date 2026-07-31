package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a11;
import com.yandex.mobile.ads.impl.i11;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ns0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f29752c = new Object();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i11 f29753a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a11 f29754b;

    public ns0() {
        this(0);
    }

    @Nullable
    public final dx a() {
        dx dxVar;
        synchronized (f29752c) {
            dxVar = !y01.f34757a.a() ? null : new dx(this.f29753a.d(), this.f29754b.d());
        }
        return dxVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ns0(int i4) {
        this(r2, a11.a.a());
        int i5 = i11.f27051d;
        i11 a4 = i11.a.a();
        int i6 = a11.f23122d;
    }

    public ns0(@NotNull i11 sdkLogsCollector, @NotNull a11 networkLogsCollector) {
        Intrinsics.checkNotNullParameter(sdkLogsCollector, "sdkLogsCollector");
        Intrinsics.checkNotNullParameter(networkLogsCollector, "networkLogsCollector");
        this.f29753a = sdkLogsCollector;
        this.f29754b = networkLogsCollector;
    }
}
