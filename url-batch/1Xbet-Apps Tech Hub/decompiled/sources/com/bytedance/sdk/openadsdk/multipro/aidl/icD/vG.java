package com.bytedance.sdk.openadsdk.multipro.aidl.icD;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.ae;

/* compiled from: FullScreenVideoListenerImpl.java */
/* loaded from: classes2.dex */
public class vG extends IFullScreenVideoAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.apiImpl.icD.icD pvs;

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    public vG(com.bytedance.sdk.openadsdk.apiImpl.icD.icD icd) {
        this.pvs = icd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs() {
        this.pvs = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.icD.vG.1
            @Override // java.lang.Runnable
            public void run() {
                if (vG.this.pvs != null) {
                    vG.this.pvs.pvs();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.icD.vG.2
            @Override // java.lang.Runnable
            public void run() {
                if (vG.this.pvs != null) {
                    vG.this.pvs.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.icD.vG.3
            @Override // java.lang.Runnable
            public void run() {
                if (vG.this.pvs != null) {
                    vG.this.pvs.icD();
                }
                vG.this.pvs();
            }
        });
    }
}
