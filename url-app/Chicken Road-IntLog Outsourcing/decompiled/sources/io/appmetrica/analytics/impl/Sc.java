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
public final class Sc implements InterfaceC1014tn {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7461a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f7462b;

    /* renamed from: c, reason: collision with root package name */
    public final CellularNetworkTypeExtractor f7463c;

    /* renamed from: d, reason: collision with root package name */
    public final CachedDataProvider.CachedData f7464d;

    public Sc(Context context) {
        this.f7461a = context;
        this.f7462b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(C1027ua.k().j(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.f7463c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f7464d = new CachedDataProvider.CachedData(millis, millis * 2, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1014tn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized Rc a() {
        Rc rc;
        try {
            rc = (Rc) this.f7464d.getData();
            if (rc != null) {
                if (this.f7464d.shouldUpdateData()) {
                }
            }
            rc = new Rc(this.f7462b.hasNecessaryPermissions(this.f7461a) ? this.f7463c.getNetworkType() : CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
            this.f7464d.setData(rc);
        } catch (Throwable th) {
            throw th;
        }
        return rc;
    }
}
