package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class d7 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g7 f211a;

    public d7(g7 g7Var) {
        this.f211a = g7Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f211a.b();
    }
}
