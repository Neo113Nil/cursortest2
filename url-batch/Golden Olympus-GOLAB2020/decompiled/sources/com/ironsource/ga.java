package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceAES;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ga implements ls<String> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16362a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f16363b;

    public ga(@NotNull String encryptedResponse, @NotNull String descriptionKey) {
        Intrinsics.checkNotNullParameter(encryptedResponse, "encryptedResponse");
        Intrinsics.checkNotNullParameter(descriptionKey, "descriptionKey");
        this.f16362a = encryptedResponse;
        this.f16363b = descriptionKey;
    }

    @Override // com.ironsource.ls
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        String value = IronSourceAES.decode(this.f16363b, this.f16362a);
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("Decryption failed");
        }
        Intrinsics.checkNotNullExpressionValue(value, "value");
        return value;
    }
}
