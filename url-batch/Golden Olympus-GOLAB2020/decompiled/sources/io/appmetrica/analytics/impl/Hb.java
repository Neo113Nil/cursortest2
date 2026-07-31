package io.appmetrica.analytics.impl;

import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Hb implements InterfaceC2498al {
    @Override // io.appmetrica.analytics.impl.InterfaceC2498al
    public final boolean a(@NotNull Eb eb) {
        Integer num = eb.f37434f;
        return num == null || num.intValue() != Process.myPid();
    }
}
