package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class oc1 implements nc1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2394zi f29976a;

    public /* synthetic */ oc1() {
        this(new C2394zi());
    }

    @Override // com.yandex.mobile.ads.impl.nc1
    @Nullable
    public final String a(@NotNull pq1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        byte[] a4 = networkResponse.a().a();
        if (a4 == null) {
            return null;
        }
        if (!cf0.a(networkResponse.b(), bh0.f23779d0, true)) {
            return new String(a4, Charsets.UTF_8);
        }
        this.f29976a.getClass();
        return C2394zi.a(a4);
    }

    public oc1(@NotNull C2394zi base64Decoder) {
        Intrinsics.checkNotNullParameter(base64Decoder, "base64Decoder");
        this.f29976a = base64Decoder;
    }
}
