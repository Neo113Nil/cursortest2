package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pn {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f30498a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f30499b;

    public pn(@NotNull String scheme, @NotNull Map<String, String> authParams) {
        String str;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.f30498a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = key.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            linkedHashMap.put(str, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        this.f30499b = unmodifiableMap;
    }

    @NotNull
    public final Charset a() {
        String str = this.f30499b.get(com.ironsource.cc.f15720M);
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    @Nullable
    public final String b() {
        return this.f30499b.get("realm");
    }

    @NotNull
    public final String c() {
        return this.f30498a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof pn)) {
            return false;
        }
        pn pnVar = (pn) obj;
        return Intrinsics.areEqual(pnVar.f30498a, this.f30498a) && Intrinsics.areEqual(pnVar.f30499b, this.f30499b);
    }

    public final int hashCode() {
        return this.f30499b.hashCode() + C1842c3.a(this.f30498a, 899, 31);
    }

    @NotNull
    public final String toString() {
        return this.f30498a + " authParams=" + this.f30499b;
    }
}
