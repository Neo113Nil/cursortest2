package com.bytedance.sdk.openadsdk.multipro.aidl.icD;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.ae;

/* compiled from: RewardVideoListenerImpl.java */
/* loaded from: classes2.dex */
public class Jd extends IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs pvs;

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    public Jd(com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs pvsVar) {
        this.pvs = pvsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs() {
        this.pvs = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.icD.Jd.1
            @Override // java.lang.Runnable
            public void run() {
                if (Jd.this.pvs != null) {
                    Jd.this.pvs.pvs();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.icD.Jd.2
            @Override // java.lang.Runnable
            public void run() {
                if (Jd.this.pvs != null) {
                    Jd.this.pvs.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.icD.Jd.3
            @Override // java.lang.Runnable
            public void run() {
                if (Jd.this.pvs != null) {
                    Jd.this.pvs.icD();
                }
                Jd.this.pvs();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(final boolean z, final int i, final String str, final int i2, final String str2) throws RemoteException {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.icD.Jd.4
            @Override // java.lang.Runnable
            public void run() {
                if (Jd.this.pvs != null) {
                    Jd.this.pvs.pvs(z, i, str, i2, str2);
                }
            }
        });
    }
}
