package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public interface AdapterAdListener {
    void onAdClicked();

    void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i4, String str);

    void onAdLoadSuccess();

    void onAdOpened();
}
