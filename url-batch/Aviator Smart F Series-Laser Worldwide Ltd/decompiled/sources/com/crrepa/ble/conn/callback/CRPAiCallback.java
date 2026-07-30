package com.crrepa.ble.conn.callback;

/* loaded from: classes3.dex */
public interface CRPAiCallback {
    public static final byte AI_FEATURE_AGENT = 2;
    public static final byte AI_FEATURE_AI_WATCHFACE = 1;
    public static final byte AI_FEATURE_CHAT = 0;
    public static final byte AI_FEATURE_HEALTH_ANALYSIS = 3;
    public static final byte AI_MODEL_AFLASH = 1;
    public static final byte AI_MODEL_HUAQIAO = 0;
    public static final byte AI_MODEL_MOYOUNG = 2;

    void onSupportAiFeature(byte b8, byte[] bArr, boolean z7);
}
