package com.bytedance.sdk.openadsdk.multipro.aidl.icD;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.core.bannerexpress.pvs;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.utils.ae;

/* compiled from: DislikeClosedListenerImpl.java */
/* loaded from: classes2.dex */
public class icD extends IDislikeClosedListener.Stub {
    private final String icD;
    private final pvs.InterfaceC0073pvs pvs;

    public icD(String str, pvs.InterfaceC0073pvs interfaceC0073pvs) {
        this.icD = str;
        this.pvs = interfaceC0073pvs;
    }

    @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
    public void onItemClickClosed() throws RemoteException {
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.icD.icD.1
            @Override // java.lang.Runnable
            public void run() {
                if (icD.this.pvs != null) {
                    icD.this.pvs.pvs();
                    TTDislikeListView.pvs(6, icD.this.icD);
                }
            }
        });
    }
}
