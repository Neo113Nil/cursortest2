package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class dg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f216a;

    public dg(Context context) {
        this.f216a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.adsbase.g.e(this.f216a);
    }
}
