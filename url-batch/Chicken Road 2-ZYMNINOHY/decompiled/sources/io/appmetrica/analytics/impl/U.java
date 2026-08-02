package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class U implements Aa {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11017a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f11018b;

    /* renamed from: i, reason: collision with root package name */
    public FutureTask f11025i;

    /* renamed from: j, reason: collision with root package name */
    public final J f11026j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11029m;

    /* renamed from: c, reason: collision with root package name */
    public final String f11019c = "advertising identifiers collecting is forbidden by client configuration";

    /* renamed from: d, reason: collision with root package name */
    public final String f11020d = "advertising identifiers collecting is forbidden by startup";

    /* renamed from: e, reason: collision with root package name */
    public final String f11021e = "advertising identifiers collecting is forbidden by unknown reason";

    /* renamed from: f, reason: collision with root package name */
    public final N f11022f = new N(new C1134zg("google"));

    /* renamed from: g, reason: collision with root package name */
    public final N f11023g = new N(new C1134zg("huawei"));

    /* renamed from: h, reason: collision with root package name */
    public final N f11024h = new N(new C1134zg("yandex"));

    /* renamed from: k, reason: collision with root package name */
    public volatile AdvertisingIdsHolder f11027k = new AdvertisingIdsHolder();

    /* renamed from: l, reason: collision with root package name */
    public G f11028l = new G(4, 4, 4);

    public U(Context context, ICommonExecutor iCommonExecutor, C0622fm c0622fm) {
        this.f11017a = context;
        this.f11018b = iCommonExecutor;
        this.f11026j = new J(c0622fm);
    }

    public static final Void e(U u4) {
        u4.f11027k = new AdvertisingIdsHolder(u4.a(u4.f11028l.f10297a, new Q(u4)), u4.a(u4.f11028l.f10298b, new S(u4)), u4.a(u4.f11028l.f10299c, new T(u4, new Xd())));
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    public final synchronized AdvertisingIdsHolder getIdentifiers(Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized void init() {
        if (this.f11025i == null) {
            this.f11028l = this.f11026j.a();
            FutureTask futureTask = new FutureTask(new Qo(0, this));
            this.f11025i = futureTask;
            this.f11018b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.impl.Aa, io.appmetrica.analytics.impl.InterfaceC0751km
    public final synchronized void a(C0622fm c0622fm) {
        this.f11026j.a(c0622fm);
        a((Gi) new Xd(), false);
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized void b(boolean z) {
        this.f11029m = true;
        this.f11026j.f10451b.update(z);
        a((Gi) new Xd(), false);
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized void c(boolean z) {
        if (!this.f11029m) {
            b(z);
        }
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.f11025i;
        if (futureTask == null) {
            kotlin.jvm.internal.i.i("refresh");
            throw null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f11027k;
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized AdvertisingIdsHolder a() {
        return a(new Xd());
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized AdvertisingIdsHolder a(Gi gi) {
        try {
            a(gi, true).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f11027k;
    }

    public final FutureTask a(final Gi gi, final boolean z) {
        final G a3 = this.f11026j.a();
        FutureTask futureTask = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.Ro
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return U.a(z, a3, this, gi);
            }
        });
        this.f11025i = futureTask;
        this.f11018b.execute(futureTask);
        FutureTask futureTask2 = this.f11025i;
        if (futureTask2 != null) {
            return futureTask2;
        }
        kotlin.jvm.internal.i.i("refresh");
        throw null;
    }

    public static final Void a(boolean z, G g4, U u4, Gi gi) {
        if (!z && kotlin.jvm.internal.i.a(g4, u4.f11028l)) {
            return null;
        }
        AdvertisingIdsHolder advertisingIdsHolder = u4.f11027k;
        AdTrackingInfoResult a3 = u4.a(g4.f10297a, new Q(u4));
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = a3.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            a3 = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, a3.mErrorExplanation);
        }
        AdTrackingInfoResult a4 = u4.a(g4.f10298b, new S(u4));
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = a4.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            a4 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, a4.mErrorExplanation);
        }
        AdTrackingInfoResult a5 = u4.a(g4.f10299c, new T(u4, gi));
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = a5.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            a5 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, a5.mErrorExplanation);
        }
        u4.f11027k = new AdvertisingIdsHolder(a3, a4, a5);
        return null;
    }

    public final AdTrackingInfoResult a(int i4, InterfaceC1328a interfaceC1328a) {
        if (i4 == 0) {
            throw null;
        }
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (AdTrackingInfoResult) interfaceC1328a.invoke();
        }
        if (i5 == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.f11019c);
        }
        if (i5 == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.f11020d);
        }
        if (i5 == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.f11021e);
        }
        throw new G1.a();
    }
}
