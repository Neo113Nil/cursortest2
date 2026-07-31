package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.impl.C2353y0;
import com.yandex.mobile.ads.impl.m91;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cw1 implements rc0<ur1> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yc0<ur1> f24332a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final s51 f24333b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final rt1 f24334c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final m91 f24335d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2286v2 f24336e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final i71 f24337f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final hd0 f24338g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private C2360y7<String> f24339h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private f61 f24340i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f24341j;

    public cw1(@NotNull yc0<ur1> rewardedAdLoadController, @NotNull vu1 sdkEnvironmentModule, @NotNull s51 infoProvider) {
        Intrinsics.checkNotNullParameter(rewardedAdLoadController, "rewardedAdLoadController");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(infoProvider, "infoProvider");
        this.f24332a = rewardedAdLoadController;
        this.f24333b = infoProvider;
        Context k4 = rewardedAdLoadController.k();
        C2286v2 e4 = rewardedAdLoadController.e();
        this.f24336e = e4;
        this.f24337f = new i71(e4);
        C2105n4 h4 = rewardedAdLoadController.h();
        this.f24334c = new rt1(e4);
        this.f24335d = new m91(k4, sdkEnvironmentModule, e4, h4);
        this.f24338g = new hd0(sdkEnvironmentModule);
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    @Nullable
    public final String getAdInfo() {
        return this.f24333b.a(this.f24340i);
    }

    private final class a implements wq1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C2360y7<String> f24342a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f24343b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cw1 f24344c;

        public a(cw1 cw1Var, @NotNull Context context, @NotNull C2360y7<String> adResponse) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            this.f24344c = cw1Var;
            this.f24342a = adResponse;
            this.f24343b = context.getApplicationContext();
        }

        @Override // com.yandex.mobile.ads.impl.wq1
        public final void a(@NotNull C1866d3 adRequestError) {
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            rt1 rt1Var = this.f24344c.f24334c;
            Context context = this.f24343b;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            rt1Var.a(context, this.f24342a, this.f24344c.f24337f);
            rt1 rt1Var2 = this.f24344c.f24334c;
            Context context2 = this.f24343b;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            rt1Var2.a(context2, this.f24342a, (j71) null);
        }

        @Override // com.yandex.mobile.ads.impl.wq1
        public final void a(@NotNull n61 nativeAdResponse) {
            Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
            j71 j71Var = new j71(this.f24342a, nativeAdResponse, this.f24344c.f24336e);
            rt1 rt1Var = this.f24344c.f24334c;
            Context context = this.f24343b;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            rt1Var.a(context, this.f24342a, this.f24344c.f24337f);
            rt1 rt1Var2 = this.f24344c.f24334c;
            Context context2 = this.f24343b;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            rt1Var2.a(context2, this.f24342a, j71Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24341j = true;
        this.f24339h = null;
        this.f24340i = null;
        this.f24335d.a();
        ap0.d(new Object[0]);
    }

    private final class b implements m91.b {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.m91.b
        public final void a(@NotNull C1866d3 adRequestError) {
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            if (cw1.this.f24341j) {
                return;
            }
            cw1.this.f24340i = null;
            cw1.this.f24332a.b(adRequestError);
        }

        @Override // com.yandex.mobile.ads.impl.m91.b
        public final void a(@NotNull f61 nativeAdPrivate) {
            Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
            if (cw1.this.f24341j) {
                return;
            }
            cw1.this.f24340i = nativeAdPrivate;
            cw1.this.f24332a.t();
        }
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    public final void a(@NotNull Context context, @NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        if (this.f24341j) {
            return;
        }
        this.f24339h = adResponse;
        C2105n4 h4 = this.f24332a.h();
        EnumC2082m4 adLoadingPhaseType = EnumC2082m4.f28846c;
        h4.getClass();
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        h4.a(adLoadingPhaseType, null);
        this.f24335d.a(adResponse, new b(), new a(this, context, adResponse));
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    public final Object a(ur1 ur1Var, Activity activity) {
        ur1 contentController = ur1Var;
        Intrinsics.checkNotNullParameter(contentController, "contentController");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Result.Companion companion = Result.Companion;
        Object m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(C2358y5.a()));
        C2360y7<String> c2360y7 = this.f24339h;
        f61 f61Var = this.f24340i;
        if (c2360y7 == null || f61Var == null) {
            return m243constructorimpl;
        }
        Object a4 = this.f24338g.a(activity, new C2353y0(new C2353y0.a(c2360y7, this.f24336e, contentController.i()).a(this.f24336e.n()).a(f61Var)));
        this.f24339h = null;
        this.f24340i = null;
        return a4;
    }
}
