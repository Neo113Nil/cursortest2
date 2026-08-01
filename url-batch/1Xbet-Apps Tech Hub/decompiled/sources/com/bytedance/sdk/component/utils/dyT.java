package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WeakHandler.java */
/* loaded from: classes.dex */
public class dyT extends Handler {
    protected WeakReference<pvs> pvs;

    /* compiled from: WeakHandler.java */
    public interface pvs {
        void pvs(Message message);
    }

    public dyT(pvs pvsVar) {
        if (pvsVar != null) {
            this.pvs = new WeakReference<>(pvsVar);
        }
    }

    public dyT(Looper looper, pvs pvsVar) {
        super(looper);
        if (pvsVar != null) {
            this.pvs = new WeakReference<>(pvsVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        pvs pvsVar;
        WeakReference<pvs> weakReference = this.pvs;
        if (weakReference == null || (pvsVar = weakReference.get()) == null || message == null) {
            return;
        }
        pvsVar.pvs(message);
    }
}
