package com.yandex.mobile.ads.impl;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.yc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2365yc implements InterfaceC1805ae {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f35051b = new Object();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Executor f35052a;

    public C2365yc(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f35052a = executor;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1805ae
    public final void a(@NotNull final C2366yd report) {
        Intrinsics.checkNotNullParameter(report, "report");
        this.f35052a.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.Sl
            @Override // java.lang.Runnable
            public final void run() {
                C2365yc.a(C2365yc.this, report);
            }
        });
    }

    private static void b(C2366yd c2366yd) {
        c2366yd.a();
        c2366yd.b();
        ap0.a(new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2365yc this$0, C2366yd report) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(report, "$report");
        this$0.getClass();
        b(report);
        C2319wc.f33993a.getClass();
        C2319wc.a(report);
    }
}
