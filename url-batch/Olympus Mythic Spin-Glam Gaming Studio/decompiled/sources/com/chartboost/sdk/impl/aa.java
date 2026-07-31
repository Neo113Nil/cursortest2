package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class aa implements q7 {
    public final u8 a;
    public final a7 b;
    public final ij c;
    public final hb d;
    public final c0 e;
    public final i3 f;
    public final gg g;
    public final Mediation h;
    public final he i;
    public final og j;
    public final ge k;
    public final Function2 l;
    public final q7 m;
    public final EndpointRepository n;
    public final zg o;

    public aa(u8 fileCache, a7 downloader, ij urlResolver, hb intentResolver, c0 adType, i3 networkService, gg requestBodyBuilder, Mediation mediation, he measurementManager, og sdkBiddingTemplateParser, ge openMeasurementImpressionCallback, Function2 impressionFactory, q7 eventTracker, EndpointRepository endpointRepository, zg session) {
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(urlResolver, "urlResolver");
        Intrinsics.checkNotNullParameter(intentResolver, "intentResolver");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(measurementManager, "measurementManager");
        Intrinsics.checkNotNullParameter(sdkBiddingTemplateParser, "sdkBiddingTemplateParser");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionFactory, "impressionFactory");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(session, "session");
        this.a = fileCache;
        this.b = downloader;
        this.c = urlResolver;
        this.d = intentResolver;
        this.e = adType;
        this.f = networkService;
        this.g = requestBodyBuilder;
        this.h = mediation;
        this.i = measurementManager;
        this.j = sdkBiddingTemplateParser;
        this.k = openMeasurementImpressionCallback;
        this.l = impressionFactory;
        this.m = eventTracker;
        this.n = endpointRepository;
        this.o = session;
    }

    @Override // com.chartboost.sdk.impl.p7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.m.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi clearFromStorage(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.m.clearFromStorage(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi persist(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.m.persist(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public mi refresh(mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        return this.m.refresh(miVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public ci store(ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        return this.m.store(ciVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi track(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.m.track(piVar);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage, reason: collision with other method in class */
    public void mo3218clearFromStorage(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.m.mo3218clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist, reason: collision with other method in class */
    public void mo3219persist(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.m.mo3219persist(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh, reason: collision with other method in class */
    public void mo3220refresh(mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.m.mo3220refresh(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store, reason: collision with other method in class */
    public void mo3221store(ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.m.mo3221store(ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track, reason: collision with other method in class */
    public void mo3222track(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.m.mo3222track(event);
    }

    public final qa a(String str, c0 c0Var) {
        if (Intrinsics.areEqual(c0Var, c0.b.g)) {
            return a(str);
        }
        if (Intrinsics.areEqual(c0Var, c0.c.g)) {
            return qa.e;
        }
        if (Intrinsics.areEqual(c0Var, c0.a.g)) {
            return qa.f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final CBError.Impression a(d0 d0Var, File file, String str) {
        Map d = d0Var.d();
        if (d.isEmpty()) {
            return null;
        }
        for (u1 u1Var : d.values()) {
            File a = u1Var.a(file);
            if (a == null || !a.exists()) {
                xb.b("Asset does not exist: " + u1Var.b, (Throwable) null, 2, (Object) null);
                String str2 = u1Var.b;
                if (str2 == null) {
                    str2 = "";
                } else {
                    Intrinsics.checkNotNull(str2);
                }
                a(str, str2);
                return CBError.Impression.ASSET_MISSING;
            }
        }
        return null;
    }

    public final na a(q1 appRequest, r0 callback, ViewGroup viewGroup, pa impressionIntermediateCallback, ca impressionClickCallback, ua viewProtocolBuilder, oa impressionInterface, xl webViewTimeoutInterface, pd nativeBridgeCommand, uh templateLoader) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionIntermediateCallback, "impressionIntermediateCallback");
        Intrinsics.checkNotNullParameter(impressionClickCallback, "impressionClickCallback");
        Intrinsics.checkNotNullParameter(viewProtocolBuilder, "viewProtocolBuilder");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(templateLoader, "templateLoader");
        try {
            File a = this.a.a().a();
            d0 a2 = appRequest.a();
            String d = appRequest.d();
            if (a2 == null) {
                return new na(null, CBError.Impression.PENDING_IMPRESSION_ERROR);
            }
            Intrinsics.checkNotNull(a);
            CBError.Impression a3 = a(a2, a, d);
            if (a3 != null) {
                return new na(null, a3);
            }
            String a4 = a(templateLoader, a2, a, d);
            if (a4 == null) {
                return new na(null, CBError.Impression.ERROR_LOADING_WEB_VIEW);
            }
            return new na(a(appRequest, a2, d, this.i.a(a4), callback, viewGroup, impressionIntermediateCallback, impressionClickCallback, viewProtocolBuilder, impressionInterface, webViewTimeoutInterface, nativeBridgeCommand), null);
        } catch (Exception e) {
            xb.b("showReady exception:", e);
            return new na(null, CBError.Impression.INTERNAL);
        }
    }

    public final a3 a(q1 q1Var, d0 d0Var, String str, String str2, r0 r0Var, ViewGroup viewGroup, pa paVar, ca caVar, ua uaVar, oa oaVar, xl xlVar, pd pdVar) {
        qa a = a(d0Var.p(), this.e);
        n4 n4Var = new n4(this.f, this.g, this.m, this.n, this.o);
        d5 d5Var = new d5(this.f, this.g, this.m, this.n, this.o);
        q3 a2 = uaVar.a(str, d0Var, this.e.b(), str2, r0Var, oaVar, xlVar, pdVar);
        return (a3) this.l.invoke(new ja(this.c, this.d, n4Var, fi.a(this.e.b(), str, this.h, this.m), d5Var, a, this.k, q1Var, this.b, a2, new ia(0, 0, 0, 0, 15, null), d0Var, this.e, str, paVar, caVar, r0Var, this.m), viewGroup);
    }

    public final String a(uh uhVar, d0 d0Var, File file, String str) {
        u1 f = d0Var.f();
        String a = f.a();
        if (a != null && a.length() != 0) {
            File a2 = f.a(file);
            HashMap hashMap = new HashMap(d0Var.s());
            if (d0Var.z().length() > 0 && d0Var.c().length() > 0) {
                og ogVar = this.j;
                Intrinsics.checkNotNull(a2);
                String a3 = ogVar.a(a2, d0Var.z(), d0Var.c());
                if (a3 != null) {
                    return a3;
                }
            }
            if (d0Var.C().length() == 0 || d0Var.B().length() == 0) {
                hashMap.put("{% native_video_player %}", "false");
            } else {
                hashMap.put("{% native_video_player %}", "true");
            }
            for (Map.Entry entry : d0Var.d().entrySet()) {
                hashMap.put(entry.getKey(), ((u1) entry.getValue()).b);
            }
            Intrinsics.checkNotNull(a2);
            return uhVar.a(a2, hashMap, this.e.b(), str);
        }
        xb.b("AdUnit does not have a template body", (Throwable) null, 2, (Object) null);
        return null;
    }

    public final qa a(String str) {
        if (Intrinsics.areEqual(str, "video")) {
            return qa.d;
        }
        return qa.c;
    }

    public final void a(String str, String str2) {
        track((pi) new s5(si.i.f, str2, this.e.b(), str, this.h, null, 32, null));
    }
}
