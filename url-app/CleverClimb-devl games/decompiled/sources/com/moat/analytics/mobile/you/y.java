package com.moat.analytics.mobile.you;

import android.view.View;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class y extends c implements ReactiveVideoTracker {
    private Integer l;

    public y(String str) {
        super(str);
        p.a(3, "ReactiveVideoTracker", this, "Initializing.");
        p.a("[SUCCESS] ", a() + " created");
    }

    @Override // com.moat.analytics.mobile.you.b
    String a() {
        return "ReactiveVideoTracker";
    }

    @Override // com.moat.analytics.mobile.you.c
    JSONObject a(MoatAdEvent moatAdEvent) {
        if (moatAdEvent.f7444d == MoatAdEventType.AD_EVT_COMPLETE && !moatAdEvent.f7442b.equals(MoatAdEvent.f7441a) && !a(moatAdEvent.f7442b, this.l)) {
            moatAdEvent.f7444d = MoatAdEventType.AD_EVT_STOPPED;
        }
        return super.a(moatAdEvent);
    }

    @Override // com.moat.analytics.mobile.you.c, com.moat.analytics.mobile.you.b
    void a(List<String> list) {
        if (this.l.intValue() < 1000) {
            throw new m(String.format(Locale.ROOT, "Invalid duration = %d. Please make sure duration is in milliseconds.", this.l));
        }
        super.a(list);
    }

    @Override // com.moat.analytics.mobile.you.c
    Map<String, Object> i() {
        HashMap hashMap = new HashMap();
        View view = this.k.get();
        int i = 0;
        int i2 = 0;
        if (view != null) {
            i = Integer.valueOf(view.getWidth());
            i2 = Integer.valueOf(view.getHeight());
        }
        hashMap.put("duration", this.l);
        hashMap.put("width", i);
        hashMap.put("height", i2);
        return hashMap;
    }

    @Override // com.moat.analytics.mobile.you.ReactiveVideoTracker
    public boolean trackVideoAd(Map<String, String> map, Integer num, View view) {
        try {
            c();
            d();
            this.l = num;
            return super.a(map, view);
        } catch (Exception e) {
            a("trackVideoAd", e);
            return false;
        }
    }
}
