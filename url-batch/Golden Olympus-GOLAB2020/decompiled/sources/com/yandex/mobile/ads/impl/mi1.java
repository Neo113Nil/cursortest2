package com.yandex.mobile.ads.impl;

import androidx.media3.common.Timeline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mi1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Timeline.Period f29117a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Timeline f29118b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29119c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ mi1() {
        this(r0, EMPTY, false);
        Timeline.Period period = new Timeline.Period();
        Timeline EMPTY = Timeline.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
    }

    @NotNull
    public final Timeline.Period a() {
        return this.f29117a;
    }

    @NotNull
    public final Timeline b() {
        return this.f29118b;
    }

    public final boolean c() {
        return this.f29119c;
    }

    public final void a(boolean z4) {
        this.f29119c = z4;
    }

    public final void a(@NotNull Timeline timeline) {
        Intrinsics.checkNotNullParameter(timeline, "<set-?>");
        this.f29118b = timeline;
    }

    public mi1(@NotNull Timeline.Period period, @NotNull Timeline timeline, boolean z4) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        this.f29117a = period;
        this.f29118b = timeline;
        this.f29119c = z4;
    }
}
