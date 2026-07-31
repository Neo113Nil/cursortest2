package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class he extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ me f264a;
    public final /* synthetic */ ie b;

    public he(ie ieVar, me meVar) {
        this.b = ieVar;
        this.f264a = meVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f264a.a(new Pair(this.b, intent));
    }
}
