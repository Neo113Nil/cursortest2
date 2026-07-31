package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;

/* renamed from: com.facebook.ads.redexgen.X.Tz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2652Tz implements AdSizeApi {
    public final /* synthetic */ DynamicLoaderImpl A00;
    public final /* synthetic */ EnumC2692Vp A01;

    public C2652Tz(DynamicLoaderImpl dynamicLoaderImpl, EnumC2692Vp enumC2692Vp) {
        this.A00 = dynamicLoaderImpl;
        this.A01 = enumC2692Vp;
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getHeight() {
        return this.A01.A03();
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getWidth() {
        return this.A01.A04();
    }
}
