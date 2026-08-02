package com.google.android.libraries.onegoogle.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OverScrollControlledNestedScrollView extends NestedScrollView {
    public OverScrollControlledNestedScrollView(Context context) {
        super(context);
    }

    public OverScrollControlledNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OverScrollControlledNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
    }
}
