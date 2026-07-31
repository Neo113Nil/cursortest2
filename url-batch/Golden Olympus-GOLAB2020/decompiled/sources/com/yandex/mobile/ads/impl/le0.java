package com.yandex.mobile.ads.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class le0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedBlockingQueue f28522a = new LinkedBlockingQueue();

    @Nullable
    public final IBinder a() {
        return (IBinder) this.f28522a.poll(5L, TimeUnit.SECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NotNull ComponentName componentName, @NotNull IBinder binder) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(binder, "binder");
        try {
            this.f28522a.put(binder);
        } catch (InterruptedException unused) {
            ap0.c(new Object[0]);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NotNull ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        try {
            this.f28522a.clear();
        } catch (UnsupportedOperationException unused) {
            ap0.c(new Object[0]);
        }
    }
}
