package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.so.so;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.multipro.aidl.pvs.Jd;
import com.bytedance.sdk.openadsdk.multipro.aidl.pvs.NB;
import com.bytedance.sdk.openadsdk.multipro.aidl.pvs.sUS;
import com.bytedance.sdk.openadsdk.multipro.aidl.pvs.yiw;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.jlb;

/* compiled from: BinderPool.java */
/* loaded from: classes2.dex */
public class pvs {
    private static final pvs icD = new pvs();
    private IBinderPool pvs;
    private icD vG;
    private long Jd = 0;
    private final ServiceConnection NB = new ServiceConnection() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.pvs.2
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            ae.pvs(new so("onServiceConnected") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.pvs.2.1
                @Override // java.lang.Runnable
                public void run() {
                    pvs.this.pvs = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        pvs.this.pvs.asBinder().linkToDeath(pvs.this.sUS, 0);
                    } catch (RemoteException e) {
                        Ju.pvs("TTAD.BinderPool", "onServiceConnected throws :", e);
                    }
                    System.currentTimeMillis();
                    long unused = pvs.this.Jd;
                    if (pvs.this.vG != null) {
                        pvs.this.vG.onServiceConnected();
                    }
                }
            }, 5);
        }
    };
    private final IBinder.DeathRecipient sUS = new IBinder.DeathRecipient() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.pvs.3
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            ae.pvs(new so("binderDied") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.pvs.3.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (pvs.this.pvs.asBinder().isBinderAlive()) {
                            pvs.this.pvs.asBinder().unlinkToDeath(pvs.this.sUS, 0);
                        }
                    } catch (Exception e) {
                        Ju.pvs("TTAD.BinderPool", e.getMessage());
                    }
                    pvs.this.pvs = null;
                    pvs.this.Jd();
                }
            }, 5);
        }
    };

    private pvs() {
        Jd();
    }

    public static pvs pvs() {
        return icD;
    }

    public void icD() {
        try {
            Context pvs = mnm.pvs();
            pvs.startService(new Intent(pvs, (Class<?>) BinderPoolService.class));
        } catch (Exception unused) {
        }
    }

    public void vG() {
        try {
            Context pvs = mnm.pvs();
            pvs.bindService(new Intent(pvs, (Class<?>) BinderPoolService.class), this.NB, 1);
            this.Jd = System.currentTimeMillis();
        } catch (Throwable unused) {
        }
    }

    public void pvs(icD icd) {
        this.vG = icd;
        if (this.pvs != null) {
            ae.pvs(new so("onServiceConnected2") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.pvs.1
                @Override // java.lang.Runnable
                public void run() {
                    if (pvs.this.vG != null) {
                        pvs.this.vG.onServiceConnected();
                    }
                }
            }, 5);
        }
    }

    public IBinder pvs(int i) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                try {
                    IBinderPool iBinderPool = this.pvs;
                    if (iBinderPool != null) {
                        return iBinderPool.queryBinder(i);
                    }
                    return null;
                } catch (RemoteException e) {
                    Ju.pvs("TTAD.BinderPool", e.getMessage());
                    jlb.so("queryBinder error");
                    return null;
                }
            }
            if (i == 0) {
                return yiw.pvs();
            }
            if (i == 1) {
                return NB.pvs();
            }
            if (i == 5) {
                return sUS.icD();
            }
            if (i == 6) {
                return Jd.pvs();
            }
            if (i != 7) {
                return null;
            }
            return com.bytedance.sdk.openadsdk.multipro.aidl.pvs.icD.pvs();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jd() {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            vG();
        }
    }
}
