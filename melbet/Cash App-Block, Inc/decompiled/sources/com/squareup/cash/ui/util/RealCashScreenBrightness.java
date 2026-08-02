package com.squareup.cash.ui.util;

import android.app.Activity;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class RealCashScreenBrightness {
    public final Activity activity;

    public RealCashScreenBrightness(Activity activity) {
        this.activity = activity;
    }

    public final void setScreenBrightness(float f) {
        Activity activity = this.activity;
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.screenBrightness = f;
        activity.getWindow().setAttributes(attributes);
    }
}
