package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.core.util.text.DivBackgroundSpan;
import com.yandex.div.core.util.text.DivTextRangesBackgroundHelper;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivLineHeightTextViewKt {
    public static final boolean hasBackgroundSpan(@NotNull DivLineHeightTextView divLineHeightTextView, @NotNull CharSequence text, @NotNull DivBackgroundSpan backgroundSpan, int i4, int i5, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(divLineHeightTextView, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(backgroundSpan, "backgroundSpan");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (divLineHeightTextView.getTextRoundedBgHelper$div_release() == null) {
            divLineHeightTextView.setTextRoundedBgHelper$div_release(new DivTextRangesBackgroundHelper(divLineHeightTextView, resolver));
            return false;
        }
        DivTextRangesBackgroundHelper textRoundedBgHelper$div_release = divLineHeightTextView.getTextRoundedBgHelper$div_release();
        Intrinsics.checkNotNull(textRoundedBgHelper$div_release);
        return textRoundedBgHelper$div_release.hasSameSpan$div_release(text, backgroundSpan, i4, i5);
    }
}
