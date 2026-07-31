package com.bytedance.adsdk.ugeno.fb.fb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.nps.bvs;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;

/* loaded from: classes14.dex */
public class rc extends zn implements bvs.zmn {
    private boolean klz;
    private Handler mw;
    private int rc;

    public rc(Context context) {
        super(context);
        this.rc = 500;
        this.mw = new com.bytedance.adsdk.ugeno.nps.bvs(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fb.zn
    public boolean zmn(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        Object obj = this.btk.get(POBCTAOverlayData.KEY_CTA_DELAY);
        if (obj == null) {
            this.rc = 500;
        } else {
            this.rc = com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(obj), 500);
        }
        return zmn(this.fs, motionEvent);
    }

    private boolean zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.fb.rc rcVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mw.sendEmptyMessageDelayed(1102, this.rc);
        } else {
            if (action == 1) {
                if (this.klz && (rcVar = this.zmn) != null) {
                    rcVar.zmn(this.fs, this.hhw, this.zn.fs(), this.zn);
                    this.klz = false;
                    Handler handler = this.mw;
                    if (handler != null) {
                        handler.removeMessages(1102);
                    }
                    return true;
                }
                Handler handler2 = this.mw;
                if (handler2 != null) {
                    handler2.removeMessages(1102);
                }
                this.klz = false;
                return false;
            }
            if (action == 3) {
                Handler handler3 = this.mw;
                if (handler3 != null) {
                    handler3.removeMessages(1102);
                }
                this.klz = false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.nps.bvs.zmn
    public void zmn(Message message) {
        if (message.what != 1102) {
            return;
        }
        this.klz = true;
        Handler handler = this.mw;
        if (handler != null) {
            handler.removeMessages(1102);
        }
    }
}
