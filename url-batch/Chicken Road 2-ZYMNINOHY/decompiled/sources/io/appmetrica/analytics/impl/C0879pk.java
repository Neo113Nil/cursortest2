package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.pk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0879pk implements Ic {
    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(Context context) {
        Rm rm = (Rm) Pm.a(C0725jm.class);
        ProtobufStateStorage<Object> a3 = rm.a(context, rm.b(context));
        C0725jm c0725jm = (C0725jm) a3.read();
        C0699im a4 = c0725jm.a(c0725jm.f12168m);
        a4.o = 0L;
        a3.save(new C0725jm(a4));
    }
}
