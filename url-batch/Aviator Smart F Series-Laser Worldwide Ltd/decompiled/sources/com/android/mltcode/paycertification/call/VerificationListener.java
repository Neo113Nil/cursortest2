package com.android.mltcode.paycertification.call;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface VerificationListener {
    void onError(int i8);

    void onSuccess();

    void onUnknown(int i8);
}
