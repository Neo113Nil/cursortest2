package com.baidu.platform.comapi.walknavi.segmentbrowse.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public class TestLinearLayout extends LinearLayout {
    public TestLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            getChildAt(i8).dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public TestLinearLayout(Context context) {
        super(context);
    }
}
