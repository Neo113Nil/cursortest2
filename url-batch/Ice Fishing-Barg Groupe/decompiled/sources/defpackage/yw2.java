package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.PxuCJdSBwIXG;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yw2 extends sw2 {
    public final /* synthetic */ PxuCJdSBwIXG PxuCJdSBwIXG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw2(PxuCJdSBwIXG pxuCJdSBwIXG, Looper looper) {
        super(looper, 2);
        this.PxuCJdSBwIXG = pxuCJdSBwIXG;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        int i = this.PxuCJdSBwIXG.VhhvGxCb8gfr.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if (i3 == 2 || i3 == 1 || i3 == 7) {
                uw2 uw2Var = (uw2) message.obj;
                uw2Var.getClass();
                uw2Var.TSizfFm2Yiuu();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !this.PxuCJdSBwIXG.e9gEMXR7LXtO()) {
            uw2 uw2Var2 = (uw2) message.obj;
            uw2Var2.getClass();
            uw2Var2.TSizfFm2Yiuu();
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            PxuCJdSBwIXG pxuCJdSBwIXG = this.PxuCJdSBwIXG;
            pxuCJdSBwIXG.RfyTYNmI9Srp = new xq(message.arg2);
            if (!pxuCJdSBwIXG.EcgxDIVH5in8 && !TextUtils.isEmpty(pxuCJdSBwIXG.XL4ISE6Oc65B()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(pxuCJdSBwIXG.XL4ISE6Oc65B());
                    PxuCJdSBwIXG pxuCJdSBwIXG2 = this.PxuCJdSBwIXG;
                    if (!pxuCJdSBwIXG2.EcgxDIVH5in8) {
                        pxuCJdSBwIXG2.VhhvGxCb8gfr(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            PxuCJdSBwIXG pxuCJdSBwIXG3 = this.PxuCJdSBwIXG;
            xq xqVar = pxuCJdSBwIXG3.RfyTYNmI9Srp;
            if (xqVar == null) {
                xqVar = new xq(8);
            }
            pxuCJdSBwIXG3.OPXfSBeufaJ8.lS5Rgt96tfkO(xqVar);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            PxuCJdSBwIXG pxuCJdSBwIXG4 = this.PxuCJdSBwIXG;
            xq xqVar2 = pxuCJdSBwIXG4.RfyTYNmI9Srp;
            if (xqVar2 == null) {
                xqVar2 = new xq(8);
            }
            pxuCJdSBwIXG4.OPXfSBeufaJ8.lS5Rgt96tfkO(xqVar2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            this.PxuCJdSBwIXG.OPXfSBeufaJ8.lS5Rgt96tfkO(new xq(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            this.PxuCJdSBwIXG.VhhvGxCb8gfr(5, null);
            b42 b42Var = this.PxuCJdSBwIXG.r3s1LDPKFs1S;
            if (b42Var != null) {
                ((dh0) b42Var.OPXfSBeufaJ8).PxuCJdSBwIXG(message.arg2);
            }
            System.currentTimeMillis();
            PxuCJdSBwIXG.S9EYkSpbGuxq(this.PxuCJdSBwIXG, 5, 1, null);
            return;
        }
        if (i4 == 2 && !this.PxuCJdSBwIXG.PxuCJdSBwIXG()) {
            uw2 uw2Var3 = (uw2) message.obj;
            uw2Var3.getClass();
            uw2Var3.TSizfFm2Yiuu();
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", o0.wdg6QnbFHrFF("Don't know how to handle message: ", i5), new Exception());
            return;
        }
        uw2 uw2Var4 = (uw2) message.obj;
        synchronized (uw2Var4) {
            try {
                bool = uw2Var4.PxuCJdSBwIXG;
                if (uw2Var4.lS5Rgt96tfkO) {
                    Log.w("GmsClient", "Callback proxy " + uw2Var4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            PxuCJdSBwIXG pxuCJdSBwIXG5 = uw2Var4.a92UlCVFR9N8;
            int i6 = uw2Var4.Y1f8riQaR6yg;
            if (i6 != 0) {
                pxuCJdSBwIXG5.VhhvGxCb8gfr(1, null);
                Bundle bundle = uw2Var4.e9gEMXR7LXtO;
                uw2Var4.PxuCJdSBwIXG(new xq(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!uw2Var4.lS5Rgt96tfkO()) {
                pxuCJdSBwIXG5.VhhvGxCb8gfr(1, null);
                uw2Var4.PxuCJdSBwIXG(new xq(8, null));
            }
        }
        synchronized (uw2Var4) {
            uw2Var4.lS5Rgt96tfkO = true;
        }
        uw2Var4.TSizfFm2Yiuu();
    }
}
