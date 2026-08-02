package com.squareup.util.android;

import android.view.View;
import android.view.WindowManager;
import androidx.core.view.insets.SystemBarStateMonitor;
import com.squareup.cash.arcade.treehouse.RadioBinding$value$1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final class Views$waitForMeasure$attachListener$1$listener$1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ Object $callback;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_waitForMeasure;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ Views$waitForMeasure$attachListener$1$listener$1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.$this_waitForMeasure = obj;
        this.this$0 = obj2;
        this.$callback = obj3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.$r8$classId;
        Object obj = this.$callback;
        Object obj2 = this.this$0;
        Object obj3 = this.$this_waitForMeasure;
        switch (i9) {
            case 0:
                view.getClass();
                int i10 = i3 - i;
                int i11 = i4 - i2;
                if (i10 != 0 || i11 != 0) {
                    view.removeOnLayoutChangeListener(this);
                    ((View) obj3).removeOnAttachStateChangeListener((SystemBarStateMonitor.AnonymousClass3) ((SystemBarStateMonitor.AnonymousClass3) obj2).val$group);
                    ((Function3) obj).invoke(view, Integer.valueOf(i10), Integer.valueOf(i11));
                    break;
                }
            default:
                view.getClass();
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) obj3;
                layoutParams.width = view.getWidth();
                layoutParams.height = view.getHeight();
                ((WindowManager) obj2).updateViewLayout((RadioBinding$value$1) obj, layoutParams);
                break;
        }
    }
}
