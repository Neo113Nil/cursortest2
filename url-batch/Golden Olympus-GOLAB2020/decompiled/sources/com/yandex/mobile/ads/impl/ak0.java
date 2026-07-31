package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ak0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bk0 f23339a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23340b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23341c;

    public ak0(@NotNull bk0 impressionReporter) {
        Intrinsics.checkNotNullParameter(impressionReporter, "impressionReporter");
        this.f23339a = impressionReporter;
    }

    public final void a() {
        this.f23340b = false;
        this.f23341c = false;
    }

    public final void b() {
        if (this.f23340b) {
            return;
        }
        this.f23340b = true;
        this.f23339a.a(ip1.b.f27365x);
    }

    public final void c() {
        if (this.f23341c) {
            return;
        }
        this.f23341c = true;
        this.f23339a.a(ip1.b.f27366y, MapsKt.mapOf(TuplesKt.to("failure_tracked", Boolean.FALSE)));
    }
}
