package com.bytedance.sdk.openadsdk.component.hhw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public class fs implements Handler.Callback {
    private final com.bytedance.sdk.openadsdk.component.zg.zmn fs;
    private long iv;
    private boolean klz;
    private boolean nps;
    private long rc;
    private zmn zn;
    private Handler zmn = new Handler(Looper.myLooper(), this);
    private int fb = 0;
    private int btk = 5;
    private int hhw = 0;
    private final int zg = 1000;
    private int bvs = 1000;

    public fs(com.bytedance.sdk.openadsdk.component.zg.zmn zmnVar) {
        this.fs = zmnVar;
    }

    public void zmn(int i) {
        this.fb = i;
        int i2 = this.btk - i;
        this.fs.fs(i2 * 1000);
        boolean z = true;
        if (i <= 0) {
            zmn zmnVar = this.zn;
            if (zmnVar != null && !this.nps) {
                zmnVar.fs();
                this.nps = true;
            }
            i = 0;
        }
        zmn zmnVar2 = this.zn;
        if (zmnVar2 != null) {
            int max = Math.max(this.hhw - i2, 0);
            if (i != 0 && i2 < this.hhw) {
                z = false;
            }
            zmnVar2.zmn(max, z);
        }
    }

    public void zmn(float f) {
        int i = (int) f;
        this.btk = i;
        if (i <= 0) {
            this.btk = 5;
        }
    }

    public void zmn(zmn zmnVar) {
        this.zn = zmnVar;
    }

    public int zmn() {
        return this.hhw;
    }

    public void fs(int i) {
        this.hhw = Math.min(i, this.btk);
    }

    public void fs() {
        Handler handler = this.zmn;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.btk, 0));
        }
    }

    public void zn() {
        if (this.zmn != null) {
            Message obtain = Message.obtain();
            obtain.what = 100;
            obtain.arg1 = this.fb;
            this.zmn.sendMessage(obtain);
        }
    }

    public void fb() {
        Handler handler = this.zmn;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void btk() {
        this.zmn.removeCallbacksAndMessages(null);
        this.zmn = null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 100 && this.zmn != null) {
            int i = message.arg1;
            zmn(i);
            if (i > 0) {
                Message obtain = Message.obtain();
                obtain.what = 100;
                obtain.arg1 = i - 1;
                this.zmn.sendMessageDelayed(obtain, this.bvs);
            }
        }
        return true;
    }

    public void zmn(int i, float f, boolean z) {
        com.bytedance.sdk.openadsdk.component.zg.zmn zmnVar;
        if ((i == 1 || i == 2) && this.klz != z) {
            this.klz = z;
            if (i == 1 && (zmnVar = this.fs) != null) {
                zmnVar.zmn(z);
            }
            if (z) {
                try {
                    this.bvs = (int) (1000.0f / f);
                    this.rc = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long currentTimeMillis = this.iv + (System.currentTimeMillis() - this.rc);
                this.iv = currentTimeMillis;
                com.bytedance.sdk.openadsdk.component.zg.zmn zmnVar2 = this.fs;
                if (zmnVar2 != null) {
                    zmnVar2.zmn(currentTimeMillis);
                }
            }
            this.bvs = 1000;
        }
    }
}
