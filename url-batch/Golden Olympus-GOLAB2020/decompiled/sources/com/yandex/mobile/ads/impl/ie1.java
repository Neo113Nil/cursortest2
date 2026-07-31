package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ie1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zd1 f27161a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ae1 f27162b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final je1 f27163c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f27164d;

    public ie1(@NotNull Context context, @NotNull na2 verificationNotExecutedListener, @NotNull zd1 omSdkAdSessionProvider, @NotNull ae1 omSdkInitializer, @NotNull je1 omSdkUsageValidator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(verificationNotExecutedListener, "verificationNotExecutedListener");
        Intrinsics.checkNotNullParameter(omSdkAdSessionProvider, "omSdkAdSessionProvider");
        Intrinsics.checkNotNullParameter(omSdkInitializer, "omSdkInitializer");
        Intrinsics.checkNotNullParameter(omSdkUsageValidator, "omSdkUsageValidator");
        this.f27161a = omSdkAdSessionProvider;
        this.f27162b = omSdkInitializer;
        this.f27163c = omSdkUsageValidator;
        this.f27164d = context.getApplicationContext();
    }

    @Nullable
    public final he1 a(@NotNull List<la2> verifications) {
        Intrinsics.checkNotNullParameter(verifications, "verifications");
        je1 je1Var = this.f27163c;
        Context context = this.f27164d;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        if (!je1Var.a(context)) {
            return null;
        }
        ae1 ae1Var = this.f27162b;
        Context context2 = this.f27164d;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        ae1Var.a(context2);
        ln2 a4 = this.f27161a.a(verifications);
        if (a4 == null) {
            return null;
        }
        lv0 a5 = lv0.a(a4);
        Intrinsics.checkNotNullExpressionValue(a5, "createMediaEvents(...)");
        C2309w2 a6 = C2309w2.a(a4);
        Intrinsics.checkNotNullExpressionValue(a6, "createAdEvents(...)");
        return new he1(a4, a5, a6);
    }
}
