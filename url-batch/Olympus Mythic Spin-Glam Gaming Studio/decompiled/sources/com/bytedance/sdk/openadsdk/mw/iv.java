package com.bytedance.sdk.openadsdk.mw;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* loaded from: classes3.dex */
public class iv {
    private final AudioManager zmn;
    private int fs = -1;
    private boolean zn = false;

    public iv(Context context) {
        this.zmn = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public int zmn() {
        return this.fs;
    }

    public void zmn(boolean z) {
        zmn(z, false);
    }

    public void zmn(boolean z, boolean z2) {
        if (this.zmn == null) {
            return;
        }
        int i = 0;
        if (z) {
            int nps = DeviceUtils.nps();
            if (nps != 0) {
                this.fs = nps;
            } else if (!z2) {
                return;
            }
            zmn(3, 0, 0);
            this.zn = true;
            return;
        }
        int i2 = this.fs;
        if (i2 == 0) {
            i2 = DeviceUtils.bvs() / 15;
        } else {
            if (i2 == -1) {
                if (!z2) {
                    return;
                } else {
                    i2 = DeviceUtils.bvs() / 15;
                }
            }
            this.fs = -1;
            zmn(3, i2, i);
            this.zn = true;
        }
        i = 1;
        this.fs = -1;
        zmn(3, i2, i);
        this.zn = true;
    }

    private void zmn(int i, int i2, int i3) {
        try {
            this.zmn.setStreamVolume(i, i2, i3);
        } catch (Throwable unused) {
        }
    }
}
