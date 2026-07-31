package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ds0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bs0 f24743a = new bs0();

    @Nullable
    public final String a(@NotNull Context context) {
        Object m243constructorimpl;
        String c4;
        LocaleList applicationLocales;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.Companion;
            if (Build.VERSION.SDK_INT >= 33) {
                Object systemService = context.getSystemService(CommonUrlParts.LOCALE);
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.LocaleManager");
                applicationLocales = B1.a(systemService).getApplicationLocales();
                Intrinsics.checkNotNullExpressionValue(applicationLocales, "getApplicationLocales(...)");
                if (applicationLocales.isEmpty()) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Locale locale = context.getResources().getConfiguration().locale;
                    bs0 bs0Var = this.f24743a;
                    Intrinsics.checkNotNull(locale);
                    bs0Var.getClass();
                    c4 = bs0.a(locale);
                } else {
                    bs0 bs0Var2 = this.f24743a;
                    Locale locale2 = applicationLocales.get(0);
                    Intrinsics.checkNotNullExpressionValue(locale2, "get(...)");
                    bs0Var2.getClass();
                    c4 = bs0.a(locale2);
                }
            } else {
                c4 = c(context);
            }
            m243constructorimpl = Result.m243constructorimpl(c4);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        return (String) m243constructorimpl;
    }

    @Nullable
    public final List<String> b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.Companion;
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            Intrinsics.checkNotNullExpressionValue(locales, "getLocales(...)");
            List createListBuilder = CollectionsKt.createListBuilder();
            int size = locales.size();
            for (int i4 = 0; i4 < size; i4++) {
                bs0 bs0Var = this.f24743a;
                Locale locale = locales.get(i4);
                Intrinsics.checkNotNullExpressionValue(locale, "get(...)");
                bs0Var.getClass();
                createListBuilder.add(bs0.a(locale));
            }
            return CollectionsKt.build(createListBuilder);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            if (Result.m244isFailureimpl(m243constructorimpl)) {
                m243constructorimpl = null;
            }
            return (List) m243constructorimpl;
        }
    }

    @NotNull
    public final String c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Locale locale = context.getResources().getConfiguration().locale;
        bs0 bs0Var = this.f24743a;
        Intrinsics.checkNotNull(locale);
        bs0Var.getClass();
        return bs0.a(locale);
    }
}
