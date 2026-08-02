package com.startapp.sdk.internal;

import com.startapp.json.TypeParser;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ha implements TypeParser<int[][]> {
    @Override // com.startapp.json.TypeParser
    public final int[][] parse(Class<int[][]> cls, Object obj) {
        if (obj instanceof Number) {
            return new int[][]{new int[]{((Number) obj).intValue(), Integer.MAX_VALUE}};
        }
        if (obj instanceof String) {
            String str = (String) obj;
            WeakHashMap weakHashMap = si.f4438a;
            if (str != null) {
                try {
                    return si.g(str);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }
}
