package com.bytedance.sdk.component.so.pvs;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.dyT;
import java.lang.ref.WeakReference;

/* compiled from: HandlerWapper.java */
/* loaded from: classes.dex */
public class icD extends dyT implements vG {
    private final HandlerThread icD;

    icD(HandlerThread handlerThread, dyT.pvs pvsVar) {
        super(handlerThread.getLooper(), pvsVar);
        this.icD = handlerThread;
    }

    @Override // com.bytedance.sdk.component.so.pvs.vG
    public void pvs() {
        removeCallbacksAndMessages(null);
        if (this.pvs != null) {
            this.pvs.clear();
            this.pvs = null;
        }
    }

    public void pvs(dyT.pvs pvsVar) {
        this.pvs = new WeakReference<>(pvsVar);
    }

    public void icD() {
        HandlerThread handlerThread = this.icD;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }
}
