package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public final class V implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f22099a;

    public V(X x4) {
        this.f22099a = x4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c2, code lost:
    
        if (r6.f22099a.f22116e != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f9, code lost:
    
        if (r6.f22099a.f22116e == false) goto L67;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        if (message.what != 2269) {
            return false;
        }
        W w4 = (W) message.obj;
        W w5 = W.f22109h;
        if (w4 == w5) {
            X x4 = this.f22099a;
            x4.f22118g--;
            x4.f22112a.executeMainThreadJobs();
            X x5 = this.f22099a;
            if (!x5.f22115d) {
                return true;
            }
            if (x5.f22112a.getHaveAndroidWindowSupport() && !this.f22099a.f22116e) {
                return true;
            }
            X x6 = this.f22099a;
            int i4 = x6.f22121j;
            if (i4 >= 0) {
                if (i4 == 0) {
                    if (x6.f22112a.getSplashEnabled()) {
                        this.f22099a.f22112a.disableStaticSplashScreen();
                    }
                    if (this.f22099a.f22112a.shouldReportFullyDrawn()) {
                        this.f22099a.f22112a.reportFullyDrawn();
                    }
                }
                this.f22099a.f22121j--;
            }
            if (!this.f22099a.f22112a.isFinishing() && !this.f22099a.f22112a.nativeRender()) {
                this.f22099a.f22112a.finish();
            }
        } else if (w4 == W.f22104c) {
            Looper.myLooper().quit();
        } else if (w4 == W.f22103b) {
            this.f22099a.f22115d = true;
        } else if (w4 == W.f22102a) {
            this.f22099a.f22115d = false;
        } else if (w4 == W.f22105d) {
            this.f22099a.f22116e = false;
        } else if (w4 == W.f22106e) {
            X x7 = this.f22099a;
            x7.f22116e = true;
            if (x7.f22117f == 3) {
                if (x7.f22112a.getHaveAndroidWindowSupport()) {
                }
                this.f22099a.f22112a.nativeFocusChanged(true);
                this.f22099a.f22117f = 1;
            }
        } else if (w4 == W.f22107f) {
            X x8 = this.f22099a;
            if (x8.f22117f == 1) {
                x8.f22112a.nativeFocusChanged(false);
            }
            this.f22099a.f22117f = 2;
        } else if (w4 == W.f22108g) {
            X x9 = this.f22099a;
            x9.f22117f = 3;
            if (x9.f22112a.getHaveAndroidWindowSupport()) {
            }
            this.f22099a.f22112a.nativeFocusChanged(true);
            this.f22099a.f22117f = 1;
        } else if (w4 == W.f22110i) {
            X x10 = this.f22099a;
            x10.f22112a.nativeOrientationChanged(x10.f22119h, x10.f22120i);
        }
        X x11 = this.f22099a;
        if (x11.f22115d && x11.f22118g <= 0) {
            Message.obtain(x11.f22114c, 2269, w5).sendToTarget();
            this.f22099a.f22118g++;
        }
        return true;
    }
}
