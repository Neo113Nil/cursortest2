package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebSettings;
import com.chartboost.sdk.impl.si;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class kj implements q7 {
    public static final kj b = new kj();
    public static String c = "Invalid user-agent value";
    public final /* synthetic */ q7 a = fi.a();

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

    public final void a(String str) {
        try {
            track((pi) new l7(si.f.c, str, null, null, null, 28, null));
        } catch (Exception e) {
            xb.b("sendUserAgentErrorTracking", e);
        }
    }

    public final void a(Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            str = System.getProperty("http.agent");
        } catch (Exception e) {
            a(e.toString());
            str = "";
        }
        try {
            str = WebSettings.getDefaultUserAgent(context);
        } catch (Exception e2) {
            a(e2.toString());
        }
        if (str != null) {
            c = str;
        }
    }

    public final String a() {
        return c;
    }
}
