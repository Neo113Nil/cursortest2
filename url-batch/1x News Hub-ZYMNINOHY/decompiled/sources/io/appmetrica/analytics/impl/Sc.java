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
public final class Sc implements InterfaceC0863tn {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6635a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f6636b;

    /* renamed from: c, reason: collision with root package name */
    public final CellularNetworkTypeExtractor f6637c;

    /* renamed from: d, reason: collision with root package name */
    public final CachedDataProvider.CachedData f6638d;

    public Sc(Context context) {
        this.f6635a = context;
        this.f6636b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(C0876ua.k().j(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.f6637c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f6638d = new CachedDataProvider.CachedData(millis, millis * 2, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0863tn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized Rc a() {
        Rc rc;
        try {
            rc = (Rc) this.f6638d.getData();
            if (rc != null) {
                if (this.f6638d.shouldUpdateData()) {
                }
            }
            rc = new Rc(this.f6636b.hasNecessaryPermissions(this.f6635a) ? this.f6637c.getNetworkType() : CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
            this.f6638d.setData(rc);
        } catch (Throwable th) {
            throw th;
        }
        return rc;
    }
}
