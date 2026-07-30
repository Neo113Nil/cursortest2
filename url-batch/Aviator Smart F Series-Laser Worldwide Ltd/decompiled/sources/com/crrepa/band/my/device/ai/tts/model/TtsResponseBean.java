package com.crrepa.band.my.device.ai.tts.model;

/* loaded from: classes2.dex */
public class TtsResponseBean {
    public int code;
    public String message;
    public Ret ret;
    public String status;
    public String voiceUrl;

    public static class Ret {
        public String hash;
        public String key;
    }
}
