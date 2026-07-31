package com.ironsource;

import android.content.Context;
import android.util.Pair;
import com.ironsource.ec;
import com.ironsource.fh;
import com.ironsource.kh;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class nh {
    public static ec a(JSONObject jSONObject) {
        return new ec.a(jSONObject.optString(cc.f15746r)).b().b(jSONObject.optBoolean("enabled")).a(new lh()).a(a()).a(false).a();
    }

    public static fh.e a(va vaVar, fh.e eVar) {
        return (vaVar == null || vaVar.g() == null || vaVar.g().get("rewarded") == null) ? eVar : Boolean.parseBoolean(vaVar.g().get("rewarded")) ? fh.e.RewardedVideo : fh.e.Interstitial;
    }

    public static kh a(Context context, String str, String str2, Map<String, String> map) {
        kh.b bVar = new kh.b();
        if (map != null && map.containsKey("sessionid")) {
            bVar.c(map.get("sessionid"));
        }
        bVar.a(context);
        return bVar.d(str).a(str2).a();
    }

    private static ArrayList<Pair<String, String>> a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>(cc.f15718K, cc.f15719L));
        arrayList.add(new Pair<>(cc.f15720M, cc.f15721N));
        return arrayList;
    }

    public static boolean a(va vaVar) {
        if (vaVar == null || vaVar.g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(vaVar.g().get("inAppBidding"));
    }
}
