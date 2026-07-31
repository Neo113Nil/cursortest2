package com.yandex.mobile.ads.impl;

import android.app.Activity;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2170q0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2192r0 f30628a;

    public /* synthetic */ C2170q0(mp1 mp1Var) {
        this(mp1Var, new C2192r0(mp1Var));
    }

    public final void a(@NotNull Activity activity, @NotNull C2353y0 adActivityData) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adActivityData, "adActivityData");
        if (adActivityData.a() == null) {
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            activity.startActivityForResult(adActivityData.a(), 0);
            Unit unit = Unit.f41027a;
            this.f30628a.a(adActivityData);
            activity.finish();
            m243constructorimpl = Result.m243constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 != null) {
            this.f30628a.a(d4);
        }
    }

    public C2170q0(@NotNull mp1 reporter, @NotNull C2192r0 activityResultReporter) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(activityResultReporter, "activityResultReporter");
        this.f30628a = activityResultReporter;
    }
}
