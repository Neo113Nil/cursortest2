package com.artillery.ctc.interfaces;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface IAsrCallBack {
    void onFail(int i8, String str);

    void onSucceed(String str, byte[] bArr, String str2);
}
