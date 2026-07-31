package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.impl.C2353y0;
import com.yandex.mobile.ads.impl.m91;
import com.yandex.mobile.ads.impl.od0;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bw1<T extends od0<T>> implements rc0<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yc0<T> f23951a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final s51 f23952b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final rt1 f23953c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final m91 f23954d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2286v2 f23955e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final i71 f23956f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final hd0 f23957g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private C2360y7<String> f23958h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private f61 f23959i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f23960j;

    public /* synthetic */ bw1(yc0 yc0Var, vu1 vu1Var) {
        this(yc0Var, vu1Var, new s51());
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    @Nullable
    public final String getAdInfo() {
        return this.f23952b.a(this.f23959i);
    }

    private final class a implements wq1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C2360y7<String> f23961a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f23962b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ bw1<T> f23963c;

        public a(bw1 bw1Var, @NotNull Context context, @NotNull C2360y7<String> adResponse) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            this.f23963c = bw1Var;
            this.f23961a = adResponse;
            this.f23962b = context.getApplicationContext();
        }

        @Override // com.yandex.mobile.ads.impl.wq1
        public final void a(@NotNull C1866d3 adRequestError) {
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            rt1 rt1Var = ((bw1) this.f23963c).f23953c;
            Context context = this.f23962b;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            rt1Var.a(context, this.f23961a, ((bw1) this.f23963c).f23956f);
            rt1 rt1Var2 = ((bw1) this.f23963c).f23953c;
            Context context2 = this.f23962b;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            rt1Var2.a(context2, this.f23961a, (j71) null);
        }

        @Override // com.yandex.mobile.ads.impl.wq1
        public final void a(@NotNull n61 nativeAdResponse) {
            Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
            j71 j71Var = new j71(this.f23961a, nativeAdResponse, ((bw1) this.f23963c).f23955e);
            rt1 rt1Var = ((bw1) this.f23963c).f23953c;
            Context context = this.f23962b;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            rt1Var.a(context, this.f23961a, ((bw1) this.f23963c).f23956f);
            rt1 rt1Var2 = ((bw1) this.f23963c).f23953c;
            Context context2 = this.f23962b;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            rt1Var2.a(context2, this.f23961a, j71Var);
        }
    }

    public bw1(@NotNull yc0<T> screenLoadController, @NotNull vu1 sdkEnvironmentModule, @NotNull s51 infoProvider) {
        Intrinsics.checkNotNullParameter(screenLoadController, "screenLoadController");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(infoProvider, "infoProvider");
        this.f23951a = screenLoadController;
        this.f23952b = infoProvider;
        Context k4 = screenLoadController.k();
        C2286v2 e4 = screenLoadController.e();
        this.f23955e = e4;
        this.f23956f = new i71(e4);
        C2105n4 h4 = screenLoadController.h();
        this.f23953c = new rt1(e4);
        this.f23954d = new m91(k4, sdkEnvironmentModule, e4, h4);
        this.f23957g = new hd0(sdkEnvironmentModule);
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23960j = true;
        this.f23958h = null;
        this.f23959i = null;
        this.f23954d.a();
        ap0.d(new Object[0]);
    }

    private final class b implements m91.b {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.m91.b
        public final void a(@NotNull C1866d3 adRequestError) {
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            if (((bw1) bw1.this).f23960j) {
                return;
            }
            ((bw1) bw1.this).f23959i = null;
            ((bw1) bw1.this).f23951a.b(adRequestError);
        }

        @Override // com.yandex.mobile.ads.impl.m91.b
        public final void a(@NotNull f61 nativeAdPrivate) {
            Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
            if (((bw1) bw1.this).f23960j) {
                return;
            }
            ((bw1) bw1.this).f23959i = nativeAdPrivate;
            ((bw1) bw1.this).f23951a.t();
        }
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    public final void a(@NotNull Context context, @NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        if (this.f23960j) {
            return;
        }
        this.f23958h = adResponse;
        C2105n4 h4 = this.f23951a.h();
        EnumC2082m4 adLoadingPhaseType = EnumC2082m4.f28846c;
        h4.getClass();
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        h4.a(adLoadingPhaseType, null);
        this.f23954d.a(adResponse, new b(), new a(this, context, adResponse));
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    @NotNull
    public final Object a(@NotNull T contentController, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(contentController, "contentController");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Result.Companion companion = Result.Companion;
        Object m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(C2358y5.a()));
        C2360y7<String> c2360y7 = this.f23958h;
        f61 f61Var = this.f23959i;
        if (c2360y7 == null || f61Var == null) {
            return m243constructorimpl;
        }
        Object a4 = this.f23957g.a(activity, new C2353y0(new C2353y0.a(c2360y7, this.f23955e, contentController.i()).a(this.f23955e.n()).a(f61Var)));
        this.f23958h = null;
        this.f23959i = null;
        return a4;
    }
}
