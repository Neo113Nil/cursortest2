package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.startapp.sdk.ads.list3d.List3DActivity;

/* loaded from: classes.dex */
public final class jb extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DActivity f4015a;

    public jb(List3DActivity list3DActivity) {
        this.f4015a = list3DActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f4015a.finish();
    }
}
