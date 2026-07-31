package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3079x1 {
    /* synthetic */ void a(Intent intent);

    /* synthetic */ void a(Intent intent, int i4);

    /* synthetic */ void a(Intent intent, int i4, int i5);

    void a(@NonNull InterfaceC3053w1 interfaceC3053w1);

    /* synthetic */ void b(Intent intent);

    /* synthetic */ void c(Intent intent);

    /* synthetic */ void onConfigurationChanged(Configuration configuration);

    /* synthetic */ void onCreate();

    /* synthetic */ void onDestroy();

    void pauseUserSession(@NonNull Bundle bundle);

    void reportData(int i4, Bundle bundle);

    void resumeUserSession(@NonNull Bundle bundle);
}
