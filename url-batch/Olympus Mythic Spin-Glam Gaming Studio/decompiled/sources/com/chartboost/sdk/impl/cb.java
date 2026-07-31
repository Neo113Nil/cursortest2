package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.e3;
import com.chartboost.sdk.impl.k3;
import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class cb implements k3.a, q7 {
    public final i3 a;
    public final gg b;
    public final q7 c;
    public final EndpointRepository d;
    public h5 e;

    public cb(i3 networkService, gg requestBodyBuilder, q7 eventTracker, EndpointRepository endpointRepository) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        this.a = networkService;
        this.b = requestBodyBuilder;
        this.c = eventTracker;
        this.d = endpointRepository;
    }

    public final void a(h5 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.e = callback;
        URL endPointUrl = this.d.getEndPointUrl(EndpointRepository.EndPoint.CONFIG);
        String a = com.chartboost.sdk.internal.Networking.b.a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        k3 k3Var = new k3(a, path, this.b.a(), af.d, this, this.c, (zg) null, 64, (DefaultConstructorMarker) null);
        k3Var.i = e3.b.c;
        k3Var.s = true;
        this.a.a(k3Var);
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

    @Override // com.chartboost.sdk.impl.k3.a
    public void a(k3 k3Var, CBError cBError) {
        String str;
        if (cBError == null || (str = cBError.getErrorDesc()) == null) {
            str = "Config failure";
        }
        track((pi) new l7(si.f.e, str, null, null, null, 28, null));
        h5 h5Var = this.e;
        if (h5Var != null) {
            h5Var.a(str);
        }
    }

    @Override // com.chartboost.sdk.impl.k3.a
    public void a(k3 k3Var, JSONObject jSONObject) {
        JSONObject a = b3.a(jSONObject, "response");
        h5 h5Var = this.e;
        if (h5Var != null) {
            Intrinsics.checkNotNull(a);
            h5Var.a(a);
        }
    }
}
