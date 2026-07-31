package com.ironsource.mediationsdk.adunit.adapter.listener;

import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public interface NetworkInitializationListener {
    void onInitFailed(int i4, @Nullable String str);

    void onInitSuccess();
}
