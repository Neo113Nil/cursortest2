package com.yandex.div.internal.widget;

import android.os.Build;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class TextViewsKt {
    public static final boolean checkHyphenationSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final float getFontHeight(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return textView.getPaint().getFontMetrics(null);
    }

    public static final int getFontHeightInt(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return textView.getPaint().getFontMetricsInt(null);
    }

    public static final boolean isHyphenationEnabled(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return checkHyphenationSupported() && textView.getHyphenationFrequency() != 0;
    }

    public static final int lineAt(@NotNull TextView textView, int i4) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (textView.getLayout() == null) {
            return 0;
        }
        return textView.getLayout().getLineForVertical(i4);
    }

    public static final int textHeight(@NotNull TextView textView, int i4) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (textView.getLayout() == null) {
            return 0;
        }
        return i4 <= 0 ? textView.getLayout().getHeight() : i4 > textView.getLayout().getLineCount() ? textView.getLayout().getHeight() : textView.getLayout().getLineTop(i4) - textView.getLayout().getLineTop(0);
    }
}
