package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class ug implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7709a;

    public ug(Context context) {
        this.f7709a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.adsbase.g.e(this.f7709a);
    }
}
