package com.yandex.div.core.actions;

import O1.AbstractC1086uf;
import W1.m;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.a;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivActionTypedUtilsKt {
    public static final void closeKeyboard(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        InputMethodManager inputMethodManager = (InputMethodManager) a.l(view.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
        }
    }

    @Nullable
    public static final Integer colorIntValue(@NotNull AbstractC1086uf abstractC1086uf, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(abstractC1086uf, "<this>");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        if (abstractC1086uf instanceof AbstractC1086uf.c) {
            return (Integer) ((AbstractC1086uf.c) abstractC1086uf).c().f8120a.evaluate(expressionResolver);
        }
        return null;
    }

    @Nullable
    public static final Double doubleValue(@NotNull AbstractC1086uf abstractC1086uf, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(abstractC1086uf, "<this>");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        if (abstractC1086uf instanceof AbstractC1086uf.g) {
            return Double.valueOf(((Number) ((AbstractC1086uf.g) abstractC1086uf).c().f7953a.evaluate(expressionResolver)).longValue());
        }
        if (abstractC1086uf instanceof AbstractC1086uf.h) {
            return (Double) ((AbstractC1086uf.h) abstractC1086uf).c().f2483a.evaluate(expressionResolver);
        }
        return null;
    }

    @NotNull
    public static final Object evaluate(@NotNull AbstractC1086uf abstractC1086uf, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(abstractC1086uf, "<this>");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        if (abstractC1086uf instanceof AbstractC1086uf.g) {
            return ((AbstractC1086uf.g) abstractC1086uf).c().f7953a.evaluate(expressionResolver);
        }
        if (abstractC1086uf instanceof AbstractC1086uf.i) {
            return ((AbstractC1086uf.i) abstractC1086uf).c().f5287a.evaluate(expressionResolver);
        }
        if (abstractC1086uf instanceof AbstractC1086uf.b) {
            return ((AbstractC1086uf.b) abstractC1086uf).c().f6746a.evaluate(expressionResolver);
        }
        if (abstractC1086uf instanceof AbstractC1086uf.c) {
            return ((AbstractC1086uf.c) abstractC1086uf).c().f8120a.evaluate(expressionResolver);
        }
        if (abstractC1086uf instanceof AbstractC1086uf.h) {
            return ((AbstractC1086uf.h) abstractC1086uf).c().f2483a.evaluate(expressionResolver);
        }
        if (abstractC1086uf instanceof AbstractC1086uf.j) {
            return ((AbstractC1086uf.j) abstractC1086uf).c().f6418a.evaluate(expressionResolver);
        }
        if (abstractC1086uf instanceof AbstractC1086uf.a) {
            return ((AbstractC1086uf.a) abstractC1086uf).c().f5571a.evaluate(expressionResolver);
        }
        if (abstractC1086uf instanceof AbstractC1086uf.f) {
            return ((AbstractC1086uf.f) abstractC1086uf).c().f4181a.evaluate(expressionResolver);
        }
        throw new m();
    }

    public static final void logError(@NotNull Div2View div2View, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(div2View, "<this>");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        div2View.getViewComponent$div_release().getErrorCollectors().getOrCreate(div2View.getDataTag(), div2View.getDivData()).logError(throwable);
    }

    public static final void logWarning(@NotNull Div2View div2View, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(div2View, "<this>");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        div2View.getViewComponent$div_release().getErrorCollectors().getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(throwable);
    }

    @Nullable
    public static final Long longValue(@NotNull AbstractC1086uf abstractC1086uf, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(abstractC1086uf, "<this>");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        if (abstractC1086uf instanceof AbstractC1086uf.g) {
            return (Long) ((AbstractC1086uf.g) abstractC1086uf).c().f7953a.evaluate(expressionResolver);
        }
        return null;
    }

    public static final void openKeyboard(@NotNull DivInputView divInputView) {
        Intrinsics.checkNotNullParameter(divInputView, "<this>");
        InputMethodManager inputMethodManager = (InputMethodManager) a.l(divInputView.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(divInputView, 1);
        }
    }
}
