package com.yandex.mobile.ads.impl;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.fh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1928fh {
    @NotNull
    public final String a() {
        byte[] decode = Base64.decode("QW1hem9u", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return new String(decode, Charsets.UTF_8);
    }

    @NotNull
    public final String b() {
        byte[] decode = Base64.decode("ZnVndQ==", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return new String(decode, Charsets.UTF_8);
    }

    @NotNull
    public final String c() {
        byte[] decode = Base64.decode("WGlhb21p", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return new String(decode, Charsets.UTF_8);
    }
}
