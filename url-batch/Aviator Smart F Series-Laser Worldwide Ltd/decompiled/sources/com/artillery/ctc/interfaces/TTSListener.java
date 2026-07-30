package com.artillery.ctc.interfaces;

import androidx.annotation.Keep;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public interface TTSListener {
    void CloudTTSError(String str, int i8);

    void CloudTTSSuccess(byte[] bArr);

    void CloudTranslateSuccess(JSONObject jSONObject);
}
