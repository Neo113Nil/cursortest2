package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.e3;
import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class sa extends e3 implements q7 {
    public final /* synthetic */ q7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(String url, q7 eventTracker) {
        super(e3.c.b, url, af.e, null);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.k = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.p7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.k.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi clearFromStorage(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.k.clearFromStorage(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi persist(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.k.persist(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public mi refresh(mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        return this.k.refresh(miVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public ci store(ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        return this.k.store(ciVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi track(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.k.track(piVar);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage */
    public void mo3218clearFromStorage(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.k.mo3218clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist */
    public void mo3219persist(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.k.mo3219persist(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh */
    public void mo3220refresh(mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.k.mo3220refresh(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store */
    public void mo3221store(ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.k.mo3221store(ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.k.mo3222track(event);
    }

    public final String b(h3 h3Var) {
        if (h3Var.c()) {
            return null;
        }
        return "Server error " + h3Var.b() + " for URL " + e();
    }

    public final String a(CBError cBError) {
        return "Error " + cBError.getType() + ": " + cBError.getMessage() + " for URL " + e();
    }

    @Override // com.chartboost.sdk.impl.e3
    public void a(CBError cBError, h3 h3Var) {
        String a;
        xb.b("Impression tracking request failed", cBError != null ? cBError : new Exception("Null CBError"));
        if (h3Var == null || (a = b(h3Var)) == null) {
            a = cBError != null ? a(cBError) : "";
        }
        track((pi) new l7(si.e.c, a, null, null, null, 28, null));
    }
}
