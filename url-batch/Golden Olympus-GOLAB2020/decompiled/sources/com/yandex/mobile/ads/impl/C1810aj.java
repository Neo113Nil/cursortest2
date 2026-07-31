package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.aj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1810aj implements d92 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2394zi f23283a;

    public C1810aj(@NotNull C2394zi base64Decoder) {
        Intrinsics.checkNotNullParameter(base64Decoder, "base64Decoder");
        this.f23283a = base64Decoder;
    }

    @Override // com.yandex.mobile.ads.impl.d92
    @NotNull
    public final String a(@NotNull String key, @NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        String a4 = w81.a(jsonObject, "jsonAsset", key, "jsonAttribute", key);
        if (a4 == null || a4.length() == 0 || Intrinsics.areEqual(a4, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a4);
        this.f23283a.getClass();
        String b4 = C2394zi.b(a4);
        if (b4 == null || b4.length() == 0) {
            throw new i61("Native Ad json has attribute with broken base64 encoding");
        }
        return b4;
    }
}
