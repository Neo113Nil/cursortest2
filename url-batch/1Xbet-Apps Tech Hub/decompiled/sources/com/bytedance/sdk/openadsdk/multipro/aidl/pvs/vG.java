package com.bytedance.sdk.openadsdk.multipro.aidl.pvs;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

/* compiled from: CommonPermissionListenerManagerImpl.java */
/* loaded from: classes2.dex */
public class vG extends pvs {
    private static volatile vG icD;
    private static final HashMap<String, RemoteCallbackList<ICommonPermissionListener>> pvs = new HashMap<>();

    public static vG pvs() {
        if (icD == null) {
            synchronized (vG.class) {
                if (icD == null) {
                    icD = new vG();
                }
            }
        }
        return icD;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs, com.bytedance.sdk.openadsdk.IListenerManager
    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        if (iCommonPermissionListener == null) {
            return;
        }
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iCommonPermissionListener);
        pvs.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs, com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        RemoteCallbackList<ICommonPermissionListener> remove = pvs.remove(str);
        if (remove == null) {
            return;
        }
        int beginBroadcast = remove.beginBroadcast();
        for (int i = 0; i < beginBroadcast; i++) {
            ICommonPermissionListener broadcastItem = remove.getBroadcastItem(i);
            if (broadcastItem != null) {
                if (str2 == null) {
                    broadcastItem.onGranted();
                } else {
                    broadcastItem.onDenied(str2);
                }
            }
        }
        remove.finishBroadcast();
        remove.kill();
    }
}
