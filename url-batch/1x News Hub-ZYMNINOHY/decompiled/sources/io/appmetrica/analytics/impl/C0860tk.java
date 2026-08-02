package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0860tk implements Pc {
    @Override // io.appmetrica.analytics.impl.Pc
    public final void a(Context context) {
        Vm vm = (Vm) Tm.a(C0707nm.class);
        ProtobufStateStorage<Object> a3 = vm.a(context, vm.b(context));
        C0707nm c0707nm = (C0707nm) a3.read();
        C0681mm a4 = c0707nm.a(c0707nm.f7968m);
        a4.o = 0L;
        a3.save(new C0707nm(a4));
    }
}
