package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Al implements X2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37190a;

    public Al(@NotNull Context context) {
        this.f37190a = context;
    }

    @Override // io.appmetrica.analytics.impl.X2, io.appmetrica.analytics.impl.InterfaceC2763km
    public final void a(@NotNull C2633fm c2633fm) {
    }

    @NotNull
    public final Context b() {
        return this.f37190a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }
}
