package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.ironsource.b9;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f20 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d20 f25588a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c30 f25589b;

    public f20(@NotNull d20 actionHandler, @NotNull c30 divViewCreator) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(divViewCreator, "divViewCreator");
        this.f25588a = actionHandler;
        this.f25589b = divViewCreator;
    }

    @NotNull
    public final Div2View a(@NotNull Context context, @NotNull c20 action) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        DivConfiguration build = new DivConfiguration.Builder(new y10(context)).actionHandler(this.f25588a).typefaceProvider(new b30(context)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.f25589b.getClass();
        Div2View a4 = c30.a(context, build, null);
        a4.setData(action.c().b(), action.c().c());
        cf1 b4 = xr.b(context);
        if (b4 == cf1.f24194e) {
            lowerCase = "PORTRAIT".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = b4.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        a4.setVariable(b9.h.f15492n, lowerCase);
        return a4;
    }
}
