package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import com.tapjoy.internal.ha;
import com.tapjoy.internal.j;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* loaded from: classes2.dex */
public class InstallReferrerReceiver extends j {
    @Override // com.tapjoy.internal.j, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String a2 = ha.a(context, intent);
        int a3 = a(context, intent);
        if (intent.getBooleanExtra("fiverocks:verify", false) && isOrderedBroadcast()) {
            setResultCode(a3 + 1);
            if (a2 != null) {
                try {
                    setResultData("http://play.google.com/store/apps/details?id=" + context.getPackageName() + "&referrer=" + URLEncoder.encode(a2, "UTF-8"));
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
    }
}
