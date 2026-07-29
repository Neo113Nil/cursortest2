package com.umeng.commonsdk;

import android.content.Context;
import android.util.Base64;
import com.umeng.commonsdk.internal.systemlocation.UMSysLocationCache;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.stateless.f;
import org.json.JSONObject;

/* compiled from: UMConfigureImpl.java */
/* loaded from: classes2.dex */
class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f8964a;

    a(Context context) {
        this.f8964a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            JSONObject locationJson = UMSysLocationCache.getLocationJson(this.f8964a);
            if (locationJson == null || locationJson.length() <= 0) {
                return;
            }
            f.a(this.f8964a, this.f8964a.getFilesDir() + "/" + com.umeng.commonsdk.stateless.a.e + "/" + Base64.encodeToString(com.umeng.commonsdk.internal.a.n.getBytes(), 0), 10);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("lbs", locationJson);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tp", jSONObject);
            UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
            uMSLEnvelopeBuild.buildSLEnvelope(this.f8964a, uMSLEnvelopeBuild.buildSLBaseHeader(this.f8964a), jSONObject2, com.umeng.commonsdk.internal.a.n);
        } catch (Exception e) {
            com.umeng.commonsdk.proguard.b.a(this.f8964a, e);
        }
    }
}
