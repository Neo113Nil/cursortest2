package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;

/* loaded from: classes.dex */
public final class ye extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef f7962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ze f7963b;

    public ye(ze zeVar, ef efVar) {
        this.f7963b = zeVar;
        this.f7962a = efVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f7962a.a(new Pair(this.f7963b, intent));
    }
}
