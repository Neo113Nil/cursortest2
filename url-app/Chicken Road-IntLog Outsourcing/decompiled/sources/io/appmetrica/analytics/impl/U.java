package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class U implements Ha {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7561a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f7562b;

    /* renamed from: i, reason: collision with root package name */
    public FutureTask f7569i;

    /* renamed from: j, reason: collision with root package name */
    public final J f7570j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7573m;

    /* renamed from: c, reason: collision with root package name */
    public final String f7563c = "advertising identifiers collecting is forbidden by client configuration";

    /* renamed from: d, reason: collision with root package name */
    public final String f7564d = "advertising identifiers collecting is forbidden by startup";

    /* renamed from: e, reason: collision with root package name */
    public final String f7565e = "advertising identifiers collecting is forbidden by unknown reason";

    /* renamed from: f, reason: collision with root package name */
    public final N f7566f = new N(new Eg("google"));

    /* renamed from: g, reason: collision with root package name */
    public final N f7567g = new N(new Eg("huawei"));

    /* renamed from: h, reason: collision with root package name */
    public final N f7568h = new N(new Eg("yandex"));

    /* renamed from: k, reason: collision with root package name */
    public volatile AdvertisingIdsHolder f7571k = new AdvertisingIdsHolder();

    /* renamed from: l, reason: collision with root package name */
    public G f7572l = new G(4, 4, 4);

    public U(Context context, ICommonExecutor iCommonExecutor, C0754jm c0754jm) {
        this.f7561a = context;
        this.f7562b = iCommonExecutor;
        this.f7570j = new J(c0754jm);
    }

    public static final Void e(U u5) {
        u5.f7571k = new AdvertisingIdsHolder(u5.a(u5.f7572l.f6815a, new Q(u5)), u5.a(u5.f7572l.f6816b, new S(u5)), u5.a(u5.f7572l.f6817c, new T(u5, new C0617ee())));
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    public final synchronized AdvertisingIdsHolder getIdentifiers(Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized void init() {
        if (this.f7569i == null) {
            this.f7572l = this.f7570j.a();
            FutureTask futureTask = new FutureTask(new C0.g(1, this));
            this.f7569i = futureTask;
            this.f7562b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ha, io.appmetrica.analytics.impl.InterfaceC0884om
    public final synchronized void a(C0754jm c0754jm) {
        this.f7570j.a(c0754jm);
        a((Li) new C0617ee(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized void b(boolean z) {
        this.f7573m = true;
        this.f7570j.f6985b.update(z);
        a((Li) new C0617ee(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized void c(boolean z) {
        if (!this.f7573m) {
            b(z);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.f7569i;
        if (futureTask == null) {
            kotlin.jvm.internal.i.l("refresh");
            throw null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f7571k;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized AdvertisingIdsHolder a() {
        return a(new C0617ee());
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized AdvertisingIdsHolder a(Li li) {
        try {
            a(li, true).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f7571k;
    }

    public final FutureTask a(final Li li, final boolean z) {
        final G a6 = this.f7570j.a();
        FutureTask futureTask = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.No
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return U.a(z, a6, this, li);
            }
        });
        this.f7569i = futureTask;
        this.f7562b.execute(futureTask);
        FutureTask futureTask2 = this.f7569i;
        if (futureTask2 != null) {
            return futureTask2;
        }
        kotlin.jvm.internal.i.l("refresh");
        throw null;
    }

    public static final Void a(boolean z, G g6, U u5, Li li) {
        if (!z && kotlin.jvm.internal.i.a(g6, u5.f7572l)) {
            return null;
        }
        AdvertisingIdsHolder advertisingIdsHolder = u5.f7571k;
        AdTrackingInfoResult a6 = u5.a(g6.f6815a, new Q(u5));
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = a6.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            a6 = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, a6.mErrorExplanation);
        }
        AdTrackingInfoResult a7 = u5.a(g6.f6816b, new S(u5));
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = a7.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            a7 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, a7.mErrorExplanation);
        }
        AdTrackingInfoResult a8 = u5.a(g6.f6817c, new T(u5, li));
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = a8.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            a8 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, a8.mErrorExplanation);
        }
        u5.f7571k = new AdvertisingIdsHolder(a6, a7, a8);
        return null;
    }

    public final AdTrackingInfoResult a(int i2, InterfaceC1430a interfaceC1430a) {
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (AdTrackingInfoResult) interfaceC1430a.invoke();
        }
        if (i3 == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.f7563c);
        }
        if (i3 == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.f7564d);
        }
        if (i3 == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.f7565e);
        }
        throw new C1.b();
    }
}
