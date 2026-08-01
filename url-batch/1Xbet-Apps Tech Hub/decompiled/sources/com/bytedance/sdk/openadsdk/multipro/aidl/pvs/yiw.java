package com.bytedance.sdk.openadsdk.multipro.aidl.pvs;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: RewardAdVideoListenerManagerImpl.java */
/* loaded from: classes2.dex */
public class yiw extends pvs {
    private static volatile yiw icD;
    private static final Map<String, RemoteCallbackList<IRewardAdInteractionListener>> pvs = Collections.synchronizedMap(new HashMap());

    public static yiw pvs() {
        if (icD == null) {
            synchronized (yiw.class) {
                if (icD == null) {
                    icD = new yiw();
                }
            }
        }
        return icD;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iRewardAdInteractionListener);
        pvs.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeRewardVideoCallback(String str, String str2, boolean z, int i, String str3, int i2, String str4) throws RemoteException {
        pvs(str, str2, z, i, str3, i2, str4);
    }

    private synchronized void pvs(String str, String str2, boolean z, int i, String str3, int i2, String str4) {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList;
        try {
            Map<String, RemoteCallbackList<IRewardAdInteractionListener>> map = pvs;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = map.remove(str);
                } else {
                    remoteCallbackList = map.get(str);
                }
                RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList2 = remoteCallbackList;
                if (remoteCallbackList2 != null) {
                    int beginBroadcast = remoteCallbackList2.beginBroadcast();
                    for (int i3 = 0; i3 < beginBroadcast; i3++) {
                        try {
                            IRewardAdInteractionListener broadcastItem = remoteCallbackList2.getBroadcastItem(i3);
                            if (broadcastItem != null) {
                                if ("onAdShow".equals(str2)) {
                                    broadcastItem.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    broadcastItem.onAdClose();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    broadcastItem.onAdVideoBarClick();
                                } else if ("onRewardVerify".equals(str2)) {
                                    broadcastItem.onRewardVerify(z, i, str3, i2, str4);
                                } else if ("recycleRes".equals(str2)) {
                                    broadcastItem.onDestroy();
                                }
                            }
                        } catch (Throwable th) {
                            Ju.pvs("MultiProcess", "reward1 '" + str2 + "'  throws Exception :", th);
                        }
                    }
                    remoteCallbackList2.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList2.kill();
                    }
                }
            }
        } catch (Throwable th2) {
            Ju.pvs("MultiProcess", "reward2 '" + str2 + "'  throws Exception :", th2);
        }
    }
}
