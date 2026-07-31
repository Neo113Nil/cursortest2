package com.bytedance.sdk.openadsdk.component.reward.zn.zmn;

import android.view.MotionEvent;

/* loaded from: classes10.dex */
public class zmn implements com.bytedance.sdk.component.bvs.btk {
    private boolean fs;
    private fb zmn;

    public zmn(fb fbVar) {
        this.fs = false;
        this.zmn = fbVar;
        if (fbVar == null) {
            this.fs = false;
        } else {
            this.fs = fbVar.zn();
        }
    }

    @Override // com.bytedance.sdk.component.bvs.btk
    public boolean zmn(MotionEvent motionEvent) {
        if (zmn(this.zmn, motionEvent.getX(), motionEvent.getY()) && this.fs) {
            return false;
        }
        this.fs = false;
        return false;
    }

    @Override // com.bytedance.sdk.component.bvs.btk
    public boolean fs(MotionEvent motionEvent) {
        return this.fs && zmn(this.zmn, motionEvent.getX(), motionEvent.getY());
    }

    public void zmn(boolean z) {
        this.fs = z;
    }

    public boolean zmn(fb fbVar, float f, float f2) {
        if (fbVar == null) {
            return false;
        }
        return fbVar.zmn(f, f2);
    }
}
