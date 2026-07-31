package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class m00 implements a12 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f28820a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private a12 f28821b;

    public interface a {
        boolean a(@NotNull SSLSocket sSLSocket);

        @NotNull
        C2137od b(@NotNull SSLSocket sSLSocket);
    }

    public m00(@NotNull C2114nd socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f28820a = socketAdapterFactory;
    }

    @Override // com.yandex.mobile.ads.impl.a12
    public final boolean a() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.a12
    @Nullable
    public final String b(@NotNull SSLSocket sslSocket) {
        a12 a12Var;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        synchronized (this) {
            try {
                if (this.f28821b == null && this.f28820a.a(sslSocket)) {
                    this.f28821b = this.f28820a.b(sslSocket);
                }
                a12Var = this.f28821b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a12Var != null) {
            return a12Var.b(sslSocket);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.a12
    public final void a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends gm1> protocols) {
        a12 a12Var;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        synchronized (this) {
            try {
                if (this.f28821b == null && this.f28820a.a(sslSocket)) {
                    this.f28821b = this.f28820a.b(sslSocket);
                }
                a12Var = this.f28821b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a12Var != null) {
            a12Var.a(sslSocket, str, protocols);
        }
    }

    @Override // com.yandex.mobile.ads.impl.a12
    public final boolean a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f28820a.a(sslSocket);
    }
}
