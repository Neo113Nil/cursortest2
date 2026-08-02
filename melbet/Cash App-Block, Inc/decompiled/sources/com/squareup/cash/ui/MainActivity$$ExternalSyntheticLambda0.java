package com.squareup.cash.ui;

import android.view.Window;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MainActivity f$0;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda0(MainActivity mainActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MainActivity mainActivity = this.f$0;
        switch (i) {
            case 0:
                int i2 = MainActivity.$r8$clinit;
                return ((SandboxedActivityContext) mainActivity.getSandboxedActivityContextFlow().getValue()).imageLoader;
            default:
                Window window = mainActivity.getWindow();
                window.getClass();
                return window;
        }
    }
}
