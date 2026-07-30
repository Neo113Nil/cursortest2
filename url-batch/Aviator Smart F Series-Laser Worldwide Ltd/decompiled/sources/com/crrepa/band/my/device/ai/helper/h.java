package com.crrepa.band.my.device.ai.helper;

import android.util.Log;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.utils.p;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.x0;
import com.moyoung.lib.ai.oauth.a;

/* loaded from: classes2.dex */
public class h {

    class a implements com.moyoung.lib.ai.oauth.d {
        a() {
        }

        @Override // com.moyoung.lib.ai.oauth.d
        public void onError(String str) {
            Log.d("MoyoungAI", "initAIAgent onError:" + str);
        }

        @Override // com.moyoung.lib.ai.oauth.d
        public void onSuccess() {
            Log.d("MoyoungAI", "initAIAgent onSuccess");
        }
    }

    public static void initAIAgent() {
        com.moyoung.lib.ai.e.setPrintLog(false);
        String address = com.crrepa.band.my.ble.band.utils.a.getInstance().getAddress();
        if (x0.isEmpty(address)) {
            address = "unknown";
        }
        String name = com.crrepa.band.my.ble.band.utils.a.getInstance().getName();
        com.moyoung.lib.ai.e.get().authenticate(com.moyoung.dafit.module.common.utils.d.get(), new a.C0311a().setSoftVersion("MOY-A003-1.0.0").setMac(address).setDeviceId(p.getDeviceId(com.moyoung.dafit.module.common.utils.d.get())).setDeviceName(x0.isEmpty(name) ? "unknown" : name).setAppVersion("v2.9.2-2").build(), new a());
    }

    public static boolean isAuthorized() {
        return com.moyoung.lib.ai.e.get().isAuthorized();
    }

    public static boolean isUnauthorized() {
        return !isAuthorized();
    }

    public static void showUnauthorizedTips() {
        r0.showShort(com.moyoung.dafit.module.common.utils.d.get(), R.string.ai_mac_unauthorized_tips);
        initAIAgent();
    }
}
