package com.yandex.mobile.ads.impl;

import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.ad.gms.service.GmsServiceAdvertisingInfoReader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pe0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1875dc f30423a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ke0 f30424b;

    public /* synthetic */ pe0() {
        this(new C1875dc(), new ke0());
    }

    @Nullable
    public final C1851cc a(@NotNull le0 connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        try {
            IBinder binder = connection.a();
            if (binder == null) {
                return null;
            }
            this.f30424b.getClass();
            Intrinsics.checkNotNullParameter(binder, "binder");
            IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            InterfaceC2018jc interfaceC2018jc = queryLocalInterface instanceof InterfaceC2018jc ? (InterfaceC2018jc) queryLocalInterface : null;
            if (interfaceC2018jc == null) {
                interfaceC2018jc = new GmsServiceAdvertisingInfoReader(binder);
            }
            String readAdvertisingId = interfaceC2018jc.readAdvertisingId();
            Boolean readAdTrackingLimited = interfaceC2018jc.readAdTrackingLimited();
            this.f30423a.getClass();
            C1851cc c1851cc = (readAdTrackingLimited == null || readAdvertisingId == null) ? null : new C1851cc(readAdvertisingId, readAdTrackingLimited.booleanValue());
            ap0.a(new Object[0]);
            return c1851cc;
        } catch (InterruptedException unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }

    public pe0(@NotNull C1875dc advertisingInfoCreator, @NotNull ke0 gmsAdvertisingInfoReaderProvider) {
        Intrinsics.checkNotNullParameter(advertisingInfoCreator, "advertisingInfoCreator");
        Intrinsics.checkNotNullParameter(gmsAdvertisingInfoReaderProvider, "gmsAdvertisingInfoReaderProvider");
        this.f30423a = advertisingInfoCreator;
        this.f30424b = gmsAdvertisingInfoReaderProvider;
    }
}
