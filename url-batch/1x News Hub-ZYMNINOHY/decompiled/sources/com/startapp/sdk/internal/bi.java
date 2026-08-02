package com.startapp.sdk.internal;

import com.startapp.json.TypeParser;

/* loaded from: classes.dex */
public class bi implements TypeParser<Long> {
    @Override // com.startapp.json.TypeParser
    public final Long parse(Class<Long> cls, Object obj) {
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(si.f((String) obj));
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }
}
