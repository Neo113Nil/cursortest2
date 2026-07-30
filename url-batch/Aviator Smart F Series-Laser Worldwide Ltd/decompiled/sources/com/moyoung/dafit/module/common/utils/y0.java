package com.moyoung.dafit.module.common.utils;

import android.content.Context;
import android.media.AudioAttributes;
import android.os.Vibrator;

/* loaded from: classes4.dex */
public class y0 {
    private Vibrator vibrator;

    private static class b {
        private static final y0 INSTANCE = new y0();

        private b() {
        }
    }

    public static y0 getInstance() {
        return b.INSTANCE;
    }

    public void cancel() {
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
            this.vibrator = null;
        }
    }

    public void vibrate(Context context, long[] jArr, boolean z7) {
        if (this.vibrator == null) {
            this.vibrator = (Vibrator) context.getSystemService("vibrator");
        }
        this.vibrator.vibrate(jArr, z7 ? 1 : -1, new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
    }

    private y0() {
    }
}
