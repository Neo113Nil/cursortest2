package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Lc implements InterfaceC0933rn {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10591a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f10592b;

    /* renamed from: c, reason: collision with root package name */
    public final CellularNetworkTypeExtractor f10593c;

    /* renamed from: d, reason: collision with root package name */
    public final CachedDataProvider.CachedData f10594d;

    public Lc(Context context) {
        this.f10591a = context;
        this.f10592b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(C0817na.k().j(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.f10593c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f10594d = new CachedDataProvider.CachedData(millis, millis * 2, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0933rn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized Kc a() {
        Kc kc;
        try {
            kc = (Kc) this.f10594d.getData();
            if (kc != null) {
                if (this.f10594d.shouldUpdateData()) {
                }
            }
            kc = new Kc(this.f10592b.hasNecessaryPermissions(this.f10591a) ? this.f10593c.getNetworkType() : CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
            this.f10594d.setData(kc);
        } catch (Throwable th) {
            throw th;
        }
        return kc;
    }
}
