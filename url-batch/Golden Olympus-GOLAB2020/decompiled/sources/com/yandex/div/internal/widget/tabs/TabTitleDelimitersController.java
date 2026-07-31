package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class TabTitleDelimitersController {

    @NotNull
    private final Context context;

    @NotNull
    private final BaseIndicatorTabLayout.OvalIndicators indicators;

    @Nullable
    private Bitmap tabDelimiterBitmap;
    private int tabDelimiterHeight;
    private int tabDelimiterWidth;

    public TabTitleDelimitersController(@NotNull Context context, @NotNull BaseIndicatorTabLayout.OvalIndicators indicators) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        this.context = context;
        this.indicators = indicators;
    }

    private final void addDelimiters() {
        removeDelimiters();
        if (getHasTabDelimiters()) {
            int childCount = this.indicators.getChildCount();
            for (int i4 = 1; i4 < childCount; i4++) {
                this.indicators.addView(createDelimiterView(), (i4 * 2) - 1);
            }
            this.indicators.setContainsDelimiters(true);
        }
    }

    private final View createDelimiterView() {
        ImageView imageView = new ImageView(this.context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.tabDelimiterWidth, this.tabDelimiterHeight);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap(this.tabDelimiterBitmap);
        return imageView;
    }

    private final boolean getHasTabDelimiters() {
        return this.tabDelimiterBitmap != null;
    }

    private final void removeDelimiters() {
        if (this.indicators.hasDelimiters()) {
            for (int childCount = this.indicators.getChildCount() - 1; childCount > 0; childCount -= 2) {
                this.indicators.removeViewAt(childCount);
            }
        }
        this.indicators.setContainsDelimiters(false);
    }

    public final void tabAdded(int i4) {
        if (getHasTabDelimiters() && this.indicators.getChildCount() != 1) {
            if (i4 == 0) {
                this.indicators.addView(createDelimiterView(), 1);
            } else {
                this.indicators.addView(createDelimiterView(), i4);
            }
        }
    }

    public final void tabRemoved(int i4) {
        if (getHasTabDelimiters() && this.indicators.getChildCount() != 0) {
            if (i4 == 0) {
                this.indicators.removeViewAt(0);
            } else {
                this.indicators.removeViewAt(i4 - 1);
            }
        }
    }

    public final void updateTitleDelimiters(@NotNull Bitmap bitmap, int i4, int i5) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.tabDelimiterBitmap = bitmap;
        this.tabDelimiterHeight = i5;
        this.tabDelimiterWidth = i4;
        addDelimiters();
    }
}
