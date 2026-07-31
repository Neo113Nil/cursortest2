package com.yandex.mobile.ads.impl;

import O1.C1039s4;
import android.R;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r10 implements DivCustomContainerViewAdapter {
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
        int i4;
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Intrinsics.checkNotNullParameter(path, "path");
        String str = null;
        ProgressBar progressBar = new ProgressBar(divView.getContext(), null, R.attr.progressBarStyleHorizontal);
        JSONObject jSONObject = div.f7833i;
        if (jSONObject == null || !jSONObject.has("progress_color")) {
            str = "#000000";
        } else {
            JSONObject jSONObject2 = div.f7833i;
            if (jSONObject2 != null) {
                str = jSONObject2.getString("progress_color");
            }
        }
        try {
            i4 = Color.parseColor(str);
        } catch (Throwable unused) {
            i4 = -16777216;
        }
        Drawable drawable = progressBar.getContext().getDrawable(com.yandex.mobile.ads.R.drawable.monetization_ads_internal_circular_close_progress);
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i4, PorterDuff.Mode.SRC_IN));
        }
        progressBar.setProgressDrawable(drawable);
        return progressBar;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Intrinsics.areEqual(type, "close_progress_view");
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
