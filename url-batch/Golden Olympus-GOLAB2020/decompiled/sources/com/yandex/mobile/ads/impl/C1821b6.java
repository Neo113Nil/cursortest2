package com.yandex.mobile.ads.impl;

import D2.C0350c;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.b6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1821b6 {

    /* renamed from: com.yandex.mobile.ads.impl.b6$a */
    static final class a extends kotlin.jvm.internal.s implements Function1<C0350c, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1989i6 f23601b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1989i6 c1989i6) {
            super(1);
            this.f23601b = c1989i6;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            C0350c putJsonArray = (C0350c) obj;
            Intrinsics.checkNotNullParameter(putJsonArray, "$this$putJsonArray");
            Iterator<T> it = this.f23601b.f().iterator();
            while (it.hasNext()) {
                D2.j.a(putJsonArray, (String) it.next());
            }
            return Unit.f41027a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.b6$b */
    static final class b extends kotlin.jvm.internal.s implements Function1<D2.x, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1989i6 f23602b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1989i6 c1989i6) {
            super(1);
            this.f23602b = c1989i6;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            D2.x putJsonObject = (D2.x) obj;
            Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
            Iterator<T> it = this.f23602b.a().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                D2.j.f(putJsonObject, (String) entry.getKey(), new C1845c6(entry));
            }
            return Unit.f41027a;
        }
    }

    @Nullable
    public static C1989i6 a(@NotNull String jsonData) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(jsonData, "jsonData");
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(a(new JSONObject(jsonData)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            ap0.b(new Object[0]);
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        return (C1989i6) m243constructorimpl;
    }

    private static Map b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Map createMapBuilder = MapsKt.createMapBuilder();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            C2012j6 c2012j6 = new C2012j6(jSONObject2.getBoolean("isDisabled"), jSONObject2.getInt("usagePercent"));
            Intrinsics.checkNotNull(next);
            createMapBuilder.put(next, c2012j6);
        }
        return MapsKt.build(createMapBuilder);
    }

    @Nullable
    public static C1989i6 a(@Nullable JSONObject jSONObject) {
        Object m243constructorimpl;
        Set set;
        if (jSONObject == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            boolean z4 = jSONObject.getBoolean("isEnabled");
            boolean z5 = jSONObject.getBoolean("isInDebug");
            String string = jSONObject.getString("apiKey");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            long j4 = jSONObject.getLong("validationTimeoutInSec");
            int i4 = jSONObject.getInt("usagePercent");
            boolean z6 = jSONObject.getBoolean("willBlockAdOnInternalError");
            JSONArray optJSONArray = jSONObject.optJSONArray("enabledAdUnits");
            if (optJSONArray != null) {
                Set b4 = kotlin.collections.T.b();
                int length = optJSONArray.length();
                for (int i5 = 0; i5 < length; i5++) {
                    String string2 = optJSONArray.getString(i5);
                    Intrinsics.checkNotNull(string2);
                    if (string2.length() > 0) {
                        b4.add(string2);
                    }
                }
                set = kotlin.collections.T.a(b4);
            } else {
                set = null;
            }
            if (set == null) {
                set = kotlin.collections.T.e();
            }
            Set set2 = set;
            Map b5 = b(jSONObject.optJSONObject("adNetworksCustomParameters"));
            if (b5 == null) {
                b5 = MapsKt.emptyMap();
            }
            m243constructorimpl = Result.m243constructorimpl(new C1989i6(z4, z5, string, j4, i4, z6, set2, b5));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            jSONObject.toString();
            ap0.b(new Object[0]);
        }
        return (C1989i6) (Result.m244isFailureimpl(m243constructorimpl) ? null : m243constructorimpl);
    }

    @Nullable
    public static String a(@Nullable C1989i6 c1989i6) {
        if (c1989i6 == null) {
            return null;
        }
        D2.x xVar = new D2.x();
        D2.j.b(xVar, "isEnabled", Boolean.valueOf(c1989i6.e()));
        D2.j.b(xVar, "isInDebug", Boolean.valueOf(c1989i6.d()));
        D2.j.d(xVar, "apiKey", c1989i6.b());
        D2.j.c(xVar, "validationTimeoutInSec", Long.valueOf(c1989i6.h()));
        D2.j.c(xVar, "usagePercent", Integer.valueOf(c1989i6.g()));
        D2.j.b(xVar, "willBlockAdOnInternalError", Boolean.valueOf(c1989i6.c()));
        D2.j.e(xVar, "enabledAdUnits", new a(c1989i6));
        D2.j.f(xVar, "adNetworksCustomParameters", new b(c1989i6));
        return xVar.a().toString();
    }
}
