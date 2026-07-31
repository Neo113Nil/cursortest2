package com.startapp.sdk.cachedservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class BackgroundService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 3;
    }
}
