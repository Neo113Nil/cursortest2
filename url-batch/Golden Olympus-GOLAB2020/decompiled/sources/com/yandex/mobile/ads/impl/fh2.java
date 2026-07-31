package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.b9;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fh2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f25798a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final dh2 f25799b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fh2(@NotNull Context context) {
        this(qx1.a(new qx1(), context, "ViewSizeInfoStorage"), new dh2());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private static String b(hh2 hh2Var) {
        return hh2Var.a() + "-" + hh2Var.b();
    }

    @Nullable
    public final String a(@NotNull hh2 viewSizeKey) {
        Intrinsics.checkNotNullParameter(viewSizeKey, "viewSizeKey");
        return this.f25798a.getString(b(viewSizeKey), null);
    }

    public final void a(@NotNull hh2 viewSizeKey, @NotNull ch2 viewSizeInfo) {
        Intrinsics.checkNotNullParameter(viewSizeKey, "viewSizeKey");
        Intrinsics.checkNotNullParameter(viewSizeInfo, "viewSizeInfo");
        String b4 = b(viewSizeKey);
        this.f25799b.getClass();
        Intrinsics.checkNotNullParameter(viewSizeInfo, "viewSizeInfo");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", viewSizeInfo.d().b());
        jSONObject2.put("height", viewSizeInfo.d().a());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("width", viewSizeInfo.b().b());
        jSONObject3.put("height", viewSizeInfo.b().a());
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject4.put("value", viewSizeInfo.c().b().b());
        String name = viewSizeInfo.c().b().a().name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        jSONObject4.put(b9.a.f15306t, lowerCase);
        jSONObject5.put("value", viewSizeInfo.c().a().b());
        String lowerCase2 = viewSizeInfo.c().a().a().name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        jSONObject5.put(b9.a.f15306t, lowerCase2);
        jSONObject6.put("width", jSONObject4);
        jSONObject6.put("height", jSONObject5);
        JSONObject jSONObject7 = new JSONObject(viewSizeInfo.a());
        jSONObject.put("view", jSONObject2);
        jSONObject.put("layout_params", jSONObject3);
        jSONObject.put("measured", jSONObject6);
        jSONObject.put("additional_info", jSONObject7);
        String jSONObject8 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject8, "toString(...)");
        this.f25798a.edit().putString(b4, jSONObject8).apply();
    }

    public fh2(@NotNull SharedPreferences preferences, @NotNull dh2 viewSizeInfoParser) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(viewSizeInfoParser, "viewSizeInfoParser");
        this.f25798a = preferences;
        this.f25799b = viewSizeInfoParser;
    }
}
