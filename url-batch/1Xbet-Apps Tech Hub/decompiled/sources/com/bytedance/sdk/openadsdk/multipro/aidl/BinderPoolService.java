package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.so;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.multipro.aidl.pvs.Jd;
import com.bytedance.sdk.openadsdk.multipro.aidl.pvs.NB;
import com.bytedance.sdk.openadsdk.multipro.aidl.pvs.sUS;
import com.bytedance.sdk.openadsdk.multipro.aidl.pvs.yiw;

/* loaded from: classes2.dex */
public class BinderPoolService extends Service {
    public static volatile boolean pvs;
    private static boolean vG;
    private final Binder icD = new pvs();

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        mnm.pvs(getApplicationContext());
        pvs = true;
        if (!vG) {
            so.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().pvs(BinderPoolService.this.getApplicationContext());
                }
            });
        }
        vG = true;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.icD;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    public static class pvs extends IBinderPool.Stub {
        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int i) throws RemoteException {
            if (i == 0) {
                return yiw.pvs();
            }
            if (i == 1) {
                return NB.pvs();
            }
            if (i == 4) {
                return com.bytedance.sdk.openadsdk.multipro.aidl.pvs.vG.pvs();
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
        }
    }
}
