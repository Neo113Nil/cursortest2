package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class ug implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4567a;

    public ug(Context context) {
        this.f4567a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.adsbase.g.e(this.f4567a);
    }
}
