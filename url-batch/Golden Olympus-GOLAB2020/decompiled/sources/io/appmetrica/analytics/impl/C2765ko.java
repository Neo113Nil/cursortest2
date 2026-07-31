package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.ko, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2765ko implements InterfaceC2622fb {
    @Override // io.appmetrica.analytics.impl.InterfaceC2622fb
    @Nullable
    public final String a(@NotNull Context context) {
        ProtobufStateStorage<Object> a4;
        C2737jm c2737jm;
        try {
            Rm a5 = Qm.a(C2737jm.class);
            if (a5 == null || (a4 = a5.a(context, a5.c(context))) == null || (c2737jm = (C2737jm) a4.read()) == null) {
                return null;
            }
            return c2737jm.f39294a;
        } catch (Throwable unused) {
            return null;
        }
    }
}
