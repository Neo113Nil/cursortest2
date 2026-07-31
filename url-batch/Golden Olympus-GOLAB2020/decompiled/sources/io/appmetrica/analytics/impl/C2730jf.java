package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.jf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2730jf extends Nd {

    /* renamed from: d, reason: collision with root package name */
    public static final C2808mf f39265d = new C2808mf("UUID_RESULT", null);

    /* renamed from: e, reason: collision with root package name */
    public static final C2808mf f39266e = new C2808mf("DEVICE_ID_RESULT", null);

    /* renamed from: f, reason: collision with root package name */
    public static final C2808mf f39267f = new C2808mf("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: g, reason: collision with root package name */
    public static final C2808mf f39268g = new C2808mf("AD_URL_GET_RESULT", null);

    /* renamed from: h, reason: collision with root package name */
    public static final C2808mf f39269h = new C2808mf("AD_URL_REPORT_RESULT", null);

    /* renamed from: i, reason: collision with root package name */
    public static final C2808mf f39270i = new C2808mf("CUSTOM_HOSTS", null);

    /* renamed from: j, reason: collision with root package name */
    public static final C2808mf f39271j = new C2808mf("SERVER_TIME_OFFSET", null);

    /* renamed from: k, reason: collision with root package name */
    public static final C2808mf f39272k = new C2808mf("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: l, reason: collision with root package name */
    public static final C2808mf f39273l = new C2808mf("CUSTOM_SDK_HOSTS", null);

    /* renamed from: m, reason: collision with root package name */
    public static final C2808mf f39274m = new C2808mf("CLIENT_CLIDS", null);

    /* renamed from: n, reason: collision with root package name */
    public static final C2808mf f39275n = new C2808mf("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* renamed from: o, reason: collision with root package name */
    public static final C2808mf f39276o = new C2808mf("API_LEVEL", null);

    /* renamed from: p, reason: collision with root package name */
    public static final C2808mf f39277p = new C2808mf("NEXT_STARTUP_TIME", null);

    /* renamed from: q, reason: collision with root package name */
    public static final C2808mf f39278q = new C2808mf(IronSourceConstants.TYPE_GAID, null);

    /* renamed from: r, reason: collision with root package name */
    public static final C2808mf f39279r = new C2808mf("HOAID", null);

    /* renamed from: s, reason: collision with root package name */
    public static final C2808mf f39280s = new C2808mf("YANDEX_ADV_ID", null);

    /* renamed from: t, reason: collision with root package name */
    public static final C2808mf f39281t = new C2808mf("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* renamed from: u, reason: collision with root package name */
    public static final C2808mf f39282u = new C2808mf("SCREEN_INFO", null);

    /* renamed from: v, reason: collision with root package name */
    public static final C2808mf f39283v = new C2808mf("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* renamed from: w, reason: collision with root package name */
    public static final C2808mf f39284w = new C2808mf("FEATURES", null);

    /* renamed from: x, reason: collision with root package name */
    public static final C2808mf f39285x = new C2808mf("APPMETRICA_CLIENT_CONFIG", null);

    public C2730jf(InterfaceC2542cb interfaceC2542cb) {
        super(interfaceC2542cb);
    }

    public final boolean a(boolean z4) {
        return this.f39400a.getBoolean(f39281t.f39447b, z4);
    }

    public final long b(long j4) {
        return this.f39400a.getLong(f39271j.f39446a, j4);
    }

    @NonNull
    public final C2730jf c(IdentifiersResult identifiersResult) {
        return a(f39273l.f39447b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult d() {
        return h(f39268g.f39447b);
    }

    @NonNull
    public final IdentifiersResult e() {
        return h(f39269h.f39447b);
    }

    @NonNull
    public final C2730jf f(IdentifiersResult identifiersResult) {
        return a(f39278q.f39447b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult h() {
        return h(f39273l.f39447b);
    }

    @NonNull
    public final IdentifiersResult i() {
        return h(f39267f.f39447b);
    }

    @NonNull
    public final IdentifiersResult j() {
        return h(f39266e.f39447b);
    }

    @NonNull
    public final C2907qa k() {
        String string = this.f39400a.getString(f39284w.f39447b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C2907qa(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C2907qa(null, IdentifierStatus.UNKNOWN, null);
    }

    @NonNull
    public final IdentifiersResult l() {
        return h(f39278q.f39447b);
    }

    @NonNull
    public final IdentifiersResult m() {
        return h(f39279r.f39447b);
    }

    @NonNull
    public final long n() {
        return this.f39400a.getLong(f39277p.f39447b, 0L);
    }

    @NonNull
    public final IdentifiersResult o() {
        return h(f39272k.f39447b);
    }

    public final ScreenInfo p() {
        return Bb.e(this.f39400a.getString(f39282u.f39447b, null));
    }

    @NonNull
    public final IdentifiersResult q() {
        return h(f39265d.f39447b);
    }

    @NonNull
    public final IdentifiersResult r() {
        return h(f39280s.f39447b);
    }

    public final boolean s() {
        return this.f39400a.getBoolean(f39275n.f39447b, false);
    }

    public final boolean t() {
        return this.f39400a.getBoolean(f39283v.f39447b, false);
    }

    public final C2730jf u() {
        return (C2730jf) b(f39275n.f39447b, true);
    }

    public final void v() {
        b(f39283v.f39447b, true);
    }

    public final List<String> g() {
        String string = this.f39400a.getString(f39270i.f39447b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return Bb.b(string);
    }

    public final long a(long j4) {
        return this.f39400a.getLong(f39276o.f39447b, j4);
    }

    @NonNull
    public final C2730jf b(IdentifiersResult identifiersResult) {
        return a(f39269h.f39447b, identifiersResult);
    }

    public final C2730jf c(long j4) {
        return (C2730jf) b(f39276o.f39447b, j4);
    }

    @NonNull
    public final C2730jf d(IdentifiersResult identifiersResult) {
        return a(f39267f.f39447b, identifiersResult);
    }

    @NonNull
    public final C2730jf e(IdentifiersResult identifiersResult) {
        return a(f39266e.f39447b, identifiersResult);
    }

    public final AppMetricaConfig f() {
        String string = this.f39400a.getString(f39285x.f39447b, null);
        if (string == null) {
            return null;
        }
        return AppMetricaConfig.fromJson(string);
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
            string = this.f39400a.getString(str, null);
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

    @NonNull
    public final C2730jf i(IdentifiersResult identifiersResult) {
        return a(f39265d.f39447b, identifiersResult);
    }

    @NonNull
    public final C2730jf j(IdentifiersResult identifiersResult) {
        return a(f39280s.f39447b, identifiersResult);
    }

    @NonNull
    public final C2730jf g(IdentifiersResult identifiersResult) {
        return a(f39279r.f39447b, identifiersResult);
    }

    @NonNull
    public final C2730jf a(IdentifiersResult identifiersResult) {
        return a(f39268g.f39447b, identifiersResult);
    }

    public final C2730jf b(boolean z4) {
        return (C2730jf) b(f39281t.f39447b, z4);
    }

    @NonNull
    public final C2730jf d(long j4) {
        return (C2730jf) b(f39277p.f39447b, j4);
    }

    public final C2730jf e(long j4) {
        return (C2730jf) b(f39271j.f39447b, j4);
    }

    public final String i(String str) {
        return this.f39400a.getString(f39274m.f39447b, str);
    }

    public final C2730jf j(String str) {
        return (C2730jf) b(f39274m.f39447b, str);
    }

    @Override // io.appmetrica.analytics.impl.Nd
    @NonNull
    public final String f(@NonNull String str) {
        return new C2808mf(str, null).f39447b;
    }

    public final C2730jf a(List<String> list) {
        return (C2730jf) b(f39270i.f39447b, AbstractC2713io.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    @NonNull
    public final C2730jf h(IdentifiersResult identifiersResult) {
        return a(f39272k.f39447b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.Nd
    @NonNull
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C2730jf g(@NonNull String str) {
        return (C2730jf) d(new C2808mf(str, null).f39447b);
    }

    @NonNull
    public final C2730jf a(@NonNull C2907qa c2907qa) {
        String str = f39284w.f39447b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c2907qa.f39652a).put("STATUS", c2907qa.f39653b.getValue()).putOpt("ERROR_EXPLANATION", c2907qa.f39654c);
        } catch (Throwable unused) {
        }
        return (C2730jf) b(str, jSONObject.toString());
    }

    public final void a(ScreenInfo screenInfo) {
        b(f39282u.f39447b, Bb.a(screenInfo));
    }

    public final void a(@NonNull AppMetricaConfig appMetricaConfig) {
        b(f39285x.f39447b, appMetricaConfig.toJson());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2730jf a(String str, IdentifiersResult identifiersResult) {
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
