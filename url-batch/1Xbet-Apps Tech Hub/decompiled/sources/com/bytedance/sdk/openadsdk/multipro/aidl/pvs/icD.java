package com.bytedance.sdk.openadsdk.multipro.aidl.pvs;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AppOpenAdListenerManagerImpl.java */
/* loaded from: classes2.dex */
public class icD extends pvs {
    private static volatile icD icD;
    private static final Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> pvs = Collections.synchronizedMap(new HashMap());

    public static icD pvs() {
        if (icD == null) {
            synchronized (icD.class) {
                if (icD == null) {
                    icD = new icD();
                }
            }
        }
        return icD;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iAppOpenAdInteractionListener);
        pvs.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
        pvs(str, str2);
    }

    private synchronized void pvs(String str, String str2) {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackList;
        try {
            Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> map = pvs;
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
                            IAppOpenAdInteractionListener broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            if (broadcastItem != null) {
                                if ("onAdShow".equals(str2)) {
                                    broadcastItem.onAdShow();
                                } else if ("onAdClicked".equals(str2)) {
                                    broadcastItem.onAdClicked();
                                } else if ("onAdSkip".equals(str2)) {
                                    broadcastItem.onAdSkip();
                                } else if ("onAdTimeOver".equals(str2)) {
                                    broadcastItem.onAdTimeOver();
                                } else if ("recycleRes".equals(str2)) {
                                    broadcastItem.onDestroy();
                                }
                            }
                        } catch (Throwable th) {
                            Ju.pvs("MultiProcess", "appOpenAd2 method " + str2 + " throws Exception :", th);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList.kill();
                    }
                }
            }
        } catch (Throwable th2) {
            Ju.pvs("MultiProcess", "appOpenAd1 method " + str2 + " throws Exception :", th2);
        }
    }
}
