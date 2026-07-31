package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class s22 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1834bj f31539a;

    public /* synthetic */ s22() {
        this(new C1834bj());
    }

    @Nullable
    public final String a(@NotNull Context context, @NotNull String body) {
        a50 a50Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(body, "body");
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        if (a4 == null || (a50Var = a4.t()) == null) {
            a50Var = a50.f23162c;
        }
        j01 j01Var = new j01(a50Var.c(), a50Var.b());
        byte[] bytes = body.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] a5 = j01Var.a(bytes);
        if (a5 == null) {
            return null;
        }
        this.f31539a.getClass();
        return C1834bj.a(a5);
    }

    public s22(@NotNull C1834bj base64Encoder) {
        Intrinsics.checkNotNullParameter(base64Encoder, "base64Encoder");
        this.f31539a = base64Encoder;
    }
}
