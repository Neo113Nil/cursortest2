package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1601z0 implements InterfaceC1595y0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wn f20486a;

    @Metadata
    /* renamed from: com.ironsource.z0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f20487a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f20488b = 1000;

        private a() {
        }
    }

    public C1601z0(@NotNull wn networkLoadApi) {
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        this.f20486a = networkLoadApi;
    }

    @Override // com.ironsource.InterfaceC1595y0
    @NotNull
    public String a() {
        return this.f20486a.a();
    }

    @Override // com.ironsource.InterfaceC1595y0
    public void a(@NotNull sj adInstance, @NotNull Map<String, String> loadParams) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        try {
            this.f20486a.a(adInstance, new yn(null, false, 3, null));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + adInstance.e() + " failed. error: " + e4.getMessage());
            StringBuilder sb = new StringBuilder();
            sb.append("1000: loadAd failed: ");
            sb.append(e4.getMessage());
            String sb2 = sb.toString();
            jo b4 = adInstance.b();
            if (b4 instanceof ad) {
                jo b5 = adInstance.b();
                Intrinsics.checkNotNull(b5, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((ad) b5).onInterstitialLoadFailed(sb2);
            } else if (b4 instanceof lo) {
                jo b6 = adInstance.b();
                Intrinsics.checkNotNull(b6, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((lo) b6).onBannerLoadFail(sb2);
            }
        }
    }
}
