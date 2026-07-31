package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class lf0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1875dc f28528a;

    public /* synthetic */ lf0() {
        this(new C1875dc());
    }

    @Nullable
    public final C1851cc a(@NotNull com.monetization.ads.core.identifiers.ad.huawei.a serviceConnection) {
        Intrinsics.checkNotNullParameter(serviceConnection, "serviceConnection");
        try {
            OpenDeviceIdentifierService a4 = serviceConnection.a();
            if (a4 != null) {
                String oaid = a4.getOaid();
                boolean oaidTrackLimited = a4.getOaidTrackLimited();
                this.f28528a.getClass();
                if (oaid != null) {
                    return new C1851cc(oaid, oaidTrackLimited);
                }
            }
            return null;
        } catch (Exception unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }

    public lf0(@NotNull C1875dc advertisingInfoCreator) {
        Intrinsics.checkNotNullParameter(advertisingInfoCreator, "advertisingInfoCreator");
        this.f28528a = advertisingInfoCreator;
    }
}
