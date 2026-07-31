package com.bytedance.adsdk.ugeno.fb.fb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.nps.bvs;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import io.bidmachine.protobuf.EventTypeExtended;

/* loaded from: classes15.dex */
public class klz extends zn implements bvs.zmn {
    private Handler klz;
    private int rc;

    public klz(Context context) {
        super(context);
        this.rc = 500;
        this.klz = new com.bytedance.adsdk.ugeno.nps.bvs(Looper.getMainLooper(), this);
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
        int action = motionEvent.getAction();
        if (action == 0) {
            this.klz.sendEmptyMessageDelayed(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE, this.rc);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.klz.removeMessages(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE);
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.nps.bvs.zmn
    public void zmn(Message message) {
        if (message.what != 1101) {
            return;
        }
        com.bytedance.adsdk.ugeno.fb.rc rcVar = this.zmn;
        if (rcVar != null) {
            rcVar.zmn(this.fs, this.hhw, this.zn.fs(), this.zn);
        }
        Handler handler = this.klz;
        if (handler != null) {
            handler.removeMessages(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE);
        }
    }
}
