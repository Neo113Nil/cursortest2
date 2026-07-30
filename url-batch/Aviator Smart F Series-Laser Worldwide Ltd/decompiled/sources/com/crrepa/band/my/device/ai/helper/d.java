package com.crrepa.band.my.device.ai.helper;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ai.chat.model.HisiliconErrorCode;
import com.crrepa.ble.conn.type.CRPChatErrorCode;
import com.moyoung.dafit.module.common.utils.p;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.utils.u;
import java.util.UUID;

/* loaded from: classes2.dex */
public class d {
    @NonNull
    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

    public static void initAIAgent() {
        if (AIProvider.getProviderType() == 0) {
            g.initMagic();
        } else if (AIProvider.getProviderType() == 1) {
            c.initAIAgent();
        } else {
            h.initAIAgent();
        }
    }

    public static boolean isMultipleMode() {
        if (AIProvider.getProviderType() == 0 && com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            return u.isZH() || u.isEN();
        }
        return false;
    }

    public static boolean isUnauthorizedAndShowTips() {
        boolean z7;
        if (AIProvider.getProviderType() == 0) {
            if (g.isMacUnauthorized()) {
                g.showMacUnauthorizedTips();
                z7 = true;
            }
            z7 = false;
        } else if (AIProvider.getProviderType() == 1) {
            if (c.isUnauthorized()) {
                c.showUnauthorizedTips();
                z7 = true;
            }
            z7 = false;
        } else {
            if (h.isUnauthorized()) {
                h.showUnauthorizedTips();
                z7 = true;
            }
            z7 = false;
        }
        if (z7 && com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            sendHisiliconAIError(1, HisiliconErrorCode.AI_UNAUTHORIZED);
        }
        return z7;
    }

    public static void logChatEvent(boolean z7) {
        logGPTEvent(1, z7);
    }

    public static void logGPTASREvent(boolean z7) {
        logGPTEvent(0, z7);
    }

    private static void logGPTEvent(int i8, boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putString("type", String.valueOf(i8));
        bundle.putString("device_id", p.getDeviceId(com.moyoung.dafit.module.common.utils.d.get()));
        bundle.putString("platform_type", z7 ? "watch" : "app");
        s0.logEvent("GPT", bundle);
    }

    public static void logPictureASREvent(boolean z7) {
        logPictureEvent(0, z7);
    }

    private static void logPictureEvent(int i8, boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putString("type", String.valueOf(i8));
        bundle.putString("device_id", p.getDeviceId(com.moyoung.dafit.module.common.utils.d.get()));
        bundle.putString("platform_type", z7 ? "watch" : "app");
        s0.logEvent("文生图", bundle);
    }

    public static void logPictureImgEvent(boolean z7) {
        logPictureEvent(1, z7);
    }

    public static void logTTSEvent(boolean z7) {
        logGPTEvent(2, z7);
    }

    public static void sendAIError(int i8, CRPChatErrorCode cRPChatErrorCode) {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            return;
        }
        if (i8 == 1) {
            i4.getInstance().sendChatError(cRPChatErrorCode);
        } else if (i8 == 3) {
            i4.getInstance().sendFetchError(cRPChatErrorCode);
        } else {
            i4.getInstance().sendAIWatchFaceError(cRPChatErrorCode);
        }
    }

    public static void sendHisiliconAIError(int i8, HisiliconErrorCode hisiliconErrorCode) {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon() && i8 == 1) {
            i4.getInstance().sendHisiliconChatError(hisiliconErrorCode);
        }
    }
}
