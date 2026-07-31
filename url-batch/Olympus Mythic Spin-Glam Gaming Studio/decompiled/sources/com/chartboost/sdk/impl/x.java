package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.impl.e3;
import com.chartboost.sdk.impl.k3;
import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.impl.w;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.net.URL;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class x implements w, k3.a, q7 {
    public final c0 a;
    public final u8 b;
    public final gg c;
    public final i3 d;
    public final m0 e;
    public final le f;
    public final he g;
    public final q7 h;
    public final EndpointRepository i;
    public final r1 j;
    public ig k;
    public tb l;
    public Function1 m;

    public x(c0 adTraits, u8 fileCache, gg requestBodyBuilder, i3 networkService, m0 adUnitParser, le openRTBAdUnitParser, he openMeasurementManager, q7 eventTracker, EndpointRepository endpointRepository, r1 applicationComponent) {
        Intrinsics.checkNotNullParameter(adTraits, "adTraits");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(adUnitParser, "adUnitParser");
        Intrinsics.checkNotNullParameter(openRTBAdUnitParser, "openRTBAdUnitParser");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.a = adTraits;
        this.b = fileCache;
        this.c = requestBodyBuilder;
        this.d = networkService;
        this.e = adUnitParser;
        this.f = openRTBAdUnitParser;
        this.g = openMeasurementManager;
        this.h = eventTracker;
        this.i = endpointRepository;
        this.j = applicationComponent;
    }

    @Override // com.chartboost.sdk.impl.p7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.h.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi clearFromStorage(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.h.clearFromStorage(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi persist(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.h.persist(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public mi refresh(mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        return this.h.refresh(miVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public ci store(ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        return this.h.store(ciVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi track(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.h.track(piVar);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage */
    public void mo3218clearFromStorage(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.h.mo3218clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist */
    public void mo3219persist(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.h.mo3219persist(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh */
    public void mo3220refresh(mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.h.mo3220refresh(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store */
    public void mo3221store(ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.h.mo3221store(ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.h.mo3222track(event);
    }

    public final boolean b(String str) {
        return Intrinsics.areEqual(str, "");
    }

    public /* synthetic */ x(c0 c0Var, u8 u8Var, gg ggVar, i3 i3Var, m0 m0Var, le leVar, he heVar, q7 q7Var, EndpointRepository endpointRepository, r1 r1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0Var, u8Var, ggVar, i3Var, m0Var, leVar, heVar, q7Var, endpointRepository, (i & 512) != 0 ? f4.b.a() : r1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0034 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(c0 c0Var, boolean z, EndpointConfig endpointConfig) {
        if (!Intrinsics.areEqual(c0Var, c0.a.g)) {
            if (Intrinsics.areEqual(c0Var, c0.b.g)) {
                if (!z || b(endpointConfig.getInterstitial())) {
                    return false;
                }
            } else {
                if (!Intrinsics.areEqual(c0Var, c0.c.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!z || b(endpointConfig.getRewarded())) {
                }
            }
        }
        return true;
    }

    public final me a(k3.a aVar, int i, int i2, String str, int i3, ig igVar, he heVar, zg zgVar) {
        i5 a = igVar.a();
        Intrinsics.checkNotNullExpressionValue(a, "getConfigurationFields(...)");
        URL a2 = a(a);
        vd vdVar = new vd(com.chartboost.sdk.internal.Networking.b.a(a2), a2.getPath(), igVar, af.e, aVar);
        b0 b0Var = new b0(this.a, Integer.valueOf(i), Integer.valueOf(i2), str, i3);
        i5 a3 = igVar.a();
        return new me(vdVar, b0Var, heVar, this.h, zgVar, a(this.a, a3.b(), a3.c()));
    }

    public final k3 a(String str, int i, int i2, boolean z, ig igVar, k3.a aVar, he heVar, zg zgVar) {
        int d;
        String rewarded;
        c0 c0Var = this.a;
        c0.c cVar = c0.c.g;
        if (Intrinsics.areEqual(c0Var, cVar)) {
            d = igVar.h().e();
        } else {
            d = Intrinsics.areEqual(c0Var, c0.b.g) ? igVar.h().d() : igVar.h().a();
        }
        int i3 = d;
        i5 a = igVar.a();
        boolean b = b(this.a, a.b(), a.c());
        if (a.b()) {
            c0 c0Var2 = this.a;
            c0.a aVar2 = c0.a.g;
            if (Intrinsics.areEqual(c0Var2, aVar2)) {
                rewarded = a.c().getBanner();
            } else if (Intrinsics.areEqual(c0Var2, c0.b.g)) {
                rewarded = a.c().getInterstitial();
            } else {
                if (!Intrinsics.areEqual(c0Var2, cVar)) {
                    throw new NoWhenBranchMatchedException();
                }
                rewarded = a.c().getRewarded();
            }
            if (b(rewarded)) {
                if (!Intrinsics.areEqual(this.a, aVar2) && a.d()) {
                    xb.a(this.a.b() + " NRP endpoint explicitly disabled, falling back to WebView", (Throwable) null, 2, (Object) null);
                    return a(aVar, str, i3, z, igVar, heVar, zgVar);
                }
                xb.a(this.a.b() + " endpoint explicitly disabled, failing load", (Throwable) null, 2, (Object) null);
                return null;
            }
        }
        if (b) {
            return a(aVar, i, i2, str, i3, igVar, heVar, zgVar);
        }
        return a(aVar, str, i3, z, igVar, heVar, zgVar);
    }

    public final s3 a(k3.a aVar, String str, int i, boolean z, ig igVar, he heVar, zg zgVar) {
        Partner c;
        URL endPointUrl = this.i.getEndPointUrl(this.a.a());
        e3.c cVar = e3.c.c;
        String a = com.chartboost.sdk.internal.Networking.b.a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        s3 s3Var = new s3(cVar, a, path, igVar, af.e, null, aVar, this.h, zgVar);
        JSONObject e = this.b.e();
        Intrinsics.checkNotNullExpressionValue(e, "getWebViewCacheAssets(...)");
        s3Var.b("cache_assets", e);
        s3Var.b("location", str);
        s3Var.b("imp_depth", Integer.valueOf(i));
        if (heVar.g() && (c = heVar.c()) != null) {
            s3Var.c("omidpn", c.getName());
            s3Var.c("omidpv", c.getVersion());
        }
        s3Var.b("cache", Boolean.valueOf(z));
        s3Var.s = true;
        return s3Var;
    }

    public final void a(d0 d0Var, k3 k3Var) {
        Function1 function1 = this.m;
        tb tbVar = null;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            function1 = null;
        }
        tb tbVar2 = this.l;
        if (tbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        } else {
            tbVar = tbVar2;
        }
        function1.invoke(new ub(tbVar.a(), d0Var, null, k3Var.h, k3Var.g));
    }

    public final void a(String str) {
        Function1 function1 = this.m;
        tb tbVar = null;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            function1 = null;
        }
        tb tbVar2 = this.l;
        if (tbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        } else {
            tbVar = tbVar2;
        }
        function1.invoke(new ub(tbVar.a(), null, new CBError(CBError.Internal.UNEXPECTED_RESPONSE, str), 0L, 0L, 26, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003e, code lost:
    
        if (r8.length() > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r8.length() > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r8.length() > 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final URL a(i5 i5Var) {
        String rewarded;
        c0 c0Var = this.a;
        if (Intrinsics.areEqual(c0Var, c0.a.g)) {
            if (i5Var.b()) {
                rewarded = i5Var.c().getBanner();
                if (rewarded != null) {
                }
            }
            rewarded = null;
        } else if (Intrinsics.areEqual(c0Var, c0.b.g)) {
            if (i5Var.b()) {
                rewarded = i5Var.c().getInterstitial();
                if (rewarded != null) {
                }
            }
            rewarded = null;
        } else if (Intrinsics.areEqual(c0Var, c0.c.g)) {
            if (i5Var.b()) {
                rewarded = i5Var.c().getRewarded();
                if (rewarded != null) {
                }
            }
            rewarded = null;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (rewarded != null) {
            try {
                URL url = new URL(rewarded);
                xb.a("Using NRP waterfall endpoint for " + this.a.b() + ": " + rewarded, (Throwable) null, 2, (Object) null);
                return url;
            } catch (Exception e) {
                xb.b("Invalid NRP waterfall endpoint URL for " + this.a.b() + ": " + rewarded, e);
                URL endPointUrl = this.i.getEndPointUrl(this.a.a());
                xb.a("Falling back to default endpoint for " + this.a.b() + ": " + endPointUrl, (Throwable) null, 2, (Object) null);
                return endPointUrl;
            }
        }
        URL endPointUrl2 = this.i.getEndPointUrl(this.a.a());
        xb.a("Using default endpoint for " + this.a.b() + ": " + endPointUrl2, (Throwable) null, 2, (Object) null);
        return endPointUrl2;
    }

    public String a(JSONObject jSONObject, String str, String str2) {
        return w.a.a(this, jSONObject, str, str2);
    }

    @Override // com.chartboost.sdk.impl.w
    public void a(tb params, Function1 callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.l = params;
        this.m = callback;
        this.k = this.c.a();
        String d = params.a().d();
        Integer b = params.b();
        int intValue = b != null ? b.intValue() : 0;
        Integer c = params.c();
        int intValue2 = c != null ? c.intValue() : 0;
        boolean e = params.e();
        ig igVar = this.k;
        if (igVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestBodyFields");
            igVar = null;
        }
        k3 a = a(d, intValue, intValue2, e, igVar, this, this.g, this.j.k());
        if (a == null) {
            callback.invoke(new ub(params.a(), null, new CBError(CBError.Impression.END_POINT_DISABLED, this.a.b() + " endpoint is explicitly disabled by server configuration"), 0L, 0L, 26, null));
            return;
        }
        a.i = e3.b.c;
        this.d.a(a);
    }

    @Override // com.chartboost.sdk.impl.k3.a
    public void a(k3 k3Var, CBError cBError) {
        Function1 function1 = this.m;
        tb tbVar = null;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            function1 = null;
        }
        tb tbVar2 = this.l;
        if (tbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        } else {
            tbVar = tbVar2;
        }
        q1 a = tbVar.a();
        if (cBError == null) {
            cBError = new CBError(CBError.Internal.INVALID_RESPONSE, "Error parsing response");
        }
        function1.invoke(new ub(a, null, cBError, 0L, 0L, 26, null));
    }

    @Override // com.chartboost.sdk.impl.k3.a
    public void a(k3 k3Var, JSONObject jSONObject) {
        if (k3Var != null && jSONObject != null) {
            ig igVar = this.k;
            Unit unit = null;
            if (igVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestBodyFields");
                igVar = null;
            }
            tb tbVar = this.l;
            if (tbVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
                tbVar = null;
            }
            JSONObject a = tbVar.d().a(jSONObject);
            tb tbVar2 = this.l;
            if (tbVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
                tbVar2 = null;
            }
            d0 a2 = a(igVar, a, tbVar2.a().d());
            if (a2 != null) {
                a(a2, k3Var);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                a("Error parsing response");
                return;
            }
            return;
        }
        a("Unexpected response");
    }

    public final d0 a(ig igVar, JSONObject jSONObject, String str) {
        d0 a;
        try {
            i5 a2 = igVar.a();
            if (b(this.a, a2.b(), a2.c())) {
                a = this.f.a(this.a, jSONObject);
            } else {
                if (!a2.d()) {
                    return null;
                }
                a = this.e.a(jSONObject);
            }
            return a;
        } catch (Exception e) {
            si.a aVar = si.a.g;
            JSONObject jSONObject2 = new JSONObject();
            String message = e.getMessage();
            if (message == null) {
                message = "no message";
            }
            String jSONObject3 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
            track((pi) new s5(aVar, a(jSONObject2, message, jSONObject3), this.a.b(), str, null, null, 48, null));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(c0 c0Var, boolean z, EndpointConfig endpointConfig) {
        if (Intrinsics.areEqual(c0Var, c0.a.g)) {
            return z && !b(endpointConfig.getBanner());
        }
        if (Intrinsics.areEqual(c0Var, c0.b.g)) {
            if (!z || b(endpointConfig.getInterstitial())) {
            }
        } else {
            if (!Intrinsics.areEqual(c0Var, c0.c.g)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!z || b(endpointConfig.getRewarded())) {
            }
        }
    }
}
