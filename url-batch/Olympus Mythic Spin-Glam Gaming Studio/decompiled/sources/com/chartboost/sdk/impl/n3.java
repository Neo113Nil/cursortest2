package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.si;
import com.safedk.android.internal.partials.ChartboostNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class n3 implements q7 {
    public final /* synthetic */ q7 a;

    public n3(q7 eventTracker) {
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.a = eventTracker;
    }

    public final void c(r3 r3Var, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        b(qd.N.c(), r3Var, location, adTypeName);
    }

    @Override // com.chartboost.sdk.impl.p7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi clearFromStorage(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.a.clearFromStorage(piVar);
    }

    public final void d(r3 r3Var, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        b(qd.O.c(), r3Var, location, adTypeName);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi persist(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.a.persist(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public mi refresh(mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        return this.a.refresh(miVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public ci store(ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        return this.a.store(ciVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi track(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.a.track(piVar);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage */
    public void mo3218clearFromStorage(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.mo3218clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist */
    public void mo3219persist(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.mo3219persist(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh */
    public void mo3220refresh(mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a.mo3220refresh(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store */
    public void mo3221store(ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.a.mo3221store(ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.mo3222track(event);
    }

    public final void b(String str, r3 r3Var, String str2, String str3) {
        a("javascript:Chartboost.EventHandler.handleNativeEvent(\"" + str + "\")", r3Var, str2, str3);
    }

    public final void b(r3 r3Var, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        b(qd.R.c(), r3Var, location, adTypeName);
    }

    public final void a(String str, r3 r3Var, String str2, String str3) {
        try {
            if (r3Var == null) {
                track((pi) new s5(si.i.j, "Webview is null", str3, str2, null, null, 48, null));
                xb.b("Calling native to javascript webview is null", (Throwable) null, 2, (Object) null);
                return;
            }
            xb.a("Calling native to javascript: " + str, (Throwable) null, 2, (Object) null);
            ChartboostNetworkBridge.webviewLoadUrl(r3Var, str);
        } catch (Exception e) {
            track((pi) new s5(si.i.k, "Cannot open url: " + e, str3, str2, null, null, 48, null));
            xb.b("Calling native to javascript. Cannot open url", e);
        }
    }

    public final void b(r3 r3Var, float f, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalDuration", Float.valueOf(f));
        String c = qd.M.c();
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        a(c, jSONObject2, r3Var, location, adTypeName);
    }

    public final void a(String str, String str2, r3 r3Var, String str3, String str4) {
        a("javascript:Chartboost.EventHandler.handleNativeEvent(\"" + str + "\", " + str2 + ")", r3Var, str3, str4);
    }

    public final void a(r3 r3Var, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        b(qd.Q.c(), r3Var, location, adTypeName);
    }

    public final void a(r3 r3Var, float f, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("seconds", Float.valueOf(f));
        String c = qd.P.c();
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        a(c, jSONObject2, r3Var, location, adTypeName);
    }
}
