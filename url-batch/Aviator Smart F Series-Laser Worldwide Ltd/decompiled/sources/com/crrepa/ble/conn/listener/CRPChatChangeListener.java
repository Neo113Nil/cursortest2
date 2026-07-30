package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.type.CRPBleRecordingType;

/* loaded from: classes3.dex */
public interface CRPChatChangeListener {
    public static final byte MODEL_DEEPSEEK = 3;
    public static final byte MODEL_DOUBAO = 5;
    public static final byte MODEL_GPT = 0;
    public static final byte MODEL_KIMI = 6;
    public static final byte MODEL_TONGYI = 2;
    public static final byte MODEL_WENXINYIYAN = 1;
    public static final byte MODEL_XUFEI = 7;
    public static final byte MODEL_ZHIPU = 4;

    void onActivateRecording();

    void onAskQuestion();

    void onCancel();

    void onModelChanged(byte b8);

    void onPauseResponse();

    void onPlayResponse();

    void onStartRecording(byte[] bArr);

    void onStopRecording(CRPBleRecordingType cRPBleRecordingType);
}
