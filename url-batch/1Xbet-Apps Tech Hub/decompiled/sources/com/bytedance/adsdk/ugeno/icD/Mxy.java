package com.bytedance.adsdk.ugeno.icD;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WeakHandler.java */
/* loaded from: classes.dex */
public class Mxy extends Handler {
    private final WeakReference<pvs> pvs;

    /* compiled from: WeakHandler.java */
    public interface pvs {
        void pvs(Message message);
    }

    public Mxy(Looper looper, pvs pvsVar) {
        super(looper);
        this.pvs = new WeakReference<>(pvsVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        pvs pvsVar = this.pvs.get();
        if (pvsVar == null || message == null) {
            return;
        }
        pvsVar.pvs(message);
    }
}
