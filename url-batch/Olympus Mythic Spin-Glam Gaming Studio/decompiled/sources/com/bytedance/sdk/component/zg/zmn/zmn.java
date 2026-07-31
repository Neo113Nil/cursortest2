package com.bytedance.sdk.component.zg.zmn;

import android.os.Handler;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.component.utils.zg;

/* loaded from: classes3.dex */
public class zmn {
    private Handler fs;
    private final fb<fs> zmn;

    private zmn() {
        this.zmn = fb.zmn(2);
    }

    public static zmn zmn() {
        return C0137zmn.zmn;
    }

    /* renamed from: com.bytedance.sdk.component.zg.zmn.zmn$zmn, reason: collision with other inner class name */
    private static class C0137zmn {
        private static final zmn zmn = new zmn();
    }

    public Handler fs() {
        if (this.fs == null) {
            synchronized (zmn.class) {
                try {
                    if (this.fs == null) {
                        this.fs = zmn("csj_io_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.fs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.zg.zmn.zmn.1
                @Override // java.lang.Runnable
                public void run() {
                    zmn.this.zmn(handler, handler2);
                }
            }, 1000L);
        }
    }

    public kjb zmn(kjb.zmn zmnVar, final String str) {
        fs zmn = this.zmn.zmn();
        if (zmn != null) {
            zmn.zmn(zmnVar);
            zmn.post(new Runnable() { // from class: com.bytedance.sdk.component.zg.zmn.zmn.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return zmn;
        }
        return fs(zmnVar, str);
    }

    public kjb zmn(String str) {
        return zmn((kjb.zmn) null, str);
    }

    private fs fs(kjb.zmn zmnVar, String str) {
        return new fs(zg.zmn(str), zmnVar);
    }

    public boolean zmn(kjb kjbVar) {
        if (!(kjbVar instanceof fs)) {
            return false;
        }
        fs fsVar = (fs) kjbVar;
        if (this.zmn.zmn((fb<fs>) fsVar)) {
            return true;
        }
        fsVar.fs();
        return true;
    }
}
