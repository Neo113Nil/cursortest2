package com.yandex.mobile.ads.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.s5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2220s5 implements a20 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zy1 f31586a;

    public C2220s5(@NotNull zy1 skipAdController) {
        Intrinsics.checkNotNullParameter(skipAdController, "skipAdController");
        this.f31586a = skipAdController;
    }

    @Override // com.yandex.mobile.ads.impl.a20
    public final boolean a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!Intrinsics.areEqual(uri.getHost(), "showNextAd")) {
            return false;
        }
        this.f31586a.a();
        return true;
    }
}
