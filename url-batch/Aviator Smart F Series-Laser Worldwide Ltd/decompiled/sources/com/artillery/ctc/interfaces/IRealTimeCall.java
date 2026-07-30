package com.artillery.ctc.interfaces;

import androidx.annotation.Keep;
import com.artillery.ctc.CtHelper;

@Keep
/* loaded from: classes.dex */
public interface IRealTimeCall {
    void onClose();

    void onReady(CtHelper ctHelper);

    void onResult(String str);
}
