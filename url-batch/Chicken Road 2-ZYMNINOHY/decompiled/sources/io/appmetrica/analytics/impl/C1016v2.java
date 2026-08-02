package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1016v2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V1 fromModel(C1068x2 c1068x2) {
        V1 v12 = new V1();
        EnumC1042w2 enumC1042w2 = c1068x2.f12990a;
        if (enumC1042w2 != null) {
            int ordinal = enumC1042w2.ordinal();
            if (ordinal == 0) {
                v12.f11090a = 6;
            } else if (ordinal == 1) {
                v12.f11090a = 1;
            } else if (ordinal == 2) {
                v12.f11090a = 2;
            } else if (ordinal == 3) {
                v12.f11090a = 3;
            } else if (ordinal == 4) {
                v12.f11090a = 4;
            } else if (ordinal != 5) {
                v12.f11090a = 0;
            } else {
                v12.f11090a = 5;
            }
        }
        Boolean bool = c1068x2.f12991b;
        if (bool != null) {
            if (bool.booleanValue()) {
                v12.f11091b = 1;
                return v12;
            }
            v12.f11091b = 0;
        }
        return v12;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1068x2 toModel(V1 v12) {
        EnumC1042w2 enumC1042w2;
        Boolean bool = null;
        switch (v12.f11090a) {
            case 1:
                enumC1042w2 = EnumC1042w2.ACTIVE;
                break;
            case 2:
                enumC1042w2 = EnumC1042w2.WORKING_SET;
                break;
            case 3:
                enumC1042w2 = EnumC1042w2.FREQUENT;
                break;
            case 4:
                enumC1042w2 = EnumC1042w2.RARE;
                break;
            case 5:
                enumC1042w2 = EnumC1042w2.RESTRICTED;
                break;
            case 6:
                enumC1042w2 = EnumC1042w2.EXEMPTED;
                break;
            default:
                enumC1042w2 = null;
                break;
        }
        int i4 = v12.f11091b;
        if (i4 == 0) {
            bool = Boolean.FALSE;
        } else if (i4 == 1) {
            bool = Boolean.TRUE;
        }
        return new C1068x2(enumC1042w2, bool);
    }
}
