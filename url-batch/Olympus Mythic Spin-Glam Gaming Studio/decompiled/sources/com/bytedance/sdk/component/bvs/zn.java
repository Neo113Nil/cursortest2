package com.bytedance.sdk.component.bvs;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes3.dex */
public abstract class zn implements View.OnTouchListener {
    private int fs = -1;
    private ViewConfiguration zmn;

    abstract void zmn(View.OnTouchListener onTouchListener);

    boolean zmn(float f, float f2, float f3, float f4, Context context) {
        if (this.zmn == null) {
            this.zmn = ViewConfiguration.get(context);
        }
        if (this.fs == -1) {
            this.fs = this.zmn.getScaledTouchSlop();
        }
        return Math.abs(f - f3) <= ((float) this.fs) && Math.abs(f2 - f4) <= ((float) this.fs);
    }
}
