package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class zc implements ok {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final os f20530a;

    /* renamed from: b, reason: collision with root package name */
    private long f20531b;

    public zc(@NotNull cf applicationLifecycleService, @NotNull os task) {
        Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        Intrinsics.checkNotNullParameter(task, "task");
        this.f20530a = task;
        applicationLifecycleService.a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.f20531b;
    }

    private final void f() {
        this.f20531b = System.currentTimeMillis();
    }

    @Override // com.ironsource.ok
    public void a() {
    }

    @Override // com.ironsource.ok
    public void b() {
        this.f20530a.a(Long.valueOf(e()));
        this.f20530a.run();
    }

    @Override // com.ironsource.ok
    public void c() {
        f();
    }

    @Override // com.ironsource.ok
    public void d() {
    }
}
