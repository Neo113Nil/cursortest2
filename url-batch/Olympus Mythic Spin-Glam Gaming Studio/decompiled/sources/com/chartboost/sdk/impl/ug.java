package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.events.StartError;
import com.chartboost.sdk.impl.o7;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ug implements h5, tg {
    public final Context a;
    public final SharedPreferences b;
    public final yi c;
    public final bf d;
    public final AtomicReference e;
    public final ze f;
    public final a7 g;
    public final zg h;
    public final lk i;
    public final Lazy j;
    public final db k;
    public final cb l;
    public final j3 m;
    public final kf n;
    public final y2 o;
    public final he p;
    public final rh q;
    public final i3 r;
    public boolean s;
    public boolean t;
    public final ConcurrentLinkedQueue u;
    public boolean v;
    public final AtomicBoolean w;

    public ug(Context context, SharedPreferences sharedPreferences, yi uiPoster, bf privacyApi, AtomicReference sdkConfig, ze prefetcher, a7 downloader, zg session, lk videoCachePolicy, Lazy videoRepository, db initInstallRequest, cb initConfigRequest, j3 reachability, kf providerInstallerHelper, y2 identity, he openMeasurementManager, rh telemetryManager, i3 networkService) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(prefetcher, "prefetcher");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(videoCachePolicy, "videoCachePolicy");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(initInstallRequest, "initInstallRequest");
        Intrinsics.checkNotNullParameter(initConfigRequest, "initConfigRequest");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(providerInstallerHelper, "providerInstallerHelper");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.a = context;
        this.b = sharedPreferences;
        this.c = uiPoster;
        this.d = privacyApi;
        this.e = sdkConfig;
        this.f = prefetcher;
        this.g = downloader;
        this.h = session;
        this.i = videoCachePolicy;
        this.j = videoRepository;
        this.k = initInstallRequest;
        this.l = initConfigRequest;
        this.m = reachability;
        this.n = providerInstallerHelper;
        this.o = identity;
        this.p = openMeasurementManager;
        this.q = telemetryManager;
        this.r = networkService;
        this.t = true;
        this.u = new ConcurrentLinkedQueue();
        session.a(this);
        this.w = new AtomicBoolean(false);
    }

    public final void m() {
        if (pg.a.d()) {
            String j = j();
            String str = JsonUtils.EMPTY_JSON;
            if (j == null) {
                j = JsonUtils.EMPTY_JSON;
            }
            if (j.length() != 0) {
                str = j;
            }
            b(new JSONObject(str));
        }
    }

    public final void i() {
        a((StartError) null);
        this.s = true;
        p();
        k();
    }

    public final void h() {
        this.h.f();
        a((StartError) null);
        this.s = true;
        k();
    }

    public final StartError b(ChartboostError chartboostError) {
        StartError.Code code;
        if (chartboostError instanceof ChartboostError.Initialization.InvalidCredentials) {
            code = StartError.Code.INVALID_CREDENTIALS;
        } else if ((chartboostError instanceof ChartboostError.Connectivity.NoInternet) || (chartboostError instanceof ChartboostError.Connectivity.NetworkError)) {
            code = StartError.Code.NETWORK_FAILURE;
        } else if (chartboostError instanceof ChartboostError.Connectivity.ServerError) {
            code = StartError.Code.SERVER_ERROR;
        } else if (chartboostError instanceof ChartboostError.Initialization.Disabled) {
            code = StartError.Code.DISABLED;
        } else if (chartboostError instanceof ChartboostError.Initialization.NoContext) {
            code = StartError.Code.NO_CONTEXT;
        } else if (chartboostError instanceof ChartboostError.Initialization.InvalidConfiguration) {
            code = StartError.Code.INVALID_CONFIGURATION;
        } else if (chartboostError instanceof ChartboostError.Initialization.OsVersionNotSupported) {
            code = StartError.Code.OS_VERSION_NOT_SUPPORTED;
        } else {
            code = chartboostError instanceof ChartboostError.Initialization.PermissionsNotSet ? StartError.Code.PERMISSIONS_NOT_SET : StartError.Code.INTERNAL;
        }
        return new StartError(code, chartboostError);
    }

    public final void b() {
        if (pg.a.d()) {
            s9 h = this.o.h();
            pg.a("SetId: " + h.d() + " scope:" + h.e() + " Tracking state: " + h.f() + " Identifiers: " + h.b());
        }
    }

    public final void c() {
        if (this.d.a("coppa") != null || this.s) {
            return;
        }
        xb.e("COPPA is not set. If this app is child directed, please use ´addDataUseConsent(android.content.Context, com.chartboost.sdk.Privacy.model.COPPA)´ to set the correct value.", null, 2, null);
    }

    public final void b(JSONObject jSONObject) {
        if (pg.a.d()) {
            pg.a("Video player: " + new sg(jSONObject).e().h());
        }
    }

    public final void k() {
        this.l.a(this);
    }

    public final boolean e() {
        String j = j();
        return j != null && j.length() > 0;
    }

    public final String j() {
        return this.b.getString("config", "");
    }

    public final boolean f() {
        String j = j();
        if (j == null || j.length() == 0) {
            return false;
        }
        try {
            boolean a2 = s2.a(this.e, new JSONObject(j));
            if (!a2) {
                xb.b("Cached config is invalid or has invalid schema", (Throwable) null, 2, (Object) null);
            }
            return a2;
        } catch (Exception e) {
            xb.b("Failed to parse cached config", e);
            return false;
        }
    }

    public final void d() {
        this.p.e();
        oj.a.a(this.r);
        q();
        r();
        l();
        o();
        this.t = false;
    }

    public final void o() {
        if (this.s) {
            return;
        }
        this.h.f();
        a((StartError) null);
        this.s = true;
        p();
    }

    public final void q() {
        mi i = ((sg) this.e.get()).i();
        if (i != null) {
            kj.b.refresh(i);
        }
        wb.a.a(i != null ? i.d() : true);
    }

    public final void r() {
        rk e = ((sg) this.e.get()).e();
        if (e != null) {
            this.i.c(e.b());
            this.i.b(e.c());
            this.i.c(e.d());
            this.i.d(e.e());
            this.i.e(e.f());
            this.i.f(e.g());
            this.i.a(e.a());
        }
        ((xk) this.j.getValue()).a(this.a);
    }

    public final void l() {
        g();
        sg sgVar = (sg) this.e.get();
        if (sgVar != null) {
            this.d.a(sgVar.C);
        }
        this.k.a();
        n();
    }

    public final void g() {
        if (this.e.get() == null || ((sg) this.e.get()).h() == null) {
            return;
        }
        String h = ((sg) this.e.get()).h();
        Intrinsics.checkNotNullExpressionValue(h, "getPublisherWarning(...)");
        xb.e(h, null, 2, null);
    }

    public final void n() {
        this.f.b();
    }

    public final void a(StartError startError) {
        b();
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.u.poll();
            StartCallback startCallback = atomicReference != null ? (StartCallback) atomicReference.get() : null;
            if (startCallback == null) {
                this.v = false;
                return;
            }
            this.c.a(new a(startCallback, startError));
        }
    }

    public static final class a extends Lambda implements Function0 {
        public final /* synthetic */ StartCallback b;
        public final /* synthetic */ StartError c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StartCallback startCallback, StartError startError) {
            super(0);
            this.b = startCallback;
            this.c = startError;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            this.b.onStartCompleted(this.c);
        }
    }

    public final void p() {
        if (this.w.getAndSet(true)) {
            xb.a("Initialization event already tracked this launch; skipping success event.", (Throwable) null, 2, (Object) null);
            return;
        }
        sg sgVar = (sg) this.e.get();
        if (sgVar == null) {
            xb.e("SDK config is null; unable to track initialization success event.", null, 2, null);
            this.w.set(false);
        } else {
            if (sgVar.c) {
                xb.a("SDK disabled via kill switch; skipping initialization success event.", (Throwable) null, 2, (Object) null);
                this.w.set(false);
                return;
            }
            try {
                rh.a(this.q, new eb(null, null, null, null, null, null, 63, null), (List) null, o7.b.o, 2, (Object) null);
            } catch (Exception e) {
                xb.b("Failed to submit initialization success event", e);
            }
        }
    }

    public final void c(JSONObject jSONObject) {
        if (jSONObject == null || !s2.a(this.e, jSONObject)) {
            return;
        }
        this.b.edit().putString("config", jSONObject.toString()).apply();
    }

    public final void d(ChartboostError chartboostError) {
        rh.a(this.q, new kh(null, chartboostError.getMessage(), chartboostError.getCode(), chartboostError.getConstant(), chartboostError.getCauseDescription(), null, wb.a(wb.a, 0, 1, null), 1, null), CollectionsKt.emptyList(), (o7.b) null, 4, (Object) null);
    }

    public final void a(ChartboostError chartboostError) {
        d(chartboostError);
        c(chartboostError);
        a(b(chartboostError));
    }

    public final synchronized void a(String appId, String appSignature, StartCallback onStarted, ChartboostError chartboostError) {
        ChartboostError.Initialization internal2;
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        try {
            v7.a.a();
            this.u.add(new AtomicReference(onStarted));
        } catch (Exception e) {
            xb.b("Cannot initialize Chartboost sdk due to internal error", e);
            if (e instanceof ChartboostError.Initialization) {
                internal2 = (ChartboostError.Initialization) e;
            } else {
                internal2 = new ChartboostError.Initialization.Internal("Internal SDK error: " + e.getMessage(), e);
            }
            a(internal2);
        }
        if (this.v) {
            xb.b("Initialization already in progress", (Throwable) null, 2, (Object) null);
            return;
        }
        if (chartboostError != null) {
            a(chartboostError);
            return;
        }
        xb.a("Current session count: " + this.h.b(), (Throwable) null, 2, (Object) null);
        if (this.h.b() > 1) {
            this.t = false;
        }
        this.v = true;
        if (this.s) {
            h();
        } else {
            a(appId, appSignature);
        }
        c();
    }

    @Override // com.chartboost.sdk.impl.tg
    public boolean a() {
        return this.s;
    }

    @Override // com.chartboost.sdk.impl.h5
    public void a(String errorMsg) {
        ChartboostError chartboostError;
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        if (this.m.e()) {
            chartboostError = new ChartboostError.Connectivity.ServerError(errorMsg, null);
        } else {
            chartboostError = ChartboostError.Connectivity.NoInternet.INSTANCE;
        }
        if (this.t) {
            a(chartboostError);
        } else if (e() && f()) {
            d();
        } else if (e()) {
            a(new ChartboostError.Initialization.InvalidConfiguration("Cached configuration is corrupt or invalid", null));
        } else {
            a(chartboostError);
        }
        m();
    }

    public final void c(ChartboostError chartboostError) {
        if (this.w.getAndSet(true)) {
            xb.a("Initialization event already tracked this launch; skipping failure event.", (Throwable) null, 2, (Object) null);
            return;
        }
        boolean z = chartboostError instanceof ChartboostError.Initialization.Disabled;
        sg sgVar = (sg) this.e.get();
        if (!z && sgVar != null && sgVar.c) {
            xb.a("SDK disabled via kill switch; skipping initialization failure event.", (Throwable) null, 2, (Object) null);
            this.w.set(false);
            return;
        }
        try {
            rh.a(this.q, new eb(null, chartboostError.getMessage(), chartboostError.getCode(), chartboostError.getConstant(), chartboostError.getCauseDescription(), wb.a(wb.a, 0, 1, null), 1, null), (List) null, o7.b.o, 2, (Object) null);
        } catch (Exception e) {
            xb.b("Failed to submit initialization failure event", e);
        }
    }

    @Override // com.chartboost.sdk.impl.h5
    public void a(JSONObject configJson) {
        Intrinsics.checkNotNullParameter(configJson, "configJson");
        c(configJson);
        d();
        b(configJson);
    }

    public final void a(String str, String str2) {
        Regex regex;
        Regex regex2;
        if (!s2.a(this.a)) {
            a(new ChartboostError.Initialization.PermissionsNotSet("INTERNET and/or ACCESS_NETWORK_STATE permissions are not set.", null));
            return;
        }
        if (str.length() != 0 && str2.length() != 0 && str.length() == 24 && str2.length() == 40) {
            regex = vg.a;
            if (regex.matches(str)) {
                regex2 = vg.a;
                if (regex2.matches(str2)) {
                    this.n.a();
                    this.g.b();
                    if (e() && f()) {
                        i();
                        return;
                    } else {
                        k();
                        return;
                    }
                }
            }
        }
        a(ChartboostError.Initialization.InvalidCredentials.INSTANCE);
    }
}
