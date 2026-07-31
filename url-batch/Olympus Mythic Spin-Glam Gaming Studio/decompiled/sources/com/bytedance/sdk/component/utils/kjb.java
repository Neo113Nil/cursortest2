package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class kjb extends Handler {
    protected WeakReference<zmn> zmn;

    public interface zmn {
        void zmn(Message message);
    }

    public kjb(zmn zmnVar) {
        if (zmnVar != null) {
            this.zmn = new WeakReference<>(zmnVar);
        }
    }

    public kjb(Looper looper, zmn zmnVar) {
        super(looper);
        if (zmnVar != null) {
            this.zmn = new WeakReference<>(zmnVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        zmn zmnVar;
        WeakReference<zmn> weakReference = this.zmn;
        if (weakReference == null || (zmnVar = weakReference.get()) == null || message == null) {
            return;
        }
        zmnVar.zmn(message);
    }
}
