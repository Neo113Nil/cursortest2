package io.appmetrica.analytics.impl;

import android.os.Process;

/* renamed from: io.appmetrica.analytics.impl.tb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851tb implements InterfaceC0473el {
    @Override // io.appmetrica.analytics.impl.InterfaceC0473el
    public final boolean a(C0774qb c0774qb) {
        Integer num = c0774qb.f;
        return num == null || num.intValue() != Process.myPid();
    }
}
