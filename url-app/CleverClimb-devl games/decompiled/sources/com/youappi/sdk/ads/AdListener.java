package com.youappi.sdk.ads;

import com.youappi.sdk.YAErrorCode;

/* loaded from: classes2.dex */
public interface AdListener {
    void onAdEnded(String str);

    void onAdStarted(String str);

    void onLoadFailure(String str, YAErrorCode yAErrorCode, Exception exc);

    void onLoadSuccess(String str);

    void onShowFailure(String str, YAErrorCode yAErrorCode, Exception exc);
}
