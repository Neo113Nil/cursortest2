package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qy0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xa2 f30933a;

    public qy0(@NotNull xa2 versionParser) {
        Intrinsics.checkNotNullParameter(versionParser, "versionParser");
        this.f30933a = versionParser;
    }

    public final boolean a(@NotNull String current, @Nullable String str) {
        Intrinsics.checkNotNullParameter(current, "current");
        if (str == null || StringsKt.z(str)) {
            return true;
        }
        this.f30933a.getClass();
        wa2 a4 = xa2.a(current);
        if (a4 == null) {
            return true;
        }
        this.f30933a.getClass();
        wa2 a5 = xa2.a(str);
        return a5 == null || a4.compareTo(a5) >= 0;
    }
}
