package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class tr {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ms f19820a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final aq f19821b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final cq f19822c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final t8 f19823d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final mc f19824e;

    public tr(@NotNull ms fullResponse) {
        Intrinsics.checkNotNullParameter(fullResponse, "fullResponse");
        this.f19820a = fullResponse;
        JSONObject optJSONObject = fullResponse.i().optJSONObject(ur.f19942a);
        this.f19821b = new aq(optJSONObject == null ? new JSONObject() : optJSONObject);
        JSONObject optJSONObject2 = fullResponse.i().optJSONObject(ur.f19943b);
        this.f19822c = new cq(optJSONObject2 == null ? new JSONObject() : optJSONObject2);
        JSONObject optJSONObject3 = fullResponse.i().optJSONObject("configurations");
        this.f19823d = new t8(optJSONObject3 == null ? new JSONObject() : optJSONObject3);
        JSONObject optJSONObject4 = fullResponse.i().optJSONObject(ur.f19945d);
        this.f19824e = new mc(optJSONObject4 == null ? new JSONObject() : optJSONObject4);
    }

    @NotNull
    public final t8 a() {
        return this.f19823d;
    }

    @NotNull
    public final mc b() {
        return this.f19824e;
    }

    @NotNull
    public final ms c() {
        return this.f19820a;
    }

    @NotNull
    public final aq d() {
        return this.f19821b;
    }

    @NotNull
    public final cq e() {
        return this.f19822c;
    }
}
