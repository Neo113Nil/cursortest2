package com.yandex.div.core;

import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.json.expressions.ExpressionResolver;

/* loaded from: classes2.dex */
public interface DivViewFacade {
    @NonNull
    ExpressionResolver getExpressionResolver();

    @NonNull
    View getView();

    void hideTooltip(@NonNull String str);

    void showTooltip(@NonNull String str, boolean z4);

    default void switchToState(long j4) {
        switchToState(j4, true);
    }

    void switchToState(long j4, boolean z4);

    void switchToState(@NonNull DivStatePath divStatePath, boolean z4);
}
