package com.bytedance.adsdk.ugeno.nps;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
public class bvs extends Handler {
    private final WeakReference<zmn> zmn;

    public interface zmn {
        void zmn(Message message);
    }

    public bvs(Looper looper, zmn zmnVar) {
        super(looper);
        this.zmn = new WeakReference<>(zmnVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        zmn zmnVar = this.zmn.get();
        if (zmnVar == null || message == null) {
            return;
        }
        zmnVar.zmn(message);
    }
}
