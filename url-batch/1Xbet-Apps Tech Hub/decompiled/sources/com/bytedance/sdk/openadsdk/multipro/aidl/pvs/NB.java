package com.bytedance.sdk.openadsdk.multipro.aidl.pvs;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FullScreenVideoListenerManagerImpl.java */
/* loaded from: classes2.dex */
public class NB extends pvs {
    private static volatile NB icD;
    private static final Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> pvs = Collections.synchronizedMap(new HashMap());

    public static NB pvs() {
        if (icD == null) {
            synchronized (NB.class) {
                if (icD == null) {
                    icD = new NB();
                }
            }
        }
        return icD;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iFullScreenVideoAdInteractionListener);
        pvs.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(String str, String str2) throws RemoteException {
        pvs(str, str2);
    }

    private synchronized void pvs(String str, String str2) {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList;
        try {
            Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> map = pvs;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = map.remove(str);
                } else {
                    remoteCallbackList = map.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < beginBroadcast; i++) {
                        try {
                            IFullScreenVideoAdInteractionListener broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            if (broadcastItem != null) {
                                if ("onAdShow".equals(str2)) {
                                    broadcastItem.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    broadcastItem.onAdClose();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    broadcastItem.onAdVideoBarClick();
                                } else if ("recycleRes".equals(str2)) {
                                    broadcastItem.onDestroy();
                                }
                            }
                        } catch (Throwable th) {
                            Ju.pvs("MultiProcess", "fullScreen2 method " + str2 + " throws Exception :", th);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList.kill();
                    }
                }
            }
        } catch (Throwable th2) {
            Ju.pvs("MultiProcess", "fullScreen1 method " + str2 + " throws Exception :", th2);
        }
    }
}
