package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.impl.C2376z0;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hd0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f26714a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gd0 f26715b;

    public /* synthetic */ hd0(vu1 vu1Var) {
        this(vu1Var, vu1Var.c(), new gd0(vu1Var.e()));
    }

    @NotNull
    public final Object a(@NotNull Context context, @NotNull C2353y0 adActivityData) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adActivityData, "adActivityData");
        long a4 = ci0.a();
        Intent a5 = this.f26715b.a(context, a4);
        int i4 = C2376z0.f35409d;
        C2376z0 a6 = C2376z0.a.a();
        a6.a(a4, adActivityData);
        try {
            Result.Companion companion = Result.Companion;
            context.startActivity(a5);
            m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 != null) {
            a6.a(a4);
            po0.a("Failed to show Fullscreen Ad. Exception: " + d4, new Object[0]);
            this.f26714a.reportError("Failed to show Fullscreen Ad", d4);
        }
        return m243constructorimpl;
    }

    public hd0(@NotNull vu1 sdkEnvironmentModule, @NotNull mp1 reporter, @NotNull gd0 intentCreator) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(intentCreator, "intentCreator");
        this.f26714a = reporter;
        this.f26715b = intentCreator;
    }
}
