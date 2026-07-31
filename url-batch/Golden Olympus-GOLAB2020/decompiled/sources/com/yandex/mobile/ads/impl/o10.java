package com.yandex.mobile.ads.impl;

import O1.C1039s4;
import android.content.Context;
import android.view.View;
import com.ironsource.b9;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o10 implements DivCustomContainerViewAdapter {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(@NotNull View view, @NotNull C1039s4 div, @NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Intrinsics.checkNotNullParameter(path, "path");
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    @NotNull
    public final View createView(@NotNull C1039s4 div, @NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Intrinsics.checkNotNullParameter(path, "path");
        Context context = divView.getContext();
        Intrinsics.checkNotNull(context);
        return new CustomizableMediaView(context);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Intrinsics.areEqual(b9.h.f15446I0, type);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    @NotNull
    public /* bridge */ /* synthetic */ DivPreloader.PreloadReference preload(@NotNull C1039s4 c1039s4, @NotNull DivPreloader.Callback callback) {
        return super.preload(c1039s4, callback);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(@NotNull View view, @NotNull C1039s4 div) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
    }
}
