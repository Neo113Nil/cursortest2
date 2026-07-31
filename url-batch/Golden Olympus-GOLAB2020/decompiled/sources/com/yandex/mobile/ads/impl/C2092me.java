package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.me, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2092me {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2115ne f29029a = new C2115ne();

    private static String a(String str) {
        return "Internal state wasn't completely configured. " + str + ".";
    }

    @NotNull
    public final String a(@NotNull EnumC2344xe reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f29029a.getClass();
        return a(C2115ne.a(reason));
    }

    @NotNull
    public static String a() {
        return a("Connection timeout");
    }
}
