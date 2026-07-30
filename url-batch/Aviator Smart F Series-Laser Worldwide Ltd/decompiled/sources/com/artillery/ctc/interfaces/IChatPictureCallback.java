package com.artillery.ctc.interfaces;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Pair;

@Keep
/* loaded from: classes.dex */
public interface IChatPictureCallback extends IChatFailCallback {
    void onSuccess(List<Pair<String, String>> list);
}
