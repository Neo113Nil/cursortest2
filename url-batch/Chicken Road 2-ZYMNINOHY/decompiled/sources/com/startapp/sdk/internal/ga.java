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
            WeakHashMap weakHashMap = si.f7575a;
            String[] split = ((String) obj).split(StringUtils.COMMA);
            int length = split.length;
            int[] iArr2 = new int[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    iArr2[i4] = Integer.parseInt(split[i4].trim());
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
            for (int i5 = 0; i5 < length2; i5++) {
                Object opt = jSONArray.opt(i5);
                if (opt instanceof Number) {
                    iArr[i5] = ((Number) opt).intValue();
                } else if (opt instanceof String) {
                    String str = (String) opt;
                    WeakHashMap weakHashMap2 = si.f7575a;
                    if (str != null) {
                        try {
                            parseInt = Integer.parseInt(str);
                        } catch (NumberFormatException unused2) {
                        }
                        iArr[i5] = parseInt;
                    }
                    parseInt = 0;
                    iArr[i5] = parseInt;
                }
            }
        }
        return iArr;
    }
}
