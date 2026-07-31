package com.adjust.sdk.sig;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.ironsource.B5;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public class Signer {
    public boolean a = false;
    public d b;
    public a c;
    public c d;

    public static String getVersion() {
        return "3.35.2";
    }

    public final synchronized void a() {
        if (this.a) {
            return;
        }
        this.b = new d();
        this.d = new c(Build.VERSION.SDK_INT);
        this.c = new NativeLibHelper();
        this.a = true;
    }

    public synchronized void onResume() {
        a();
        d dVar = this.b;
        a aVar = this.c;
        dVar.getClass();
        if (!d.a) {
            ((NativeLibHelper) aVar).a();
        }
    }

    public synchronized void sign(Context context, Map<String, String> map, String str, String str2) {
        a();
        d dVar = this.b;
        c cVar = this.d;
        a aVar = this.c;
        dVar.getClass();
        d.a(context, cVar, aVar, map, str, str2);
    }

    public synchronized void sign(Context context, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        try {
            a();
            d dVar = this.b;
            c cVar = this.d;
            a aVar = this.c;
            dVar.getClass();
            if (map != null && map.size() != 0 && map2 != null && map3 != null) {
                HashMap hashMap = new HashMap();
                d.a(map.keySet(), map, hashMap);
                String str = map2.get("activity_kind");
                String str2 = map2.get("client_sdk");
                if (!"b".equals(map2.get("a"))) {
                    d.a(context, cVar, aVar, hashMap, str, str2);
                    if (hashMap.containsKey(InAppPurchaseMetaData.KEY_SIGNATURE) && hashMap.containsKey("adj_signing_id") && hashMap.containsKey("headers_id") && hashMap.containsKey("algorithm") && hashMap.containsKey("native_version")) {
                        String str3 = (String) hashMap.get("adj_signing_id");
                        String str4 = (String) hashMap.get("headers_id");
                        String str5 = (String) hashMap.get(InAppPurchaseMetaData.KEY_SIGNATURE);
                        String str6 = (String) hashMap.get("algorithm");
                        String str7 = (String) hashMap.get("native_version");
                        Locale locale = Locale.US;
                        String str8 = "algorithm=\"" + str6 + "\"";
                        map3.put("authorization", "Signature " + ("signature=\"" + str5 + "\"") + StringUtils.COMMA + ("adj_signing_id=\"" + str3 + "\"") + StringUtils.COMMA + str8 + StringUtils.COMMA + ("headers_id=\"" + str4 + "\"") + StringUtils.COMMA + ("native_version=\"" + str7 + "\""));
                    }
                    Log.e("SignerInstance", "sign: Signature generation failed. Exiting...");
                }
                d.a(map.keySet(), map, map3);
                d.a(new HashSet(Arrays.asList("network_payload", B5.r)), map2, map3);
            }
            Log.e("SignerInstance", "sign: One or more parameters are null");
        } catch (Throwable th) {
            throw th;
        }
    }
}
