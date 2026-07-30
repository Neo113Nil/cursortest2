package com.moyoung.dafit.module.common.utils;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public class b0 {
    private static final int MIN_CLICK_DELAY_TIME = 400;
    private long lastClickTime = 0;

    public boolean isDoubleClick() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.lastClickTime < 400) {
            com.orhanobut.logger.f.d("Double Click");
            return true;
        }
        this.lastClickTime = uptimeMillis;
        return false;
    }
}
