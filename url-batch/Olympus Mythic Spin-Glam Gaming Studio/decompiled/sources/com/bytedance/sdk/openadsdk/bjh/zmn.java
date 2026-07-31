package com.bytedance.sdk.openadsdk.bjh;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.mw;
import com.bytedance.sdk.openadsdk.utils.oub;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class zmn {
    private static int zmn(int i) {
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

    public static List<String> zmn(List<String> list, boolean z) {
        String zmn = mw.zmn(kgc.zmn());
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
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(zmn)) {
                next = next.replace("{UID}", zmn).replace("__UID__", zmn);
            }
            if (z) {
                next = zmn(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    public static String zmn(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String zmn = mw.zmn(kgc.zmn());
        if (str.contains("{TS}") || str.contains("__TS__")) {
            long currentTimeMillis = System.currentTimeMillis();
            str = str.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
        }
        if ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(zmn)) {
            str = str.replace("{UID}", zmn).replace("__UID__", zmn);
        }
        return z ? zmn(str) : str;
    }

    private static String zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            iqz.zn("TrackAdUrlUtils", e.getMessage());
            return str;
        }
    }

    public static List<String> zmn(List<String> list, boolean z, nqi nqiVar) {
        String zmn = mw.zmn(kgc.zmn());
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
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(zmn)) {
                next = next.replace("{UID}", zmn).replace("__UID__", zmn);
            }
            if (next.contains("__CID__") && nqiVar != null && !TextUtils.isEmpty(nqiVar.ji())) {
                next = next.replace("__CID__", nqiVar.ji());
            }
            if (next.contains("__CTYPE__") && nqiVar != null) {
                next = next.replace("__CTYPE__", String.valueOf(zmn(nqiVar.zq())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().fs());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(oub.fb()));
            }
            if (z) {
                next = zmn(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
