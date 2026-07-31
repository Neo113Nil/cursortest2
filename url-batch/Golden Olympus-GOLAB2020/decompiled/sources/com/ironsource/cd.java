package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface cd {
    void a(@Nullable String str);

    void onAdInstanceDidBecomeVisible();

    void onAdInstanceDidClick();

    void onAdInstanceDidDismiss();

    void onAdInstanceDidReward(@Nullable String str, int i4);

    void onAdInstanceDidShow();
}
