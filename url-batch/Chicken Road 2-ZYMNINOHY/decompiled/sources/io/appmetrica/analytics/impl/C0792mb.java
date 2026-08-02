package io.appmetrica.analytics.impl;

import android.os.Process;

/* renamed from: io.appmetrica.analytics.impl.mb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0792mb implements InterfaceC0492al {
    @Override // io.appmetrica.analytics.impl.InterfaceC0492al
    public final boolean a(C0714jb c0714jb) {
        Integer num = c0714jb.f12122f;
        return num == null || num.intValue() != Process.myPid();
    }
}
