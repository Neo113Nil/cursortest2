package com.bytedance.sdk.openadsdk.multipro.aidl.pvs;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: DislikeClosedListenerManagerImpl.java */
/* loaded from: classes2.dex */
public class Jd extends pvs {
    private static volatile Jd icD;
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> pvs = new ConcurrentHashMap<>();

    public static Jd pvs() {
        if (icD == null) {
            synchronized (Jd.class) {
                if (icD == null) {
                    icD = new Jd();
                }
            }
        }
        return icD;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        pvs.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        pvs.remove(str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        pvs(str, str2);
    }

    private synchronized void pvs(String str, String str2) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList;
        try {
            ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> concurrentHashMap = pvs;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i = 0; i < beginBroadcast; i++) {
                    try {
                        IDislikeClosedListener broadcastItem = remoteCallbackList.getBroadcastItem(i);
                        if (broadcastItem != null && "onItemClickClosed".equals(str2)) {
                            broadcastItem.onItemClickClosed();
                        }
                    } catch (Throwable th) {
                        Ju.pvs("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th);
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th2) {
            Ju.pvs("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th2);
        }
    }
}
