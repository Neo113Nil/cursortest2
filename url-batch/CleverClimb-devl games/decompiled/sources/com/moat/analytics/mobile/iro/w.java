package com.moat.analytics.mobile.iro;

import android.view.View;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class w extends d implements ReactiveVideoTracker {

    /* renamed from: ˏॱ, reason: contains not printable characters */
    private Integer f1255;

    @Override // com.moat.analytics.mobile.iro.c
    /* renamed from: ˊ */
    final String mo1190() {
        return "ReactiveVideoTracker";
    }

    public w(String str) {
        super(str);
        b.m1182(3, "ReactiveVideoTracker", this, "Initializing.");
        b.m1180("[SUCCESS] ", "ReactiveVideoTracker created");
    }

    @Override // com.moat.analytics.mobile.iro.d
    /* renamed from: ˊॱ */
    final Map<String, Object> mo1201() throws o {
        HashMap hashMap = new HashMap();
        View view = this.f1096.get();
        int i = 0;
        int i2 = 0;
        if (view != null) {
            i = Integer.valueOf(view.getWidth());
            i2 = Integer.valueOf(view.getHeight());
        }
        hashMap.put("duration", this.f1255);
        hashMap.put("width", i);
        hashMap.put("height", i2);
        return hashMap;
    }

    @Override // com.moat.analytics.mobile.iro.ReactiveVideoTracker
    public final boolean trackVideoAd(Map<String, String> map, Integer num, View view) {
        try {
            m1191();
            m1194();
            this.f1255 = num;
            return super.mo1203(map, view);
        } catch (Exception e) {
            m1196("trackVideoAd", e);
            return false;
        }
    }

    @Override // com.moat.analytics.mobile.iro.d
    /* renamed from: ˋ */
    final JSONObject mo1202(MoatAdEvent moatAdEvent) {
        if (moatAdEvent.f1060 == MoatAdEventType.AD_EVT_COMPLETE && !moatAdEvent.f1058.equals(MoatAdEvent.f1055) && !m1199(moatAdEvent.f1058, this.f1255)) {
            moatAdEvent.f1060 = MoatAdEventType.AD_EVT_STOPPED;
        }
        return super.mo1202(moatAdEvent);
    }

    @Override // com.moat.analytics.mobile.iro.d, com.moat.analytics.mobile.iro.c
    /* renamed from: ˏ */
    final void mo1195(List<String> list) throws o {
        if (this.f1255.intValue() < 1000) {
            throw new o(String.format(Locale.ROOT, "Invalid duration = %d. Please make sure duration is in milliseconds.", this.f1255));
        }
        super.mo1195(list);
    }
}
