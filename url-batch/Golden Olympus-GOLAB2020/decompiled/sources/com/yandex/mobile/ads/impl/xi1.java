package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xi1 implements tl1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gf2 f34578a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final sn1 f34579b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final rn1 f34580c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final zi1 f34581d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34582e;

    public xi1(@NotNull gf2 videoProgressMonitoringManager, @NotNull sn1 readyToPrepareProvider, @NotNull rn1 readyToPlayProvider, @NotNull zi1 playlistSchedulerListener) {
        Intrinsics.checkNotNullParameter(videoProgressMonitoringManager, "videoProgressMonitoringManager");
        Intrinsics.checkNotNullParameter(readyToPrepareProvider, "readyToPrepareProvider");
        Intrinsics.checkNotNullParameter(readyToPlayProvider, "readyToPlayProvider");
        Intrinsics.checkNotNullParameter(playlistSchedulerListener, "playlistSchedulerListener");
        this.f34578a = videoProgressMonitoringManager;
        this.f34579b = readyToPrepareProvider;
        this.f34580c = readyToPlayProvider;
        this.f34581d = playlistSchedulerListener;
    }

    @Override // com.yandex.mobile.ads.impl.tl1
    public final void a(long j4) {
        ss a4 = this.f34580c.a(j4);
        if (a4 != null) {
            this.f34581d.a(a4);
            return;
        }
        ss a5 = this.f34579b.a(j4);
        if (a5 != null) {
            this.f34581d.b(a5);
        }
    }

    public final void b() {
        if (this.f34582e) {
            this.f34578a.a((tl1) null);
            this.f34578a.b();
            this.f34582e = false;
        }
    }

    public final void a() {
        if (this.f34582e) {
            return;
        }
        this.f34582e = true;
        this.f34578a.a(this);
        this.f34578a.a();
    }
}
