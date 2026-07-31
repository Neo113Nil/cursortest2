package ru.rustore.sdk.pay.internal;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e7 {
    @NotNull
    public static PublicKey a(@NotNull gc publicKey) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(StringsKt.G(StringsKt.G(new Regex("\\n").replace(publicKey.f44170b, ""), "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), 0)));
        Intrinsics.checkNotNullExpressionValue(generatePublic, "keyFactory.generatePublic(keySpecX509)");
        return generatePublic;
    }
}
