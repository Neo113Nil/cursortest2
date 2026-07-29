package com.dancingbogo.skyrolline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.cmplay.kinfoc.report.KInfocReportManager;
import com.dancingbogo.skyrolline.util.b;
import com.dancingbogo.skyrolline.util.c;
import com.tapjoy.TapjoyConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class CMCampaignTrackingReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!"com.android.vending.INSTALL_REFERRER".equals(action)) {
            b.a("zzb_channel", "receive invalid action " + action);
            return;
        }
        String stringExtra = intent.getStringExtra(TapjoyConstants.TJC_REFERRER);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        try {
            String[] split = URLDecoder.decode(stringExtra, "GBK").split("&");
            if (split == null || split.length <= 0) {
                return;
            }
            HashMap<String, String> hashMap = new HashMap<>(split.length);
            for (String str : split) {
                String[] split2 = str.split("=");
                if (split2.length > 1) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
            String str2 = hashMap.get("utm_source");
            if (!TextUtils.isEmpty(str2)) {
                c.a(str2);
                b.a("zzb_channel", "channel id is " + str2);
                try {
                    KInfocReportManager.forceUpdateChannel(str2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            a(hashMap);
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
    }

    private void a(HashMap<String, String> hashMap) {
        StringBuilder sb = new StringBuilder();
        sb.append(hashMap.get("pid"));
        String str = hashMap.get("af_sub1");
        if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
            sb.append("#");
            sb.append(str);
        }
        String str2 = hashMap.get("af_sub2");
        if (!TextUtils.isEmpty(str2) && !str2.equalsIgnoreCase("null")) {
            sb.append("#");
            sb.append(str2);
        }
        b.a("zzb_channel", "child channel id is " + sb.toString());
        c.b(sb.toString());
    }
}
