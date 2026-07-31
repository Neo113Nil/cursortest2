package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ty0 implements ar1<sy0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final nc1 f32743a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gz0 f32744b;

    public /* synthetic */ ty0() {
        this(new oc1(), new gz0());
    }

    @Override // com.yandex.mobile.ads.impl.ar1
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final sy0 a(@NotNull pq1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        String a4 = this.f32743a.a(networkResponse);
        if (a4 != null && a4.length() > 0) {
            try {
                JSONObject parent = new JSONObject(a4);
                try {
                    int i4 = dq0.f24735b;
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter("passback_parameters", "name");
                    JSONObject jSONObject = parent.getJSONObject("passback_parameters");
                    Map createMapBuilder = MapsKt.createMapBuilder();
                    Iterator<String> keys = jSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Intrinsics.checkNotNull(next);
                        String string = jSONObject.getString(next);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        createMapBuilder.put(next, string);
                    }
                    Map build = MapsKt.build(createMapBuilder);
                    if (!build.isEmpty()) {
                        JSONArray jSONArray = parent.getJSONArray(com.ironsource.ge.f16516z1);
                        ArrayList arrayList = new ArrayList();
                        int length = jSONArray.length();
                        for (int i5 = 0; i5 < length; i5++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i5);
                            gz0 gz0Var = this.f32744b;
                            Intrinsics.checkNotNull(jSONObject2);
                            xy0 a5 = gz0Var.a(jSONObject2);
                            if (a5 != null) {
                                arrayList.add(a5);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new sy0(arrayList, build);
                        }
                    }
                } catch (JSONException e4) {
                    ap0.c(new Object[0]);
                    throw new JSONException(e4.getMessage());
                }
            } catch (JSONException unused) {
                ap0.c(new Object[0]);
            }
        }
        return null;
    }

    public ty0(@NotNull nc1 networkResponseDecoder, @NotNull gz0 mediationNetworkParser) {
        Intrinsics.checkNotNullParameter(networkResponseDecoder, "networkResponseDecoder");
        Intrinsics.checkNotNullParameter(mediationNetworkParser, "mediationNetworkParser");
        this.f32743a = networkResponseDecoder;
        this.f32744b = mediationNetworkParser;
    }
}
