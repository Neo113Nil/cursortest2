package com.moat.analytics.mobile.cha;

import android.view.View;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class w extends b implements ReactiveVideoTracker {

    /* renamed from: ˋॱ, reason: contains not printable characters */
    private Integer f1052;

    @Override // com.moat.analytics.mobile.cha.d
    /* renamed from: ˋ */
    final String mo1024() {
        return "ReactiveVideoTracker";
    }

    public w(String str) {
        super(str);
        a.m994(3, "ReactiveVideoTracker", this, "Initializing.");
        a.m991("[SUCCESS] ", "ReactiveVideoTracker created");
    }

    @Override // com.moat.analytics.mobile.cha.b
    /* renamed from: ᐝ */
    final Map<String, Object> mo1011() throws o {
        HashMap hashMap = new HashMap();
        View view = this.f854.get();
        int i = 0;
        int i2 = 0;
        if (view != null) {
            i = Integer.valueOf(view.getWidth());
            i2 = Integer.valueOf(view.getHeight());
        }
        hashMap.put("duration", this.f1052);
        hashMap.put("width", i);
        hashMap.put("height", i2);
        return hashMap;
    }

    @Override // com.moat.analytics.mobile.cha.ReactiveVideoTracker
    public final boolean trackVideoAd(Map<String, String> map, Integer num, View view) {
        try {
            m1025();
            m1026();
            this.f1052 = num;
            return super.mo1009(map, view);
        } catch (Exception e) {
            m1028("trackVideoAd", e);
            return false;
        }
    }

    @Override // com.moat.analytics.mobile.cha.b
    /* renamed from: ˎ */
    final JSONObject mo1006(MoatAdEvent moatAdEvent) {
        if (moatAdEvent.f834 == MoatAdEventType.AD_EVT_COMPLETE && !moatAdEvent.f833.equals(MoatAdEvent.f829) && !m1001(moatAdEvent.f833, this.f1052)) {
            moatAdEvent.f834 = MoatAdEventType.AD_EVT_STOPPED;
        }
        return super.mo1006(moatAdEvent);
    }

    @Override // com.moat.analytics.mobile.cha.b, com.moat.analytics.mobile.cha.d
    /* renamed from: ˋ */
    final void mo1004(List<String> list) throws o {
        if (this.f1052.intValue() < 1000) {
            throw new o(String.format(Locale.ROOT, "Invalid duration = %d. Please make sure duration is in milliseconds.", this.f1052));
        }
        super.mo1004(list);
    }
}
