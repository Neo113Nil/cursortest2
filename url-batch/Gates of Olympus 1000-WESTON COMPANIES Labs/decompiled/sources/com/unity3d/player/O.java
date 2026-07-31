package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public final class O implements Handler.Callback {
    public final /* synthetic */ Q a;

    public O(Q q) {
        this.a = q;
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
        P p = (P) message.obj;
        P p2 = P.h;
        if (p == p2) {
            Q q = this.a;
            q.g--;
            q.a.executeMainThreadJobs();
            Q q2 = this.a;
            if (!q2.d) {
                return true;
            }
            if (q2.a.getHaveAndroidWindowSupport() && !this.a.e) {
                return true;
            }
            Q q3 = this.a;
            int i = q3.j;
            if (i >= 0) {
                if (i == 0) {
                    if (q3.a.getSplashEnabled()) {
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
        } else if (p == P.c) {
            Looper.myLooper().quit();
        } else if (p == P.b) {
            this.a.d = true;
        } else if (p == P.a) {
            this.a.d = false;
        } else if (p == P.d) {
            this.a.e = false;
        } else if (p == P.e) {
            Q q4 = this.a;
            q4.e = true;
            if (q4.f == 3) {
                if (q4.a.getHaveAndroidWindowSupport()) {
                }
                this.a.a.nativeFocusChanged(true);
                this.a.f = 1;
            }
        } else if (p == P.f) {
            Q q5 = this.a;
            if (q5.f == 1) {
                q5.a.nativeFocusChanged(false);
            }
            this.a.f = 2;
        } else if (p == P.g) {
            Q q6 = this.a;
            q6.f = 3;
            if (q6.a.getHaveAndroidWindowSupport()) {
            }
            this.a.a.nativeFocusChanged(true);
            this.a.f = 1;
        } else if (p == P.i) {
            Q q7 = this.a;
            q7.a.nativeOrientationChanged(q7.h, q7.i);
        }
        Q q8 = this.a;
        if (q8.d && q8.g <= 0) {
            Message.obtain(q8.c, 2269, p2).sendToTarget();
            this.a.g++;
        }
        return true;
    }
}
