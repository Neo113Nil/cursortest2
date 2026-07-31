package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.q9;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zb {

    /* renamed from: e, reason: collision with root package name */
    static final String f20522e = "euid";

    /* renamed from: f, reason: collision with root package name */
    static final String f20523f = "esat";

    /* renamed from: g, reason: collision with root package name */
    static final String f20524g = "esfr";

    /* renamed from: h, reason: collision with root package name */
    static final int f20525h = 1;

    /* renamed from: a, reason: collision with root package name */
    private int f20526a;

    /* renamed from: b, reason: collision with root package name */
    private long f20527b;

    /* renamed from: c, reason: collision with root package name */
    private int f20528c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f20529d;

    public zb(int i4, long j4, String str) {
        this(i4, j4, new JSONObject(str));
    }

    public String a() {
        return this.f20529d.toString();
    }

    public JSONObject b() {
        return this.f20529d;
    }

    public int c() {
        return this.f20526a;
    }

    public long d() {
        return this.f20527b;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zb zbVar = (zb) obj;
        return this.f20526a == zbVar.f20526a && this.f20527b == zbVar.f20527b && this.f20528c == zbVar.f20528c && yk.a(this.f20529d, zbVar.f20529d);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f20526a) * 31) + Long.hashCode(this.f20527b)) * 31) + this.f20529d.toString().hashCode()) * 31) + this.f20528c;
    }

    @NotNull
    public String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + StringUtils.COMMA + a().substring(1) + "}").replace(StringUtils.COMMA, "\n");
    }

    public zb(int i4, long j4, JSONObject jSONObject) {
        this.f20528c = 1;
        this.f20526a = i4;
        this.f20527b = j4;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f20529d = jSONObject;
        if (!jSONObject.has(f20522e)) {
            a(f20522e, UUID.randomUUID().toString());
        }
        if (jSONObject.has(f20523f)) {
            this.f20528c = jSONObject.optInt(f20523f, 1);
        } else {
            a(f20523f, Integer.valueOf(this.f20528c));
        }
    }

    public void a(int i4) {
        this.f20526a = i4;
    }

    public zb(int i4, JSONObject jSONObject) {
        this(i4, new q9.a().a(), jSONObject);
    }

    public void a(String str) {
        a(f20524g, str);
        int i4 = this.f20528c + 1;
        this.f20528c = i4;
        a(f20523f, Integer.valueOf(i4));
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.f20529d.put(str, obj);
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }
}
