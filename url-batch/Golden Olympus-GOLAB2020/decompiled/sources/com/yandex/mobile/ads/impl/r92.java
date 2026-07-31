package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class r92 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ki2 f31087a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ja2 f31088b;

    public /* synthetic */ r92(Context context, mp1 mp1Var) {
        this(context, mp1Var, kc1.a(), new ja2(context, mp1Var));
    }

    @Nullable
    public final o92 a(@NotNull lc1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        String a4 = this.f31087a.a(networkResponse);
        Map<String, String> map = networkResponse.f28507c;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        C1882dj c1882dj = new C1882dj(map);
        if (a4 != null && a4.length() != 0) {
            try {
                j92 a5 = this.f31088b.a(a4, c1882dj);
                if (a5 != null) {
                    Map<String, String> responseHeaders = networkResponse.f28507c;
                    if (responseHeaders != null) {
                        bh0 httpHeader = bh0.f23756I;
                        int i4 = cf0.f24191b;
                        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                        Intrinsics.checkNotNullParameter(httpHeader, "httpHeader");
                        String a6 = cf0.a(responseHeaders, httpHeader);
                        if (a6 != null && Boolean.parseBoolean(a6)) {
                            return new o92(a5, a4);
                        }
                    }
                    a4 = null;
                    return new o92(a5, a4);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public r92(@NotNull Context context, @NotNull mp1 reporter, @NotNull ki2 volleyNetworkResponseDecoder, @NotNull ja2 vastXmlParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(volleyNetworkResponseDecoder, "volleyNetworkResponseDecoder");
        Intrinsics.checkNotNullParameter(vastXmlParser, "vastXmlParser");
        this.f31087a = volleyNetworkResponseDecoder;
        this.f31088b = vastXmlParser;
    }
}
