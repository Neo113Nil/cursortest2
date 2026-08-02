package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.xo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1090xo {

    /* renamed from: a, reason: collision with root package name */
    public final C1116yo f13040a;

    public C1090xo(We we, Bo bo, String str) {
        this.f13040a = new C1116yo(we, bo, new Zo(4));
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject3.put("first_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", AbstractC0637gb.a(jSONObject2, "report_request_id", AbstractC0637gb.a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put("session_id", JsonUtils.optLongOrDefault(jSONObject2, "session_id", JsonUtils.optLongOrDefault(jSONObject, "session_id", -1L)));
        jSONObject3.put("referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put("open_id", AbstractC0637gb.a(jSONObject2, "open_id", AbstractC0637gb.a(jSONObject, "open_id", 1)));
        jSONObject3.put("attribution_id", AbstractC0637gb.a(jSONObject2, "attribution_id", AbstractC0637gb.a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", AbstractC0637gb.a(jSONObject2, "last_migration_api_level", AbstractC0637gb.a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }

    public final synchronized void b(long j4) {
        C1116yo c1116yo = this.f13040a;
        c1116yo.a(c1116yo.a().put("session_id", j4));
    }

    public final synchronized boolean c() {
        return this.f13040a.a().optBoolean("first_event_done", false);
    }

    public final synchronized boolean d() {
        return this.f13040a.a().optBoolean("init_event_done", false);
    }

    public final synchronized int b() {
        return this.f13040a.a().optInt("open_id", 1);
    }

    public final synchronized void c(int i4) {
        C1116yo c1116yo = this.f13040a;
        c1116yo.a(c1116yo.a().put("open_id", i4));
    }

    public final synchronized void b(int i4) {
        C1116yo c1116yo = this.f13040a;
        c1116yo.a(c1116yo.a().put("last_migration_api_level", i4));
    }

    public final synchronized int a() {
        return this.f13040a.a().optInt("attribution_id", 1);
    }

    public final synchronized void a(int i4) {
        C1116yo c1116yo = this.f13040a;
        c1116yo.a(c1116yo.a().put("attribution_id", i4));
    }

    public final synchronized void a(long j4) {
        C1116yo c1116yo = this.f13040a;
        c1116yo.a(c1116yo.a().put("external_attribution_window_start", j4));
    }
}
