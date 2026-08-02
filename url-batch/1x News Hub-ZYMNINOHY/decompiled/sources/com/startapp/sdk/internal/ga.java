package com.startapp.sdk.internal;

import com.startapp.json.TypeParser;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.WeakHashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class ga implements TypeParser<int[]> {
    @Override // com.startapp.json.TypeParser
    public final int[] parse(Class<int[]> cls, Object obj) {
        int parseInt;
        if (obj instanceof Number) {
            return new int[]{((Number) obj).intValue()};
        }
        int[] iArr = null;
        if (obj instanceof String) {
            WeakHashMap weakHashMap = si.f4438a;
            String[] split = ((String) obj).split(StringUtils.COMMA);
            int length = split.length;
            int[] iArr2 = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    iArr2[i3] = Integer.parseInt(split[i3].trim());
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            return iArr2;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = new JSONArray();
            int length2 = jSONArray.length();
            iArr = new int[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                Object opt = jSONArray.opt(i4);
                if (opt instanceof Number) {
                    iArr[i4] = ((Number) opt).intValue();
                } else if (opt instanceof String) {
                    String str = (String) opt;
                    WeakHashMap weakHashMap2 = si.f4438a;
                    if (str != null) {
                        try {
                            parseInt = Integer.parseInt(str);
                        } catch (NumberFormatException unused2) {
                        }
                        iArr[i4] = parseInt;
                    }
                    parseInt = 0;
                    iArr[i4] = parseInt;
                }
            }
        }
        return iArr;
    }
}
