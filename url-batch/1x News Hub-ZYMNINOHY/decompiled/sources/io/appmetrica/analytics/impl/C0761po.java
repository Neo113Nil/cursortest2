package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.po, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761po implements Ra {
    @Override // io.appmetrica.analytics.impl.Ra
    public final String a(Context context) {
        C0707nm c0707nm;
        try {
            Um a3 = Tm.a(C0707nm.class);
            if (a3 == null) {
                return null;
            }
            Vm vm = (Vm) a3;
            ProtobufStateStorage<Object> a4 = vm.a(context, vm.a(context));
            if (a4 == null || (c0707nm = (C0707nm) a4.read()) == null) {
                return null;
            }
            return c0707nm.f7957a;
        } catch (Throwable unused) {
            return null;
        }
    }
}
