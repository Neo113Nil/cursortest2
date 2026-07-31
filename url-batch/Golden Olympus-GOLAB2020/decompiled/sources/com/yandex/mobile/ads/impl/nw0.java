package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.ironsource.b9;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nw0 implements InterfaceC1951gg<mw0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wv0 f29771a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ne2 f29772b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final wi0 f29773c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final kj0 f29774d;

    public nw0(@NotNull Context context, @NotNull mp1 reporter, @NotNull InterfaceC1906ej base64EncodingParameters, @NotNull wv0 mediaParser, @NotNull ne2 videoParser, @NotNull wi0 imageParser, @NotNull kj0 imageValuesParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        Intrinsics.checkNotNullParameter(mediaParser, "mediaParser");
        Intrinsics.checkNotNullParameter(videoParser, "videoParser");
        Intrinsics.checkNotNullParameter(imageParser, "imageParser");
        Intrinsics.checkNotNullParameter(imageValuesParser, "imageValuesParser");
        this.f29771a = mediaParser;
        this.f29772b = videoParser;
        this.f29773c = imageParser;
        this.f29774d = imageValuesParser;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1951gg
    public final mw0 a(JSONObject jsonAsset) {
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        if (!jsonAsset.has("value") || jsonAsset.isNull("value")) {
            ap0.b(new Object[0]);
            throw new i61("Native Ad json has not required attributes");
        }
        JSONObject jSONObject = jsonAsset.getJSONObject("value");
        Intrinsics.checkNotNull(jSONObject);
        wv0 wv0Var = this.f29771a;
        if (!jSONObject.has(b9.h.f15446I0) || jSONObject.isNull(b9.h.f15446I0)) {
            obj = null;
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject(b9.h.f15446I0);
            Intrinsics.checkNotNull(jSONObject2);
            obj = wv0Var.a(jSONObject2);
        }
        eu0 eu0Var = (eu0) obj;
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        List a4 = optJSONArray != null ? this.f29774d.a(optJSONArray) : null;
        wi0 wi0Var = this.f29773c;
        if (!jSONObject.has("image") || jSONObject.isNull("image")) {
            obj2 = null;
        } else {
            JSONObject jSONObject3 = jSONObject.getJSONObject("image");
            Intrinsics.checkNotNull(jSONObject3);
            obj2 = wi0Var.b(jSONObject3);
        }
        ej0 ej0Var = (ej0) obj2;
        if ((a4 == null || a4.isEmpty()) && ej0Var != null) {
            a4 = CollectionsKt.mutableListOf(ej0Var);
        }
        ne2 ne2Var = this.f29772b;
        if (!jSONObject.has("video") || jSONObject.isNull("video")) {
            obj3 = null;
        } else {
            JSONObject jSONObject4 = jSONObject.getJSONObject("video");
            Intrinsics.checkNotNull(jSONObject4);
            obj3 = ne2Var.a(jSONObject4);
        }
        ab2 ab2Var = (ab2) obj3;
        if (eu0Var != null || ((a4 != null && !a4.isEmpty()) || ab2Var != null)) {
            return new mw0(eu0Var, ab2Var, a4 != null ? CollectionsKt.toMutableList((Collection) a4) : null);
        }
        ap0.b(new Object[0]);
        throw new i61("Native Ad json has not required attributes");
    }
}
