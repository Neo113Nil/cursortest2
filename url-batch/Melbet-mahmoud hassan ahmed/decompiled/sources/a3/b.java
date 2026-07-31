package a3;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;

@TargetApi(26)
/* loaded from: classes.dex */
public class b extends m2 {
    @Override // a3.f
    public final int p(Context context, TelephonyManager telephonyManager) {
        y2.t.q();
        return (g2.f(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? 2 : 1;
    }
}
