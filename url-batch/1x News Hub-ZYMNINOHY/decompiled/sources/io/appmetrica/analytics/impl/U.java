package io.appmetrica.analytics.impl;

import android.content.Context;
import b0.CallableC0175f;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class U implements Ha {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6731a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f6732b;

    /* renamed from: i, reason: collision with root package name */
    public FutureTask f6738i;

    /* renamed from: j, reason: collision with root package name */
    public final J f6739j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6742m;

    /* renamed from: c, reason: collision with root package name */
    public final String f6733c = "advertising identifiers collecting is forbidden by client configuration";

    /* renamed from: d, reason: collision with root package name */
    public final String f6734d = "advertising identifiers collecting is forbidden by startup";

    /* renamed from: e, reason: collision with root package name */
    public final String f6735e = "advertising identifiers collecting is forbidden by unknown reason";
    public final N f = new N(new Eg("google"));

    /* renamed from: g, reason: collision with root package name */
    public final N f6736g = new N(new Eg("huawei"));

    /* renamed from: h, reason: collision with root package name */
    public final N f6737h = new N(new Eg("yandex"));

    /* renamed from: k, reason: collision with root package name */
    public volatile AdvertisingIdsHolder f6740k = new AdvertisingIdsHolder();

    /* renamed from: l, reason: collision with root package name */
    public G f6741l = new G(4, 4, 4);

    public U(Context context, ICommonExecutor iCommonExecutor, C0603jm c0603jm) {
        this.f6731a = context;
        this.f6732b = iCommonExecutor;
        this.f6739j = new J(c0603jm);
    }

    public static final Void e(U u3) {
        u3.f6740k = new AdvertisingIdsHolder(u3.a(u3.f6741l.f6022a, new Q(u3)), u3.a(u3.f6741l.f6023b, new S(u3)), u3.a(u3.f6741l.f6024c, new T(u3, new C0466ee())));
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    public final synchronized AdvertisingIdsHolder getIdentifiers(Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized void init() {
        if (this.f6738i == null) {
            this.f6741l = this.f6739j.a();
            FutureTask futureTask = new FutureTask(new CallableC0175f(1, this));
            this.f6738i = futureTask;
            this.f6732b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ha, io.appmetrica.analytics.impl.InterfaceC0733om
    public final synchronized void a(C0603jm c0603jm) {
        this.f6739j.a(c0603jm);
        a((Li) new C0466ee(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized void b(boolean z) {
        this.f6742m = true;
        this.f6739j.f6184b.update(z);
        a((Li) new C0466ee(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized void c(boolean z) {
        if (!this.f6742m) {
            b(z);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.f6738i;
        if (futureTask == null) {
            kotlin.jvm.internal.j.g("refresh");
            throw null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f6740k;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized AdvertisingIdsHolder a() {
        return a(new C0466ee());
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized AdvertisingIdsHolder a(Li li) {
        try {
            a(li, true).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f6740k;
    }

    public final FutureTask a(final Li li, final boolean z) {
        final G a3 = this.f6739j.a();
        FutureTask futureTask = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.No
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return U.a(z, a3, this, li);
            }
        });
        this.f6738i = futureTask;
        this.f6732b.execute(futureTask);
        FutureTask futureTask2 = this.f6738i;
        if (futureTask2 != null) {
            return futureTask2;
        }
        kotlin.jvm.internal.j.g("refresh");
        throw null;
    }

    public static final Void a(boolean z, G g3, U u3, Li li) {
        if (!z && kotlin.jvm.internal.j.a(g3, u3.f6741l)) {
            return null;
        }
        AdvertisingIdsHolder advertisingIdsHolder = u3.f6740k;
        AdTrackingInfoResult a3 = u3.a(g3.f6022a, new Q(u3));
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = a3.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            a3 = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, a3.mErrorExplanation);
        }
        AdTrackingInfoResult a4 = u3.a(g3.f6023b, new S(u3));
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = a4.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            a4 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, a4.mErrorExplanation);
        }
        AdTrackingInfoResult a5 = u3.a(g3.f6024c, new T(u3, li));
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = a5.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            a5 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, a5.mErrorExplanation);
        }
        u3.f6740k = new AdvertisingIdsHolder(a3, a4, a5);
        return null;
    }

    public final AdTrackingInfoResult a(int i3, l2.a aVar) {
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (AdTrackingInfoResult) aVar.invoke();
        }
        if (i4 == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.f6733c);
        }
        if (i4 == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.f6734d);
        }
        if (i4 == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.f6735e);
        }
        throw new O0.b();
    }
}
