package com.startapp.sdk.internal;

import android.content.Intent;
import android.os.RemoteException;
import com.startapp.sdk.ads.list3d.List3DActivity;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class sa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DActivity f420a;

    public sa(List3DActivity list3DActivity) {
        this.f420a = list3DActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f420a.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (Throwable th) {
            if (zh.a(th, RemoteException.class)) {
                return;
            }
            n8.a(th);
        }
    }
}
