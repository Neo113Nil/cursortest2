package com.bytedance.sdk.openadsdk.mnm;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.utils.jlb;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: TrackAdUrlUtils.java */
/* loaded from: classes2.dex */
public class pvs {
    private static int pvs(int i) {
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i != 5 && i != 15) {
                        return -1;
                    }
                }
            }
        }
        return i2;
    }

    public static List<String> pvs(List<String> list, boolean z) {
        String pvs = qh.pvs(mnm.pvs());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(pvs)) {
                next = next.replace("{UID}", pvs).replace("__UID__", pvs);
            }
            if (z) {
                next = pvs(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private static String pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            Ju.pvs("TrackAdUrlUtils", e.getMessage());
            return str;
        }
    }

    public static List<String> pvs(List<String> list, boolean z, cR cRVar) {
        String pvs = qh.pvs(mnm.pvs());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(pvs)) {
                next = next.replace("{UID}", pvs).replace("__UID__", pvs);
            }
            if (next.contains("__CID__") && cRVar != null && !TextUtils.isEmpty(cRVar.neB())) {
                next = next.replace("__CID__", cRVar.neB());
            }
            if (next.contains("__CTYPE__") && cRVar != null) {
                next = next.replace("__CTYPE__", String.valueOf(pvs(cRVar.Ye())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", com.com.bytedance.overseas.sdk.icD.pvs.pvs().icD());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(jlb.vG()));
            }
            if (z) {
                next = pvs(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
