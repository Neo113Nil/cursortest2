package com.yandex.varioqub.config.impl;

import android.content.Context;
import com.yandex.varioqub.config.model.ConfigValue;
import g4.C0472q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.yandex.varioqub.config.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393c {

    /* renamed from: a, reason: collision with root package name */
    public final i f5400a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5401b;

    /* renamed from: c, reason: collision with root package name */
    public final t f5402c;

    /* renamed from: d, reason: collision with root package name */
    public final C0391a f5403d;

    /* renamed from: e, reason: collision with root package name */
    public final u f5404e;

    /* renamed from: f, reason: collision with root package name */
    public long f5405f;

    /* renamed from: g, reason: collision with root package name */
    public long f5406g;

    /* renamed from: h, reason: collision with root package name */
    public HashMap f5407h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public String f5408i = "";

    /* renamed from: j, reason: collision with root package name */
    public String f5409j = "";

    /* renamed from: k, reason: collision with root package name */
    public String f5410k = "";

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f5411l = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public boolean f5412m;

    public C0393c(i iVar, long j2, t tVar, C0391a c0391a, u uVar) {
        this.f5400a = iVar;
        this.f5401b = j2;
        this.f5402c = tVar;
        this.f5403d = c0391a;
        this.f5404e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v7, types: [g4.q] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Map] */
    public final void a() {
        ?? r12;
        ConfigValue configValue;
        if (this.f5411l.compareAndSet(false, true)) {
            this.f5405f = m.a().getLong("last_fetched_time_ms_key", 0L);
            this.f5406g = m.a().getLong("last_successful_fetched_time_ms_key", 0L);
            String string = m.a().getString("experiments", "");
            if (string == null) {
                string = "";
            }
            this.f5409j = string;
            String string2 = m.a().getString("identifier", "");
            if (string2 == null) {
                string2 = "";
            }
            this.f5408i = string2;
            String string3 = m.a().getString("fetched_config_key", "");
            if (string3 == null || string3.length() == 0) {
                r12 = C0472q.f5751a;
            } else {
                JSONObject jSONObject = new JSONObject(string3);
                r12 = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string4 = jSONObject.getString(next);
                    if (string4 == null || string4.length() == 0) {
                        configValue = null;
                    } else {
                        JSONObject jSONObject2 = new JSONObject(string4);
                        configValue = new ConfigValue(jSONObject2.getString("value"), jSONObject2.getInt("sourceType"), jSONObject2.getLong("testId"));
                    }
                    if (configValue == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.varioqub.config.model.ConfigValue");
                    }
                    r12.put(next, configValue);
                }
            }
            this.f5407h = new HashMap((Map) r12);
            Context context = AbstractC0394d.f5413a;
            if (context == null) {
                kotlin.jvm.internal.i.l("appContext");
                throw null;
            }
            this.f5412m = context.getSharedPreferences(context.getPackageName() + "_varioqub_pref", 0).getBoolean("should_notify_adapter", false);
        }
    }
}
