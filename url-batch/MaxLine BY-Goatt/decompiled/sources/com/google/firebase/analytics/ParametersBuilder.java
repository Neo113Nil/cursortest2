package com.google.firebase.analytics;

import android.os.Bundle;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ParametersBuilder {
    private final Bundle zza = new Bundle();

    public final Bundle getBundle() {
        return this.zza;
    }

    public final void param(String str, Bundle[] bundleArr) {
        str.getClass();
        bundleArr.getClass();
        this.zza.putParcelableArray(str, bundleArr);
    }

    public final void param(String str, long j) {
        str.getClass();
        this.zza.putLong(str, j);
    }

    public final void param(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.zza.putBundle(str, bundle);
    }

    public final void param(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.zza.putString(str, str2);
    }

    public final void param(String str, double d) {
        str.getClass();
        this.zza.putDouble(str, d);
    }
}
