package com.bykv.vk.openvk.component.video.pvs.icD;

import android.content.Context;
import android.util.Log;
import com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG;
import com.bytedance.sdk.component.utils.Ju;
import java.util.Set;

/* compiled from: Proxy.java */
/* loaded from: classes.dex */
public class NB {
    public static volatile boolean Jd;
    public static volatile Integer Mxy;
    private static volatile com.bykv.vk.openvk.component.video.pvs.icD.icD.vG Wyp;
    static volatile com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG icD;
    static volatile com.bykv.vk.openvk.component.video.pvs.icD.pvs.icD pvs;
    private static volatile Context qh;
    static volatile boolean sUS;
    public static final boolean vG = Ju.Jd();
    static volatile boolean NB = true;
    static volatile int yiw = 0;
    public static volatile int so = 3;

    public static Context pvs() {
        return qh;
    }

    public static void pvs(boolean z) {
        NB = z;
    }

    public static void icD(boolean z) {
        sUS = z;
    }

    public static void pvs(int i) {
        yiw = i;
    }

    public static void pvs(com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG vGVar, Context context) {
        if (vGVar == null || context == null) {
            throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
        }
        qh = context.getApplicationContext();
        if (icD != null) {
            return;
        }
        if (pvs != null) {
            throw null;
        }
        icD = vGVar;
        Wyp = com.bykv.vk.openvk.component.video.pvs.icD.icD.vG.pvs(context);
        icD.pvs(new vG.pvs() { // from class: com.bykv.vk.openvk.component.video.pvs.icD.NB.1
            @Override // com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG.pvs
            public void pvs(String str) {
                if (NB.vG) {
                    Log.i("TAG_PROXY_DiskLruCache", "new cache created: ".concat(String.valueOf(str)));
                }
            }

            @Override // com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG.pvs
            public void pvs(Set<String> set) {
                NB.Wyp.pvs(set, 0);
                if (NB.vG) {
                    Log.i("TAG_PROXY_DiskLruCache", "cache file removed, ".concat(String.valueOf(set)));
                }
            }
        });
        sUS pvs2 = sUS.pvs();
        pvs2.pvs(vGVar);
        pvs2.pvs(Wyp);
        Jd vG2 = Jd.vG();
        vG2.pvs(vGVar);
        vG2.pvs(Wyp);
    }

    public static com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG icD() {
        return icD;
    }

    public static com.bykv.vk.openvk.component.video.pvs.icD.pvs.icD vG() {
        return pvs;
    }
}
