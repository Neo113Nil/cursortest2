package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.k3;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wi extends k3 {
    public final ri u;
    public final String v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wi(String url, ri trackingEventCache, String sessionId, k3.a callback, p7 eventTracker) {
        super(r1.a(url), r1.b(url), (ig) null, af.e, callback, eventTracker, (zg) null, 64, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(trackingEventCache, "trackingEventCache");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        NetworkHelper networkHelper = NetworkHelper.a;
        this.u = trackingEventCache;
        this.v = sessionId;
        this.s = false;
    }

    public final Map c(String str) {
        return MapsKt.mapOf(TuplesKt.to(com.safedk.android.utils.n.c, "application/json"), TuplesKt.to("X-Chartboost-Client", p3.b()), TuplesKt.to("X-Chartboost-API", "9.12.1"), TuplesKt.to("x-monetization-session-id", str));
    }

    public static final class a implements k3.a {
        public final /* synthetic */ ri a;

        public a(ri riVar) {
            this.a = riVar;
        }

        @Override // com.chartboost.sdk.impl.k3.a
        public void a(k3 k3Var, JSONObject jSONObject) {
        }

        @Override // com.chartboost.sdk.impl.k3.a
        public void a(k3 k3Var, CBError cBError) {
            JSONArray h;
            xb.a("Request " + (k3Var != null ? k3Var.e() : null) + " failed!", (Throwable) null, 2, (Object) null);
            if (k3Var == null || (h = k3Var.h()) == null) {
                return;
            }
            this.a.a(h);
        }
    }

    @Override // com.chartboost.sdk.impl.k3, com.chartboost.sdk.impl.e3
    public f3 a() {
        Map c = c(this.v);
        JSONArray h = h();
        return new f3(c, h != null ? c3.a(h) : null, "application/json");
    }

    public /* synthetic */ wi(String str, ri riVar, String str2, k3.a aVar, p7 p7Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, riVar, str2, (i & 8) != 0 ? new a(riVar) : aVar, p7Var);
    }
}
