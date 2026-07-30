package com.crrepa.band.my.device.ai.debugmodel;

import com.artillery.ctc.base.Audio2TextBody;
import com.google.gson.Gson;

/* loaded from: classes2.dex */
public class e {
    String msg;

    public e(Object obj) {
        this.msg = new Gson().toJson(obj);
    }

    public e(Audio2TextBody audio2TextBody) {
        Audio2TextBody audio2TextBody2 = (Audio2TextBody) new Gson().fromJson(new Gson().toJson(audio2TextBody), Audio2TextBody.class);
        audio2TextBody2.speech = "fileBase64";
        this.msg = new Gson().toJson(audio2TextBody2);
    }
}
