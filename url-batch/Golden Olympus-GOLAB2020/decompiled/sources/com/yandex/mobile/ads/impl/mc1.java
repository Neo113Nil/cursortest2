package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class mc1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pn1 f28992a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qn1 f28993b;

    public /* synthetic */ mc1(Context context) {
        this(context, new pn1(context), qn1.f30853b.a());
    }

    @Nullable
    public final lc1 a(@NotNull op1<?> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String a4 = this.f28993b.a(request);
        if (a4 == null) {
            return null;
        }
        try {
            on1 a5 = this.f28992a.a(a4);
            byte[] bytes = a5.a().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new lc1(200, bytes, a5.b(), false);
        } catch (JSONException unused) {
            return null;
        }
    }

    public mc1(@NotNull Context appContext, @NotNull pn1 readyResponseDecoder, @NotNull qn1 readyResponseStorage) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(readyResponseDecoder, "readyResponseDecoder");
        Intrinsics.checkNotNullParameter(readyResponseStorage, "readyResponseStorage");
        this.f28992a = readyResponseDecoder;
        this.f28993b = readyResponseStorage;
    }
}
