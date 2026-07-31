package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class my2 {

    /* renamed from: a, reason: collision with root package name */
    private final ty2 f8805a;

    /* renamed from: b, reason: collision with root package name */
    private final ty2 f8806b;

    /* renamed from: c, reason: collision with root package name */
    private final qy2 f8807c;

    /* renamed from: d, reason: collision with root package name */
    private final sy2 f8808d;

    private my2(qy2 qy2Var, sy2 sy2Var, ty2 ty2Var, ty2 ty2Var2, boolean z6) {
        this.f8807c = qy2Var;
        this.f8808d = sy2Var;
        this.f8805a = ty2Var;
        if (ty2Var2 == null) {
            this.f8806b = ty2.NONE;
        } else {
            this.f8806b = ty2Var2;
        }
    }

    public static my2 a(qy2 qy2Var, sy2 sy2Var, ty2 ty2Var, ty2 ty2Var2, boolean z6) {
        uz2.b(sy2Var, "ImpressionType is null");
        uz2.b(ty2Var, "Impression owner is null");
        if (ty2Var == ty2.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (qy2Var == qy2.DEFINED_BY_JAVASCRIPT && ty2Var == ty2.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (sy2Var == sy2.DEFINED_BY_JAVASCRIPT && ty2Var == ty2.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new my2(qy2Var, sy2Var, ty2Var, ty2Var2, true);
    }

    public final JSONObject b() {
        Object obj;
        String str;
        JSONObject jSONObject = new JSONObject();
        sz2.g(jSONObject, "impressionOwner", this.f8805a);
        if (this.f8808d != null) {
            sz2.g(jSONObject, "mediaEventsOwner", this.f8806b);
            sz2.g(jSONObject, "creativeType", this.f8807c);
            obj = this.f8808d;
            str = "impressionType";
        } else {
            obj = this.f8806b;
            str = "videoEventsOwner";
        }
        sz2.g(jSONObject, str, obj);
        sz2.g(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
