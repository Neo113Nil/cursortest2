package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class Xm extends O4 {

    /* renamed from: g, reason: collision with root package name */
    public final In f38542g;

    public Xm(@NonNull String str, @NonNull String str2, @NonNull In in, @NonNull InterfaceC2895po interfaceC2895po, @NonNull W2 w22) {
        super(0, str, str2, interfaceC2895po, w22);
        this.f38542g = in;
    }

    @Override // io.appmetrica.analytics.impl.O4
    public final void a(@NonNull C2555co c2555co) {
        String str = (String) this.f38542g.a((String) this.f38048f);
        c2555co.f38804d.f38941a = str == null ? new byte[0] : str.getBytes();
    }

    public final In h() {
        return this.f38542g;
    }
}
