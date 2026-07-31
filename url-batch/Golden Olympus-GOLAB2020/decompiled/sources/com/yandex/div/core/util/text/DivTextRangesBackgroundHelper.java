package com.yandex.div.core.util.text;

import O1.AbstractC0853he;
import W1.h;
import W1.i;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.view.View;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivTextRangesBackgroundHelper {

    @NotNull
    private final h cloudBackgroundRenderer$delegate;

    @NotNull
    private final h multiLineRenderer$delegate;

    @NotNull
    private final ExpressionResolver resolver;

    @NotNull
    private final h singleLineRenderer$delegate;

    @NotNull
    private ArrayList<DivBackgroundSpan> spans;

    @NotNull
    private final View view;

    public DivTextRangesBackgroundHelper(@NotNull View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        this.view = view;
        this.resolver = resolver;
        this.spans = new ArrayList<>();
        this.singleLineRenderer$delegate = i.b(new DivTextRangesBackgroundHelper$singleLineRenderer$2(this));
        this.multiLineRenderer$delegate = i.b(new DivTextRangesBackgroundHelper$multiLineRenderer$2(this));
        this.cloudBackgroundRenderer$delegate = i.b(new DivTextRangesBackgroundHelper$cloudBackgroundRenderer$2(this));
    }

    private final CloudTextRangeBackgroundRenderer getCloudBackgroundRenderer() {
        return (CloudTextRangeBackgroundRenderer) this.cloudBackgroundRenderer$delegate.getValue();
    }

    private final DivTextRangesBackgroundRenderer getMultiLineRenderer() {
        return (DivTextRangesBackgroundRenderer) this.multiLineRenderer$delegate.getValue();
    }

    private final DivTextRangesBackgroundRenderer getSingleLineRenderer() {
        return (DivTextRangesBackgroundRenderer) this.singleLineRenderer$delegate.getValue();
    }

    public final boolean addBackgroundSpan$div_release(@NotNull DivBackgroundSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return this.spans.add(span);
    }

    public final void draw(@NotNull Canvas canvas, @NotNull Spanned text, @NotNull Layout layout) {
        Layout layout2 = layout;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(layout, "layout");
        ArrayList<DivBackgroundSpan> arrayList = this.spans;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            DivBackgroundSpan divBackgroundSpan = arrayList.get(i4);
            int spanStart = text.getSpanStart(divBackgroundSpan);
            int spanEnd = text.getSpanEnd(divBackgroundSpan);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            int primaryHorizontal = (int) layout.getPrimaryHorizontal(spanStart);
            int primaryHorizontal2 = (int) layout.getPrimaryHorizontal(spanEnd);
            if (divBackgroundSpan.getBackground() instanceof AbstractC0853he.a) {
                getCloudBackgroundRenderer().draw(canvas, layout2, lineForOffset, lineForOffset2, primaryHorizontal, primaryHorizontal2, divBackgroundSpan.getBorder(), divBackgroundSpan.getBackground());
            } else {
                (lineForOffset == lineForOffset2 ? getSingleLineRenderer() : getMultiLineRenderer()).draw(canvas, layout, lineForOffset, lineForOffset2, primaryHorizontal, primaryHorizontal2, divBackgroundSpan.getBorder(), divBackgroundSpan.getBackground());
            }
            layout2 = layout;
            i4 = i5;
        }
    }

    @NotNull
    public final ExpressionResolver getResolver() {
        return this.resolver;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    public final boolean hasBackgroundSpan$div_release() {
        return !this.spans.isEmpty();
    }

    public final boolean hasSameSpan$div_release(@NotNull CharSequence text, @NotNull DivBackgroundSpan backgroundSpan, int i4, int i5) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(backgroundSpan, "backgroundSpan");
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return false;
        }
        ArrayList<DivBackgroundSpan> arrayList = this.spans;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            DivBackgroundSpan divBackgroundSpan = arrayList.get(i6);
            i6++;
            DivBackgroundSpan divBackgroundSpan2 = divBackgroundSpan;
            if (Intrinsics.areEqual(divBackgroundSpan2.getBorder(), backgroundSpan.getBorder()) && Intrinsics.areEqual(divBackgroundSpan2.getBackground(), backgroundSpan.getBackground()) && i5 == spannable.getSpanEnd(divBackgroundSpan2) && i4 == spannable.getSpanStart(divBackgroundSpan2)) {
                return true;
            }
        }
        return false;
    }

    public final void invalidateSpansCache$div_release() {
        this.spans.clear();
    }
}
