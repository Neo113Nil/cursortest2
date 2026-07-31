package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.impl.C2376z0;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.m1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2079m1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f28824a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2147p0 f28825b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2055l1 f28826c;

    public /* synthetic */ C2079m1(C2286v2 c2286v2, C2360y7 c2360y7) {
        this(c2286v2, c2360y7, c2286v2.p().c(), new C2147p0(c2360y7, c2286v2), new C2055l1(c2286v2.p().e()));
    }

    @NotNull
    public final void a(@NotNull Context context, @NotNull Intent intent) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        long a4 = ci0.a();
        Intent a5 = this.f28826c.a(context, a4);
        C2353y0 a6 = this.f28825b.a(intent);
        int i4 = C2376z0.f35409d;
        C2376z0 a7 = C2376z0.a.a();
        a7.a(a4, a6);
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
            a7.a(a4);
            this.f28824a.reportError("Failed to launch AdActivity for result", d4);
        }
    }

    public C2079m1(@NotNull C2286v2 adConfiguration, @NotNull C2360y7<?> adResponse, @NotNull mp1 reporter, @NotNull C2147p0 activityResultAdDataCreator, @NotNull C2055l1 intentCreator) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(activityResultAdDataCreator, "activityResultAdDataCreator");
        Intrinsics.checkNotNullParameter(intentCreator, "intentCreator");
        this.f28824a = reporter;
        this.f28825b = activityResultAdDataCreator;
        this.f28826c = intentCreator;
    }
}
