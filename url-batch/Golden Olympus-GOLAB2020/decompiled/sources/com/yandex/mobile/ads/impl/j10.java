package com.yandex.mobile.ads.impl;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.view2.Div2View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j10 {
    @NotNull
    public static final px1 a(@NotNull Div2View div2View) {
        Intrinsics.checkNotNullParameter(div2View, "<this>");
        DivActionHandler actionHandler = div2View.getActionHandler();
        px1 px1Var = actionHandler instanceof px1 ? (px1) actionHandler : null;
        if (px1Var == null) {
            px1Var = new px1(0);
        }
        div2View.setActionHandler(px1Var);
        return px1Var;
    }
}
