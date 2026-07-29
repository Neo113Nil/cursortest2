package com.aiming.mdt.mobileads;

import android.app.Activity;
import com.aiming.mdt.mediation.InitListener;
import com.aiming.mdt.mediation.InitModel;
import com.aiming.mdt.utils.AdLog;
import com.aiming.mdt.utils.Constants;
import com.tapjoy.TJConnectListener;
import com.tapjoy.Tapjoy;
import java.util.Map;

/* loaded from: classes.dex */
public class TapjoyInit extends InitModel {
    private static String sAppKey;

    @Override // com.aiming.mdt.mediation.InitModel
    public String mediation() {
        return Constants.INSTANCE_USELESS_REQUEST;
    }

    @Override // com.aiming.mdt.mediation.InitModel
    public void init(Activity activity, Map<String, Object> map, final InitListener initListener) throws Throwable {
        super.init(activity, map, initListener);
        sAppKey = this.mAppKey;
        Tapjoy.setActivity(activity);
        Tapjoy.limitedConnect(activity.getApplicationContext(), this.mAppKey, new TJConnectListener() { // from class: com.aiming.mdt.mobileads.TapjoyInit.1
            @Override // com.tapjoy.TJConnectListener
            public void onConnectSuccess() {
                initListener.onSuccess(TapjoyInit.this.mediation());
                AdLog.getSingleton().LogD("Adt-Tapjoy", "Tapjoy init success ");
            }

            @Override // com.tapjoy.TJConnectListener
            public void onConnectFailure() {
                initListener.onError(TapjoyInit.this.mediation());
                AdLog.getSingleton().LogD("Adt-Tapjoy", "Tapjoy init failed ");
            }
        });
    }

    static String getAppKey() {
        return sAppKey;
    }
}
