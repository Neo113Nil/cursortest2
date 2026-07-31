package com.yandex.div.core.widget;

import android.os.Build;
import android.widget.TextView;
import com.yandex.div.internal.widget.TextViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class FixedLineHeightHelper {
    private int lineHeight;
    private int textPaddingBottom;
    private int textPaddingTop;

    @NotNull
    private final TextView view;

    public FixedLineHeightHelper(@NotNull TextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.lineHeight = -1;
        view.setIncludeFontPadding(false);
    }

    private final void applyLineHeight(int i4) {
        if (i4 == -1) {
            resetLineHeight();
            return;
        }
        int fontHeightInt = i4 - TextViewsKt.getFontHeightInt(this.view);
        if (fontHeightInt < 0) {
            int i5 = fontHeightInt / 2;
            this.textPaddingTop = i5;
            this.textPaddingBottom = fontHeightInt - i5;
        } else {
            int i6 = fontHeightInt / 2;
            this.textPaddingBottom = i6;
            this.textPaddingTop = fontHeightInt - i6;
        }
        this.view.setLineSpacing(i4 - TextViewsKt.getFontHeight(this.view), 1.0f);
        setFallbackLineSpacing(false);
    }

    private final void resetLineHeight() {
        this.textPaddingTop = 0;
        this.textPaddingBottom = 0;
        this.view.setLineSpacing(0.0f, 1.0f);
        setFallbackLineSpacing(true);
    }

    private final void setFallbackLineSpacing(boolean z4) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.view.setFallbackLineSpacing(z4);
        }
    }

    public final int getExtraPaddingBottom() {
        return this.textPaddingBottom;
    }

    public final int getExtraPaddingTop() {
        return this.textPaddingTop;
    }

    public final int getLineHeight() {
        return this.lineHeight;
    }

    public final void onFontSizeChanged() {
        applyLineHeight(this.lineHeight);
    }

    public final void setLineHeight(int i4) {
        if (this.lineHeight == i4) {
            return;
        }
        this.lineHeight = i4;
        applyLineHeight(i4);
    }
}
