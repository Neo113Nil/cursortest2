package com.withpersona.sdk2.inquiry.steps.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;
import com.withpersona.sdk2.inquiry.resources.R$styleable;

/* loaded from: classes9.dex */
public final class ShadowedNestedScrollView extends NestedScrollView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowedNestedScrollView(Context context) {
        super(context);
        context.getClass();
    }

    @Override // android.view.View
    public final int getSolidColor() {
        Context context = getContext();
        context.getClass();
        return context.obtainStyledAttributes(null, R$styleable.Theme, 0, 0).getColor(25, -3355444);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowedNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowedNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
