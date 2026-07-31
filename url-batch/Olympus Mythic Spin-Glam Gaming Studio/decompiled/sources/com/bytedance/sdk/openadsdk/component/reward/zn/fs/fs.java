package com.bytedance.sdk.openadsdk.component.reward.zn.fs;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.utils.kjb;

/* loaded from: classes14.dex */
public class fs implements kjb.zmn {
    private long fb;
    private zmn fs;
    private long zn;
    private Handler zmn = new kjb(this);
    private boolean btk = false;
    private boolean hhw = false;
    private int nps = 10000;
    private int zg = 10000;

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.zn.fs.fs$fs, reason: collision with other inner class name */
    public enum EnumC0149fs {
        NORMAL,
        TIMEOUT,
        DISCONNECTED
    }

    public interface zmn {
        void zmn();

        void zmn(EnumC0149fs enumC0149fs);
    }

    public void zmn(int i) {
        this.nps = i;
    }

    public void fs(int i) {
        this.zg = i;
    }

    public void zmn(zmn zmnVar) {
        if (this.btk) {
            return;
        }
        this.fs = zmnVar;
        this.btk = true;
        this.hhw = false;
        this.zmn.sendEmptyMessage(1);
        if (zmnVar != null) {
            zmnVar.zmn(EnumC0149fs.NORMAL);
        }
    }

    public void zmn() {
        this.btk = false;
        this.hhw = false;
        this.zmn.removeMessages(1);
        this.zmn.removeMessages(2);
        this.fs = null;
    }

    private void zn() {
        if (!this.btk || this.fs == null) {
            return;
        }
        this.zn = System.currentTimeMillis();
        this.hhw = true;
        this.fs.zmn();
        this.zmn.removeMessages(2);
        this.zmn.sendEmptyMessageDelayed(2, this.zg);
        this.zmn.removeMessages(1);
        this.zmn.sendEmptyMessageDelayed(1, this.nps);
    }

    public void fs() {
        if (this.btk && this.hhw) {
            this.fb = System.currentTimeMillis();
            this.hhw = false;
            this.zmn.removeMessages(2);
            zmn zmnVar = this.fs;
            if (zmnVar != null) {
                zmnVar.zmn(EnumC0149fs.NORMAL);
            }
        }
    }

    private void fb() {
        if (this.btk && this.hhw && System.currentTimeMillis() - this.zn >= this.nps) {
            this.hhw = false;
            zmn zmnVar = this.fs;
            if (zmnVar != null) {
                zmnVar.zmn(EnumC0149fs.TIMEOUT);
            }
            zmn();
        }
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        int i = message.what;
        if (i == 1) {
            zn();
        } else {
            if (i != 2) {
                return;
            }
            fb();
        }
    }
}
