package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.e3;
import com.chartboost.sdk.impl.k3;
import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.internal.Model.CBError;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class s0 implements k3.a, q7 {
    public final i3 a;
    public final gg b;
    public final q7 c;
    public final zg d;
    public fh e;

    public s0(i3 networkService, gg requestBodyBuilder, q7 eventTracker, zg session) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(session, "session");
        this.a = networkService;
        this.b = requestBodyBuilder;
        this.c = eventTracker;
        this.d = session;
    }

    @Override // com.chartboost.sdk.impl.k3.a
    public void a(k3 k3Var, JSONObject jSONObject) {
    }

    @Override // com.chartboost.sdk.impl.p7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.c.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi clearFromStorage(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.c.clearFromStorage(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi persist(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.c.persist(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public mi refresh(mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        return this.c.refresh(miVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public ci store(ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        return this.c.store(ciVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi track(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.c.track(piVar);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage */
    public void mo3218clearFromStorage(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.c.mo3218clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist */
    public void mo3219persist(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.c.mo3219persist(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh */
    public void mo3220refresh(mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.c.mo3220refresh(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store */
    public void mo3221store(ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.c.mo3221store(ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.c.mo3222track(event);
    }

    public final void a(k3 k3Var, fh fhVar) {
        k3Var.a("cached", "0");
        k3Var.a("location", fhVar.c());
        int e = fhVar.e();
        if (e >= 0) {
            k3Var.a("video_cached", Integer.valueOf(e));
        }
        String a = fhVar.a();
        if (a == null || a.length() == 0) {
            return;
        }
        k3Var.a(CreativeInfo.c, a);
    }

    public final void a(URL url, fh showParams) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(showParams, "showParams");
        this.e = showParams;
        String a = com.chartboost.sdk.internal.Networking.b.a(url);
        String path = url.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        k3 k3Var = new k3(a, path, this.b.a(), af.e, this, this.c, this.d);
        k3Var.i = e3.b.c;
        a(k3Var, showParams);
        this.a.a(k3Var);
    }

    @Override // com.chartboost.sdk.impl.k3.a
    public void a(k3 k3Var, CBError cBError) {
        String str;
        si.i iVar = si.i.m;
        if (cBError == null || (str = cBError.getMessage()) == null) {
            str = "Show failure";
        }
        String str2 = str;
        fh fhVar = this.e;
        fh fhVar2 = null;
        if (fhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showParams");
            fhVar = null;
        }
        String b = fhVar.b();
        fh fhVar3 = this.e;
        if (fhVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showParams");
            fhVar3 = null;
        }
        String c = fhVar3.c();
        fh fhVar4 = this.e;
        if (fhVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showParams");
        } else {
            fhVar2 = fhVar4;
        }
        track((pi) new l7(iVar, str2, b, c, fhVar2.d()));
    }
}
