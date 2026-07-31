package com.monetization.ads.core.identifiers.ad.huawei;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService;
import com.yandex.mobile.ads.impl.ap0;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedBlockingQueue f20682a = new LinkedBlockingQueue();

    @Nullable
    public final OpenDeviceIdentifierService a() {
        return (OpenDeviceIdentifierService) this.f20682a.poll(5L, TimeUnit.SECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NotNull ComponentName componentName, @NotNull IBinder binder) {
        IInterface proxy;
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(binder, "binder");
        try {
            int i4 = OpenDeviceIdentifierService.Stub.f20680a;
            if (binder == null) {
                proxy = null;
            } else {
                IInterface queryLocalInterface = binder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                proxy = (queryLocalInterface == null || !(queryLocalInterface instanceof OpenDeviceIdentifierService)) ? new OpenDeviceIdentifierService.Stub.Proxy(binder) : (OpenDeviceIdentifierService) queryLocalInterface;
            }
            this.f20682a.put(proxy);
        } catch (Exception unused) {
            ap0.c(new Object[0]);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NotNull ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        try {
            this.f20682a.clear();
        } catch (UnsupportedOperationException unused) {
            ap0.c(new Object[0]);
        }
    }
}
