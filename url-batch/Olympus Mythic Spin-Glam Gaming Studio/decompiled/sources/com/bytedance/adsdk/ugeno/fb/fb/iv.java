package com.bytedance.adsdk.ugeno.fb.fb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.adsdk.ugeno.nps.bvs;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

/* loaded from: classes3.dex */
public class iv extends zn implements bvs.zmn {
    private int klz;
    private Handler mw;
    private int rc;
    private int rt;

    public iv(Context context) {
        super(context);
        this.klz = 0;
        this.mw = new com.bytedance.adsdk.ugeno.nps.bvs(Looper.getMainLooper(), this);
        this.rt = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fb.zn
    public boolean zmn(Object... objArr) {
        Map<String, Object> map = this.btk;
        if (map != null) {
            Object obj = map.get("loop");
            if (obj != null) {
                this.rc = com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(obj), 1);
            } else {
                this.rc = 1;
            }
            int i = this.rc;
            if (i <= 0) {
                this.rt = -1;
            } else {
                this.rt = i;
            }
            Object obj2 = this.btk.get(IronSourceConstants.EVENTS_DURATION);
            if (obj2 == null) {
                this.klz = 0;
            } else {
                this.klz = com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(obj2), 0);
            }
        }
        this.mw.sendEmptyMessageDelayed(1001, this.klz);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.nps.bvs.zmn
    public void zmn(Message message) {
        int i;
        int i2;
        if (message.what != 1001) {
            return;
        }
        Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.rt);
        this.zmn.zmn(this.fs, this.hhw, this.zn.fs(), this.zn);
        int i3 = this.rt + (-1);
        this.rt = i3;
        if (i3 < 0 && (i2 = this.klz) != 0) {
            this.mw.sendEmptyMessageDelayed(1001, i2);
        } else if (i3 > 0 && (i = this.klz) != 0) {
            this.mw.sendEmptyMessageDelayed(1001, i);
        } else {
            this.mw.removeMessages(1001);
        }
    }
}
