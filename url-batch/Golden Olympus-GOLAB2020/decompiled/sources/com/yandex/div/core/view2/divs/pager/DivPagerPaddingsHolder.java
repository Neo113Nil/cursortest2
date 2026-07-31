package com.yandex.div.core.view2.divs.pager;

import O1.C0754c5;
import O1.E9;
import android.util.DisplayMetrics;
import android.view.View;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import j2.AbstractC3185a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivPagerPaddingsHolder {

    @Nullable
    private final Integer alignedBottom;

    @Nullable
    private final Integer alignedLeft;

    @Nullable
    private final Integer alignedRight;

    @Nullable
    private final Integer alignedTop;
    private final float bottom;
    private final float end;
    private final boolean hasRelativePaddings;
    private final float left;

    @NotNull
    private final DisplayMetrics metrics;

    @NotNull
    private final ExpressionResolver resolver;
    private final float right;
    private final float start;
    private final float top;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivPagerPaddingsHolder(@Nullable C0754c5 c0754c5, @NotNull ExpressionResolver resolver, @NotNull View parent, @NotNull DisplayMetrics metrics, boolean z4, @NotNull E9.c alignment) {
        boolean z5;
        Expression<Long> expression;
        Expression<Long> expression2;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.resolver = resolver;
        this.metrics = metrics;
        if ((c0754c5 != null ? c0754c5.f5854e : null) == null) {
            if ((c0754c5 != null ? c0754c5.f5851b : null) == null) {
                z5 = false;
                this.hasRelativePaddings = z5;
                if (z5) {
                    if (c0754c5 != null) {
                        expression = c0754c5.f5852c;
                    }
                    expression = null;
                } else if (ViewsKt.isLayoutRtl(parent)) {
                    if (c0754c5 != null) {
                        expression = c0754c5.f5851b;
                    }
                    expression = null;
                } else {
                    if (c0754c5 != null) {
                        expression = c0754c5.f5854e;
                    }
                    expression = null;
                }
                float padding = toPadding(expression);
                this.left = padding;
                float padding2 = toPadding(c0754c5 == null ? c0754c5.f5855f : null);
                this.top = padding2;
                if (z5) {
                    if (c0754c5 != null) {
                        expression2 = c0754c5.f5853d;
                    }
                    expression2 = null;
                } else if (ViewsKt.isLayoutRtl(parent)) {
                    if (c0754c5 != null) {
                        expression2 = c0754c5.f5854e;
                    }
                    expression2 = null;
                } else {
                    if (c0754c5 != null) {
                        expression2 = c0754c5.f5851b;
                    }
                    expression2 = null;
                }
                float padding3 = toPadding(expression2);
                this.right = padding3;
                float padding4 = toPadding(c0754c5 == null ? c0754c5.f5850a : null);
                this.bottom = padding4;
                this.start = z4 ? padding2 : ViewsKt.isLayoutRtl(parent) ? padding3 : padding;
                this.end = z4 ? padding4 : ViewsKt.isLayoutRtl(parent) ? padding : padding3;
                this.alignedLeft = (z4 || (alignment == E9.c.START && !ViewsKt.isLayoutRtl(parent)) || (alignment == E9.c.END && ViewsKt.isLayoutRtl(parent))) ? Integer.valueOf(AbstractC3185a.c(padding)) : null;
                this.alignedTop = (!z4 || alignment == E9.c.START) ? Integer.valueOf(AbstractC3185a.c(padding2)) : null;
                this.alignedRight = (z4 || (alignment == E9.c.START && ViewsKt.isLayoutRtl(parent)) || (alignment == E9.c.END && !ViewsKt.isLayoutRtl(parent))) ? Integer.valueOf(AbstractC3185a.c(padding3)) : null;
                this.alignedBottom = (!z4 || alignment == E9.c.END) ? Integer.valueOf(AbstractC3185a.c(padding4)) : null;
            }
        }
        z5 = true;
        this.hasRelativePaddings = z5;
        if (z5) {
        }
        float padding5 = toPadding(expression);
        this.left = padding5;
        float padding22 = toPadding(c0754c5 == null ? c0754c5.f5855f : null);
        this.top = padding22;
        if (z5) {
        }
        float padding32 = toPadding(expression2);
        this.right = padding32;
        float padding42 = toPadding(c0754c5 == null ? c0754c5.f5850a : null);
        this.bottom = padding42;
        this.start = z4 ? padding22 : ViewsKt.isLayoutRtl(parent) ? padding32 : padding5;
        this.end = z4 ? padding42 : ViewsKt.isLayoutRtl(parent) ? padding5 : padding32;
        this.alignedLeft = (z4 || (alignment == E9.c.START && !ViewsKt.isLayoutRtl(parent)) || (alignment == E9.c.END && ViewsKt.isLayoutRtl(parent))) ? Integer.valueOf(AbstractC3185a.c(padding5)) : null;
        this.alignedTop = (!z4 || alignment == E9.c.START) ? Integer.valueOf(AbstractC3185a.c(padding22)) : null;
        this.alignedRight = (z4 || (alignment == E9.c.START && ViewsKt.isLayoutRtl(parent)) || (alignment == E9.c.END && !ViewsKt.isLayoutRtl(parent))) ? Integer.valueOf(AbstractC3185a.c(padding32)) : null;
        this.alignedBottom = (!z4 || alignment == E9.c.END) ? Integer.valueOf(AbstractC3185a.c(padding42)) : null;
    }

    private final float toPadding(Expression<Long> expression) {
        if (expression != null) {
            return BaseDivViewExtensionsKt.dpToPxF(Long.valueOf(expression.evaluate(this.resolver).longValue()), this.metrics);
        }
        return 0.0f;
    }

    @Nullable
    public final Integer getAlignedBottom() {
        return this.alignedBottom;
    }

    @Nullable
    public final Integer getAlignedLeft() {
        return this.alignedLeft;
    }

    @Nullable
    public final Integer getAlignedRight() {
        return this.alignedRight;
    }

    @Nullable
    public final Integer getAlignedTop() {
        return this.alignedTop;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getStart() {
        return this.start;
    }

    public final float getTop() {
        return this.top;
    }
}
