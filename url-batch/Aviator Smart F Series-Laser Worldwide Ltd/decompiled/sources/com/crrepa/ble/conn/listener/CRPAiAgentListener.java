package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.type.CRPBleRecordingType;

/* loaded from: classes3.dex */
public interface CRPAiAgentListener {
    public static final byte AI_AGENT_CONSTELLATION = 0;
    public static final byte AI_AGENT_EAT = 5;
    public static final byte AI_AGENT_EMOTION = 4;
    public static final byte AI_AGENT_FOOD_CALORIES = 2;
    public static final byte AI_AGENT_SOCIAL_SKILL = 3;
    public static final byte AI_AGENT_TROPICAL = 1;

    void onActivateRecording(byte b8);

    void onAskQuestion();

    void onCancel();

    void onPauseResponse();

    void onPlayResponse();

    void onStartRecording(byte[] bArr);

    void onStopRecording(CRPBleRecordingType cRPBleRecordingType);

    void onSupportAiAgent(byte[] bArr);
}
