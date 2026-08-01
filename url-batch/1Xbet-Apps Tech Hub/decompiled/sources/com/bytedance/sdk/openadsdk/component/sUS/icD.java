package com.bytedance.sdk.openadsdk.component.sUS;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: TTAppOpenAdTopLayoutHelper.java */
/* loaded from: classes2.dex */
public class icD implements Handler.Callback {
    private final com.bytedance.sdk.openadsdk.component.so.pvs icD;
    private pvs vG;
    private boolean yiw;
    private Handler pvs = new Handler(Looper.myLooper(), this);
    private int Jd = 0;
    private int NB = 5;
    private int sUS = 0;

    public icD(com.bytedance.sdk.openadsdk.component.so.pvs pvsVar) {
        this.icD = pvsVar;
    }

    public void pvs(int i) {
        this.Jd = i;
        int i2 = this.NB - i;
        this.icD.pvs(i2);
        if (i <= 0) {
            pvs pvsVar = this.vG;
            if (pvsVar != null && !this.yiw) {
                pvsVar.icD();
                this.yiw = true;
            }
            i = 0;
        }
        boolean z = i2 >= this.sUS;
        pvs pvsVar2 = this.vG;
        if (pvsVar2 != null) {
            pvsVar2.pvs(i, i2, z);
        }
    }

    public void pvs(float f) {
        int i = (int) f;
        this.NB = i;
        if (i <= 0) {
            this.NB = 5;
        }
    }

    public void pvs(pvs pvsVar) {
        this.vG = pvsVar;
    }

    public int pvs() {
        return this.sUS;
    }

    public void icD(int i) {
        this.sUS = i;
    }

    public void icD() {
        Handler handler = this.pvs;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.NB, 0));
        }
    }

    public void vG() {
        if (this.pvs != null) {
            Message obtain = Message.obtain();
            obtain.what = 100;
            obtain.arg1 = this.Jd;
            this.pvs.sendMessage(obtain);
        }
    }

    public void Jd() {
        Handler handler = this.pvs;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void NB() {
        this.pvs.removeCallbacksAndMessages(null);
        this.pvs = null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 100 && this.pvs != null) {
            int i = message.arg1;
            pvs(i);
            if (i > 0) {
                Message obtain = Message.obtain();
                obtain.what = 100;
                obtain.arg1 = i - 1;
                this.pvs.sendMessageDelayed(obtain, 1000L);
            }
        }
        return true;
    }
}
