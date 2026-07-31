package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.wk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3072wk implements InterfaceC2571dd {
    @Override // io.appmetrica.analytics.impl.InterfaceC2571dd
    public final void a(@NotNull Context context) {
        Rm a4 = Qm.a(C2737jm.class);
        ProtobufStateStorage<Object> a5 = a4.a(context, a4.d(context));
        C2737jm c2737jm = (C2737jm) a5.read();
        C2711im a6 = c2737jm.a(c2737jm.f39306m);
        a6.f39232o = 0L;
        a5.save(new C2737jm(a6));
    }
}
