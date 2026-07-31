package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public abstract class k2 extends b1 {
    public static final a e = new a(null);
    public final Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(Context context, AttributeSet attributeSet, int i, Function0 function0) {
        super(context, attributeSet, i, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = function0;
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        setPadding(a(16), a(4), a(16), a(4));
    }

    public abstract void a(il ilVar, gl glVar);

    public abstract void a(t5 t5Var);

    @Override // com.chartboost.sdk.impl.b1, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.chartboost.sdk.impl.b1, androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setCustomContentDescription(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        setContentDescription(description);
    }

    @Nullable
    public final Function0 getOnCtaClicked() {
        return this.d;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
