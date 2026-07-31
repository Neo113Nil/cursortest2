package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class mc extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ nc f8488a;

    mc(nc ncVar) {
        this.f8488a = ncVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f8488a.f();
    }
}
