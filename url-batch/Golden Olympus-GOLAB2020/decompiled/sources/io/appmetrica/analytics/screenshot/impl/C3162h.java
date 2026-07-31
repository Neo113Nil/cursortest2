package io.appmetrica.analytics.screenshot.impl;

import android.os.Bundle;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3162h implements BundleToServiceConfigConverter {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B fromBundle(@NotNull Bundle bundle) {
        bundle.setClassLoader(B.class.getClassLoader());
        B b4 = (B) bundle.getParcelable("config");
        return b4 == null ? new B(new g0()) : b4;
    }
}
