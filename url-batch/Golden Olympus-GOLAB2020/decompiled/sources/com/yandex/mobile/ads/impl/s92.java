package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s92<T> implements rc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ob2<T> f31635a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bg2 f31636b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ec2<T> f31637c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ig2 f31638d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f31639e;

    public /* synthetic */ s92(ob2 ob2Var, hg2 hg2Var, cg2 cg2Var, ec2 ec2Var) {
        this(ob2Var, hg2Var, cg2Var, ec2Var, new ig2(hg2Var));
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void a(long j4, long j5) {
        if (this.f31639e || j5 <= 0 || !this.f31638d.a()) {
            return;
        }
        this.f31639e = true;
        this.f31636b.h();
        this.f31637c.i(this.f31635a);
    }

    public s92(@NotNull ob2 videoAdInfo, @NotNull hg2 videoViewProvider, @NotNull cg2 videoTracker, @NotNull ec2 playbackEventsListener, @NotNull ig2 videoVisibleAreaValidator) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(playbackEventsListener, "playbackEventsListener");
        Intrinsics.checkNotNullParameter(videoVisibleAreaValidator, "videoVisibleAreaValidator");
        this.f31635a = videoAdInfo;
        this.f31636b = videoTracker;
        this.f31637c = playbackEventsListener;
        this.f31638d = videoVisibleAreaValidator;
    }
}
