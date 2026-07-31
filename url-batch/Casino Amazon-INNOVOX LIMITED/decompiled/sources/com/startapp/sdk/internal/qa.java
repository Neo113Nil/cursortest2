package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.startapp.sdk.ads.list3d.List3DActivity;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class qa extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DActivity f390a;

    public qa(List3DActivity list3DActivity) {
        this.f390a = list3DActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f390a.finish();
    }
}
