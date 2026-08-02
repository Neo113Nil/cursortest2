package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;
import w3.AbstractC1504a;

/* renamed from: io.appmetrica.analytics.impl.wo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1064wo {

    /* renamed from: a, reason: collision with root package name */
    public final C1116yo f12987a;

    public C1064wo(Ze ze, C0507ba c0507ba) {
        this.f12987a = new C1116yo(ze, c0507ba, new Zo(3));
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", AbstractC0637gb.a(jSONObject2, "last_migration_api_level", AbstractC0637gb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized void b(String str) {
        C1116yo c1116yo = this.f12987a;
        c1116yo.a(c1116yo.a().put("device_id_hash", str));
    }

    public final synchronized boolean c() {
        return this.f12987a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void d() {
        C1116yo c1116yo = this.f12987a;
        c1116yo.a(c1116yo.a().put("referrer_checked", true));
    }

    public final synchronized C0823ng b() {
        byte[] decode;
        C0823ng c0823ng;
        String optStringOrNull = JsonUtils.optStringOrNull(this.f12987a.a(), "referrer");
        if (optStringOrNull != null) {
            try {
                decode = Base64.decode(optStringOrNull.getBytes(AbstractC1504a.f15936a), 0);
            } catch (Throwable unused) {
            }
            c0823ng = (decode == null || decode.length == 0) ? null : new C0823ng(decode);
        }
        return c0823ng;
    }

    public final synchronized void a(String str) {
        C1116yo c1116yo = this.f12987a;
        c1116yo.a(c1116yo.a().put("device_id", str));
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.f12987a.a(), "device_id_hash");
    }

    public final synchronized void a(C0823ng c0823ng) {
        try {
            C1116yo c1116yo = this.f12987a;
            c1116yo.a(c1116yo.a().put("referrer", c0823ng != null ? new String(Base64.encode(c0823ng.a(), 0), AbstractC1504a.f15936a) : null));
        } catch (Throwable th) {
            throw th;
        }
    }
}
