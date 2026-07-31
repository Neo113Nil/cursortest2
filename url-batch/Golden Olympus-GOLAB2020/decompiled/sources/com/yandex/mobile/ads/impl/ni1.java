package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Timeline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ni1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Timeline.Period f29651a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Timeline f29652b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29653c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ni1() {
        this(r0, EMPTY, false);
        Timeline.Period period = new Timeline.Period();
        Timeline EMPTY = Timeline.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
    }

    @NotNull
    public final Timeline.Period a() {
        return this.f29651a;
    }

    @NotNull
    public final Timeline b() {
        return this.f29652b;
    }

    public final boolean c() {
        return this.f29653c;
    }

    public final void a(boolean z4) {
        this.f29653c = z4;
    }

    public final void a(@NotNull Timeline timeline) {
        Intrinsics.checkNotNullParameter(timeline, "<set-?>");
        this.f29652b = timeline;
    }

    public ni1(@NotNull Timeline.Period period, @NotNull Timeline timeline, boolean z4) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        this.f29651a = period;
        this.f29652b = timeline;
        this.f29653c = z4;
    }
}
