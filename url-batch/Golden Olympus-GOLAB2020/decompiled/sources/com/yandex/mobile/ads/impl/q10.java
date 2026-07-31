package com.yandex.mobile.ads.impl;

import O1.C1039s4;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class q10 implements DivCustomContainerViewAdapter {
    private static Integer a(C1039s4 c1039s4, String str) {
        Object m243constructorimpl;
        JSONObject jSONObject = c1039s4.f7833i;
        String optString = jSONObject != null ? jSONObject.optString(str) : null;
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(Integer.valueOf(Color.parseColor(optString)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        return (Integer) (Result.m244isFailureimpl(m243constructorimpl) ? null : m243constructorimpl);
    }

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
        ProgressBar progressBar = new ProgressBar(divView.getContext(), null, R.attr.progressBarStyleHorizontal);
        Integer a4 = a(div, "progress_color");
        if (a4 != null) {
            progressBar.setProgressTintList(ColorStateList.valueOf(a4.intValue()));
        }
        Integer a5 = a(div, "background_color");
        if (a5 != null) {
            progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(a5.intValue()));
        }
        return progressBar;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public abstract /* synthetic */ boolean isCustomTypeSupported(@NotNull String str);

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
