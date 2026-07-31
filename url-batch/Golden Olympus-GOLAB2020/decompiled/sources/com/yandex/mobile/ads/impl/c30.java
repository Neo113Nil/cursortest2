package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.lifecycle.InterfaceC1354u;
import com.yandex.div.R$style;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c30 {
    @NotNull
    public static Div2View a(@NotNull Context context, @NotNull DivConfiguration divConfiguration, @Nullable InterfaceC1354u interfaceC1354u) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(divConfiguration, "divConfiguration");
        return new Div2View(new Div2Context(new ContextThemeWrapper(context, R$style.Div), divConfiguration, 0, interfaceC1354u, 4, null), null, 0, 6, null);
    }
}
