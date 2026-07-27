package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

/* loaded from: classes.dex */
public interface A1 {
    /* synthetic */ void a(Intent intent);

    /* synthetic */ void a(Intent intent, int i2);

    /* synthetic */ void a(Intent intent, int i2, int i3);

    void a(InterfaceC1146z1 interfaceC1146z1);

    /* synthetic */ void b(Intent intent);

    /* synthetic */ void c(Intent intent);

    /* synthetic */ void onConfigurationChanged(Configuration configuration);

    /* synthetic */ void onCreate();

    /* synthetic */ void onDestroy();

    void pauseUserSession(Bundle bundle);

    void reportData(int i2, Bundle bundle);

    void resumeUserSession(Bundle bundle);
}
