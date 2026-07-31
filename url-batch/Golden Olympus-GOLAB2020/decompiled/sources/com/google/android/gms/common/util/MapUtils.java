package com.google.android.gms.common.util;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MapUtils {
    public static void writeStringMapToJson(StringBuilder sb, HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z4 = true;
        for (String str : hashMap.keySet()) {
            if (!z4) {
                sb.append(StringUtils.COMMA);
            }
            String str2 = hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z4 = false;
        }
        sb.append("}");
    }
}
