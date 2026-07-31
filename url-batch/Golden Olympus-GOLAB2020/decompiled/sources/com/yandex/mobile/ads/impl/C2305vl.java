package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import f2.AbstractC2419b;
import f2.AbstractC2420c;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.vl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2305vl implements bv {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33670a;

    public C2305vl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33670a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.bv
    @NotNull
    public byte[][] a() {
        try {
            InputStream openRawResource = this.f33670a.getResources().openRawResource(R.raw.monetization_ads_bundled_cert);
            try {
                Intrinsics.checkNotNull(openRawResource);
                byte[] c4 = AbstractC2419b.c(openRawResource);
                AbstractC2420c.a(openRawResource, null);
                return new byte[][]{c4};
            } finally {
            }
        } catch (IOException e4) {
            throw new IllegalStateException("Failed to create cert", e4);
        }
    }
}
