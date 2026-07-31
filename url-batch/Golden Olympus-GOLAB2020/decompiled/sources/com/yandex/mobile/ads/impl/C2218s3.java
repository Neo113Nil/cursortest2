package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.s3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2218s3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f31540a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ss f31541b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC1865d2 f31542c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final zi0 f31543d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final rl0 f31544e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final km0 f31545f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ec2<on0> f31546g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C1889e2 f31547h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final dg2 f31548i;

    public /* synthetic */ C2218s3(Context context, ss ssVar, EnumC1865d2 enumC1865d2, zi0 zi0Var, rl0 rl0Var, km0 km0Var, ec2 ec2Var) {
        this(context, ssVar, enumC1865d2, zi0Var, rl0Var, km0Var, ec2Var, new C1889e2(), new dg2(ssVar.d().d()));
    }

    @NotNull
    public final C2195r3 a(@NotNull ob2<on0> videoAdInfo) {
        pc2 pc2Var;
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        C1889e2 c1889e2 = this.f31547h;
        EnumC1865d2 adBreakPosition = this.f31542c;
        c1889e2.getClass();
        Intrinsics.checkNotNullParameter(adBreakPosition, "adBreakPosition");
        int ordinal = adBreakPosition.ordinal();
        if (ordinal == 0) {
            pc2Var = pc2.f30409b;
        } else if (ordinal == 1) {
            pc2Var = pc2.f30410c;
        } else if (ordinal == 2) {
            pc2Var = pc2.f30411d;
        } else {
            if (ordinal != 3) {
                throw new W1.m();
            }
            pc2Var = pc2.f30412e;
        }
        cg2 a4 = this.f31548i.a(this.f31540a, videoAdInfo, pc2Var);
        fd2 fd2Var = new fd2();
        Context context = this.f31540a;
        vu1 d4 = this.f31541b.d();
        rl0 rl0Var = this.f31544e;
        km0 km0Var = this.f31545f;
        ss ssVar = this.f31541b;
        zi0 zi0Var = this.f31543d;
        ec2<on0> ec2Var = this.f31546g;
        C2286v2 c2286v2 = new C2286v2(gs.f26284h, d4);
        on0 d5 = videoAdInfo.d();
        kn0 kn0Var = new kn0(d5, rl0Var);
        do0 do0Var = new do0(km0Var);
        co0 co0Var = new co0(ssVar, videoAdInfo, fd2Var, do0Var, new ig2(do0Var), new eo0(fd2Var, ssVar, videoAdInfo));
        sc2 sc2Var = new sc2();
        mn0 mn0Var = new mn0(ec2Var);
        k92 k92Var = new k92(context, c2286v2, kn0Var, do0Var, videoAdInfo, co0Var, fd2Var, a4, sc2Var, mn0Var, null);
        ri0 ri0Var = new ri0(context);
        C2105n4 c2105n4 = new C2105n4();
        return new C2195r3(videoAdInfo, new ln0(context, d4, rl0Var, km0Var, ssVar, videoAdInfo, fd2Var, a4, zi0Var, ec2Var, c2286v2, d5, kn0Var, do0Var, co0Var, sc2Var, mn0Var, k92Var, ri0Var, c2105n4, new bn0(ri0Var, c2105n4), new zl0(d5, do0Var, kn0Var, km0Var, fd2Var), new ll0(d5, new rb2(d5)), new fl0(ssVar)), this.f31543d, fd2Var, a4);
    }

    public C2218s3(@NotNull Context context, @NotNull ss adBreak, @NotNull EnumC1865d2 adBreakPosition, @NotNull zi0 imageProvider, @NotNull rl0 adPlayerController, @NotNull km0 adViewsHolderManager, @NotNull ec2<on0> playbackEventsListener, @NotNull C1889e2 adBreakPositionConverter, @NotNull dg2 videoTrackerCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(adBreakPosition, "adBreakPosition");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(adPlayerController, "adPlayerController");
        Intrinsics.checkNotNullParameter(adViewsHolderManager, "adViewsHolderManager");
        Intrinsics.checkNotNullParameter(playbackEventsListener, "playbackEventsListener");
        Intrinsics.checkNotNullParameter(adBreakPositionConverter, "adBreakPositionConverter");
        Intrinsics.checkNotNullParameter(videoTrackerCreator, "videoTrackerCreator");
        this.f31540a = context;
        this.f31541b = adBreak;
        this.f31542c = adBreakPosition;
        this.f31543d = imageProvider;
        this.f31544e = adPlayerController;
        this.f31545f = adViewsHolderManager;
        this.f31546g = playbackEventsListener;
        this.f31547h = adBreakPositionConverter;
        this.f31548i = videoTrackerCreator;
    }
}
