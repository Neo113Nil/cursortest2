package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import f2.AbstractC2419b;
import f2.AbstractC2420c;
import java.io.IOException;
import java.io.InputStream;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cu1 extends C2305vl {

    /* renamed from: b, reason: collision with root package name */
    private final Context f24324b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu1(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24324b = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.C2305vl, com.yandex.mobile.ads.impl.bv
    @NotNull
    public final byte[][] a() {
        try {
            InputStream openRawResource = this.f24324b.getResources().openRawResource(R.raw.monetization_ads_sdkinternalca);
            try {
                Intrinsics.checkNotNull(openRawResource);
                byte[] c4 = AbstractC2419b.c(openRawResource);
                AbstractC2420c.a(openRawResource, null);
                return (byte[][]) AbstractC3219i.r(super.a(), new byte[][]{c4});
            } finally {
            }
        } catch (IOException e4) {
            throw new IllegalStateException("Failed to create cert", e4);
        }
    }
}
