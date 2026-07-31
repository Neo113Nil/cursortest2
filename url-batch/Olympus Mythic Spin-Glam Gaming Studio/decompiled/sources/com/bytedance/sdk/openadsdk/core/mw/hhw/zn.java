package com.bytedance.sdk.openadsdk.core.mw.hhw;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.fb.rc;
import com.bytedance.adsdk.ugeno.fb.rt;

/* loaded from: classes13.dex */
public class zn implements rt {
    private boolean zmn = false;

    @Override // com.bytedance.adsdk.ugeno.fb.rt
    public boolean zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, MotionEvent motionEvent, rc rcVar, com.bytedance.adsdk.ugeno.fb.fb.zn znVar2) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zmn = true;
        } else if ((action == 1 || action == 3) && this.zmn) {
            this.zmn = false;
            if (zmn(znVar.rc(), motionEvent.getX(), motionEvent.getY()) && rcVar != null) {
                rcVar.zmn(znVar, znVar2.fb(), znVar2.nps().fs(), znVar2.nps());
            }
        }
        return true;
    }

    private boolean zmn(View view, float f, float f2) {
        return f >= 0.0f && f < ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }
}
