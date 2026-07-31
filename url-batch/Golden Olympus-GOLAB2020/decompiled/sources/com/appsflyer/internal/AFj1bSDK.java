package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.ironsource.cc;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFj1bSDK {
    public static Map<String, String> getRevenue(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                hashMap.put(URLEncoder.encode(entry.getKey(), cc.f15721N), URLEncoder.encode(entry.getValue(), cc.f15721N));
            } catch (UnsupportedEncodingException e4) {
                AFLogger.afErrorLogForExcManagerOnly("failed to encode map", e4);
            }
        }
        return hashMap;
    }
}
