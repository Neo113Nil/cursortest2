package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g02 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e02 f25966a = new e02();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1857ci f25967b = new C1857ci();

    @NotNull
    public final f02 a(@NotNull JSONObject jsonValue) {
        JSONObject jSONObject;
        xz1 xz1Var;
        C1833bi c1833bi;
        ArrayList arrayList;
        g02 g02Var = this;
        String str = "jsonValue";
        Intrinsics.checkNotNullParameter(jsonValue, "jsonValue");
        Object opt = jsonValue.opt("ColorWizButton");
        String str2 = opt instanceof String ? (String) opt : null;
        Object opt2 = jsonValue.opt("ColorWizButtonText");
        String str3 = opt2 instanceof String ? (String) opt2 : null;
        Object opt3 = jsonValue.opt("ColorWizBack");
        String str4 = opt3 instanceof String ? (String) opt3 : null;
        Object opt4 = jsonValue.opt("ColorWizBackRight");
        String str5 = opt4 instanceof String ? (String) opt4 : null;
        JSONObject optJSONObject = jsonValue.optJSONObject("backgroundColors");
        JSONObject jsonValue2 = jsonValue.optJSONObject("smart-center");
        JSONArray optJSONArray = jsonValue.optJSONArray("smart-centers");
        if (jsonValue2 != null) {
            g02Var.f25966a.getClass();
            Intrinsics.checkNotNullParameter(jsonValue2, "jsonValue");
            jSONObject = optJSONObject;
            xz1Var = new xz1(jsonValue2.getInt("x"), jsonValue2.getInt("y"), jsonValue2.getInt("w"), jsonValue2.getInt("h"));
        } else {
            jSONObject = optJSONObject;
            xz1Var = null;
        }
        if (jSONObject != null) {
            g02Var.f25967b.getClass();
            c1833bi = C1857ci.a(jSONObject);
        } else {
            c1833bi = null;
        }
        if (optJSONArray != null) {
            IntRange p4 = kotlin.ranges.g.p(0, optJSONArray.length());
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(p4, 10));
            Iterator it = p4.iterator();
            while (it.hasNext()) {
                int a4 = ((kotlin.collections.E) it).a();
                xz1 xz1Var2 = xz1Var;
                e02 e02Var = g02Var.f25966a;
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(a4);
                Intrinsics.checkNotNullExpressionValue(optJSONObject2, "optJSONObject(...)");
                e02Var.getClass();
                Intrinsics.checkNotNullParameter(optJSONObject2, str);
                arrayList2.add(new xz1(optJSONObject2.getInt("x"), optJSONObject2.getInt("y"), optJSONObject2.getInt("w"), optJSONObject2.getInt("h")));
                g02Var = this;
                xz1Var = xz1Var2;
                optJSONArray = optJSONArray;
                str = str;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new f02(str2, str3, str4, str5, c1833bi, xz1Var, arrayList);
    }
}
