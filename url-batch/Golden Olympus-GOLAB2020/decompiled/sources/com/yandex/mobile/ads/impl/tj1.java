package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tj1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f82 f32457a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x70 f32458b;

    public /* synthetic */ tj1(f82 f82Var) {
        this(f82Var, new x70());
    }

    @NotNull
    public final rj1 a(@NotNull JSONObject jsonObject) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String a4 = w81.a(jsonObject, "jsonAsset", "package", "jsonAttribute", "package");
        if (a4 == null || a4.length() == 0 || Intrinsics.areEqual(a4, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a4);
        this.f32457a.getClass();
        String a5 = f82.a("url", jsonObject);
        LinkedHashMap a6 = this.f32458b.a(jsonObject.optJSONObject("extras"));
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter("flags", "name");
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(Integer.valueOf(jsonObject.getInt("flags")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Object obj = null;
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        Integer num = (Integer) m243constructorimpl;
        String a7 = eq0.a("launchMode", jsonObject);
        my.f29299b.getClass();
        Iterator<E> it = my.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (StringsKt.w(((my) next).name(), a7, true)) {
                obj = next;
                break;
            }
        }
        my myVar = (my) obj;
        if (myVar == null) {
            myVar = my.f29300c;
        }
        return new rj1(a4, a5, a6, num, myVar);
    }

    public tj1(@NotNull f82 urlJsonParser, @NotNull x70 extrasParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(extrasParser, "extrasParser");
        this.f32457a = urlJsonParser;
        this.f32458b = extrasParser;
    }
}
