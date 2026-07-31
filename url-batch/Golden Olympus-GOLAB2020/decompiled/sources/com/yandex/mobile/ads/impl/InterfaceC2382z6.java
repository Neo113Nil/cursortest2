package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.model.MediatedAdObjectInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.z6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2382z6 {
    @Nullable
    Object a(@NotNull Context context, @NotNull Object obj, @Nullable C2360y7<?> c2360y7, @NotNull C2286v2 c2286v2, @Nullable MediatedAdObjectInfo mediatedAdObjectInfo, @NotNull kotlin.coroutines.d dVar);

    void onAdClicked();

    void onAdClosed();

    void onAdWillDisplay();

    void onInvalidated();
}
