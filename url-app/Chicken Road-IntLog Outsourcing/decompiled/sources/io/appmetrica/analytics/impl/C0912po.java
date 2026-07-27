package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.po, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0912po implements Ra {
    @Override // io.appmetrica.analytics.impl.Ra
    public final String a(Context context) {
        C0858nm c0858nm;
        try {
            Um a6 = Tm.a(C0858nm.class);
            if (a6 != null) {
                Vm vm = (Vm) a6;
                ProtobufStateStorage<Object> a7 = vm.a(context, vm.a(context));
                if (a7 != null && (c0858nm = (C0858nm) a7.read()) != null) {
                    return c0858nm.f8874a;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
