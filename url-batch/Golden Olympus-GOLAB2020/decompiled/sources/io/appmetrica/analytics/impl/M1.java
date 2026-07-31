package io.appmetrica.analytics.impl;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class M1 implements InterfaceC2787lk {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final L1 f37937b = new L1();

    /* renamed from: c, reason: collision with root package name */
    public static final int f37938c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2871p0 f37939a;

    public M1(@NotNull InterfaceC2871p0 interfaceC2871p0) {
        this.f37939a = interfaceC2871p0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2787lk
    public final void reportData(int i4, @NotNull Bundle bundle) {
        ((J1) this.f37939a).a(bundle);
    }
}
