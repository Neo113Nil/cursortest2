package com.monetization.ads.mediation.banner;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.yandex.mobile.ads.impl.C1977hi;
import com.yandex.mobile.ads.impl.C2054l0;
import com.yandex.mobile.ads.impl.C2105n4;
import com.yandex.mobile.ads.impl.C2286v2;
import com.yandex.mobile.ads.impl.C2360y7;
import com.yandex.mobile.ads.impl.InterfaceC2072li;
import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.ap0;
import com.yandex.mobile.ads.impl.hx0;
import com.yandex.mobile.ads.impl.qx0;
import com.yandex.mobile.ads.impl.sx0;
import com.yandex.mobile.ads.impl.sy0;
import com.yandex.mobile.ads.impl.ux0;
import com.yandex.mobile.ads.impl.zw0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class c implements InterfaceC2072li {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<String> f20721a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f20722b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final zw0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> f20723c;

    public c(@NotNull C1977hi loadController, @NotNull C2360y7<String> adResponse, @NotNull sy0 mediationData) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(mediationData, "mediationData");
        this.f20721a = adResponse;
        C2286v2 e4 = loadController.e();
        ux0 ux0Var = new ux0(e4);
        qx0 qx0Var = new qx0(e4, adResponse);
        sx0 sx0Var = new sx0(new hx0(mediationData.c(), ux0Var, qx0Var));
        C2105n4 h4 = loadController.h();
        zw0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> zw0Var = new zw0<>(e4, h4, new b(), qx0Var, sx0Var, new ag1(loadController, mediationData, h4));
        this.f20723c = zw0Var;
        this.f20722b = new a(loadController, zw0Var, new d(loadController.B(), loadController.e().q()));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2072li
    public final void a(@NotNull Context context, @NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Activity a4 = C2054l0.a();
        if (a4 != null) {
            ap0.a(new Object[0]);
        }
        if (a4 != null) {
            context = a4;
        }
        this.f20723c.a(context, (Context) this.f20722b);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2072li
    @Nullable
    public final String getAdInfo() {
        return this.f20721a.e();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2072li
    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20723c.a(context);
    }
}
