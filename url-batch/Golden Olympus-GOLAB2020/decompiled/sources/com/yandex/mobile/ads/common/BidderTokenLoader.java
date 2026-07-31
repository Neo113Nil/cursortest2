package com.yandex.mobile.ads.common;

import W1.m;
import android.content.Context;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.banner.a;
import com.yandex.mobile.ads.impl.C1803ac;
import com.yandex.mobile.ads.impl.C2050kk;
import com.yandex.mobile.ads.impl.C2074lk;
import com.yandex.mobile.ads.impl.C2105n4;
import com.yandex.mobile.ads.impl.au1;
import com.yandex.mobile.ads.impl.e50;
import com.yandex.mobile.ads.impl.eu;
import com.yandex.mobile.ads.impl.gs;
import com.yandex.mobile.ads.impl.jv1;
import com.yandex.mobile.ads.impl.kl2;
import com.yandex.mobile.ads.impl.ll2;
import com.yandex.mobile.ads.impl.te1;
import com.yandex.mobile.ads.impl.um2;
import com.yandex.mobile.ads.impl.vy1;
import com.yandex.mobile.ads.impl.we1;
import com.yandex.mobile.ads.impl.y22;
import com.yandex.mobile.ads.impl.yt1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3316J;
import o2.K;
import o2.R0;
import o2.Z;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class BidderTokenLoader {
    static {
        new BidderTokenLoader();
    }

    private BidderTokenLoader() {
    }

    public static final void loadBidderToken(@NotNull Context context, @NotNull BidderTokenRequestConfiguration request, @NotNull BidderTokenLoadListener listener) {
        gs gsVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "bidderTokenRequestConfiguration");
        Intrinsics.checkNotNullParameter(listener, "listener");
        um2 um2Var = new um2(context);
        kl2 kl2Var = new kl2(listener);
        Intrinsics.checkNotNullParameter(request, "request");
        switch (ll2.f28642a[request.getAdType().ordinal()]) {
            case 1:
                gsVar = null;
                break;
            case 2:
                gsVar = gs.f26280d;
                break;
            case 3:
                gsVar = gs.f26281e;
                break;
            case 4:
                gsVar = gs.f26282f;
                break;
            case 5:
                gsVar = gs.f26283g;
                break;
            case 6:
                gsVar = gs.f26285i;
                break;
            default:
                throw new m();
        }
        BannerAdSize bannerAdSize = request.getBannerAdSize();
        vy1 a4 = bannerAdSize != null ? a.a(bannerAdSize).a() : null;
        Map<String, String> parameters = request.getParameters();
        if (parameters == null) {
            parameters = MapsKt.emptyMap();
        }
        C2074lk c2074lk = new C2074lk(gsVar, a4, parameters);
        InterfaceC3316J a5 = K.a(R0.b(null, 1, null).plus(Z.b()).plus(new eu(um2Var.c())));
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        C2105n4 c2105n4 = new C2105n4();
        int i4 = e50.f25096e;
        e50 a6 = e50.a.a(applicationContext);
        C1803ac c1803ac = new C1803ac();
        jv1 jv1Var = new jv1(applicationContext, um2Var, a5, c2105n4, a6, c1803ac, 1048512);
        int i5 = y22.f34782d;
        new au1(context, um2Var, a5, applicationContext, c2105n4, a6, c1803ac, jv1Var, y22.a.a(), new yt1(c2105n4), new we1(c2105n4, um2Var.c(), new C2050kk(), new te1(c2105n4))).a(c2074lk, kl2Var);
    }
}
