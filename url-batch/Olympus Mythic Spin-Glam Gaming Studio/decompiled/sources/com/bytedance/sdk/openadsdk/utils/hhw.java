package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.ironsource.X3;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class hhw {
    public static String zmn(String str) {
        if (!com.bytedance.sdk.component.utils.cn.zn() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.iv ivVar = new com.bytedance.sdk.openadsdk.core.model.iv(com.bytedance.sdk.openadsdk.core.iv.fs().klz());
        StringBuilder sb = new StringBuilder(str);
        Iterator<String> it = ivVar.fs().iterator();
        while (it.hasNext()) {
            if (sb.toString().contains(it.next())) {
                if (sb.toString().contains("?")) {
                    sb.append(X3.j.c);
                    sb.append(ivVar.zmn());
                } else {
                    sb.append("?");
                    sb.append(ivVar.zmn());
                }
            }
        }
        return sb.toString();
    }
}
