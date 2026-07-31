package com.yandex.mobile.ads.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.af, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1806af implements InterfaceC2020je {
    @Override // com.yandex.mobile.ads.impl.InterfaceC2020je
    @Nullable
    public final C1830bf a(@NotNull Context context, @NotNull String apiKey, @NotNull InterfaceC2343xd appAdAnalyticsActivator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(appAdAnalyticsActivator, "appAdAnalyticsActivator");
        try {
            return new C1830bf(W1.i.b(new C2390ze(appAdAnalyticsActivator, context, this, apiKey)));
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2020je
    @Nullable
    public final String b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return AppMetrica.getDeviceId(context);
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2020je
    @Nullable
    public final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return AppMetrica.getUuid(context);
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2020je
    public final void a(@NotNull Context context, @NotNull InterfaceC2367ye listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            AppMetrica.requestStartupParams(context, new C1854cf(listener), C1878df.a());
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
            listener.a(EnumC2344xe.f34531b);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2020je
    @Nullable
    public final String a() {
        try {
            return AppMetrica.getLibraryVersion();
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }
}
