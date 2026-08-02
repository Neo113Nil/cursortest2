package io.appmetrica.analytics.screenshot.impl;

import android.os.Bundle;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;

/* renamed from: io.appmetrica.analytics.screenshot.impl.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150h implements BundleToServiceConfigConverter {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D fromBundle(Bundle bundle) {
        bundle.setClassLoader(D.class.getClassLoader());
        D d4 = (D) bundle.getParcelable("config");
        return d4 == null ? new D(new j0()) : d4;
    }
}
