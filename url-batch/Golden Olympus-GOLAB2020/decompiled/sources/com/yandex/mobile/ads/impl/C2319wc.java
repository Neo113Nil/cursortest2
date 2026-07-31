package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.wc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2319wc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2319wc f33993a = new C2319wc();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f33994b = "ads_sdk";

    private C2319wc() {
    }

    public static void a(@NotNull C2366yd report) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(report, "report");
        try {
            Result.Companion companion = Result.Companion;
            AppMetricaLibraryAdapter.reportEvent(f33994b, report.a(), report.b());
            m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            ap0.b(new Object[0]);
        }
    }
}
