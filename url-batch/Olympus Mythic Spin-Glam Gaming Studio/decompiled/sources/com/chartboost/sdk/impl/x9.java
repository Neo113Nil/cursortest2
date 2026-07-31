package com.chartboost.sdk.impl;

import com.chartboost.sdk.view.CBImpressionActivity;

/* loaded from: classes6.dex */
public interface x9 {
    void attachViewToActivity(cl clVar);

    void finishActivity();

    CBImpressionActivity getActivity();

    boolean isActivityHardwareAccelerated();

    void setFullscreen();
}
