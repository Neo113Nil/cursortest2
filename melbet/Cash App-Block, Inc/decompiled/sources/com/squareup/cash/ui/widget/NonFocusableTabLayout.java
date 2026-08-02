package com.squareup.cash.ui.widget;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes4.dex */
public final class NonFocusableTabLayout extends TabLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonFocusableTabLayout(Context context) {
        super(context, null);
        context.getClass();
        setImportantForAccessibility(4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return false;
    }
}
