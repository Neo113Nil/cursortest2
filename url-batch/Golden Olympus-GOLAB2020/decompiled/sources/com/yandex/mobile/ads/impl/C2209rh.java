package com.yandex.mobile.ads.impl;

import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.rh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2209rh {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fl1 f31188a = new fl1();

    public final boolean a() {
        String a4 = this.f31188a.a();
        if (a4 == null || !(StringsKt.v(a4, ":Metrica", false, 2, null) || StringsKt.v(a4, ":AppMetrica", false, 2, null))) {
            return false;
        }
        ap0.d(new Object[0]);
        return true;
    }
}
