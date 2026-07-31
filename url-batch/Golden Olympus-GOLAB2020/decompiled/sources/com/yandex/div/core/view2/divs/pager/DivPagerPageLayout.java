package com.yandex.div.core.view2.divs.pager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.core.widget.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class DivPagerPageLayout extends DivViewWrapper {

    @NotNull
    private final Function0<Boolean> isHorizontal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivPagerPageLayout(@NotNull Context context, @NotNull Function0<Boolean> isHorizontal) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isHorizontal, "isHorizontal");
        this.isHorizontal = isHorizontal;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    private final int getMinimumSize(int i4) {
        if (ViewsKt.isUnspecified(i4)) {
            return 0;
        }
        return View.MeasureSpec.getSize(i4);
    }

    private final int getSpec(int i4, int i5, boolean z4) {
        return (z4 || i4 == -1 || i4 == -3) ? i5 : ViewsKt.makeUnspecifiedSpec();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @Nullable View view, long j4) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (view != null && view.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(view, canvas);
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (getChildCount() == 0) {
            super.onMeasure(i4, i5);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getChildAt(0).getLayoutParams();
        boolean booleanValue = ((Boolean) this.isHorizontal.invoke()).booleanValue();
        if (booleanValue) {
            setMinimumHeight(getMinimumSize(i5));
        } else {
            setMinimumWidth(getMinimumSize(i4));
        }
        super.onMeasure(getSpec(layoutParams.width, i4, booleanValue), getSpec(layoutParams.height, i5, !booleanValue));
    }
}
