package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.uo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3024uo {

    /* renamed from: a, reason: collision with root package name */
    public final C3050vo f39951a;

    public C3024uo(C2756kf c2756kf, InterfaceC3128yo interfaceC3128yo, String str) {
        this.f39951a = new C3050vo(c2756kf, interfaceC3128yo, new InterfaceC3076wo() { // from class: io.appmetrica.analytics.impl.Cp
            @Override // io.appmetrica.analytics.impl.InterfaceC3076wo
            public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
                return C3024uo.a(jSONObject, jSONObject2);
            }
        });
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject3.put("first_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", Bb.a(jSONObject2, "report_request_id", Bb.a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put("session_id", JsonUtils.optLongOrDefault(jSONObject2, "session_id", JsonUtils.optLongOrDefault(jSONObject, "session_id", -1L)));
        jSONObject3.put("referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put("open_id", Bb.a(jSONObject2, "open_id", Bb.a(jSONObject, "open_id", 1)));
        jSONObject3.put("attribution_id", Bb.a(jSONObject2, "attribution_id", Bb.a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", Bb.a(jSONObject2, "last_migration_api_level", Bb.a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }

    public final synchronized void b(long j4) {
        C3050vo c3050vo = this.f39951a;
        c3050vo.a(c3050vo.a().put("global_number", j4));
    }

    public final synchronized boolean c() {
        return this.f39951a.a().optBoolean("first_event_done", false);
    }

    public final synchronized boolean d() {
        return this.f39951a.a().optBoolean("init_event_done", false);
    }

    public final synchronized int b() {
        return this.f39951a.a().optInt("open_id", 1);
    }

    public final synchronized void c(long j4) {
        C3050vo c3050vo = this.f39951a;
        c3050vo.a(c3050vo.a().put("session_id", j4));
    }

    public final synchronized void b(int i4) {
        C3050vo c3050vo = this.f39951a;
        c3050vo.a(c3050vo.a().put("last_migration_api_level", i4));
    }

    public final synchronized void c(int i4) {
        C3050vo c3050vo = this.f39951a;
        c3050vo.a(c3050vo.a().put("open_id", i4));
    }

    public final synchronized void a(JSONObject jSONObject) {
        C3050vo c3050vo = this.f39951a;
        c3050vo.a(c3050vo.a().put("numbers_of_type", jSONObject));
    }

    public final synchronized int a() {
        return this.f39951a.a().optInt("attribution_id", 1);
    }

    public final synchronized void a(int i4) {
        C3050vo c3050vo = this.f39951a;
        c3050vo.a(c3050vo.a().put("attribution_id", i4));
    }

    public final synchronized void a(long j4) {
        C3050vo c3050vo = this.f39951a;
        c3050vo.a(c3050vo.a().put("external_attribution_window_start", j4));
    }
}
