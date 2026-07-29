package com.moat.analytics.mobile.vng;

import android.view.View;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class y extends c<Object> implements ReactiveVideoTracker {
    private Integer l;

    public y(String str) {
        super(str);
        p.a("[SUCCESS] ", a() + " created");
    }

    @Override // com.moat.analytics.mobile.vng.b
    String a() {
        return "ReactiveVideoTracker";
    }

    @Override // com.moat.analytics.mobile.vng.c
    protected JSONObject a(MoatAdEvent moatAdEvent) {
        if (moatAdEvent.f7322d == MoatAdEventType.AD_EVT_COMPLETE && !moatAdEvent.f7320b.equals(MoatAdEvent.f7319a) && !a(moatAdEvent.f7320b, this.l)) {
            moatAdEvent.f7322d = MoatAdEventType.AD_EVT_STOPPED;
        }
        return super.a(moatAdEvent);
    }

    @Override // com.moat.analytics.mobile.vng.c
    protected Map<String, Object> g() {
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

    @Override // com.moat.analytics.mobile.vng.ReactiveVideoTracker
    public boolean trackVideoAd(Map<String, String> map, Integer num, View view) {
        if (!this.e) {
            if (num.intValue() < 1000) {
                p.a(3, "ReactiveVideoTracker", this, String.format(Locale.ROOT, "Invalid duration = %d. Please make sure duration is in milliseconds.", num));
                return false;
            }
            this.l = num;
            return super.a(map, new Object(), view);
        }
        p.a(3, "ReactiveVideoTracker", this, "trackVideoAd already called");
        p.a("[ERROR] ", a() + " trackVideoAd can't be called twice");
        return false;
    }
}
