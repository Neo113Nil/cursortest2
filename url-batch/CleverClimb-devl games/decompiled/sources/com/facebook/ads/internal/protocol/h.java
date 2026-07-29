package com.facebook.ads.internal.protocol;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final a f5385a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f5386b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5387c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5388d;

    private enum a {
        ID,
        CREATIVE,
        NONE
    }

    public h(Context context, String str, String str2, f fVar) {
        if (TextUtils.isEmpty(str)) {
            this.f5385a = a.NONE;
            this.f5386b = null;
            this.f5388d = null;
            this.f5387c = null;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            switch (a.valueOf(jSONObject.getString("type").toUpperCase())) {
                case ID:
                    this.f5385a = a.ID;
                    this.f5386b = Long.valueOf(jSONObject.getString("bid_id"));
                    this.f5388d = jSONObject.getString("device_id");
                    this.f5387c = null;
                    break;
                case CREATIVE:
                    this.f5385a = a.CREATIVE;
                    this.f5386b = Long.valueOf(jSONObject.getString("bid_id"));
                    this.f5388d = jSONObject.getString("device_id");
                    this.f5387c = new JSONObject(jSONObject.getString("payload")).toString();
                    break;
                default:
                    throw new b(AdErrorType.BID_PAYLOAD_ERROR, "Unsupported BidPayload type " + jSONObject.getString("type"));
            }
            if (!jSONObject.getString("sdk_version").equals("4.28.2")) {
                throw new b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for SDK version %s being used on SDK version %s", this.f5386b, jSONObject.getString("sdk_version"), "4.28.2"));
            }
            if (!jSONObject.getString("resolved_placement_id").equals(str2)) {
                throw new b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for placement %s being used on placement %s", this.f5386b, jSONObject.getString("resolved_placement_id"), str2));
            }
            if (jSONObject.getInt("template") != fVar.a()) {
                throw new b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for template %s being used on template %s", this.f5386b, Integer.valueOf(jSONObject.getInt("template")), fVar));
            }
        } catch (JSONException e) {
            com.facebook.ads.internal.q.d.a.a(e, context);
            throw new b(AdErrorType.BID_PAYLOAD_ERROR, "Invalid BidPayload", e);
        }
    }

    public void a(String str) {
        if (!this.f5388d.equals(str)) {
            throw new b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for IDFA %s being used on IDFA %s", this.f5386b, this.f5388d, str));
        }
    }

    public boolean a() {
        return this.f5385a == a.CREATIVE;
    }

    public String b() {
        return this.f5387c;
    }

    public boolean c() {
        return this.f5385a != a.NONE;
    }

    public String d() {
        if (this.f5386b == null) {
            return null;
        }
        return this.f5386b.toString();
    }
}
