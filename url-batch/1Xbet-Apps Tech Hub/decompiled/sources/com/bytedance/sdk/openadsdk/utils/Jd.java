package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: AutoTestUtils.java */
/* loaded from: classes2.dex */
public class Jd {
    public static String pvs(String str) {
        if (!com.bytedance.sdk.component.utils.Ju.Jd() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.yiw yiwVar = new com.bytedance.sdk.openadsdk.core.model.yiw(com.bytedance.sdk.openadsdk.core.so.icD().kj());
        StringBuilder sb = new StringBuilder(str);
        Iterator<String> it = yiwVar.icD().iterator();
        while (it.hasNext()) {
            if (sb.toString().contains(it.next())) {
                if (sb.toString().contains("?")) {
                    sb.append("&").append(yiwVar.pvs());
                } else {
                    sb.append("?").append(yiwVar.pvs());
                }
            }
        }
        return sb.toString();
    }
}
