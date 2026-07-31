package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.qk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0461qk implements Jc {
    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(Context context) {
        Sm sm = (Sm) Qm.a(C0312km.class);
        ProtobufStateStorage<Object> a2 = sm.a(context, sm.b(context));
        C0312km c0312km = (C0312km) a2.read();
        C0286jm a3 = c0312km.a(c0312km.m);
        a3.o = 0L;
        a2.save(new C0312km(a3));
    }
}
