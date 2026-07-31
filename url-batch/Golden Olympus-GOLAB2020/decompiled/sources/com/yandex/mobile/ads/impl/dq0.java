package com.yandex.mobile.ads.impl;

import D2.AbstractC0348a;
import android.text.Html;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dq0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final AbstractC0348a f24734a = D2.p.b(null, a.f24736b, 1, null);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24735b = 0;

    static final class a extends kotlin.jvm.internal.s implements Function1<D2.e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24736b = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            D2.e Json = (D2.e) obj;
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.d(false);
            Json.e(true);
            return Unit.f41027a;
        }
    }

    @NotNull
    public static String a(@NotNull String key, @NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        String string = jsonObject.getString(key);
        if (string == null || string.length() == 0 || Intrinsics.areEqual("null", string)) {
            throw new JSONException("Json value can not be null or empty");
        }
        return String.valueOf(Html.fromHtml(string));
    }

    @Nullable
    public static final Integer b(@NotNull String name, @NotNull JSONObject jsonObject) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(Integer.valueOf(jsonObject.getInt(name)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        return (Integer) m243constructorimpl;
    }

    @Nullable
    public static List c(@NotNull String name, @NotNull JSONObject parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(name, "name");
        JSONArray optJSONArray = parent.optJSONArray(name);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        int length = optJSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            String optString = optJSONArray.optString(i4);
            if (optString != null && optString.length() != 0 && !Intrinsics.areEqual("null", optString)) {
                Intrinsics.checkNotNull(optString);
                createListBuilder.add(optString);
            }
        }
        return CollectionsKt.build(createListBuilder);
    }

    @Nullable
    public static Map a(@NotNull JSONObject parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter("bidding_info", "name");
        JSONObject optJSONObject = parent.optJSONObject("bidding_info");
        if (optJSONObject == null) {
            return null;
        }
        Map createMapBuilder = MapsKt.createMapBuilder();
        Iterator<String> keys = optJSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = optJSONObject.optString(next);
            if (optString != null && optString.length() != 0 && !Intrinsics.areEqual("null", optString)) {
                Intrinsics.checkNotNull(next);
                Intrinsics.checkNotNull(optString);
                createMapBuilder.put(next, optString);
            }
        }
        return MapsKt.build(createMapBuilder);
    }

    @Nullable
    public static final JSONObject a(@NotNull String content) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(new JSONObject(content));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        return (JSONObject) m243constructorimpl;
    }

    @NotNull
    public static AbstractC0348a a() {
        return f24734a;
    }
}
