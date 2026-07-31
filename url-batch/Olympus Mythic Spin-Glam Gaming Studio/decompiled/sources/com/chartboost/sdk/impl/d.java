package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.internal.Model.CBError;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class d implements q0, h0, q7 {
    public final g0 a;
    public final o0 b;
    public final AtomicReference c;
    public final ScheduledExecutorService d;
    public final e e;
    public final zg f;
    public final i2 g;
    public final Function0 h;
    public final /* synthetic */ q7 i;
    public Ad j;
    public AdCallback k;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CBError.Impression.values().length];
            try {
                iArr[CBError.Impression.ASSET_MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CBError.Impression.ASSETS_DOWNLOAD_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CBError.Impression.ASSET_PREFETCH_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CBError.Impression.WEB_VIEW_CLIENT_RECEIVED_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CBError.Impression.WEB_VIEW_PAGE_LOAD_TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CBError.Impression.ERROR_LOADING_WEB_VIEW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public d(g0 adUnitLoader, o0 adUnitRenderer, AtomicReference sdkConfig, ScheduledExecutorService backgroundExecutorService, e adApiCallbackSender, zg session, i2 base64Wrapper, q7 eventTracker, Function0 androidVersion) {
        Intrinsics.checkNotNullParameter(adUnitLoader, "adUnitLoader");
        Intrinsics.checkNotNullParameter(adUnitRenderer, "adUnitRenderer");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(adApiCallbackSender, "adApiCallbackSender");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.a = adUnitLoader;
        this.b = adUnitRenderer;
        this.c = sdkConfig;
        this.d = backgroundExecutorService;
        this.e = adApiCallbackSender;
        this.f = session;
        this.g = base64Wrapper;
        this.h = androidVersion;
        this.i = eventTracker;
    }

    public final void a(final String location, final Ad ad, AdCallback callback, String str) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.j = ad;
        this.k = callback;
        Object a2 = h.a.a(str, this.g, new b(this));
        if (Result.m8026exceptionOrNullimpl(a2) == null) {
            final String str2 = (String) a2;
            this.d.execute(new Runnable() { // from class: com.chartboost.sdk.impl.d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    d.a(Ad.this, this, location, str2);
                }
            });
        }
    }

    @Override // com.chartboost.sdk.impl.p7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.i.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi clearFromStorage(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.i.clearFromStorage(piVar);
    }

    public final boolean g(String location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (((Number) this.h.mo4828invoke()).intValue() < 21) {
            return true;
        }
        sg sgVar = (sg) this.c.get();
        if (sgVar == null || !sgVar.g()) {
            return location.length() == 0;
        }
        xb.b("Chartboost Integration Warning: your account has been disabled for this session. This app has no active publishing campaigns, please create a publishing campaign in the Chartboost dashboard and wait at least 30 minutes to re-enable. If you need assistance, please visit http://chartboo.st/publishing .", (Throwable) null, 2, (Object) null);
        return true;
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi persist(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.i.persist(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public mi refresh(mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        return this.i.refresh(miVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public ci store(ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        return this.i.store(ciVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi track(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.i.track(piVar);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage */
    public void mo3218clearFromStorage(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.i.mo3218clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist */
    public void mo3219persist(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.i.mo3219persist(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh */
    public void mo3220refresh(mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.i.mo3220refresh(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store */
    public void mo3221store(ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.i.mo3221store(ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.i.mo3222track(event);
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function2 {
        public b(Object obj) {
            super(2, obj, d.class, "onAdFailToLoad", "onAdFailToLoad(Ljava/lang/String;Lcom/chartboost/sdk/internal/Model/CBError$Type;)V", 0);
        }

        public final void a(String str, CBError.Type p1) {
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((d) this.receiver).a(str, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (CBError.Type) obj2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Ad ad, d this$0, String location, String str) {
        Intrinsics.checkNotNullParameter(ad, "$ad");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(location, "$location");
        if (ad instanceof Banner) {
            ViewGroup viewGroup = (ViewGroup) ad;
            Banner banner = (Banner) ad;
            this$0.a.a(location, this$0, str, new e0(viewGroup, banner.getBannerWidth(), banner.getBannerHeight()));
            return;
        }
        g0.a(this$0.a, location, this$0, str, null, 8, null);
    }

    public final boolean b() {
        q1 a2 = this.a.a();
        return (a2 != null ? a2.a() : null) != null;
    }

    @Override // com.chartboost.sdk.impl.h0
    public void b(String str, si trackingEventName) {
        Intrinsics.checkNotNullParameter(trackingEventName, "trackingEventName");
        a(trackingEventName, "", str);
        this.e.a(str, (CacheError) null, this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.q0
    public void e(String str) {
        a(si.i.d, "", str);
        c();
        this.e.a(str, (ShowError) null, this.j, this.k);
    }

    public final ci f(String str) {
        if (str == null) {
            str = "";
        }
        return new ci(null, null, str, null, null, null, null, null, 251, null);
    }

    public final void a() {
        if (b()) {
            this.a.b();
        }
    }

    @Override // com.chartboost.sdk.impl.h0
    public void a(String str, CBError.Type error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a(si.a.f, error.getName(), str);
        this.e.a(str, q.a(error), this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.q0
    public void d(String str) {
        this.e.c(str, this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.q0
    public void c(String str) {
        a(si.f.g, "", str);
        this.e.b(str, this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.q0
    public void b(String str) {
        this.e.a(str, (ClickError) null, this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.q0
    public void a(String str, String str2, CBError.Click error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String str3 = "Click error: " + error.name() + " url: " + str2;
        a(si.b.e, str3, str);
        this.e.a(str, q.a(error, str3), this.j, this.k);
    }

    public final void c() {
        c0 a2;
        Ad ad = this.j;
        if (ad == null || (a2 = t.a(ad)) == null) {
            return;
        }
        this.f.a(a2);
        xb.c("Current session impression count: " + this.f.b(a2) + " in session: " + this.f.b(), null, 2, null);
    }

    @Override // com.chartboost.sdk.impl.q0
    public void a(String str) {
        this.e.a(str, this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.h0
    public void a(String bidResponse, si trackingEventName) {
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        Intrinsics.checkNotNullParameter(trackingEventName, "trackingEventName");
        a(trackingEventName, "", (String) null);
        Ad ad = this.j;
        if (ad != null) {
            ad.cache(bidResponse);
        }
    }

    @Override // com.chartboost.sdk.impl.q0
    public void a(String str, int i) {
        this.e.a(str, this.j, this.k, i);
    }

    @Override // com.chartboost.sdk.impl.q0
    public void a(String str, CBError.Impression error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a(error, str);
        this.e.a(str, q.a(error), this.j, this.k);
    }

    public final void a(Ad ad, AdCallback callback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.j = ad;
        this.k = callback;
        this.d.execute(new Runnable() { // from class: com.chartboost.sdk.impl.d$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                d.a(d.this);
            }
        });
    }

    public static final void a(d this$0) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        q1 a2 = this$0.a.a();
        if (a2 != null) {
            this$0.b.a(a2, this$0);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.b("Missing app request on render", (Throwable) null, 2, (Object) null);
        }
    }

    public final void a(si siVar, String str, String str2) {
        String str3;
        String str4;
        pi yaVar;
        c0 a2;
        Ad ad = this.j;
        if (ad == null || (a2 = t.a(ad)) == null || (str3 = a2.b()) == null) {
            str3 = "Unknown";
        }
        String str5 = str3;
        Ad ad2 = this.j;
        if (ad2 == null || (str4 = ad2.getLocation()) == null) {
            str4 = "";
        }
        String str6 = str4;
        if (siVar == si.b.e) {
            yaVar = new s5(siVar, str, str5, str6, this.b.F(), f(str2));
        } else {
            yaVar = new ya(siVar, str, str5, str6, this.b.F(), f(str2));
        }
        track(yaVar);
    }

    public final void a(si eventName, String message, c0 adType, String location) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        track((pi) new ya(eventName, message, adType.b(), location, this.b.F(), null, 32, null));
    }

    public final void a(CBError.Impression impression, String str) {
        si.i iVar;
        switch (a.a[impression.ordinal()]) {
            case 1:
            case 2:
            case 3:
                iVar = si.i.f;
                break;
            case 4:
            case 5:
            case 6:
                iVar = si.i.j;
                break;
            default:
                iVar = si.i.e;
                break;
        }
        a(iVar, impression.name(), str);
    }
}
