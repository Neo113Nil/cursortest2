package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public abstract class e6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3721a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f3722b;

    public e6(Context context, ConnectivityManager connectivityManager) {
        this.f3721a = context;
        this.f3722b = connectivityManager;
    }

    public abstract int a();

    public void b() {
    }
}
