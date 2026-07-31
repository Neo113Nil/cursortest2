package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class Mc implements InterfaceC0513sn {

    /* renamed from: a, reason: collision with root package name */
    public final Context f954a;
    public final PermissionResolutionStrategy b;
    public final CellularNetworkTypeExtractor c;
    public final CachedDataProvider.CachedData d;

    public Mc(Context context) {
        this.f954a = context;
        this.b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(C0401oa.k().j(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.d = new CachedDataProvider.CachedData(millis, millis * 2, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0513sn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized Lc a() {
        Lc lc;
        lc = (Lc) this.d.getData();
        if (lc == null || this.d.shouldUpdateData()) {
            lc = new Lc(this.b.hasNecessaryPermissions(this.f954a) ? this.c.getNetworkType() : "unknown");
            this.d.setData(lc);
        }
        return lc;
    }
}
