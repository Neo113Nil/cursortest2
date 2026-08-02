package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.le, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769le implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(Boolean bool) {
        int i4;
        if (bool == null) {
            i4 = -1;
        } else if (bool.equals(Boolean.TRUE)) {
            i4 = 1;
        } else {
            if (!bool.equals(Boolean.FALSE)) {
                throw new G1.a();
            }
            i4 = 0;
        }
        return Integer.valueOf(i4);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object toModel(Object obj) {
        return a(((Number) obj).intValue());
    }

    public final Boolean a(int i4) {
        if (i4 == -1) {
            return null;
        }
        if (i4 == 0) {
            return Boolean.FALSE;
        }
        if (i4 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
