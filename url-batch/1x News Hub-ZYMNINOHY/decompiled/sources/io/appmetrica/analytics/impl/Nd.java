package io.appmetrica.analytics.impl;

import android.os.Process;

/* loaded from: classes.dex */
public final class Nd implements InterfaceC0473el {

    /* renamed from: a, reason: collision with root package name */
    public final int f6371a;

    public Nd(int i3) {
        this.f6371a = i3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0473el
    public final boolean a(String str) {
        return this.f6371a != Process.myPid();
    }
}
