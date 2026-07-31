package com.bytedance.adsdk.ugeno.fb.fb;

import android.content.Context;
import android.util.Log;

/* loaded from: classes3.dex */
public class fb extends zn implements com.bytedance.adsdk.ugeno.fb.zmn.fb {
    private com.bytedance.adsdk.ugeno.fb.zmn.zn rc;

    public fb(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fb.zn
    public boolean zmn(Object... objArr) {
        com.bytedance.adsdk.ugeno.fb.zmn.zmn jy = this.fs.jy();
        if (jy == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.fb.zmn.zn zmn = jy.zmn(this.hhw);
        this.rc = zmn;
        if (zmn != null) {
            zmn.zmn(this);
            return false;
        }
        jy.zmn(this.hhw, new com.bytedance.adsdk.ugeno.fb.zmn.fs());
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.fb.zmn.fb
    public void zmn(String str) {
        Log.d("UGBaseEventMonitor", "receive: ");
        this.zmn.zmn(this.fs, this.hhw, this.zn.fs(), this.zn);
    }
}
