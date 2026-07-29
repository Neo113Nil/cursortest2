package com.moat.analytics.mobile.cha;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.moat.analytics.mobile.cha.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
abstract class b extends d {

    /* renamed from: ʻ, reason: contains not printable characters */
    static final MoatAdEventType[] f851 = {MoatAdEventType.AD_EVT_FIRST_QUARTILE, MoatAdEventType.AD_EVT_MID_POINT, MoatAdEventType.AD_EVT_THIRD_QUARTILE};

    /* renamed from: ʼ, reason: contains not printable characters */
    final Map<MoatAdEventType, Integer> f852;

    /* renamed from: ʼॱ, reason: contains not printable characters */
    private final String f853;

    /* renamed from: ˊॱ, reason: contains not printable characters */
    WeakReference<View> f854;

    /* renamed from: ˋॱ, reason: contains not printable characters */
    private boolean f855;

    /* renamed from: ˏॱ, reason: contains not printable characters */
    private Map<String, String> f856;

    /* renamed from: ͺ, reason: contains not printable characters */
    private Double f857;

    /* renamed from: ॱˊ, reason: contains not printable characters */
    private VideoTrackerListener f858;

    /* renamed from: ॱˋ, reason: contains not printable characters */
    private final Set<MoatAdEventType> f859;

    /* renamed from: ॱˎ, reason: contains not printable characters */
    private final a f860;

    /* renamed from: ᐝ, reason: contains not printable characters */
    final Handler f861;

    /* renamed from: ᐝ, reason: contains not printable characters */
    abstract Map<String, Object> mo1011() throws o;

    /* renamed from: ˏ, reason: contains not printable characters */
    static /* synthetic */ VideoTrackerListener m1002(b bVar) {
        bVar.f858 = null;
        return null;
    }

    b(String str) {
        super(null, false, true);
        a.m994(3, "BaseVideoTracker", this, "Initializing.");
        this.f853 = str;
        this.f860 = new a(c.m1015(), a.d.f849);
        this.f876 = this.f860.f845;
        try {
            super.m1027(this.f860.f843);
        } catch (o e) {
            this.f879 = e;
        }
        this.f852 = new HashMap();
        this.f859 = new HashSet();
        this.f861 = new Handler();
        this.f855 = false;
        this.f857 = Double.valueOf(1.0d);
    }

    public void setVideoListener(VideoTrackerListener videoTrackerListener) {
        this.f858 = videoTrackerListener;
    }

    public void removeVideoListener() {
        this.f858 = null;
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    public boolean mo1009(Map<String, String> map, View view) {
        try {
            m1025();
            m1026();
            if (view == null) {
                a.m994(3, "BaseVideoTracker", this, "trackVideoAd received null video view instance");
            }
            this.f856 = map;
            this.f854 = new WeakReference<>(view);
            mo1007();
            String format = String.format("trackVideoAd tracking ids: %s | view: %s", new JSONObject(map).toString(), a.m993(view));
            a.m994(3, "BaseVideoTracker", this, format);
            a.m991("[SUCCESS] ", mo1024() + " " + format);
            if (this.f873 != null) {
                this.f873.onTrackingStarted(m1020());
            }
            return true;
        } catch (Exception e) {
            m1028("trackVideoAd", e);
            return false;
        }
    }

    @Override // com.moat.analytics.mobile.cha.d
    public void changeTargetView(View view) {
        a.m994(3, "BaseVideoTracker", this, "changing view to " + a.m993(view));
        this.f854 = new WeakReference<>(view);
        try {
            super.changeTargetView(view);
        } catch (Exception e) {
            o.m1110(e);
        }
    }

    @Override // com.moat.analytics.mobile.cha.d
    /* renamed from: ˋ, reason: contains not printable characters */
    void mo1004(List<String> list) throws o {
        if (this.f856 == null) {
            list.add("Null adIds object");
        }
        if (!list.isEmpty()) {
            throw new o(TextUtils.join(" and ", list));
        }
        super.mo1004(list);
    }

    @Override // com.moat.analytics.mobile.cha.d
    public void stopTracking() {
        try {
            super.stopTracking();
            m1008();
            if (this.f858 != null) {
                this.f858 = null;
            }
        } catch (Exception e) {
            o.m1110(e);
        }
    }

    /* renamed from: ॱˊ, reason: contains not printable characters */
    final Double m1010() {
        return this.f857;
    }

    @Override // com.moat.analytics.mobile.cha.d
    /* renamed from: ˏ, reason: contains not printable characters */
    final void mo1007() throws o {
        super.changeTargetView(this.f854.get());
        super.mo1007();
        Map<String, Object> mo1011 = mo1011();
        Integer num = (Integer) mo1011.get("width");
        Integer num2 = (Integer) mo1011.get("height");
        Integer num3 = (Integer) mo1011.get("duration");
        a.m994(3, "BaseVideoTracker", this, String.format(Locale.ROOT, "Player metadata: height = %d, width = %d, duration = %d", num2, num, num3));
        this.f860.m999(this.f853, this.f856, num, num2, num3);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    JSONObject mo1006(MoatAdEvent moatAdEvent) {
        if (Double.isNaN(moatAdEvent.f832.doubleValue())) {
            moatAdEvent.f832 = this.f857;
        }
        return new JSONObject(moatAdEvent.m988());
    }

    /* renamed from: ˏॱ, reason: contains not printable characters */
    final void m1008() {
        if (this.f855) {
            return;
        }
        this.f855 = true;
        this.f861.postDelayed(new Runnable() { // from class: com.moat.analytics.mobile.cha.b.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.m994(3, "BaseVideoTracker", this, "Shutting down.");
                    a aVar = b.this.f860;
                    a.m994(3, "GlobalWebView", aVar, "Cleaning up");
                    aVar.f845.m1078();
                    aVar.f845 = null;
                    aVar.f843.destroy();
                    aVar.f843 = null;
                    b.m1002(b.this);
                } catch (Exception e) {
                    o.m1110(e);
                }
            }
        }, 500L);
    }

    /* renamed from: ˋॱ, reason: contains not printable characters */
    final boolean m1005() {
        return this.f852.containsKey(MoatAdEventType.AD_EVT_COMPLETE) || this.f852.containsKey(MoatAdEventType.AD_EVT_STOPPED) || this.f852.containsKey(MoatAdEventType.AD_EVT_SKIPPED);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static boolean m1001(Integer num, Integer num2) {
        int abs = Math.abs(num2.intValue() - num.intValue());
        double intValue = num2.intValue();
        Double.isNaN(intValue);
        return ((double) abs) <= Math.min(750.0d, intValue * 0.05d);
    }

    public void setPlayerVolume(Double d2) {
        Double valueOf = Double.valueOf(this.f857.doubleValue() * r.m1131());
        if (d2.equals(this.f857)) {
            return;
        }
        a.m994(3, "BaseVideoTracker", this, String.format(Locale.ROOT, "player volume changed to %f ", d2));
        this.f857 = d2;
        if (valueOf.equals(Double.valueOf(this.f857.doubleValue() * r.m1131()))) {
            return;
        }
        dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_VOLUME_CHANGE, MoatAdEvent.f829, this.f857));
    }

    public void dispatchEvent(MoatAdEvent moatAdEvent) {
        try {
            JSONObject mo1006 = mo1006(moatAdEvent);
            a.m994(3, "BaseVideoTracker", this, String.format("Received event: %s", mo1006.toString()));
            a.m991("[SUCCESS] ", mo1024() + String.format(" Received event: %s", mo1006.toString()));
            if (m1023() && this.f876 != null) {
                this.f876.m1086(this.f860.f842, mo1006);
                if (!this.f859.contains(moatAdEvent.f834)) {
                    this.f859.add(moatAdEvent.f834);
                    if (this.f858 != null) {
                        this.f858.onVideoEventReported(moatAdEvent.f834);
                    }
                }
            }
            MoatAdEventType moatAdEventType = moatAdEvent.f834;
            if (moatAdEventType == MoatAdEventType.AD_EVT_COMPLETE || moatAdEventType == MoatAdEventType.AD_EVT_STOPPED || moatAdEventType == MoatAdEventType.AD_EVT_SKIPPED) {
                this.f852.put(moatAdEventType, 1);
                if (this.f876 != null) {
                    this.f876.m1080(this);
                }
                m1008();
            }
        } catch (Exception e) {
            o.m1110(e);
        }
    }

    /* renamed from: ˊॱ, reason: contains not printable characters */
    final Double m1003() {
        return Double.valueOf(this.f857.doubleValue() * r.m1131());
    }
}
