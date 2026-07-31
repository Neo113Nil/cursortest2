package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class s71 implements xa1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ra1 f31614a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private ke2 f31615b;

    public s71(@NotNull ra1 nativeVideoController, @NotNull fe2 videoLifecycleListener, @Nullable ke2 ke2Var) {
        Intrinsics.checkNotNullParameter(nativeVideoController, "nativeVideoController");
        Intrinsics.checkNotNullParameter(videoLifecycleListener, "videoLifecycleListener");
        this.f31614a = nativeVideoController;
        this.f31615b = ke2Var;
    }

    @Override // com.yandex.mobile.ads.impl.xa1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.xa1
    public final void b() {
        ke2 ke2Var = this.f31615b;
        if (ke2Var != null) {
            ke2Var.onVideoComplete();
        }
    }

    public final void c() {
        this.f31614a.b(this);
        this.f31615b = null;
    }

    public final void d() {
        this.f31614a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.xa1
    public final void a(long j4, long j5) {
    }
}
