package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z82 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final za2 f35509a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y82 f35510b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f35511c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a92 f35512d;

    public /* synthetic */ z82(Context context) {
        this(context, new za2(), new y82());
    }

    public final void a() {
        za2 za2Var = this.f35509a;
        Context context = this.f35511c;
        za2Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (C2385z9.a(context) && this.f35510b.a(this.f35511c)) {
            this.f35512d.getClass();
            a92.b();
        }
    }

    public z82(@NotNull Context context, @NotNull za2 versionValidationNeedChecker, @NotNull y82 validationErrorLogChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(versionValidationNeedChecker, "versionValidationNeedChecker");
        Intrinsics.checkNotNullParameter(validationErrorLogChecker, "validationErrorLogChecker");
        this.f35509a = versionValidationNeedChecker;
        this.f35510b = validationErrorLogChecker;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f35511c = applicationContext;
        this.f35512d = new a92();
    }
}
