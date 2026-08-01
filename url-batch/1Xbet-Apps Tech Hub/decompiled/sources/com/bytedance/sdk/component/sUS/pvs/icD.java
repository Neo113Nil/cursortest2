package com.bytedance.sdk.component.sUS.pvs;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: AdLogManager.java */
/* loaded from: classes.dex */
public class icD {
    private static volatile List<Object> pvs = new ArrayList();

    public static void pvs(pvs pvsVar, Context context) {
        Jd.pvs.pvs(pvsVar, context);
    }

    public static void pvs(boolean z) {
        Jd.pvs.pvs(z);
    }

    public static List<Object> pvs() {
        return pvs;
    }

    public static boolean icD() {
        return so.yiw().mnm() == null || so.yiw().sUS() == null;
    }

    public static void vG() {
        pvs(false);
        Jd.pvs.pvs();
    }

    public static void Jd() {
        Jd.pvs.icD();
    }

    public static void pvs(String str, boolean z) {
        Jd.pvs.pvs(str, z);
    }

    public static void pvs(String str, List<String> list, boolean z, int i, String str2) {
        pvs(str, list, z, null, i, str2);
    }

    public static void pvs(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        Jd.pvs.pvs(str, list, z, map, i, str2);
    }

    public static void NB() {
        Jd jd = Jd.pvs;
    }

    public static void pvs(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar) {
        Jd.pvs.pvs(pvsVar);
    }
}
