package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.m3;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes11.dex */
public final class MaxDebuggerActivity extends m3 {
    @Override // com.applovin.impl.m3, com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.a, me);
        return super.dispatchTouchEvent(me);
    }
}
