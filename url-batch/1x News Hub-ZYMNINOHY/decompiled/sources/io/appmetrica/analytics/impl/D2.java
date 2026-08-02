package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class D2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0454e2 fromModel(F2 f22) {
        C0454e2 c0454e2 = new C0454e2();
        E2 e22 = f22.f5979a;
        if (e22 != null) {
            int ordinal = e22.ordinal();
            if (ordinal == 1) {
                c0454e2.f7221a = 1;
            } else if (ordinal == 2) {
                c0454e2.f7221a = 2;
            } else if (ordinal == 3) {
                c0454e2.f7221a = 3;
            } else if (ordinal == 4) {
                c0454e2.f7221a = 4;
            } else if (ordinal == 5) {
                c0454e2.f7221a = 5;
            }
        }
        Boolean bool = f22.f5980b;
        if (bool != null) {
            if (bool.booleanValue()) {
                c0454e2.f7222b = 1;
                return c0454e2;
            }
            c0454e2.f7222b = 0;
        }
        return c0454e2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F2 toModel(C0454e2 c0454e2) {
        E2 e22;
        int i3 = c0454e2.f7221a;
        Boolean bool = null;
        if (i3 == 1) {
            e22 = E2.ACTIVE;
        } else if (i3 == 2) {
            e22 = E2.WORKING_SET;
        } else if (i3 == 3) {
            e22 = E2.FREQUENT;
        } else if (i3 != 4) {
            e22 = i3 != 5 ? null : E2.RESTRICTED;
        } else {
            e22 = E2.RARE;
        }
        int i4 = c0454e2.f7222b;
        if (i4 == 0) {
            bool = Boolean.FALSE;
        } else if (i4 == 1) {
            bool = Boolean.TRUE;
        }
        return new F2(e22, bool);
    }
}
