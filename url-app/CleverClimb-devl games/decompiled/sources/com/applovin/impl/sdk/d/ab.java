package com.applovin.impl.sdk.d;

import android.text.TextUtils;
import com.applovin.impl.sdk.network.a;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ab extends z {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.g f3077a;

    /* renamed from: c, reason: collision with root package name */
    private final AppLovinAdRewardListener f3078c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f3079d;
    private volatile boolean e;

    public ab(com.applovin.impl.sdk.ad.g gVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.j jVar) {
        super("TaskValidateReward", jVar);
        this.f3079d = new Object();
        this.e = false;
        this.f3077a = gVar;
        this.f3078c = appLovinAdRewardListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (f()) {
            return;
        }
        String str = "network_timeout";
        if (i < 400 || i > 500) {
            this.f3078c.validationRequestFailed(this.f3077a, i);
        } else {
            this.f3078c.userRewardRejected(this.f3077a, new HashMap(0));
            str = "rejected";
        }
        com.applovin.impl.sdk.a.e.a().a(this.f3077a, str);
    }

    private void a(String str, Map<String, String> map) {
        if (f()) {
            return;
        }
        com.applovin.impl.sdk.a.e a2 = com.applovin.impl.sdk.a.e.a();
        a2.a(this.f3077a, str);
        a2.a(this.f3077a, map);
        if (str.equals("accepted")) {
            this.f3078c.userRewardVerified(this.f3077a, map);
            return;
        }
        if (str.equals("quota_exceeded")) {
            this.f3078c.userOverQuota(this.f3077a, map);
        } else if (str.equals("rejected")) {
            this.f3078c.userRewardRejected(this.f3077a, map);
        } else {
            this.f3078c.validationRequestFailed(this.f3077a, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        Map<String, String> hashMap;
        String str;
        if (f()) {
            return;
        }
        try {
            JSONObject a2 = com.applovin.impl.sdk.e.e.a(jSONObject);
            com.applovin.impl.sdk.e.e.d(a2, this.f3073b);
            com.applovin.impl.sdk.e.e.c(jSONObject, this.f3073b);
            try {
                hashMap = com.applovin.impl.sdk.e.f.a((JSONObject) a2.get("params"));
            } catch (Throwable unused) {
                hashMap = new HashMap<>(0);
            }
            try {
                str = a2.getString("result");
            } catch (Throwable unused2) {
                str = "network_timeout";
            }
            a(str, hashMap);
        } catch (JSONException e) {
            a("Unable to parse API response", e);
        }
    }

    private boolean f() {
        boolean z;
        synchronized (this.f3079d) {
            z = this.e;
        }
        return z;
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.z;
    }

    public void a(boolean z) {
        synchronized (this.f3079d) {
            this.e = z;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String k = this.f3073b.k();
        String clCode = this.f3077a.getClCode();
        HashMap hashMap = new HashMap(3);
        hashMap.put("zone_id", this.f3077a.getAdZone().a());
        if (com.applovin.impl.sdk.e.i.b(clCode)) {
            hashMap.put("clcode", clCode);
        } else {
            hashMap.put("clcode", "NO_CLCODE");
        }
        if (!TextUtils.isEmpty(k)) {
            hashMap.put("user_id", k);
        }
        a("2.0/vr", new JSONObject(hashMap), ((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.bv)).intValue(), new a.b<JSONObject>() { // from class: com.applovin.impl.sdk.d.ab.1
            @Override // com.applovin.impl.sdk.network.a.b
            public void a(int i) {
                ab.this.a(i);
            }

            @Override // com.applovin.impl.sdk.network.a.b
            public void a(JSONObject jSONObject, int i) {
                ab.this.a(jSONObject);
            }
        });
    }
}
