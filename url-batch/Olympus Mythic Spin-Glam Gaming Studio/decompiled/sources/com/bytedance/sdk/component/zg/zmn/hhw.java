package com.bytedance.sdk.component.zg.zmn;

import android.os.Handler;

/* loaded from: classes6.dex */
public abstract class hhw {
    public final Handler zmn;

    public abstract boolean zmn();

    public hhw(Handler handler) {
        this.zmn = handler;
    }

    public void zmn(final Runnable runnable) {
        if (zmn()) {
            zn(new Runnable() { // from class: com.bytedance.sdk.component.zg.zmn.hhw$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    hhw.this.btk(runnable);
                }
            });
            return;
        }
        Handler handler = this.zmn;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void btk(Runnable runnable) {
        Handler handler = this.zmn;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void zmn(final Runnable runnable, final long j) {
        if (zmn()) {
            zn(new Runnable() { // from class: com.bytedance.sdk.component.zg.zmn.hhw$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    hhw.this.fs(runnable, j);
                }
            });
            return;
        }
        Handler handler = this.zmn;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fs(Runnable runnable, long j) {
        Handler handler = this.zmn;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }

    public void fs(final Runnable runnable) {
        if (zmn()) {
            zn(new Runnable() { // from class: com.bytedance.sdk.component.zg.zmn.hhw$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    hhw.this.fb(runnable);
                }
            });
            return;
        }
        Handler handler = this.zmn;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fb(Runnable runnable) {
        Handler handler = this.zmn;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    protected void zn(Runnable runnable) {
        btk.zmn().zmn(runnable);
    }
}
