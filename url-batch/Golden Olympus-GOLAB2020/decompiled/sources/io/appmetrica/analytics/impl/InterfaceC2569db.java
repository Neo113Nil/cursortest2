package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.db, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2569db extends Ya, InterfaceC2544cd {
    void a(Activity activity);

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    /* synthetic */ void a(Location location);

    void a(@NonNull AnrListener anrListener);

    void a(@NonNull ExternalAttribution externalAttribution);

    void a(@NonNull Do r12);

    void a(@NonNull EnumC2792m enumC2792m);

    @Override // io.appmetrica.analytics.impl.Ya
    /* synthetic */ void a(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    /* synthetic */ void a(String str, String str2);

    void a(@NonNull String str, boolean z4);

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    /* synthetic */ void a(boolean z4);

    void b(Activity activity);

    void b(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.Ya
    /* synthetic */ void b(@NonNull String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    /* synthetic */ void b(boolean z4);

    @Override // io.appmetrica.analytics.impl.Ya
    /* synthetic */ boolean b();

    void c();

    List<String> f();
}
