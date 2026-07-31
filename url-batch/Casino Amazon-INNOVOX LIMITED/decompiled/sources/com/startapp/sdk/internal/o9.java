package com.startapp.sdk.internal;

import com.startapp.json.TypeParser;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class o9 implements TypeParser<int[][]> {
    @Override // com.startapp.json.TypeParser
    public final int[][] parse(Class<int[][]> cls, Object obj) {
        if (obj instanceof Number) {
            return new int[][]{new int[]{((Number) obj).intValue(), Integer.MAX_VALUE}};
        }
        if (obj instanceof String) {
            try {
                return zh.f((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
