package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Ae implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(@Nullable Boolean bool) {
        int i4;
        if (bool == null) {
            i4 = -1;
        } else if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            i4 = 1;
        } else {
            if (!Intrinsics.areEqual(bool, Boolean.FALSE)) {
                throw new W1.m();
            }
            i4 = 0;
        }
        return Integer.valueOf(i4);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object toModel(Object obj) {
        return a(((Number) obj).intValue());
    }

    @Nullable
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
