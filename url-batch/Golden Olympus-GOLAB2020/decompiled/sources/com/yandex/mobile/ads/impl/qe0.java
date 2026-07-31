package com.yandex.mobile.ads.impl;

import android.content.Intent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qe0 {
    @NotNull
    public static Intent a() {
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        return intent;
    }
}
