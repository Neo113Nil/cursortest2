package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.e7;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class MaxDebuggerTestModeNetworkActivity extends e7 {
    @Override // com.applovin.impl.e7, com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.a, me);
        return super.dispatchTouchEvent(me);
    }
}
