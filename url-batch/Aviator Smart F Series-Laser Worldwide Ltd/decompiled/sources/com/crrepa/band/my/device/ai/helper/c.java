package com.crrepa.band.my.device.ai.helper;

import android.util.Log;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.x0;
import com.my.lib.AFlash;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.WatchInfo;
import com.my.lib.enums.PaymentModel;
import com.my.lib.enums.Region;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import f6.l;
import java.util.List;
import java.util.Random;
import y5.w;

/* loaded from: classes2.dex */
public class c {
    private static boolean isInitialized = false;
    private static String randomMac = "";

    public static void checkUnauthorized(String str) {
        boolean z7 = "21".equals(str) || "61".equals(str);
        isInitialized = !z7;
        if (z7) {
            initAIAgent();
        }
    }

    public static String generateRandomMac() {
        if (x0.isNotEmpty(randomMac)) {
            return randomMac;
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < 6; i8++) {
            if (i8 > 0) {
                sb.append(":");
            }
            int nextInt = random.nextInt(256);
            if (i8 == 0) {
                nextInt &= GattError.GATT_PRC_IN_PROGRESS;
            }
            sb.append(String.format("%02X", Integer.valueOf(nextInt)));
        }
        String sb2 = sb.toString();
        randomMac = sb2;
        return sb2;
    }

    public static String getWID() {
        return com.crrepa.band.my.ble.band.utils.a.getInstance().getAddress();
    }

    public static void initAIAgent() {
        String wid = getWID();
        String currentLanguage = com.crrepa.band.my.device.ai.asr.b.getCurrentLanguage();
        WatchInfo watchInfo = new WatchInfo(PaymentModel.LICENSE_PAY, wid);
        watchInfo.setLanguage(currentLanguage);
        Log.d("AFlash", "initAIAgent: wid：" + wid + ",,,language:" + currentLanguage);
        AFlash.Companion.getInstance().initialize(com.moyoung.dafit.module.common.utils.d.get(), Region.OVERSEAS, new WatchInfo[]{watchInfo}, new l() { // from class: com.crrepa.band.my.device.ai.helper.a
            @Override // f6.l
            public final Object invoke(Object obj) {
                w lambda$initAIAgent$0;
                lambda$initAIAgent$0 = c.lambda$initAIAgent$0((List) obj);
                return lambda$initAIAgent$0;
            }
        }, new l() { // from class: com.crrepa.band.my.device.ai.helper.b
            @Override // f6.l
            public final Object invoke(Object obj) {
                w lambda$initAIAgent$1;
                lambda$initAIAgent$1 = c.lambda$initAIAgent$1((ErrorCode) obj);
                return lambda$initAIAgent$1;
            }
        });
    }

    public static boolean isUnauthorized() {
        return !isInitialized;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w lambda$initAIAgent$0(List list) {
        Log.d("AFlash", "onSuccess: " + list.toString());
        isInitialized = true;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w lambda$initAIAgent$1(ErrorCode errorCode) {
        Log.d("AFlash", "onFail: " + errorCode.getCode() + "，" + errorCode.getMessage());
        return null;
    }

    public static void showUnauthorizedTips() {
        r0.showShort(com.moyoung.dafit.module.common.utils.d.get(), R.string.ai_mac_unauthorized_tips);
        initAIAgent();
    }
}
