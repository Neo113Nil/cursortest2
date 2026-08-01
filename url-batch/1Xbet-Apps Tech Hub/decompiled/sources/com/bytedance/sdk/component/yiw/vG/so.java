package com.bytedance.sdk.component.yiw.vG;

import android.content.Context;
import java.util.HashMap;

/* compiled from: TncInstanceManager.java */
/* loaded from: classes.dex */
public class so {
    private static HashMap<Integer, sUS> icD;
    private static volatile so pvs;
    private static HashMap<Integer, pvs> vG;

    private so() {
        icD = new HashMap<>();
        vG = new HashMap<>();
    }

    public static synchronized so pvs() {
        so soVar;
        synchronized (so.class) {
            if (pvs == null) {
                synchronized (so.class) {
                    if (pvs == null) {
                        pvs = new so();
                    }
                }
            }
            soVar = pvs;
        }
        return soVar;
    }

    public sUS pvs(int i) {
        sUS sus = icD.get(Integer.valueOf(i));
        if (sus != null) {
            return sus;
        }
        sUS sus2 = new sUS(i);
        icD.put(Integer.valueOf(i), sus2);
        return sus2;
    }

    public pvs pvs(int i, Context context) {
        pvs pvsVar = vG.get(Integer.valueOf(i));
        if (pvsVar != null) {
            return pvsVar;
        }
        pvs pvsVar2 = new pvs(context, i);
        vG.put(Integer.valueOf(i), pvsVar2);
        return pvsVar2;
    }
}
