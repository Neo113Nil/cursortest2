package com.yandex.mobile.ads.impl;

import com.appsflyer.AdRevenueScheme;
import com.yandex.mobile.ads.impl.C2030k0;
import com.yandex.mobile.ads.impl.gs;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e80 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g80 f25137a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1838c f25138b;

    public /* synthetic */ e80(int i4) {
        this(new g80(), new C1838c());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:3:0x0001, B:7:0x0006, B:10:0x0020, B:12:0x0031, B:31:0x0036, B:16:0x0050, B:18:0x006b, B:25:0x0086, B:20:0x007f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #0 {all -> 0x008c, blocks: (B:3:0x0001, B:7:0x0006, B:10:0x0020, B:12:0x0031, B:31:0x0036, B:16:0x0050, B:18:0x006b, B:25:0x0086, B:20:0x007f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082 A[SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d80 a(@Nullable String str) {
        c80 c80Var;
        int length;
        int i4;
        C2030k0.a aVar;
        try {
            if (str == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            gs.a aVar2 = gs.f26279c;
            String string = jSONObject.getString(AdRevenueScheme.AD_TYPE);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            aVar2.getClass();
            gs a4 = gs.a.a(string);
            if (a4 == null) {
                return null;
            }
            long j4 = jSONObject.getLong("start_time");
            g80 g80Var = this.f25137a;
            String optString = jSONObject.optString("false_click");
            g80Var.getClass();
            if (optString == null) {
                c80Var = null;
                HashMap a5 = a(jSONObject);
                C1838c c1838c = this.f25138b;
                String optString2 = jSONObject.optString("ab_experiments");
                c1838c.getClass();
                C1814b a6 = C1838c.a(optString2);
                C2030k0.a[] values = C2030k0.a.values();
                length = values.length;
                i4 = 0;
                while (true) {
                    if (i4 < length) {
                        aVar = null;
                        break;
                    }
                    C2030k0.a aVar3 = values[i4];
                    if (Intrinsics.areEqual(aVar3.a(), jSONObject.getString("type"))) {
                        aVar = aVar3;
                        break;
                    }
                    i4++;
                }
                if (aVar != null) {
                    return null;
                }
                return new d80(a4, j4, aVar, c80Var, a5, a6);
            }
            JSONObject jSONObject2 = new JSONObject(optString);
            String string2 = jSONObject2.getString("url");
            long j5 = jSONObject2.getLong("interval");
            Intrinsics.checkNotNull(string2);
            c80Var = new c80(string2, j5);
            HashMap a52 = a(jSONObject);
            C1838c c1838c2 = this.f25138b;
            String optString22 = jSONObject.optString("ab_experiments");
            c1838c2.getClass();
            C1814b a62 = C1838c.a(optString22);
            C2030k0.a[] values2 = C2030k0.a.values();
            length = values2.length;
            i4 = 0;
            while (true) {
                if (i4 < length) {
                }
                i4++;
            }
            if (aVar != null) {
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public e80(@NotNull g80 falseClickFormatter, @NotNull C1838c abExperimentDataConverter) {
        Intrinsics.checkNotNullParameter(falseClickFormatter, "falseClickFormatter");
        Intrinsics.checkNotNullParameter(abExperimentDataConverter, "abExperimentDataConverter");
        this.f25137a = falseClickFormatter;
        this.f25138b = abExperimentDataConverter;
    }

    private static HashMap a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject2 = jSONObject.getJSONObject("report_data");
            Iterator<String> keys = jSONObject2.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                Intrinsics.checkNotNull(next);
                hashMap.put(next, jSONObject2.get(next));
            }
            Result.m243constructorimpl(Unit.f41027a);
            return hashMap;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m243constructorimpl(ResultKt.createFailure(th));
            return hashMap;
        }
    }

    @Nullable
    public final String a(@Nullable d80 d80Var) {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AdRevenueScheme.AD_TYPE, d80Var.c().b());
        jSONObject.put("start_time", d80Var.f());
        jSONObject.put("type", d80Var.b().a());
        g80 g80Var = this.f25137a;
        c80 d4 = d80Var.d();
        g80Var.getClass();
        String str2 = null;
        if (d4 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("interval", d4.c());
            jSONObject2.put("url", d4.d());
            str = jSONObject2.toString();
        } else {
            str = null;
        }
        jSONObject.put("false_click", str);
        jSONObject.put("report_data", new JSONObject(d80Var.e()));
        C1838c c1838c = this.f25138b;
        C1814b a4 = d80Var.a();
        c1838c.getClass();
        if (a4 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(com.ironsource.ur.f19945d, a4.a());
            jSONObject3.put("test_ids", a4.b());
            str2 = jSONObject3.toString();
        }
        jSONObject.put("ab_experiments", str2);
        return jSONObject.toString();
    }
}
