package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yq0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class zq0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2186qg f35745a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final uk2 f35746b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final er0 f35747c;

    public zq0(@NotNull mp1 reporter, @NotNull C2186qg assetsJsonParser) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(assetsJsonParser, "assetsJsonParser");
        this.f35745a = assetsJsonParser;
        this.f35746b = new uk2();
        this.f35747c = new er0(reporter);
    }

    @NotNull
    public final yq0 a(@NotNull XmlPullParser parser, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        try {
            yq0.a aVar = new yq0.a();
            this.f35746b.getClass();
            JSONObject jSONObject = new JSONObject(uk2.c(parser));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (Intrinsics.areEqual("assets", next)) {
                    aVar.a(this.f35745a.a(jSONObject, base64EncodingParameters));
                } else if (Intrinsics.areEqual("link", next)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    er0 er0Var = this.f35747c;
                    Intrinsics.checkNotNull(jSONObject2);
                    aVar.a(er0Var.a(jSONObject2, base64EncodingParameters));
                }
            }
            return aVar.a();
        } catch (Exception e4) {
            throw new JSONException(e4.getMessage());
        }
    }
}
