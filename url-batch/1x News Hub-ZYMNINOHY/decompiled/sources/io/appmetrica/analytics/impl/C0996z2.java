package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

/* renamed from: io.appmetrica.analytics.impl.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0996z2 {

    /* renamed from: a, reason: collision with root package name */
    public final LocationManager f8659a;

    public C0996z2(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public C0996z2(LocationManager locationManager) {
        this.f8659a = locationManager;
    }
}
