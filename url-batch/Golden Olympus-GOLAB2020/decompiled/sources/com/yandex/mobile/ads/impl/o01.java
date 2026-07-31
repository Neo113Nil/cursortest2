package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o01 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Executor f29828a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f29829b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ o01() {
        this(r0, r1);
        Executor executor = new Executor() { // from class: com.yandex.mobile.ads.impl.Bb
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                o01.a(runnable);
            }
        };
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable r4) {
        Intrinsics.checkNotNullParameter(r4, "r");
        new Handler(Looper.getMainLooper()).post(r4);
    }

    @NotNull
    public final Executor b() {
        return this.f29828a;
    }

    @NotNull
    public final Executor a() {
        return this.f29829b;
    }

    public o01(@NotNull Executor mainThreadExecutor, @NotNull Executor backgroundExecutor) {
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        this.f29828a = mainThreadExecutor;
        this.f29829b = backgroundExecutor;
    }
}
