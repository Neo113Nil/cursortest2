package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.m8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2086m8 {

    /* renamed from: a, reason: collision with root package name */
    private final nf1 f28935a;

    /* renamed from: b, reason: collision with root package name */
    private final nf1 f28936b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28937c;

    /* renamed from: d, reason: collision with root package name */
    private final pu f28938d;

    /* renamed from: e, reason: collision with root package name */
    private final fk0 f28939e;

    private C2086m8() {
        pu puVar = pu.f30563c;
        fk0 fk0Var = fk0.f25824c;
        nf1 nf1Var = nf1.f29558c;
        this.f28938d = puVar;
        this.f28939e = fk0Var;
        this.f28935a = nf1Var;
        this.f28936b = nf1Var;
        this.f28937c = false;
    }

    public static C2086m8 a() {
        return new C2086m8();
    }

    public final boolean b() {
        return nf1.f29558c == this.f28935a;
    }

    public final boolean c() {
        return nf1.f29558c == this.f28936b;
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        yn2.a(jSONObject, "impressionOwner", this.f28935a);
        yn2.a(jSONObject, "mediaEventsOwner", this.f28936b);
        yn2.a(jSONObject, "creativeType", this.f28938d);
        yn2.a(jSONObject, "impressionType", this.f28939e);
        yn2.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f28937c));
        return jSONObject;
    }
}
