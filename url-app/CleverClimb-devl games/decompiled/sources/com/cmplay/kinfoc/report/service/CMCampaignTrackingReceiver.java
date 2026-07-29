package com.cmplay.kinfoc.report.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.cmplay.kinfoc.report.KInfocReportManager;
import com.tapjoy.TapjoyConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;

/* loaded from: classes.dex */
public class CMCampaignTrackingReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra(TapjoyConstants.TJC_REFERRER);
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            try {
                String[] split = URLDecoder.decode(stringExtra, "GBK").split("&");
                if (split == null || split.length <= 0) {
                    return;
                }
                HashMap hashMap = new HashMap(split.length);
                for (String str : split) {
                    String[] split2 = str.split("=");
                    if (split2.length > 1) {
                        hashMap.put(split2[0], split2[1]);
                    }
                }
                String str2 = (String) hashMap.get("utm_source");
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                Log.d("CMCampaignTracking", "channel id is " + str2);
                KInfocReportManager.forceUpdateChannel(str2);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }
}
