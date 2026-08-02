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

/* loaded from: classes.dex */
public final class Ve extends AbstractC1105yd {

    /* renamed from: d, reason: collision with root package name */
    public static final Ye f11119d = new Ye("UUID_RESULT", null);

    /* renamed from: e, reason: collision with root package name */
    public static final Ye f11120e = new Ye("DEVICE_ID_RESULT", null);

    /* renamed from: f, reason: collision with root package name */
    public static final Ye f11121f = new Ye("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: g, reason: collision with root package name */
    public static final Ye f11122g = new Ye("AD_URL_GET_RESULT", null);

    /* renamed from: h, reason: collision with root package name */
    public static final Ye f11123h = new Ye("AD_URL_REPORT_RESULT", null);

    /* renamed from: i, reason: collision with root package name */
    public static final Ye f11124i = new Ye("CUSTOM_HOSTS", null);

    /* renamed from: j, reason: collision with root package name */
    public static final Ye f11125j = new Ye("SERVER_TIME_OFFSET", null);

    /* renamed from: k, reason: collision with root package name */
    public static final Ye f11126k = new Ye("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: l, reason: collision with root package name */
    public static final Ye f11127l = new Ye("CUSTOM_SDK_HOSTS", null);

    /* renamed from: m, reason: collision with root package name */
    public static final Ye f11128m = new Ye("CLIENT_CLIDS", null);
    public static final Ye n = new Ye("DEFERRED_DEEP_LINK_WAS_CHECKED", null);
    public static final Ye o = new Ye("API_LEVEL", null);

    /* renamed from: p, reason: collision with root package name */
    public static final Ye f11129p = new Ye("NEXT_STARTUP_TIME", null);

    /* renamed from: q, reason: collision with root package name */
    public static final Ye f11130q = new Ye("GAID", null);

    /* renamed from: r, reason: collision with root package name */
    public static final Ye f11131r = new Ye("HOAID", null);

    /* renamed from: s, reason: collision with root package name */
    public static final Ye f11132s = new Ye("YANDEX_ADV_ID", null);

    /* renamed from: t, reason: collision with root package name */
    public static final Ye f11133t = new Ye("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* renamed from: u, reason: collision with root package name */
    public static final Ye f11134u = new Ye("SCREEN_INFO", null);
    public static final Ye v = new Ye("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* renamed from: w, reason: collision with root package name */
    public static final Ye f11135w = new Ye("FEATURES", null);

    /* renamed from: x, reason: collision with root package name */
    public static final Ye f11136x = new Ye("APPMETRICA_CLIENT_CONFIG", null);

    public Ve(Ha ha) {
        super(ha);
    }

    public final boolean a(boolean z) {
        return this.f11265a.getBoolean(f11133t.f11306b, z);
    }

    public final long b(long j4) {
        return this.f11265a.getLong(f11125j.f11305a, j4);
    }

    public final Ve c(IdentifiersResult identifiersResult) {
        return a(f11127l.f11306b, identifiersResult);
    }

    public final IdentifiersResult d() {
        return h(f11122g.f11306b);
    }

    public final IdentifiersResult e() {
        return h(f11123h.f11306b);
    }

    public final Ve f(IdentifiersResult identifiersResult) {
        return a(f11130q.f11306b, identifiersResult);
    }

    public final IdentifiersResult h() {
        return h(f11127l.f11306b);
    }

    public final IdentifiersResult i() {
        return h(f11121f.f11306b);
    }

    public final IdentifiersResult j() {
        return h(f11120e.f11306b);
    }

    public final V9 k() {
        String string = this.f11265a.getString(f11135w.f11306b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new V9(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new V9(null, IdentifierStatus.UNKNOWN, null);
    }

    public final IdentifiersResult l() {
        return h(f11130q.f11306b);
    }

    public final IdentifiersResult m() {
        return h(f11131r.f11306b);
    }

    public final long n() {
        return this.f11265a.getLong(f11129p.f11306b, 0L);
    }

    public final IdentifiersResult o() {
        return h(f11126k.f11306b);
    }

    public final ScreenInfo p() {
        return AbstractC0637gb.e(this.f11265a.getString(f11134u.f11306b, null));
    }

    public final IdentifiersResult q() {
        return h(f11119d.f11306b);
    }

    public final IdentifiersResult r() {
        return h(f11132s.f11306b);
    }

    public final boolean s() {
        return this.f11265a.getBoolean(n.f11306b, false);
    }

    public final boolean t() {
        return this.f11265a.getBoolean(v.f11306b, false);
    }

    public final Ve u() {
        return (Ve) b(n.f11306b, true);
    }

    public final void v() {
        b(v.f11306b, true);
    }

    public final List<String> g() {
        String string = this.f11265a.getString(f11124i.f11306b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC0637gb.b(string);
    }

    public final long a(long j4) {
        return this.f11265a.getLong(o.f11306b, j4);
    }

    public final Ve b(IdentifiersResult identifiersResult) {
        return a(f11123h.f11306b, identifiersResult);
    }

    public final Ve c(long j4) {
        return (Ve) b(o.f11306b, j4);
    }

    public final Ve d(IdentifiersResult identifiersResult) {
        return a(f11121f.f11306b, identifiersResult);
    }

    public final Ve e(IdentifiersResult identifiersResult) {
        return a(f11120e.f11306b, identifiersResult);
    }

    public final AppMetricaConfig.Builder f() {
        String string = this.f11265a.getString(f11136x.f11306b, null);
        if (string == null) {
            return null;
        }
        return new G3().a(string);
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
            string = this.f11265a.getString(str, null);
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

    public final Ve i(IdentifiersResult identifiersResult) {
        return a(f11119d.f11306b, identifiersResult);
    }

    public final Ve j(IdentifiersResult identifiersResult) {
        return a(f11132s.f11306b, identifiersResult);
    }

    public final Ve g(IdentifiersResult identifiersResult) {
        return a(f11131r.f11306b, identifiersResult);
    }

    public final Ve a(IdentifiersResult identifiersResult) {
        return a(f11122g.f11306b, identifiersResult);
    }

    public final Ve b(boolean z) {
        return (Ve) b(f11133t.f11306b, z);
    }

    public final Ve d(long j4) {
        return (Ve) b(f11129p.f11306b, j4);
    }

    public final Ve e(long j4) {
        return (Ve) b(f11125j.f11306b, j4);
    }

    public final String i(String str) {
        return this.f11265a.getString(f11128m.f11306b, str);
    }

    public final Ve j(String str) {
        return (Ve) b(f11128m.f11306b, str);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1105yd
    public final String f(String str) {
        return new Ye(str, null).f11306b;
    }

    public final Ve a(List<String> list) {
        return (Ve) b(f11124i.f11306b, AbstractC0779lo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    public final Ve h(IdentifiersResult identifiersResult) {
        return a(f11126k.f11306b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1105yd
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Ve g(String str) {
        return (Ve) d(new Ye(str, null).f11306b);
    }

    public final Ve a(V9 v9) {
        String str = f11135w.f11306b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", v9.f11110a).put("STATUS", v9.f11111b.getValue()).putOpt("ERROR_EXPLANATION", v9.f11112c);
        } catch (Throwable unused) {
        }
        return (Ve) b(str, jSONObject.toString());
    }

    public final void a(ScreenInfo screenInfo) {
        b(f11134u.f11306b, AbstractC0637gb.a(screenInfo));
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        b(f11136x.f11306b, appMetricaConfig.toJson());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Ve a(String str, IdentifiersResult identifiersResult) {
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
