package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPWhatsappConfigInfo;
import com.crrepa.ble.conn.bean.CRPWhatsappSendMessageInfo;
import com.crrepa.ble.conn.type.CRPBleRecordingType;

/* loaded from: classes3.dex */
public interface CRPWhatsappListener {
    void onActivateRecording();

    void onCancel();

    void onConfig(CRPWhatsappConfigInfo cRPWhatsappConfigInfo);

    void onSendMessage(CRPWhatsappSendMessageInfo cRPWhatsappSendMessageInfo);

    void onStartRecording(byte[] bArr);

    void onStopRecording(CRPBleRecordingType cRPBleRecordingType);

    void onSubscribeMessage(boolean z7);
}
