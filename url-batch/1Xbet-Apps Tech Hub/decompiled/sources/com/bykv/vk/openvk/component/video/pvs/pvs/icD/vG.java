package com.bykv.vk.openvk.component.video.pvs.pvs.icD;

import android.content.Context;
import com.bykv.vk.openvk.component.video.api.NB.pvs;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: VideoFileManager.java */
/* loaded from: classes.dex */
public class vG {
    public static final ConcurrentHashMap<String, icD> pvs = new ConcurrentHashMap<>();

    public static synchronized void pvs(Context context, com.bykv.vk.openvk.component.video.api.vG.vG vGVar, pvs.InterfaceC0017pvs interfaceC0017pvs) {
        synchronized (vG.class) {
            if (vGVar == null) {
                return;
            }
            ConcurrentHashMap<String, icD> concurrentHashMap = pvs;
            icD icd = concurrentHashMap.get(vGVar.IP());
            if (icd == null) {
                icd = new icD(context, vGVar);
                concurrentHashMap.put(vGVar.IP(), icd);
                Object[] objArr = new Object[3];
                Integer.valueOf(vGVar.vG());
                vGVar.IP();
            }
            icd.pvs(interfaceC0017pvs);
            Object[] objArr2 = new Object[3];
            Integer.valueOf(vGVar.vG());
            vGVar.IP();
        }
    }

    public static synchronized void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        synchronized (vG.class) {
            icD remove = pvs.remove(vGVar.IP());
            if (remove != null) {
                remove.pvs(true);
            }
            Object[] objArr = new Object[3];
            Integer.valueOf(vGVar.vG());
            vGVar.IP();
        }
    }
}
