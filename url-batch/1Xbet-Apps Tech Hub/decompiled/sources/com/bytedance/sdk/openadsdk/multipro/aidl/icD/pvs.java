package com.bytedance.sdk.openadsdk.multipro.aidl.icD;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.ae;

/* compiled from: AppOpenAdListenerImpl.java */
/* loaded from: classes2.dex */
public class pvs extends IAppOpenAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.apiImpl.vG.icD pvs;

    public pvs(com.bytedance.sdk.openadsdk.apiImpl.vG.icD icd) {
        this.pvs = icd;
    }

    private void pvs() {
        this.pvs = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() throws RemoteException {
        pvs();
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.icD.pvs.1
            @Override // java.lang.Runnable
            public void run() {
                if (pvs.this.pvs != null) {
                    pvs.this.pvs.pvs();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() throws RemoteException {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.icD.pvs.2
            @Override // java.lang.Runnable
            public void run() {
                if (pvs.this.pvs != null) {
                    pvs.this.pvs.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() throws RemoteException {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.icD.pvs.3
            @Override // java.lang.Runnable
            public void run() {
                if (pvs.this.pvs != null) {
                    pvs.this.pvs.icD();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() throws RemoteException {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.icD.pvs.4
            @Override // java.lang.Runnable
            public void run() {
                if (pvs.this.pvs != null) {
                    pvs.this.pvs.vG();
                }
            }
        });
    }
}
