package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.m9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2087m9 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private String f28949a;

    @Nullable
    public final String a() {
        return this.f28949a;
    }

    public final void a(@Nullable String str) {
        if (str == null || StringsKt.z(str)) {
            po0.c("Ad Unit Id can't be null or empty.", new Object[0]);
            return;
        }
        String str2 = this.f28949a;
        if (str2 == null || Intrinsics.areEqual(str2, str)) {
            this.f28949a = str;
        } else {
            po0.c("Ad Unit Id can't be set twice.", new Object[0]);
        }
    }
}
