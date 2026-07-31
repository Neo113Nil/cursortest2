package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.model.MediatedAdObjectInfo;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.e6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1893e6 implements InterfaceC2382z6 {
    @Override // com.yandex.mobile.ads.impl.InterfaceC2382z6
    @Nullable
    public final Object a(@NotNull Context context, @NotNull Object obj, @Nullable C2360y7<?> c2360y7, @NotNull C2286v2 c2286v2, @Nullable MediatedAdObjectInfo mediatedAdObjectInfo, @NotNull kotlin.coroutines.d dVar) {
        return AdQualityVerificationResult.NotImplemented.INSTANCE;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2382z6
    public final void onAdClicked() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2382z6
    public final void onAdClosed() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2382z6
    public final void onAdWillDisplay() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2382z6
    public final void onInvalidated() {
    }
}
