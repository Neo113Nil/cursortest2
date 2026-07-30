package com.artillery.ctc.interfaces;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface IResultCallback {
    void onFail(Integer num, String str);

    void onSuccess(String str);
}
