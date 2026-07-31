package com.ironsource.sdk.controller;

import android.os.Bundle;
import com.ironsource.b9;
import com.ironsource.sdk.utils.Logger;

/* loaded from: classes2.dex */
public class InterstitialActivity extends ControllerActivity {

    /* renamed from: r, reason: collision with root package name */
    private static final String f19094r = "InterstitialActivity";

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f19094r, "onCreate");
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        Logger.i(f19094r, b9.h.f15505t0);
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        Logger.i(f19094r, b9.h.f15507u0);
    }
}
