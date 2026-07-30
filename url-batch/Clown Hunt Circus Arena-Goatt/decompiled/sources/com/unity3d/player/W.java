package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class W implements Handler.Callback {
    public final /* synthetic */ Y a;

    public W(Y y) {
        this.a = y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c2, code lost:
    
        if (r6.a.e != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f9, code lost:
    
        if (r6.a.e == false) goto L67;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        if (message.what != 2269) {
            return false;
        }
        X x = (X) message.obj;
        X x2 = X.h;
        if (x == x2) {
            Y y = this.a;
            y.g--;
            y.a.executeMainThreadJobs();
            Y y2 = this.a;
            if (!y2.d) {
                return true;
            }
            if (y2.a.getHaveAndroidWindowSupport() && !this.a.e) {
                return true;
            }
            Y y3 = this.a;
            int i = y3.j;
            if (i >= 0) {
                if (i == 0) {
                    if (y3.a.getSplashEnabled()) {
                        this.a.a.disableStaticSplashScreen();
                    }
                    if (this.a.a.shouldReportFullyDrawn()) {
                        this.a.a.reportFullyDrawn();
                    }
                }
                this.a.j--;
            }
            if (!this.a.a.isFinishing() && !this.a.a.nativeRender()) {
                this.a.a.finish();
            }
        } else if (x == X.c) {
            Looper.myLooper().quit();
        } else if (x == X.b) {
            this.a.d = true;
        } else if (x == X.a) {
            this.a.d = false;
        } else if (x == X.d) {
            this.a.e = false;
        } else if (x == X.e) {
            Y y4 = this.a;
            y4.e = true;
            if (y4.f == 3) {
                if (y4.a.getHaveAndroidWindowSupport()) {
                }
                this.a.a.nativeFocusChanged(true);
                this.a.f = 1;
            }
        } else if (x == X.f) {
            Y y5 = this.a;
            if (y5.f == 1) {
                y5.a.nativeFocusChanged(false);
            }
            this.a.f = 2;
        } else if (x == X.g) {
            Y y6 = this.a;
            y6.f = 3;
            if (y6.a.getHaveAndroidWindowSupport()) {
            }
            this.a.a.nativeFocusChanged(true);
            this.a.f = 1;
        } else if (x == X.i) {
            Y y7 = this.a;
            y7.a.nativeOrientationChanged(y7.h, y7.i);
        }
        Y y8 = this.a;
        if (y8.d && y8.g <= 0) {
            Message.obtain(y8.c, 2269, x2).sendToTarget();
            this.a.g++;
        }
        return true;
    }
}
