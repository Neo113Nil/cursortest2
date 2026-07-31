package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C2137od;
import com.yandex.mobile.ads.impl.m00;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.nd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2114nd implements m00.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f29540a = "com.google.android.gms.org.conscrypt";

    C2114nd() {
    }

    @Override // com.yandex.mobile.ads.impl.m00.a
    public final boolean a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.K(name, this.f29540a + ".", false, 2, null);
    }

    @Override // com.yandex.mobile.ads.impl.m00.a
    @NotNull
    public final C2137od b(@NotNull SSLSocket sslSocket) {
        C2137od b4;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i4 = C2137od.f29980g;
        b4 = C2137od.a.b(sslSocket.getClass());
        return b4;
    }
}
