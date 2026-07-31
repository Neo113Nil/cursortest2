package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qh2<T> implements rc2, tc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ob2<T> f30780a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final fd2 f30781b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final bg2 f30782c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ec2<T> f30783d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final id2 f30784e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private Long f30785f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30786g;

    public /* synthetic */ qh2(ob2 ob2Var, hg2 hg2Var, fd2 fd2Var, cg2 cg2Var, ec2 ec2Var) {
        this(ob2Var, hg2Var, fd2Var, cg2Var, ec2Var, new jg2(hg2Var));
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void a(long j4, long j5) {
        if (this.f30786g) {
            return;
        }
        Unit unit = null;
        if (!this.f30784e.a() || this.f30781b.a() != ed2.f25241e) {
            this.f30785f = null;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l4 = this.f30785f;
        if (l4 != null) {
            if (elapsedRealtime - l4.longValue() >= 2000) {
                this.f30786g = true;
                this.f30783d.k(this.f30780a);
                this.f30782c.n();
            }
            unit = Unit.f41027a;
        }
        if (unit == null) {
            this.f30785f = Long.valueOf(elapsedRealtime);
            this.f30783d.l(this.f30780a);
        }
    }

    @Override // com.yandex.mobile.ads.impl.tc2
    public final void b() {
        this.f30785f = null;
    }

    public qh2(@NotNull ob2 videoAdInfo, @NotNull hg2 videoViewProvider, @NotNull fd2 videoAdStatusController, @NotNull cg2 videoTracker, @NotNull ec2 videoAdPlaybackEventsListener, @NotNull id2 videoAdVisibilityValidator) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(videoAdStatusController, "videoAdStatusController");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(videoAdPlaybackEventsListener, "videoAdPlaybackEventsListener");
        Intrinsics.checkNotNullParameter(videoAdVisibilityValidator, "videoAdVisibilityValidator");
        this.f30780a = videoAdInfo;
        this.f30781b = videoAdStatusController;
        this.f30782c = videoTracker;
        this.f30783d = videoAdPlaybackEventsListener;
        this.f30784e = videoAdVisibilityValidator;
    }

    @Override // com.yandex.mobile.ads.impl.tc2
    public final void a() {
        this.f30785f = null;
    }
}
