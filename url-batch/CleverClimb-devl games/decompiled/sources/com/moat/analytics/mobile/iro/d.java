package com.moat.analytics.mobile.iro;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.moat.analytics.mobile.iro.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
abstract class d extends c {

    /* renamed from: ʽ, reason: contains not printable characters */
    static final MoatAdEventType[] f1094 = {MoatAdEventType.AD_EVT_FIRST_QUARTILE, MoatAdEventType.AD_EVT_MID_POINT, MoatAdEventType.AD_EVT_THIRD_QUARTILE};

    /* renamed from: ʻ, reason: contains not printable characters */
    final Map<MoatAdEventType, Integer> f1095;

    /* renamed from: ʼ, reason: contains not printable characters */
    WeakReference<View> f1096;

    /* renamed from: ˊॱ, reason: contains not printable characters */
    final Handler f1097;

    /* renamed from: ˋॱ, reason: contains not printable characters */
    private Double f1098;

    /* renamed from: ˏॱ, reason: contains not printable characters */
    private Map<String, String> f1099;

    /* renamed from: ͺ, reason: contains not printable characters */
    private boolean f1100;

    /* renamed from: ॱˊ, reason: contains not printable characters */
    private VideoTrackerListener f1101;

    /* renamed from: ॱˋ, reason: contains not printable characters */
    private final Set<MoatAdEventType> f1102;

    /* renamed from: ॱˎ, reason: contains not printable characters */
    private final String f1103;

    /* renamed from: ᐝॱ, reason: contains not printable characters */
    private final b f1104;

    /* renamed from: ˊॱ, reason: contains not printable characters */
    abstract Map<String, Object> mo1201() throws o;

    /* renamed from: ˋ, reason: contains not printable characters */
    static /* synthetic */ VideoTrackerListener m1198(d dVar) {
        dVar.f1101 = null;
        return null;
    }

    d(String str) {
        super(null, false, true);
        b.m1182(3, "BaseVideoTracker", this, "Initializing.");
        this.f1103 = str;
        this.f1104 = new b(a.m1173(), b.a.f1079);
        this.f1090 = this.f1104.f1073;
        try {
            super.m1192(this.f1104.f1075);
        } catch (o e) {
            this.f1088 = e;
        }
        this.f1095 = new HashMap();
        this.f1102 = new HashSet();
        this.f1097 = new Handler();
        this.f1100 = false;
        this.f1098 = Double.valueOf(1.0d);
    }

    public void setVideoListener(VideoTrackerListener videoTrackerListener) {
        this.f1101 = videoTrackerListener;
    }

    public void removeVideoListener() {
        this.f1101 = null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean mo1203(Map<String, String> map, View view) {
        try {
            m1191();
            m1194();
            if (view == null) {
                b.m1182(3, "BaseVideoTracker", this, "trackVideoAd received null video view instance");
            }
            this.f1099 = map;
            this.f1096 = new WeakReference<>(view);
            mo1193();
            String format = String.format("trackVideoAd tracking ids: %s | view: %s", new JSONObject(map).toString(), b.m1184(view));
            b.m1182(3, "BaseVideoTracker", this, format);
            b.m1180("[SUCCESS] ", mo1190() + " " + format);
            if (this.f1086 != null) {
                this.f1086.onTrackingStarted(m1189());
            }
            return true;
        } catch (Exception e) {
            m1196("trackVideoAd", e);
            return false;
        }
    }

    @Override // com.moat.analytics.mobile.iro.c
    public void changeTargetView(View view) {
        b.m1182(3, "BaseVideoTracker", this, "changing view to " + b.m1184(view));
        this.f1096 = new WeakReference<>(view);
        try {
            super.changeTargetView(view);
        } catch (Exception e) {
            o.m1290(e);
        }
    }

    @Override // com.moat.analytics.mobile.iro.c
    /* renamed from: ˏ */
    void mo1195(List<String> list) throws o {
        if (this.f1099 == null) {
            list.add("Null adIds object");
        }
        if (!list.isEmpty()) {
            throw new o(TextUtils.join(" and ", list));
        }
        super.mo1195(list);
    }

    @Override // com.moat.analytics.mobile.iro.c
    public void stopTracking() {
        try {
            super.stopTracking();
            m1206();
            if (this.f1101 != null) {
                this.f1101 = null;
            }
        } catch (Exception e) {
            o.m1290(e);
        }
    }

    /* renamed from: ˏॱ, reason: contains not printable characters */
    final Double m1204() {
        return this.f1098;
    }

    @Override // com.moat.analytics.mobile.iro.c
    /* renamed from: ˎ */
    final void mo1193() throws o {
        super.changeTargetView(this.f1096.get());
        super.mo1193();
        Map<String, Object> mo1201 = mo1201();
        Integer num = (Integer) mo1201.get("width");
        Integer num2 = (Integer) mo1201.get("height");
        Integer num3 = (Integer) mo1201.get("duration");
        b.m1182(3, "BaseVideoTracker", this, String.format(Locale.ROOT, "Player metadata: height = %d, width = %d, duration = %d", num2, num, num3));
        this.f1104.m1186(this.f1103, this.f1099, num, num2, num3);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    JSONObject mo1202(MoatAdEvent moatAdEvent) {
        if (Double.isNaN(moatAdEvent.f1059.doubleValue())) {
            moatAdEvent.f1059 = this.f1098;
        }
        return new JSONObject(moatAdEvent.m1167());
    }

    /* renamed from: ॱˋ, reason: contains not printable characters */
    final void m1206() {
        if (this.f1100) {
            return;
        }
        this.f1100 = true;
        this.f1097.postDelayed(new Runnable() { // from class: com.moat.analytics.mobile.iro.d.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    b.m1182(3, "BaseVideoTracker", this, "Shutting down.");
                    b bVar = d.this.f1104;
                    b.m1182(3, "GlobalWebView", bVar, "Cleaning up");
                    bVar.f1073.m1229();
                    bVar.f1073 = null;
                    bVar.f1075.destroy();
                    bVar.f1075 = null;
                    d.m1198(d.this);
                } catch (Exception e) {
                    o.m1290(e);
                }
            }
        }, 500L);
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    final boolean m1205() {
        return this.f1095.containsKey(MoatAdEventType.AD_EVT_COMPLETE) || this.f1095.containsKey(MoatAdEventType.AD_EVT_STOPPED) || this.f1095.containsKey(MoatAdEventType.AD_EVT_SKIPPED);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static boolean m1199(Integer num, Integer num2) {
        int abs = Math.abs(num2.intValue() - num.intValue());
        double intValue = num2.intValue();
        Double.isNaN(intValue);
        return ((double) abs) <= Math.min(750.0d, intValue * 0.05d);
    }

    public void setPlayerVolume(Double d2) {
        Double valueOf = Double.valueOf(this.f1098.doubleValue() * p.m1301());
        if (d2.equals(this.f1098)) {
            return;
        }
        b.m1182(3, "BaseVideoTracker", this, String.format(Locale.ROOT, "player volume changed to %f ", d2));
        this.f1098 = d2;
        if (valueOf.equals(Double.valueOf(this.f1098.doubleValue() * p.m1301()))) {
            return;
        }
        dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_VOLUME_CHANGE, MoatAdEvent.f1055, this.f1098));
    }

    public void dispatchEvent(MoatAdEvent moatAdEvent) {
        try {
            JSONObject mo1202 = mo1202(moatAdEvent);
            b.m1182(3, "BaseVideoTracker", this, String.format("Received event: %s", mo1202.toString()));
            b.m1180("[SUCCESS] ", mo1190() + String.format(" Received event: %s", mo1202.toString()));
            if (m1197() && this.f1090 != null) {
                this.f1090.m1231(this.f1104.f1072, mo1202);
                if (!this.f1102.contains(moatAdEvent.f1060)) {
                    this.f1102.add(moatAdEvent.f1060);
                    if (this.f1101 != null) {
                        this.f1101.onVideoEventReported(moatAdEvent.f1060);
                    }
                }
            }
            MoatAdEventType moatAdEventType = moatAdEvent.f1060;
            if (moatAdEventType == MoatAdEventType.AD_EVT_COMPLETE || moatAdEventType == MoatAdEventType.AD_EVT_STOPPED || moatAdEventType == MoatAdEventType.AD_EVT_SKIPPED) {
                this.f1095.put(moatAdEventType, 1);
                if (this.f1090 != null) {
                    this.f1090.m1234(this);
                }
                m1206();
            }
        } catch (Exception e) {
            o.m1290(e);
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    final Double m1207() {
        return Double.valueOf(this.f1098.doubleValue() * p.m1301());
    }
}
