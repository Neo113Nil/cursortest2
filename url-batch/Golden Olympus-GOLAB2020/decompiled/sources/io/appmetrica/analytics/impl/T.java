package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class T implements Va {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38272a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f38273b;

    /* renamed from: i, reason: collision with root package name */
    public FutureTask f38280i;

    /* renamed from: j, reason: collision with root package name */
    public final I f38281j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f38284m;

    /* renamed from: c, reason: collision with root package name */
    public final String f38274c = "advertising identifiers collecting is forbidden by client configuration";

    /* renamed from: d, reason: collision with root package name */
    public final String f38275d = "advertising identifiers collecting is forbidden by startup";

    /* renamed from: e, reason: collision with root package name */
    public final String f38276e = "advertising identifiers collecting is forbidden by unknown reason";

    /* renamed from: f, reason: collision with root package name */
    public final M f38277f = new M(new Mg("google"));

    /* renamed from: g, reason: collision with root package name */
    public final M f38278g = new M(new Mg("huawei"));

    /* renamed from: h, reason: collision with root package name */
    public final M f38279h = new M(new Mg("yandex"));

    /* renamed from: k, reason: collision with root package name */
    public volatile AdvertisingIdsHolder f38282k = new AdvertisingIdsHolder();

    /* renamed from: l, reason: collision with root package name */
    public F f38283l = new F(4, 4, 4);

    public T(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor, @NotNull C2633fm c2633fm) {
        this.f38272a = context;
        this.f38273b = iCommonExecutor;
        this.f38281j = new I(c2633fm);
    }

    public static final Void e(T t4) {
        t4.f38282k = new AdvertisingIdsHolder(t4.a(t4.f38283l.f37488a, new P(t4)), t4.a(t4.f38283l.f37489b, new Q(t4)), t4.a(t4.f38283l.f37490c, new S(t4, new C2807me())));
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    @NotNull
    public final synchronized AdvertisingIdsHolder getIdentifiers(@NotNull Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final synchronized void init() {
        if (this.f38280i == null) {
            this.f38283l = this.f38281j.a();
            FutureTask futureTask = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.Uo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return T.e(T.this);
                }
            });
            this.f38280i = futureTask;
            this.f38273b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.impl.Va, io.appmetrica.analytics.impl.InterfaceC2763km
    public final synchronized void a(@NotNull C2633fm c2633fm) {
        this.f38281j.a(c2633fm);
        a((Ti) new C2807me(), false);
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final synchronized void b(boolean z4) {
        this.f38284m = true;
        this.f38281j.f37680b.update(z4);
        a((Ti) new C2807me(), false);
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final synchronized void c(boolean z4) {
        if (!this.f38284m) {
            b(z4);
        }
    }

    @Override // io.appmetrica.analytics.impl.Va
    @NotNull
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.f38280i;
        if (futureTask == null) {
            Intrinsics.throwUninitializedPropertyAccessException("refresh");
            futureTask = null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f38282k;
    }

    @Override // io.appmetrica.analytics.impl.Va
    @NotNull
    public final synchronized AdvertisingIdsHolder a() {
        return a(new C2807me());
    }

    @Override // io.appmetrica.analytics.impl.Va
    @NotNull
    public final synchronized AdvertisingIdsHolder a(@NotNull Ti ti) {
        try {
            a(ti, true).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f38282k;
    }

    public final FutureTask a(final Ti ti, final boolean z4) {
        final F a4 = this.f38281j.a();
        FutureTask futureTask = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.Vo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return T.a(z4, a4, this, ti);
            }
        });
        this.f38280i = futureTask;
        this.f38273b.execute(futureTask);
        FutureTask futureTask2 = this.f38280i;
        if (futureTask2 != null) {
            return futureTask2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("refresh");
        return null;
    }

    public static final Void a(boolean z4, F f4, T t4, Ti ti) {
        if (!z4 && Intrinsics.areEqual(f4, t4.f38283l)) {
            return null;
        }
        AdvertisingIdsHolder advertisingIdsHolder = t4.f38282k;
        AdTrackingInfoResult a4 = t4.a(f4.f37488a, new P(t4));
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = a4.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            a4 = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, a4.mErrorExplanation);
        }
        AdTrackingInfoResult a5 = t4.a(f4.f37489b, new Q(t4));
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = a5.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            a5 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, a5.mErrorExplanation);
        }
        AdTrackingInfoResult a6 = t4.a(f4.f37490c, new S(t4, ti));
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = a6.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            a6 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, a6.mErrorExplanation);
        }
        t4.f38282k = new AdvertisingIdsHolder(a4, a5, a6);
        return null;
    }

    public final AdTrackingInfoResult a(int i4, Function0 function0) {
        if (i4 == 0) {
            throw null;
        }
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (AdTrackingInfoResult) function0.invoke();
        }
        if (i5 == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.f38274c);
        }
        if (i5 == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.f38275d);
        }
        if (i5 == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.f38276e);
        }
        throw new W1.m();
    }
}
