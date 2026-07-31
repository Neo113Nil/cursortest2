package com.startapp.sdk.internal;

import com.startapp.json.TypeParser;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class kh implements TypeParser<Long> {
    @Override // com.startapp.json.TypeParser
    public final Long parse(Class<Long> cls, Object obj) {
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(zh.e((String) obj));
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }
}
