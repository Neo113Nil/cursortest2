package com.bytedance.sdk.component.zg.zmn;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.kjb;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class fs extends kjb implements zn {
    private final HandlerThread fs;

    fs(HandlerThread handlerThread, kjb.zmn zmnVar) {
        super(handlerThread.getLooper(), zmnVar);
        this.fs = handlerThread;
    }

    @Override // com.bytedance.sdk.component.zg.zmn.zn
    public void zmn() {
        removeCallbacksAndMessages(null);
        WeakReference<kjb.zmn> weakReference = this.zmn;
        if (weakReference != null) {
            weakReference.clear();
            this.zmn = null;
        }
    }

    public void zmn(kjb.zmn zmnVar) {
        this.zmn = new WeakReference<>(zmnVar);
    }

    public void fs() {
        HandlerThread handlerThread = this.fs;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }
}
