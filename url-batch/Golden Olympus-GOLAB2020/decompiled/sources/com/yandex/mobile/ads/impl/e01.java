package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class e01 implements mp1 {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Object f25049e = new Object();

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final mp1 f25050a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25051b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Executor f25052c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final W1.h f25053d;

    public e01(@Nullable mp1 mp1Var, @NotNull W1.h lazyVarioqubAdapter, boolean z4, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(lazyVarioqubAdapter, "lazyVarioqubAdapter");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f25050a = mp1Var;
        this.f25051b = z4;
        this.f25052c = executor;
        this.f25053d = lazyVarioqubAdapter;
    }

    private static void a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), AbstractC3219i.G0((Object[]) entry.getValue()));
        }
        linkedHashMap.toString();
        ap0.b(new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.mp1
    public final void reportAnr(@NotNull final Map<Thread, StackTraceElement[]> traces) {
        Intrinsics.checkNotNullParameter(traces, "traces");
        if (this.f25050a != null) {
            this.f25052c.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.E1
                @Override // java.lang.Runnable
                public final void run() {
                    e01.a(e01.this, traces);
                }
            });
        } else {
            ap0.d(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.j50
    public final void reportError(@NotNull final String message, @NotNull final Throwable error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.f25051b) {
            if (this.f25050a != null) {
                this.f25052c.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.H1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e01.a(e01.this, message, error);
                    }
                });
            } else {
                ap0.d(new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.mp1
    public final void reportUnhandledException(@NotNull final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (this.f25050a != null) {
            this.f25052c.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.G1
                @Override // java.lang.Runnable
                public final void run() {
                    e01.a(e01.this, throwable);
                }
            });
        } else {
            ap0.d(new Object[0]);
        }
    }

    private static void a(String str, Throwable th) {
        Objects.toString(th);
        ap0.b(new Object[0]);
    }

    private static void a(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), AbstractC3219i.c(new Object[]{entry.getValue()}));
        }
        linkedHashMap.toString();
        ap0.a(new Object[0]);
    }

    private static void a(Throwable th) {
        Objects.toString(th);
        ap0.b(new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(e01 this$0, Map traces) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(traces, "$traces");
        try {
            this$0.getClass();
            a(traces);
            this$0.f25050a.reportAnr(traces);
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(e01 this$0, String message, Throwable error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "$message");
        Intrinsics.checkNotNullParameter(error, "$error");
        try {
            this$0.getClass();
            a(message, error);
            this$0.f25050a.reportError(message, error);
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mp1
    public final void a(@NotNull final ip1 report) {
        Intrinsics.checkNotNullParameter(report, "report");
        if (this.f25050a != null) {
            this.f25052c.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.F1
                @Override // java.lang.Runnable
                public final void run() {
                    e01.a(e01.this, report);
                }
            });
        } else {
            ap0.d(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(e01 this$0, ip1 report) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(report, "$report");
        try {
            h92.a((g92) this$0.f25053d.getValue(), report);
            a(report.c(), report.b());
            this$0.f25050a.a(report);
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(e01 this$0, Throwable throwable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(throwable, "$throwable");
        try {
            this$0.getClass();
            a(throwable);
            this$0.f25050a.reportUnhandledException(throwable);
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
        }
    }
}
