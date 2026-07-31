package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class x82 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b92 f34497a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ew1 f34498b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final za2 f34499c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final w82 f34500d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Context f34501e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ x82(Context context) {
        this(context, r2, ew1.a.a(), new za2(), new w82());
        b92 b92Var = new b92(context);
        int i4 = ew1.f25476l;
    }

    public final void a() {
        za2 za2Var = this.f34499c;
        Context context = this.f34501e;
        za2Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (C2385z9.a(context) && this.f34498b.j() && this.f34500d.a(this.f34501e)) {
            this.f34497a.a();
        }
    }

    public x82(@NotNull Context context, @NotNull b92 toastPresenter, @NotNull ew1 sdkSettings, @NotNull za2 versionValidationNeedChecker, @NotNull w82 validationErrorIndicatorChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(toastPresenter, "toastPresenter");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(versionValidationNeedChecker, "versionValidationNeedChecker");
        Intrinsics.checkNotNullParameter(validationErrorIndicatorChecker, "validationErrorIndicatorChecker");
        this.f34497a = toastPresenter;
        this.f34498b = sdkSettings;
        this.f34499c = versionValidationNeedChecker;
        this.f34500d = validationErrorIndicatorChecker;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f34501e = applicationContext;
    }
}
