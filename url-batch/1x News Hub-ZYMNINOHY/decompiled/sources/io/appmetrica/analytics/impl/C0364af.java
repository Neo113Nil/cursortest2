package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.af, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364af extends Fd {

    /* renamed from: d, reason: collision with root package name */
    public static final C0442df f7006d = new C0442df("UUID_RESULT", null);

    /* renamed from: e, reason: collision with root package name */
    public static final C0442df f7007e = new C0442df("DEVICE_ID_RESULT", null);
    public static final C0442df f = new C0442df("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: g, reason: collision with root package name */
    public static final C0442df f7008g = new C0442df("AD_URL_GET_RESULT", null);

    /* renamed from: h, reason: collision with root package name */
    public static final C0442df f7009h = new C0442df("AD_URL_REPORT_RESULT", null);

    /* renamed from: i, reason: collision with root package name */
    public static final C0442df f7010i = new C0442df("CUSTOM_HOSTS", null);

    /* renamed from: j, reason: collision with root package name */
    public static final C0442df f7011j = new C0442df("SERVER_TIME_OFFSET", null);

    /* renamed from: k, reason: collision with root package name */
    public static final C0442df f7012k = new C0442df("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: l, reason: collision with root package name */
    public static final C0442df f7013l = new C0442df("CUSTOM_SDK_HOSTS", null);

    /* renamed from: m, reason: collision with root package name */
    public static final C0442df f7014m = new C0442df("CLIENT_CLIDS", null);

    /* renamed from: n, reason: collision with root package name */
    public static final C0442df f7015n = new C0442df("DEFERRED_DEEP_LINK_WAS_CHECKED", null);
    public static final C0442df o = new C0442df("API_LEVEL", null);

    /* renamed from: p, reason: collision with root package name */
    public static final C0442df f7016p = new C0442df("NEXT_STARTUP_TIME", null);

    /* renamed from: q, reason: collision with root package name */
    public static final C0442df f7017q = new C0442df("GAID", null);

    /* renamed from: r, reason: collision with root package name */
    public static final C0442df f7018r = new C0442df("HOAID", null);

    /* renamed from: s, reason: collision with root package name */
    public static final C0442df f7019s = new C0442df("YANDEX_ADV_ID", null);

    /* renamed from: t, reason: collision with root package name */
    public static final C0442df f7020t = new C0442df("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* renamed from: u, reason: collision with root package name */
    public static final C0442df f7021u = new C0442df("SCREEN_INFO", null);
    public static final C0442df v = new C0442df("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* renamed from: w, reason: collision with root package name */
    public static final C0442df f7022w = new C0442df("FEATURES", null);

    /* renamed from: x, reason: collision with root package name */
    public static final C0442df f7023x = new C0442df("APPMETRICA_CLIENT_CONFIG", null);

    public C0364af(Oa oa) {
        super(oa);
    }

    public final boolean a(boolean z) {
        return this.f7142a.getBoolean(f7020t.f7185b, z);
    }

    public final long b(long j3) {
        return this.f7142a.getLong(f7011j.f7184a, j3);
    }

    public final C0364af c(IdentifiersResult identifiersResult) {
        return a(f7013l.f7185b, identifiersResult);
    }

    public final IdentifiersResult d() {
        return h(f7008g.f7185b);
    }

    public final IdentifiersResult e() {
        return h(f7009h.f7185b);
    }

    public final C0364af f(IdentifiersResult identifiersResult) {
        return a(f7017q.f7185b, identifiersResult);
    }

    public final IdentifiersResult h() {
        return h(f7013l.f7185b);
    }

    public final IdentifiersResult i() {
        return h(f.f7185b);
    }

    public final IdentifiersResult j() {
        return h(f7007e.f7185b);
    }

    public final C0411ca k() {
        String string = this.f7142a.getString(f7022w.f7185b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C0411ca(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C0411ca(null, IdentifierStatus.UNKNOWN, null);
    }

    public final IdentifiersResult l() {
        return h(f7017q.f7185b);
    }

    public final IdentifiersResult m() {
        return h(f7018r.f7185b);
    }

    public final long n() {
        return this.f7142a.getLong(f7016p.f7185b, 0L);
    }

    public final IdentifiersResult o() {
        return h(f7012k.f7185b);
    }

    public final ScreenInfo p() {
        return AbstractC0696nb.e(this.f7142a.getString(f7021u.f7185b, null));
    }

    public final IdentifiersResult q() {
        return h(f7006d.f7185b);
    }

    public final IdentifiersResult r() {
        return h(f7019s.f7185b);
    }

    public final boolean s() {
        return this.f7142a.getBoolean(f7015n.f7185b, false);
    }

    public final boolean t() {
        return this.f7142a.getBoolean(v.f7185b, false);
    }

    public final C0364af u() {
        return (C0364af) b(f7015n.f7185b, true);
    }

    public final void v() {
        b(v.f7185b, true);
    }

    public final List<String> g() {
        String string = this.f7142a.getString(f7010i.f7185b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC0696nb.b(string);
    }

    public final long a(long j3) {
        return this.f7142a.getLong(o.f7185b, j3);
    }

    public final C0364af b(IdentifiersResult identifiersResult) {
        return a(f7009h.f7185b, identifiersResult);
    }

    public final C0364af c(long j3) {
        return (C0364af) b(o.f7185b, j3);
    }

    public final C0364af d(IdentifiersResult identifiersResult) {
        return a(f.f7185b, identifiersResult);
    }

    public final C0364af e(IdentifiersResult identifiersResult) {
        return a(f7007e.f7185b, identifiersResult);
    }

    public final AppMetricaConfig.Builder f() {
        String string = this.f7142a.getString(f7023x.f7185b, null);
        if (string == null) {
            return null;
        }
        return new O3().a(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult h(String str) {
        IdentifiersResult identifiersResult;
        String string;
        try {
            string = this.f7142a.getString(str, null);
        } catch (Throwable unused) {
        }
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            identifiersResult = new IdentifiersResult(JsonUtils.optStringOrNull(jSONObject, "ID"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            return identifiersResult != null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
        }
        identifiersResult = null;
        if (identifiersResult != null) {
        }
    }

    public final C0364af i(IdentifiersResult identifiersResult) {
        return a(f7006d.f7185b, identifiersResult);
    }

    public final C0364af j(IdentifiersResult identifiersResult) {
        return a(f7019s.f7185b, identifiersResult);
    }

    public final C0364af g(IdentifiersResult identifiersResult) {
        return a(f7018r.f7185b, identifiersResult);
    }

    public final C0364af a(IdentifiersResult identifiersResult) {
        return a(f7008g.f7185b, identifiersResult);
    }

    public final C0364af b(boolean z) {
        return (C0364af) b(f7020t.f7185b, z);
    }

    public final C0364af d(long j3) {
        return (C0364af) b(f7016p.f7185b, j3);
    }

    public final C0364af e(long j3) {
        return (C0364af) b(f7011j.f7185b, j3);
    }

    public final String i(String str) {
        return this.f7142a.getString(f7014m.f7185b, str);
    }

    public final C0364af j(String str) {
        return (C0364af) b(f7014m.f7185b, str);
    }

    @Override // io.appmetrica.analytics.impl.Fd
    public final String f(String str) {
        return new C0442df(str, null).f7185b;
    }

    public final C0364af a(List<String> list) {
        return (C0364af) b(f7010i.f7185b, AbstractC0709no.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    public final C0364af h(IdentifiersResult identifiersResult) {
        return a(f7012k.f7185b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.Fd
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C0364af g(String str) {
        return (C0364af) d(new C0442df(str, null).f7185b);
    }

    public final C0364af a(C0411ca c0411ca) {
        String str = f7022w.f7185b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c0411ca.f7132a).put("STATUS", c0411ca.f7133b.getValue()).putOpt("ERROR_EXPLANATION", c0411ca.f7134c);
        } catch (Throwable unused) {
        }
        return (C0364af) b(str, jSONObject.toString());
    }

    public final void a(ScreenInfo screenInfo) {
        b(f7021u.f7185b, AbstractC0696nb.a(screenInfo));
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        b(f7023x.f7185b, appMetricaConfig.toJson());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0364af a(String str, IdentifiersResult identifiersResult) {
        String jSONObject;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ID", identifiersResult.id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                jSONObject = jSONObject2.toString();
            } catch (Throwable unused2) {
            }
            if (jSONObject != null) {
                b(str, jSONObject);
            }
            return this;
        }
        jSONObject = null;
        if (jSONObject != null) {
        }
        return this;
    }
}
