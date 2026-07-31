package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.ironsource.b9;
import com.yandex.mobile.ads.impl.ew1;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pn1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f30503a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ew1 f30504b;

    /* synthetic */ class a extends kotlin.jvm.internal.p implements Function1<String, String> {
        a(C1930fj c1930fj) {
            super(1, c1930fj, C1930fj.class, "decompressBase64GzipAsString", "decompressBase64GzipAsString(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return C1930fj.b((String) obj);
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.p implements Function1<String, String> {
        b(C1930fj c1930fj) {
            super(1, c1930fj, C1930fj.class, "decompressDoubleBase64GzipAsString", "decompressDoubleBase64GzipAsString(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return C1930fj.c((String) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn1(Context context) {
        this(context, ew1.a.a());
        int i4 = ew1.f25476l;
    }

    @NotNull
    public final on1 a(@NotNull String readyResponse) {
        Intrinsics.checkNotNullParameter(readyResponse, "readyResponse");
        du1 a4 = this.f30504b.a(this.f30503a);
        JSONObject jSONObject = new JSONObject((String) ((a4 == null || !a4.r()) ? new b(C1930fj.f25812a) : new a(C1930fj.f25812a)).invoke(readyResponse));
        HashMap hashMap = new HashMap();
        String string = jSONObject.getString(b9.h.f15438E0);
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string2 = jSONObject2.getString(next);
            Intrinsics.checkNotNull(next);
            Intrinsics.checkNotNull(string2);
            hashMap.put(next, string2);
        }
        Intrinsics.checkNotNull(string);
        return new on1(string, hashMap);
    }

    public pn1(@NotNull Context appContext, @NotNull ew1 sdkSettings) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f30503a = appContext;
        this.f30504b = sdkSettings;
    }
}
