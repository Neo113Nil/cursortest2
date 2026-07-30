package com.android.mltcode.paycertification.entitys;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class JsonData {
    public String data;
    public int errCode;
    public int nextReqTime;
    public String offlineVoiceKey;
    public int stabilityLevel;

    public String toString() {
        return "JsonData{data='" + this.data + "', supportDoubleServer=" + this.stabilityLevel + ", errCode=" + this.errCode + ", nextReqTime=" + this.nextReqTime + '}';
    }
}
