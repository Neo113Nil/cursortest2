package com.crrepa.band.my.ble.band.cmd.parser;

import com.crrepa.band.my.model.db.OnceHeartRate;
import java.util.Date;

/* loaded from: classes2.dex */
public class b {
    private static final int HEART_RATE_MAX = 250;
    private static final int HEART_RATE_MIN = 10;

    private b() {
    }

    public static OnceHeartRate parseOnceHeartRate(int i8) {
        if (i8 <= 10 || 250 <= i8) {
            return null;
        }
        OnceHeartRate onceHeartRate = new OnceHeartRate();
        onceHeartRate.setDate(new Date());
        onceHeartRate.setHeartRate(Integer.valueOf(i8));
        return onceHeartRate;
    }
}
