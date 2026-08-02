package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.se, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0828se implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(Boolean bool) {
        int i3;
        if (bool == null) {
            i3 = -1;
        } else if (bool.equals(Boolean.TRUE)) {
            i3 = 1;
        } else {
            if (!bool.equals(Boolean.FALSE)) {
                throw new O0.b();
            }
            i3 = 0;
        }
        return Integer.valueOf(i3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object toModel(Object obj) {
        return a(((Number) obj).intValue());
    }

    public final Boolean a(int i3) {
        if (i3 == -1) {
            return null;
        }
        if (i3 == 0) {
            return Boolean.FALSE;
        }
        if (i3 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
