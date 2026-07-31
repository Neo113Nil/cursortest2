package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.d5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1868d5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1824b9 f24420a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2311w4 f24421b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ni1 f24422c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ri1 f24423d;

    /* renamed from: com.yandex.mobile.ads.impl.d5$a */
    public interface a {
        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.d5$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f24424b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f24425c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f24426d;

        static {
            b bVar = new b(0, "SINGLE_AD");
            f24424b = bVar;
            b bVar2 = new b(1, "AD_GROUP");
            f24425c = bVar2;
            b[] bVarArr = {bVar, bVar2};
            f24426d = bVarArr;
            AbstractC1372b.a(bVarArr);
        }

        private b(int i4, String str) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f24426d.clone();
        }
    }

    public /* synthetic */ C1868d5(C2384z8 c2384z8, li1 li1Var) {
        this(c2384z8, li1Var, c2384z8.b(), c2384z8.c(), li1Var.d(), li1Var.e());
    }

    public final void a(@NotNull C1843c4 adInfo, @NotNull b adDiscardType, @NotNull a adDiscardListener) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(adDiscardType, "adDiscardType");
        Intrinsics.checkNotNullParameter(adDiscardListener, "adDiscardListener");
        int a4 = adInfo.a();
        int b4 = adInfo.b();
        AdPlaybackState a5 = this.f24421b.a();
        if (a5.isAdInErrorState(a4, b4)) {
            return;
        }
        if (b.f24425c == adDiscardType) {
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
        this.f24421b.a(a5);
        this.f24423d.b();
        adDiscardListener.a();
        if (this.f24422c.c()) {
            return;
        }
        this.f24420a.a((ui1) null);
    }

    public C1868d5(@NotNull C2384z8 adStateDataController, @NotNull li1 playerStateController, @NotNull C1824b9 adStateHolder, @NotNull C2311w4 adPlaybackStateController, @NotNull ni1 playerStateHolder, @NotNull ri1 playerVolumeController) {
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(playerVolumeController, "playerVolumeController");
        this.f24420a = adStateHolder;
        this.f24421b = adPlaybackStateController;
        this.f24422c = playerStateHolder;
        this.f24423d = playerVolumeController;
    }
}
