package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.no, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0831no implements Ka {
    @Override // io.appmetrica.analytics.impl.Ka
    public final String a(Context context) {
        C0725jm c0725jm;
        try {
            Qm a3 = Pm.a(C0725jm.class);
            if (a3 == null) {
                return null;
            }
            Rm rm = (Rm) a3;
            ProtobufStateStorage<Object> a4 = rm.a(context, rm.a(context));
            if (a4 == null || (c0725jm = (C0725jm) a4.read()) == null) {
                return null;
            }
            return c0725jm.f12156a;
        } catch (Throwable unused) {
            return null;
        }
    }
}
