package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.cn.fb.zmn;

/* loaded from: classes6.dex */
public class tf implements Handler.Callback, zmn.InterfaceC0155zmn {
    private final com.bytedance.sdk.openadsdk.component.reward.zmn.fs btk;
    private boolean bvs;
    private final com.bytedance.sdk.openadsdk.core.model.nqi fb;
    private boolean hhw;
    private int iv;
    private int klz;
    private boolean nps;
    private boolean zg;
    private float zmn = 1.0f;
    private int fs = 1000;
    private final Handler zn = new Handler(Looper.getMainLooper(), this);
    private int rc = 0;

    public boolean zmn() {
        return this.hhw;
    }

    public void zmn(long j) {
        int ceil = (int) Math.ceil(j / 1000.0d);
        if (this.nps && !this.zg) {
            this.rc = ceil;
            zn();
        } else {
            if (this.hhw || this.zg) {
                return;
            }
            this.rc = ceil;
            this.hhw = true;
            fs();
        }
    }

    public tf(@NonNull com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, @NonNull com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        this.iv = 0;
        this.klz = 0;
        this.btk = fsVar;
        this.fb = nqiVar;
        if (nqiVar.bv()) {
            if (nqiVar.nkw() >= 0) {
                this.klz = nqiVar.nkw();
            } else {
                this.klz = com.bytedance.sdk.openadsdk.core.kgc.fb().rc(String.valueOf(nqiVar.qvo()));
            }
        } else if (nqiVar.ul()) {
            if (nqiVar.ab() >= 0) {
                this.klz = nqiVar.ab();
            } else {
                this.klz = com.bytedance.sdk.openadsdk.core.kgc.fb().iqz(String.valueOf(nqiVar.qvo()));
            }
        }
        this.iv = (int) fsVar.phc.ww();
        com.bytedance.sdk.component.utils.iqz.zmn("TTAD.TopLayoutHelper", "totalTime: " + this.iv + ", skipTime=" + this.klz);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 1024) {
            int i = this.iv;
            int i2 = this.rc;
            int i3 = i - i2;
            this.btk.phc.zmn(i2 * 1000);
            com.bytedance.sdk.component.utils.iqz.zmn("TTAD.TopLayoutHelper", "handleMessage: currentTime= " + this.rc + ", mRemainTimeInSeconds=" + i3);
            if (i3 > 0) {
                Activity activity = this.btk.nu;
                if (activity instanceof TTRewardVideoActivity) {
                    ((TTRewardVideoActivity) activity).zn(this.rc * 1000, this.iv);
                }
                com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = this.btk.uqh;
                boolean z = false;
                if (bvsVar != null && bvsVar.zmn() != null) {
                    this.btk.uqh.zmn().setTime(String.valueOf(i3), this.rc, 0, false);
                }
                if (this.fb.bv()) {
                    com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar2 = this.btk.uqh;
                    if (bvsVar2 != null) {
                        if (bvsVar2.bvs() && this.klz > 0) {
                            z = true;
                        }
                        this.bvs = z;
                    }
                    if (this.bvs && this.rc >= this.klz && this.btk.fs.cd() != 5 && this.btk.fs.cd() != 33) {
                        this.btk.zmn(true);
                        this.btk.ev.zmn(String.valueOf(i3), TTAdDislikeToast.getSkipText());
                        this.btk.ev.btk(true);
                    } else {
                        this.btk.ev.zmn(String.valueOf(i3), null);
                    }
                } else if (this.fb.ul() && (this.btk.uqh.bvs() || this.btk.fs.wir())) {
                    Activity activity2 = this.btk.nu;
                    if (activity2 instanceof TTFullScreenVideoActivity) {
                        ((TTFullScreenVideoActivity) activity2).zmn(this.rc);
                    }
                    this.btk.ev.fb(true);
                    this.btk.ev.zmn(String.valueOf(i3), null);
                }
                this.rc++;
                if (this.btk.phc.zn()) {
                    com.bytedance.sdk.openadsdk.core.model.yj el = this.btk.fs.el();
                    if (el != null) {
                        float zmn = el.zmn();
                        this.zmn = zmn;
                        if (zmn <= 0.0f) {
                            this.zmn = 1.0f;
                        }
                    }
                } else {
                    this.zmn = 1.0f;
                }
                int i4 = (int) (1000.0f / this.zmn);
                com.bytedance.sdk.component.utils.iqz.zmn("TTAD.TopLayoutHelper", "handleMessage: next msg intervalInMillis = ".concat(String.valueOf(i4)));
                this.zn.sendEmptyMessageDelayed(message.what, i4);
            }
        }
        return true;
    }

    public void fs() {
        this.zn.sendEmptyMessage(1024);
        this.nps = false;
    }

    public void zn() {
        if (this.hhw) {
            this.zn.removeMessages(1024);
            this.zn.sendEmptyMessage(1024);
            this.nps = false;
        }
    }

    public void fb() {
        if (!this.hhw || this.nps) {
            return;
        }
        this.zn.removeMessages(1024);
        this.nps = true;
    }

    public void btk() {
        this.zn.removeMessages(1024);
        this.hhw = false;
        this.zg = true;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.btk;
        if (fsVar != null) {
            fsVar.phc.ev();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.zmn.InterfaceC0155zmn
    public void zmn(int i) {
        com.bytedance.sdk.component.utils.iqz.zmn("TTAD.TopLayoutHelper", "onPlayerStateChanged: ".concat(String.valueOf(i)));
        if (i == 1) {
            zn();
            return;
        }
        if (i == 2) {
            fb();
        } else if (i == 3 || i == 4) {
            btk();
        }
    }
}
