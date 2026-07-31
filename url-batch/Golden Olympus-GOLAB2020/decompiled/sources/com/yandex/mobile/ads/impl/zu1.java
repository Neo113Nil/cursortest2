package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.impl.od0;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zu1<T extends od0<T>> implements rc0<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yc0<T> f35783a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final rt1 f35784b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final dv1<av1> f35785c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private av1 f35786d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ zu1(yc0 yc0Var, vu1 vu1Var) {
        this(yc0Var, vu1Var, r3, r4, r5, new rt1(r3), new dv1(r3, r4, r5));
        C2286v2 e4 = yc0Var.e();
        jd0 jd0Var = new jd0();
        bv1 bv1Var = new bv1(yc0Var.k(), vu1Var, e4);
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    @Nullable
    public final String getAdInfo() {
        av1 av1Var = this.f35786d;
        if (av1Var != null) {
            return av1Var.e();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ap0.d(new Object[0]);
        this.f35785c.a();
        av1 av1Var = this.f35786d;
        if (av1Var != null) {
            av1Var.d();
        }
        this.f35786d = null;
    }

    public final class a implements ev1<av1> {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.ev1
        public final void a(av1 av1Var) {
            av1 ad = av1Var;
            Intrinsics.checkNotNullParameter(ad, "ad");
            ((zu1) zu1.this).f35786d = ad;
            ((zu1) zu1.this).f35783a.t();
        }

        @Override // com.yandex.mobile.ads.impl.ev1
        public final void a(@NotNull C1866d3 adFetchRequestError) {
            Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
            ((zu1) zu1.this).f35783a.b(adFetchRequestError);
        }
    }

    public zu1(@NotNull yc0<T> loadController, @NotNull vu1 sdkEnvironmentModule, @NotNull C2286v2 adConfiguration, @NotNull jd0 fullscreenAdSizeValidator, @NotNull bv1 fullscreenHtmlAdCreateController, @NotNull rt1 sdkAdapterReporter, @NotNull dv1<av1> htmlAdCreationHandler) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(fullscreenAdSizeValidator, "fullscreenAdSizeValidator");
        Intrinsics.checkNotNullParameter(fullscreenHtmlAdCreateController, "fullscreenHtmlAdCreateController");
        Intrinsics.checkNotNullParameter(sdkAdapterReporter, "sdkAdapterReporter");
        Intrinsics.checkNotNullParameter(htmlAdCreationHandler, "htmlAdCreationHandler");
        this.f35783a = loadController;
        this.f35784b = sdkAdapterReporter;
        this.f35785c = htmlAdCreationHandler;
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    public final void a(@NotNull Context context, @NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        C2105n4 h4 = this.f35783a.h();
        EnumC2082m4 enumC2082m4 = EnumC2082m4.f28846c;
        C2001ij.a(h4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
        this.f35784b.a(context, adResponse, (i71) null);
        this.f35784b.a(context, adResponse);
        this.f35785c.a(context, adResponse, new a());
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    @NotNull
    public final Object a(@NotNull T contentController, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(contentController, "contentController");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Result.Companion companion = Result.Companion;
        Object m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(C2358y5.a()));
        av1 av1Var = this.f35786d;
        if (av1Var == null) {
            return m243constructorimpl;
        }
        Object a4 = av1Var.a(activity, contentController.i());
        this.f35786d = null;
        return a4;
    }
}
