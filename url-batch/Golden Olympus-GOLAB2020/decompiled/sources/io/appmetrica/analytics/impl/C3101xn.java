package io.appmetrica.analytics.impl;

import android.os.Looper;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.xn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3101xn implements InterfaceC3153zn {
    @Override // io.appmetrica.analytics.impl.InterfaceC3153zn
    public final Thread a() {
        return Looper.getMainLooper().getThread();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3153zn
    public final StackTraceElement[] b() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3153zn
    public final Map c() {
        return Thread.getAllStackTraces();
    }
}
