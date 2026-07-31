package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class r61 implements br1<n61> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ki2 f31053a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x81 f31054b;

    public /* synthetic */ r61(Context context, mp1 mp1Var) {
        this(context, mp1Var, kc1.a(), new x81(context, mp1Var));
    }

    @Nullable
    public final n61 a(@NotNull String stringResponse, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(stringResponse, "stringResponse");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        try {
            return this.f31054b.a(stringResponse, base64EncodingParameters);
        } catch (i61 unused) {
            ap0.b(new Object[0]);
            return null;
        } catch (JSONException unused2) {
            ap0.b(new Object[0]);
            return null;
        }
    }

    public r61(@NotNull Context context, @NotNull mp1 reporter, @NotNull ki2 volleyNetworkResponseDecoder, @NotNull x81 nativeJsonParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(volleyNetworkResponseDecoder, "volleyNetworkResponseDecoder");
        Intrinsics.checkNotNullParameter(nativeJsonParser, "nativeJsonParser");
        this.f31053a = volleyNetworkResponseDecoder;
        this.f31054b = nativeJsonParser;
    }

    @Override // com.yandex.mobile.ads.impl.br1
    public final n61 a(lc1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        String a4 = this.f31053a.a(networkResponse);
        if (a4 == null || a4.length() == 0) {
            return null;
        }
        Map<String, String> map = networkResponse.f28507c;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        return a(a4, new C1882dj(map));
    }
}
