package com.liulishuo.filedownloader.services;

import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes4.dex */
interface l {
    IBinder onBind(Intent intent);

    void onDestroy();

    void onStartCommand(Intent intent, int i8, int i9);
}
