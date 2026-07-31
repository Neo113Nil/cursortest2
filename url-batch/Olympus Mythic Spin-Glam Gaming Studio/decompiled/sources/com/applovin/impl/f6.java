package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.d6;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class f6 extends i5 {
    private static final AtomicBoolean o = new AtomicBoolean();
    private final a3 g;
    private final JSONObject h;
    private final List i;
    private final a.InterfaceC0079a j;
    private final WeakReference k;
    private final String l;
    private long m;
    private final List n;

    private class b extends i5 {
        private final long g;
        private final int h;
        private final y2 i;
        private final List j;

        class a extends i3 {
            final /* synthetic */ MaxAdFormat b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a.InterfaceC0079a interfaceC0079a, MaxAdFormat maxAdFormat, String str) {
                super(interfaceC0079a);
                this.b = maxAdFormat;
                this.c = str;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.g;
                com.applovin.impl.sdk.o unused = b.this.c;
                if (com.applovin.impl.sdk.o.a()) {
                    b.this.c.a(b.this.b, "Ad failed to load in " + elapsedRealtime + " ms for " + this.b.getLabel() + " ad unit " + str + " with error: " + maxError);
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.a(bVar.i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                if (b.this.h >= b.this.j.size() - 1) {
                    f6.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                } else {
                    b bVar2 = b.this;
                    b.this.a.q0().a((i5) new b(bVar2.h + 1, b.this.j), d6.b.MEDIATION);
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.g;
                com.applovin.impl.sdk.o unused = b.this.c;
                if (com.applovin.impl.sdk.o.a()) {
                    b.this.c.a(b.this.b, "Ad loaded in " + elapsedRealtime + "ms for " + this.b.getLabel() + " ad unit " + this.c);
                }
                y2 y2Var = (y2) maxAd;
                b.this.a(y2Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                int i = b.this.h;
                while (true) {
                    i++;
                    if (i >= b.this.j.size()) {
                        f6.this.b(y2Var);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.a((y2) bVar.j.get(i), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            String b = f6.this.g.b();
            MaxAdFormat a2 = f6.this.g.a();
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Loading ad " + (this.h + 1) + " of " + this.j.size() + " from " + this.i.c() + " for " + a2.getLabel() + " ad unit " + b);
            }
            b("started to load ad");
            Context context = (Context) f6.this.k.get();
            Activity u0 = context instanceof Activity ? (Activity) context : this.a.u0();
            this.a.a0().b(this.i);
            this.a.X().loadThirdPartyMediatedAd(b, this.i, u0, new a(f6.this.j, a2, b));
        }

        private b(int i, List list) {
            super(f6.this.b, f6.this.a, f6.this.g.b());
            this.g = SystemClock.elapsedRealtime();
            this.h = i;
            this.i = (y2) list.get(i);
            this.j = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(y2 y2Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, MaxError maxError) {
            f6.this.n.add(new MaxNetworkResponseInfoImpl(adLoadState, w3.a(y2Var.b()), y2Var.E(), y2Var.W(), j, y2Var.B(), maxError));
        }
    }

    public f6(a3 a3Var, JSONObject jSONObject, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0079a interfaceC0079a) {
        super("TaskProcessMediationWaterfall", kVar, a3Var.b());
        this.g = a3Var;
        this.h = jSONObject;
        this.j = interfaceC0079a;
        this.k = new WeakReference(context);
        this.l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        this.i = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            this.i.add(y2.a(a3Var, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, kVar));
        }
        this.n = new ArrayList(this.i.size());
    }

    @Override // java.lang.Runnable
    public void run() {
        final MaxErrorImpl maxErrorImpl;
        this.m = SystemClock.elapsedRealtime();
        int i = 0;
        if (this.h.optBoolean("is_testing", false) && !this.a.s0().c() && o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.f6$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    f6.this.e();
                }
            });
        }
        String b2 = this.g.b();
        MaxAdFormat a2 = this.g.a();
        if (this.i.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Starting waterfall for " + a2.getLabel() + " ad unit " + b2 + " with " + this.i.size() + " ad(s)...");
            }
            this.a.q0().a(new b(i, this.i));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.k(this.b, "No ads were returned from the server for " + a2.getLabel() + " ad unit " + b2);
        }
        n7.a(b2, a2, this.h, this.a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.h, "settings", new JSONObject());
        long j = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (w3.a(this.h, b2, this.a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, "Ad Unit ID " + b2 + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://support.axon.ai/en/max/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
            if (n7.c(this.a) && ((Boolean) this.a.a(x4.A6)).booleanValue()) {
                j = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j <= 0) {
            b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.f6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                f6.this.b(maxErrorImpl);
            }
        };
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            g0.a(millis, this.a, runnable);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        n7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.a.u0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        this.a.a0().c(y2Var);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d(this.b, "Waterfall loaded in " + elapsedRealtime + "ms from " + y2Var.c() + " for " + this.g.a().getLabel() + " ad unit " + this.g.b());
        }
        y2Var.a(new MaxAdWaterfallInfoImpl(y2Var, elapsedRealtime, this.n, this.l));
        t2.f(this.j, y2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======");
            sb.append("\n");
            int i = 0;
            while (i < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i);
                i++;
                sb.append(i);
                sb.append(") ");
                sb.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb.append("\n");
                sb.append("..code: ");
                sb.append(maxNetworkResponseInfo2.getError().getCode());
                sb.append("\n");
                sb.append("..message: ");
                sb.append(maxNetworkResponseInfo2.getError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        String b2 = this.g.b();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d(this.b, "Waterfall failed in " + elapsedRealtime + "ms for " + this.g.a().getLabel() + " ad unit " + b2 + " with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.h, "waterfall_name", ""), JsonUtils.getString(this.h, "waterfall_test_name", ""), elapsedRealtime, this.n, this.g, JsonUtils.optList(JsonUtils.getJSONArray(this.h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.l, JsonUtils.getString(this.h, "event_id", "")));
        t2.a(this.j, b2, maxError);
    }
}
