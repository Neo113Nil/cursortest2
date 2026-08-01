package com.bytedance.sdk.openadsdk.Mxy;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* compiled from: VolumeChangeObserver.java */
/* loaded from: classes2.dex */
public class so {
    private final AudioManager pvs;
    private int icD = -1;
    private boolean vG = false;

    public so(Context context) {
        this.pvs = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public int pvs() {
        return this.icD;
    }

    public void pvs(int i) {
        this.icD = i;
    }

    public boolean icD() {
        if (!this.vG) {
            return false;
        }
        this.vG = false;
        return true;
    }

    public void pvs(boolean z) {
        pvs(z, false);
    }

    public void pvs(boolean z, boolean z2) {
        if (this.pvs == null) {
            return;
        }
        int i = 0;
        if (z) {
            int yiw = DeviceUtils.yiw();
            if (yiw != 0) {
                this.icD = yiw;
            }
            pvs(3, 0, 0);
            this.vG = true;
            return;
        }
        int i2 = this.icD;
        if (i2 == 0) {
            i2 = DeviceUtils.Mxy() / 15;
        } else {
            if (i2 == -1) {
                if (!z2) {
                    return;
                } else {
                    i2 = DeviceUtils.Mxy() / 15;
                }
            }
            this.icD = -1;
            pvs(3, i2, i);
            this.vG = true;
        }
        i = 1;
        this.icD = -1;
        pvs(3, i2, i);
        this.vG = true;
    }

    private void pvs(int i, int i2, int i3) {
        try {
            this.pvs.setStreamVolume(i, i2, i3);
        } catch (Throwable unused) {
        }
    }
}
