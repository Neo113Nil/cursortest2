package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    void onAdClosed();

    void onAdEnded();

    void onAdShowFailed(int i4, @Nullable String str);

    void onAdShowSuccess();

    void onAdStarted();

    void onAdVisible();
}
