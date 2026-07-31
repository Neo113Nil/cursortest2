package io.appmetrica.analytics.billingv6.internal;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv6.impl.b;
import io.appmetrica.analytics.billingv6.impl.c;
import io.appmetrica.analytics.billingv6.impl.d;
import io.appmetrica.analytics.billingv6.impl.l;
import io.appmetrica.analytics.billingv6.impl.n;
import io.appmetrica.analytics.billingv6.impl.o;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class BillingLibraryMonitor implements BillingMonitor, n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36931a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f36932b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f36933c;

    /* renamed from: d, reason: collision with root package name */
    private final BillingInfoSender f36934d;

    /* renamed from: e, reason: collision with root package name */
    private final BillingInfoManager f36935e;

    /* renamed from: f, reason: collision with root package name */
    private final UpdatePolicy f36936f;

    /* renamed from: g, reason: collision with root package name */
    private BillingConfig f36937g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f36938h;

    public BillingLibraryMonitor(@NotNull Context context, @NotNull Executor executor, @NotNull Executor executor2, @NotNull BillingInfoStorage billingInfoStorage, @NotNull BillingInfoSender billingInfoSender, @NotNull BillingInfoManager billingInfoManager, @NotNull UpdatePolicy updatePolicy) {
        this.f36931a = context;
        this.f36932b = executor;
        this.f36933c = executor2;
        this.f36934d = billingInfoSender;
        this.f36935e = billingInfoManager;
        this.f36936f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(@Nullable BillingConfig billingConfig) {
        if (Intrinsics.areEqual(this.f36937g, billingConfig)) {
            return;
        }
        this.f36937g = billingConfig;
        if (billingConfig != null && !this.f36938h) {
            this.f36938h = true;
            BillingClient build = BillingClient.newBuilder(this.f36931a).setListener(new l()).enablePendingPurchases().build();
            try {
                build.startConnection(new b(billingConfig, build, new BillingLibraryMonitor$updateBilling$1(this), new d(build), this));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        try {
            BillingConfig billingConfig = this.f36937g;
            if (billingConfig != null && !this.f36938h) {
                this.f36938h = true;
                BillingClient build = BillingClient.newBuilder(this.f36931a).setListener(new l()).enablePendingPurchases().build();
                build.startConnection(new b(billingConfig, build, new BillingLibraryMonitor$updateBilling$1(this), new d(build), this));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billingv6.impl.n
    public synchronized void onUpdateFinished() {
        this.f36938h = false;
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i4 & 32) != 0 ? new c(billingInfoStorage) : billingInfoManager, (i4 & 64) != 0 ? new o(null, 1, null) : updatePolicy);
    }
}
