package com.crrepa.band.my.device.ai.chat.model;

import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.utils.d;

/* loaded from: classes2.dex */
public enum HisiliconErrorCode {
    AI_SERVER_BUSY(0),
    DEVICE_DISCONNECTED(1),
    AI_UNAUTHORIZED(2),
    INVALID_INSTRUCTION(3),
    COPYRIGHT_VIOLATION(4),
    NETWORK_ERROR(5),
    OTHER_ERROR(6);

    private final int code;

    HisiliconErrorCode(int i8) {
        this.code = i8;
    }

    @NonNull
    public static String getErrorStr(HisiliconErrorCode hisiliconErrorCode) {
        int value = hisiliconErrorCode.getValue();
        int i8 = value != 0 ? value != 1 ? value != 2 ? value != 3 ? value != 4 ? value != 5 ? -1 : R.string.net_disonnected : R.string.ai_copyright_error_tips : R.string.ai_inscriptions_error_tips : R.string.ai_mac_unauthorized_tips : R.string.ai_picture_disconnected_tip : R.string.ai_picture_error_serve_busy;
        if (i8 != -1) {
            return d.get().getString(i8);
        }
        return d.get().getString(R.string.ai_chat_answer_error) + "!!";
    }

    public int getValue() {
        return this.code;
    }
}
