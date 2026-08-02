package io.appmetrica.analytics.impl;

import android.os.Process;

/* loaded from: classes.dex */
public final class Gd implements InterfaceC0492al {

    /* renamed from: a, reason: collision with root package name */
    public final int f10316a;

    public Gd(int i4) {
        this.f10316a = i4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0492al
    public final boolean a(String str) {
        return this.f10316a != Process.myPid();
    }
}
