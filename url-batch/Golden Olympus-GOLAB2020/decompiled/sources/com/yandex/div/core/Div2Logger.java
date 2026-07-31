package com.yandex.div.core;

import O1.C0892k0;
import O1.C0970o6;
import O1.C1165z4;
import O1.E9;
import O1.M4;
import O1.Wf;
import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;

/* loaded from: classes2.dex */
public interface Div2Logger {
    public static final Div2Logger STUB = new Div2Logger() { // from class: com.yandex.div.core.Div2Logger.1
    };

    default void logClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull C0892k0 c0892k0) {
    }

    default void logDoubleClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull C0892k0 c0892k0) {
    }

    default void logGalleryScroll(Div2View div2View) {
    }

    default void logLongClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull C0892k0 c0892k0) {
    }

    default void logSliderDrag(Div2View div2View, View view, Float f4) {
    }

    default void logTabPageChanged(Div2View div2View, int i4) {
    }

    default void logTabTitlesScroll(Div2View div2View) {
    }

    default void logViewDisappeared(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull M4 m4) {
    }

    default void logViewShown(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull Wf wf) {
    }

    default void logClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull C0892k0 c0892k0, @NonNull String str) {
        logClick(div2View, expressionResolver, view, c0892k0);
    }

    default void logDoubleClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull C0892k0 c0892k0, @NonNull String str) {
        logDoubleClick(div2View, expressionResolver, view, c0892k0);
    }

    default void logLongClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull C0892k0 c0892k0, @NonNull String str) {
        logLongClick(div2View, expressionResolver, view, c0892k0);
    }

    default void logViewDisappeared(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull M4 m4, @NonNull String str) {
        logViewDisappeared(div2View, expressionResolver, view, m4);
    }

    default void logViewShown(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull Wf wf, @NonNull String str) {
        logViewShown(div2View, expressionResolver, view, wf);
    }

    default void logTrigger(Div2View div2View, C0892k0 c0892k0) {
    }

    default void logBindingResult(@NonNull Div2View div2View, C1165z4 c1165z4, C1165z4 c1165z42, @NonNull String str, String str2) {
    }

    default void logFocusChanged(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull C0892k0 c0892k0, boolean z4) {
    }

    default void logHoverChanged(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull C0892k0 c0892k0, boolean z4) {
    }

    default void logPagerChangePage(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull E9 e9, int i4, @NonNull String str) {
    }

    default void logPopupMenuItemClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, int i4, String str, @NonNull C0892k0 c0892k0) {
    }

    default void logPressChanged(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull C0892k0 c0892k0, boolean z4) {
    }

    default void logActiveTabTitleClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, int i4, @NonNull C0892k0 c0892k0) {
    }

    default void logImeEnter(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull C0892k0 c0892k0) {
    }

    default void logSwipedAway(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull C0892k0 c0892k0) {
    }

    default void logGalleryCompleteScroll(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull C0970o6 c0970o6, int i4, int i5, @NonNull String str) {
    }
}
