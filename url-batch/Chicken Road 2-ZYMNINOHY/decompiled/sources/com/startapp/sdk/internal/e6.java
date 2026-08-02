package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public abstract class e6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6835a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f6836b;

    public e6(Context context, ConnectivityManager connectivityManager) {
        this.f6835a = context;
        this.f6836b = connectivityManager;
    }

    public abstract int a();

    public void b() {
    }
}
