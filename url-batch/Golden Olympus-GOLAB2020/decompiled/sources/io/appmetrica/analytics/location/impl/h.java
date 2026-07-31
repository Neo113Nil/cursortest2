package io.appmetrica.analytics.location.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;

/* loaded from: classes3.dex */
public final class h implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final m f40433a;

    public h(@NonNull m mVar) {
        this.f40433a = mVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(Location location) {
        if (location != null) {
            this.f40433a.updateData(location);
        }
    }
}
