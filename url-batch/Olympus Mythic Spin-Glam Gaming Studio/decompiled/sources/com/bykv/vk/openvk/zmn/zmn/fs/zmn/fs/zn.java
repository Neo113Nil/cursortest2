package com.bykv.vk.openvk.zmn.zmn.fs.zmn.fs;

import android.content.Context;
import com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class zn {
    public static final ConcurrentHashMap<String, fs> zmn = new ConcurrentHashMap<>();

    public static synchronized void zmn(Context context, com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, zmn.InterfaceC0101zmn interfaceC0101zmn) {
        synchronized (zn.class) {
            if (znVar == null) {
                return;
            }
            try {
                ConcurrentHashMap<String, fs> concurrentHashMap = zmn;
                fs fsVar = concurrentHashMap.get(znVar.olo());
                if (fsVar == null) {
                    fsVar = new fs(context, znVar);
                    concurrentHashMap.put(znVar.olo(), fsVar);
                    znVar.hhw();
                    znVar.olo();
                }
                fsVar.zmn(interfaceC0101zmn);
                znVar.hhw();
                znVar.olo();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        synchronized (zn.class) {
            try {
                fs remove = zmn.remove(znVar.olo());
                if (remove != null) {
                    remove.zmn(true);
                }
                znVar.hhw();
                znVar.olo();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
