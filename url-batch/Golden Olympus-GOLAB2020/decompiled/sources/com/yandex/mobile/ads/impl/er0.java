package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class er0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2352y f25401a;

    public /* synthetic */ er0(mp1 mp1Var) {
        this(mp1Var, new C2352y(mp1Var));
    }

    private static String a(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return null;
        }
        String a4 = w81.a(jSONObject, "jsonAsset", str, "jsonAttribute", str);
        if (a4 == null || a4.length() == 0 || Intrinsics.areEqual(a4, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a4);
        return a4;
    }

    public er0(@NotNull mp1 reporter, @NotNull C2352y actionParserProvider) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(actionParserProvider, "actionParserProvider");
        this.f25401a = actionParserProvider;
    }

    @NotNull
    public final dr0 a(@NotNull JSONObject jsonLink, @NotNull InterfaceC1906ej base64EncodingParameters) {
        ArrayList arrayList;
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(jsonLink, "jsonLink");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        JSONArray optJSONArray = jsonLink.optJSONArray("actions");
        List list = null;
        if (optJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            int length = optJSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                JSONObject jSONObject = optJSONArray.getJSONObject(i4);
                C2352y c2352y = this.f25401a;
                Intrinsics.checkNotNull(jSONObject);
                InterfaceC2329x<?> a4 = c2352y.a(jSONObject, base64EncodingParameters);
                if (a4 != null) {
                    arrayList2.add(a4.a(jSONObject));
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        String a5 = a("falseClickUrl", jsonLink);
        c80 c80Var = a5 != null ? new c80(a5, jsonLink.optLong("falseClickInterval", 0L)) : null;
        Set b4 = kotlin.collections.T.b();
        String a6 = a("trackingUrl", jsonLink);
        if (a6 != null) {
            b4.add(a6);
        }
        JSONArray optJSONArray2 = jsonLink.optJSONArray("trackingUrls");
        if (optJSONArray2 != null) {
            List createListBuilder = CollectionsKt.createListBuilder();
            int length2 = optJSONArray2.length();
            for (int i5 = 0; i5 < length2; i5++) {
                try {
                    Result.Companion companion = Result.Companion;
                    m243constructorimpl = Result.m243constructorimpl(optJSONArray2.getString(i5));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.f(m243constructorimpl)) {
                    String str = (String) m243constructorimpl;
                    Intrinsics.checkNotNull(str);
                    createListBuilder.add(str);
                }
            }
            list = CollectionsKt.build(createListBuilder);
        }
        if (list != null) {
            b4.addAll(list);
        }
        return new dr0(arrayList, c80Var, CollectionsKt.toList(kotlin.collections.T.a(b4)), a("url", jsonLink), jsonLink.optLong("clickableDelay", 0L));
    }
}
