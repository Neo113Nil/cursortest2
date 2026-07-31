package com.startapp.sdk.internal;

import com.startapp.json.TypeParser;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.WeakHashMap;
import org.json.JSONArray;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class n9 implements TypeParser<int[]> {
    @Override // com.startapp.json.TypeParser
    public final int[] parse(Class<int[]> cls, Object obj) {
        int i;
        if (obj instanceof Number) {
            return new int[]{((Number) obj).intValue()};
        }
        int[] iArr = null;
        if (obj instanceof String) {
            WeakHashMap weakHashMap = zh.f528a;
            String[] split = ((String) obj).split(StringUtils.COMMA);
            int length = split.length;
            int[] iArr2 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    iArr2[i2] = Integer.parseInt(split[i2].trim());
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
            for (int i3 = 0; i3 < length2; i3++) {
                Object opt = jSONArray.opt(i3);
                if (opt instanceof Number) {
                    iArr[i3] = ((Number) opt).intValue();
                } else if (opt instanceof String) {
                    String str = (String) opt;
                    WeakHashMap weakHashMap2 = zh.f528a;
                    try {
                        i = Integer.parseInt(str);
                    } catch (NumberFormatException unused2) {
                        i = 0;
                    }
                    iArr[i3] = i;
                }
            }
        }
        return iArr;
    }
}
