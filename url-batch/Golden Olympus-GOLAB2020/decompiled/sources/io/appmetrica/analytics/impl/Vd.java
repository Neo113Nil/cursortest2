package io.appmetrica.analytics.impl;

import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Vd implements InterfaceC2498al {

    /* renamed from: a, reason: collision with root package name */
    public final int f38423a;

    public Vd(int i4) {
        this.f38423a = i4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2498al
    public final boolean a(@NotNull String str) {
        return this.f38423a != Process.myPid();
    }
}
