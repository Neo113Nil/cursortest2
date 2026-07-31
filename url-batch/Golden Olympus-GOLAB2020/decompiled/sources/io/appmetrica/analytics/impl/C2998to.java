package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.to, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2998to {

    /* renamed from: a, reason: collision with root package name */
    public final C3050vo f39884a;

    public C2998to(C2834nf c2834nf, C3062wa c3062wa) {
        this.f39884a = new C3050vo(c2834nf, c3062wa, new InterfaceC3076wo() { // from class: io.appmetrica.analytics.impl.Ap
            @Override // io.appmetrica.analytics.impl.InterfaceC3076wo
            public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
                return C2998to.a(jSONObject, jSONObject2);
            }
        });
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", Bb.a(jSONObject2, "last_migration_api_level", Bb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized void b(String str) {
        C3050vo c3050vo = this.f39884a;
        c3050vo.a(c3050vo.a().put("device_id_hash", str));
    }

    public final synchronized boolean c() {
        return this.f39884a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void d() {
        C3050vo c3050vo = this.f39884a;
        c3050vo.a(c3050vo.a().put("referrer_checked", true));
    }

    public final synchronized Ag b() {
        byte[] decode;
        Ag ag;
        String optStringOrNull = JsonUtils.optStringOrNull(this.f39884a.a(), "referrer");
        if (optStringOrNull != null) {
            try {
                decode = Base64.decode(optStringOrNull.getBytes(Charsets.UTF_8), 0);
            } catch (Throwable unused) {
            }
            ag = (decode == null || decode.length == 0) ? null : new Ag(decode);
        }
        return ag;
    }

    public final synchronized void a(String str) {
        C3050vo c3050vo = this.f39884a;
        c3050vo.a(c3050vo.a().put("device_id", str));
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.f39884a.a(), "device_id_hash");
    }

    public final synchronized void a(Ag ag) {
        try {
            C3050vo c3050vo = this.f39884a;
            c3050vo.a(c3050vo.a().put("referrer", ag != null ? new String(Base64.encode(ag.a(), 0), Charsets.UTF_8) : null));
        } catch (Throwable th) {
            throw th;
        }
    }
}
