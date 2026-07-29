package com.applovin.impl.sdk.d;

import android.text.TextUtils;
import com.applovin.impl.sdk.network.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x extends z {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.g f3147a;

    public x(com.applovin.impl.sdk.ad.g gVar, com.applovin.impl.sdk.j jVar) {
        super("TaskReportReward", jVar);
        this.f3147a = gVar;
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.w;
    }

    @Override // java.lang.Runnable
    public void run() {
        String b2 = com.applovin.impl.sdk.a.e.a().b(this.f3147a);
        if (b2 == null) {
            d("No reward result was found for ad: " + this.f3147a);
            return;
        }
        HashMap hashMap = new HashMap(6);
        hashMap.put("result", b2);
        hashMap.put("zone_id", this.f3147a.getAdZone().a());
        hashMap.put("fire_percent", Integer.valueOf(this.f3147a.ab()));
        String clCode = this.f3147a.getClCode();
        if (!com.applovin.impl.sdk.e.i.b(clCode)) {
            clCode = "NO_CLCODE";
        }
        hashMap.put("clcode", clCode);
        String k = this.f3073b.k();
        if (!TextUtils.isEmpty(k)) {
            hashMap.put("user_id", k);
        }
        Map<String, String> a2 = com.applovin.impl.sdk.a.e.a().a(this.f3147a);
        if (a2 != null) {
            hashMap.put("params", a2);
        }
        a("2.0/cr", new JSONObject(hashMap), ((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.bw)).intValue(), new a.b<JSONObject>() { // from class: com.applovin.impl.sdk.d.x.1
            @Override // com.applovin.impl.sdk.network.a.b
            public void a(int i) {
                x.this.d("Failed to report reward for ad: " + x.this.f3147a.getAdIdNumber() + " - error code: " + i);
            }

            @Override // com.applovin.impl.sdk.network.a.b
            public void a(JSONObject jSONObject, int i) {
                x.this.a("Reported reward successfully for ad: " + x.this.f3147a.getAdIdNumber());
            }
        });
    }
}
