package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* loaded from: classes3.dex */
public final class oo implements La {
    @Override // io.appmetrica.analytics.impl.La
    public final String a(Context context) {
        C0312km c0312km;
        try {
            Rm a2 = Qm.a(C0312km.class);
            if (a2 == null) {
                return null;
            }
            Sm sm = (Sm) a2;
            ProtobufStateStorage<Object> a3 = sm.a(context, sm.a(context));
            if (a3 == null || (c0312km = (C0312km) a3.read()) == null) {
                return null;
            }
            return c0312km.f1347a;
        } catch (Throwable unused) {
            return null;
        }
    }
}
