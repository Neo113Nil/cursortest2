package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class J implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f25671a;

    public J(L l9, Runnable runnable) {
        this.f25671a = runnable;
        Objects.requireNonNull(l9);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z8) {
        this.f25671a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z8) {
        this.f25671a.run();
    }
}
