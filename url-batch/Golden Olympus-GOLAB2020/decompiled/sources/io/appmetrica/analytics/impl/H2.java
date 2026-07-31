package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class H2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2506b2 fromModel(@NonNull J2 j22) {
        C2506b2 c2506b2 = new C2506b2();
        I2 i22 = j22.f37787a;
        if (i22 != null) {
            int ordinal = i22.ordinal();
            if (ordinal == 1) {
                c2506b2.f38704a = 1;
            } else if (ordinal == 2) {
                c2506b2.f38704a = 2;
            } else if (ordinal == 3) {
                c2506b2.f38704a = 3;
            } else if (ordinal == 4) {
                c2506b2.f38704a = 4;
            } else if (ordinal == 5) {
                c2506b2.f38704a = 5;
            }
        }
        Boolean bool = j22.f37788b;
        if (bool != null) {
            if (bool.booleanValue()) {
                c2506b2.f38705b = 1;
                return c2506b2;
            }
            c2506b2.f38705b = 0;
        }
        return c2506b2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J2 toModel(@NonNull C2506b2 c2506b2) {
        I2 i22;
        int i4 = c2506b2.f38704a;
        Boolean bool = null;
        if (i4 == 1) {
            i22 = I2.ACTIVE;
        } else if (i4 == 2) {
            i22 = I2.WORKING_SET;
        } else if (i4 == 3) {
            i22 = I2.FREQUENT;
        } else if (i4 != 4) {
            i22 = i4 != 5 ? null : I2.RESTRICTED;
        } else {
            i22 = I2.RARE;
        }
        int i5 = c2506b2.f38705b;
        if (i5 == 0) {
            bool = Boolean.FALSE;
        } else if (i5 == 1) {
            bool = Boolean.TRUE;
        }
        return new J2(i22, bool);
    }
}
