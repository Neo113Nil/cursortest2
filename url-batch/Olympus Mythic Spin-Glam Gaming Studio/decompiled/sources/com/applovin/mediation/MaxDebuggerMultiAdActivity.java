package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.mediation.debugger.ui.testmode.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public final class MaxDebuggerMultiAdActivity extends a {
    @Override // com.applovin.impl.mediation.debugger.ui.testmode.a, com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.a, me);
        return super.dispatchTouchEvent(me);
    }
}
