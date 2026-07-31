package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.gd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2651gd implements InterfaceC2868on {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39083a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f39084b;

    /* renamed from: c, reason: collision with root package name */
    public final CellularNetworkTypeExtractor f39085c;

    /* renamed from: d, reason: collision with root package name */
    public final CachedDataProvider.CachedData f39086d;

    public C2651gd(@NotNull Context context) {
        this.f39083a = context;
        this.f39084b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(Ia.j().i(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.f39085c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f39086d = new CachedDataProvider.CachedData(millis, millis * 2, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2868on
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized C2624fd a() {
        C2624fd c2624fd;
        try {
            c2624fd = (C2624fd) this.f39086d.getData();
            if (c2624fd != null) {
                if (this.f39086d.shouldUpdateData()) {
                }
            }
            c2624fd = new C2624fd(this.f39084b.hasNecessaryPermissions(this.f39083a) ? this.f39085c.getNetworkType() : "unknown");
            this.f39086d.setData(c2624fd);
        } catch (Throwable th) {
            throw th;
        }
        return c2624fd;
    }
}
