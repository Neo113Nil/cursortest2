package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import b2.AbstractC1372b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.e5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1892e5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1800a9 f25087a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2288v4 f25088b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mi1 f25089c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final qi1 f25090d;

    /* renamed from: com.yandex.mobile.ads.impl.e5$a */
    public interface a {
        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.e5$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f25091b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f25092c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f25093d;

        static {
            b bVar = new b(0, "SINGLE_AD");
            f25091b = bVar;
            b bVar2 = new b(1, "AD_GROUP");
            f25092c = bVar2;
            b[] bVarArr = {bVar, bVar2};
            f25093d = bVarArr;
            AbstractC1372b.a(bVarArr);
        }

        private b(int i4, String str) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f25093d.clone();
        }
    }

    public /* synthetic */ C1892e5(C2361y8 c2361y8, ki1 ki1Var) {
        this(c2361y8, ki1Var, c2361y8.b(), c2361y8.c(), ki1Var.d(), ki1Var.e());
    }

    public final void a(@NotNull C1819b4 adInfo, @NotNull b adDiscardType, @NotNull a adDiscardListener) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(adDiscardType, "adDiscardType");
        Intrinsics.checkNotNullParameter(adDiscardListener, "adDiscardListener");
        int a4 = adInfo.a();
        int b4 = adInfo.b();
        AdPlaybackState a5 = this.f25088b.a();
        if (a5.isAdInErrorState(a4, b4)) {
            return;
        }
        if (b.f25092c == adDiscardType) {
            int i4 = a5.getAdGroup(a4).count;
            while (b4 < i4) {
                if (!a5.isAdInErrorState(a4, b4)) {
                    a5 = a5.withSkippedAd(a4, b4).withAdResumePositionUs(0L);
                    Intrinsics.checkNotNull(a5);
                }
                b4++;
            }
        } else if (!a5.isAdInErrorState(a4, b4)) {
            a5 = a5.withSkippedAd(a4, b4).withAdResumePositionUs(0L);
            Intrinsics.checkNotNull(a5);
        }
        this.f25088b.a(a5);
        this.f25090d.b();
        adDiscardListener.a();
        if (this.f25089c.c()) {
            return;
        }
        this.f25087a.a((ti1) null);
    }

    public C1892e5(@NotNull C2361y8 adStateDataController, @NotNull ki1 playerStateController, @NotNull C1800a9 adStateHolder, @NotNull C2288v4 adPlaybackStateController, @NotNull mi1 playerStateHolder, @NotNull qi1 playerVolumeController) {
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(playerVolumeController, "playerVolumeController");
        this.f25087a = adStateHolder;
        this.f25088b = adPlaybackStateController;
        this.f25089c = playerStateHolder;
        this.f25090d = playerVolumeController;
    }
}
