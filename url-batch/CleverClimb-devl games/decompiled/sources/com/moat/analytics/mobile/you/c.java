package com.moat.analytics.mobile.you;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.moat.analytics.mobile.you.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
abstract class c extends b {
    static final MoatAdEventType[] g = {MoatAdEventType.AD_EVT_FIRST_QUARTILE, MoatAdEventType.AD_EVT_MID_POINT, MoatAdEventType.AD_EVT_THIRD_QUARTILE};
    final Map<MoatAdEventType, Integer> h;
    final Handler i;
    Map<String, String> j;
    WeakReference<View> k;
    private final Set<MoatAdEventType> l;
    private VideoTrackerListener m;
    private boolean n;
    private Double o;
    private final g p;
    private final String q;

    c(String str) {
        super(null, false, true);
        p.a(3, "BaseVideoTracker", this, "Initializing.");
        this.q = str;
        this.p = new g(a.a(), g.a.VIDEO);
        super.a(this.p.f7465b);
        try {
            super.a(this.p.f7464a);
        } catch (m e) {
            this.f7457a = e;
        }
        this.h = new HashMap();
        this.l = new HashSet();
        this.i = new Handler();
        this.n = false;
        this.o = Double.valueOf(1.0d);
    }

    private static boolean a(MoatAdEventType moatAdEventType) {
        return moatAdEventType == MoatAdEventType.AD_EVT_COMPLETE || moatAdEventType == MoatAdEventType.AD_EVT_STOPPED || moatAdEventType == MoatAdEventType.AD_EVT_SKIPPED;
    }

    private void b(MoatAdEvent moatAdEvent) {
        JSONObject a2 = a(moatAdEvent);
        p.a(3, "BaseVideoTracker", this, String.format("Received event: %s", a2.toString()));
        p.a("[SUCCESS] ", a() + String.format(" Received event: %s", a2.toString()));
        if (e() && this.f7459c != null) {
            this.f7459c.a(this.p.f7466c, a2);
            if (!this.l.contains(moatAdEvent.f7444d)) {
                this.l.add(moatAdEvent.f7444d);
                if (this.m != null) {
                    this.m.onVideoEventReported(moatAdEvent.f7444d);
                }
            }
        }
        MoatAdEventType moatAdEventType = moatAdEvent.f7444d;
        if (a(moatAdEventType)) {
            this.h.put(moatAdEventType, 1);
            if (this.f7459c != null) {
                this.f7459c.c(this);
            }
            l();
        }
    }

    JSONObject a(MoatAdEvent moatAdEvent) {
        if (Double.isNaN(moatAdEvent.f7443c.doubleValue())) {
            moatAdEvent.f7443c = this.o;
        }
        return new JSONObject(moatAdEvent.a());
    }

    @Override // com.moat.analytics.mobile.you.b
    void a(List<String> list) {
        if (this.j == null) {
            list.add("Null adIds object");
        }
        if (!list.isEmpty()) {
            throw new m(TextUtils.join(" and ", list));
        }
        super.a(list);
    }

    boolean a(Integer num, Integer num2) {
        int abs = Math.abs(num2.intValue() - num.intValue());
        double intValue = num2.intValue();
        Double.isNaN(intValue);
        return ((double) abs) <= Math.min(750.0d, intValue * 0.05d);
    }

    public boolean a(Map<String, String> map, View view) {
        try {
            c();
            d();
            if (view == null) {
                p.a(3, "BaseVideoTracker", this, "trackVideoAd received null video view instance");
            }
            this.j = map;
            this.k = new WeakReference<>(view);
            b();
            String format = String.format("trackVideoAd tracking ids: %s | view: %s", new JSONObject(map).toString(), p.a(view));
            p.a(3, "BaseVideoTracker", this, format);
            p.a("[SUCCESS] ", a() + " " + format);
            if (this.f7460d != null) {
                this.f7460d.onTrackingStarted(g());
            }
            return true;
        } catch (Exception e) {
            a("trackVideoAd", e);
            return false;
        }
    }

    @Override // com.moat.analytics.mobile.you.b
    void b() {
        super.changeTargetView(this.k.get());
        super.b();
        Map<String, Object> i = i();
        Integer num = (Integer) i.get("width");
        Integer num2 = (Integer) i.get("height");
        Integer num3 = (Integer) i.get("duration");
        p.a(3, "BaseVideoTracker", this, String.format(Locale.ROOT, "Player metadata: height = %d, width = %d, duration = %d", num2, num, num3));
        this.p.a(this.q, this.j, num, num2, num3);
    }

    @Override // com.moat.analytics.mobile.you.b
    public void changeTargetView(View view) {
        p.a(3, "BaseVideoTracker", this, "changing view to " + p.a(view));
        this.k = new WeakReference<>(view);
        try {
            super.changeTargetView(view);
        } catch (Exception e) {
            m.a(e);
        }
    }

    public void dispatchEvent(MoatAdEvent moatAdEvent) {
        try {
            b(moatAdEvent);
        } catch (Exception e) {
            m.a(e);
        }
    }

    abstract Map<String, Object> i();

    Double j() {
        return Double.valueOf(k().doubleValue() * s.a());
    }

    Double k() {
        return this.o;
    }

    void l() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.i.postDelayed(new Runnable() { // from class: com.moat.analytics.mobile.you.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    p.a(3, "BaseVideoTracker", this, "Shutting down.");
                    c.this.p.a();
                    c.this.m = null;
                } catch (Exception e) {
                    m.a(e);
                }
            }
        }, 500L);
    }

    boolean m() {
        return this.h.containsKey(MoatAdEventType.AD_EVT_COMPLETE) || this.h.containsKey(MoatAdEventType.AD_EVT_STOPPED) || this.h.containsKey(MoatAdEventType.AD_EVT_SKIPPED);
    }

    public void removeVideoListener() {
        this.m = null;
    }

    public void setPlayerVolume(Double d2) {
        Double j = j();
        if (d2.equals(this.o)) {
            return;
        }
        p.a(3, "BaseVideoTracker", this, String.format(Locale.ROOT, "player volume changed to %f ", d2));
        this.o = d2;
        if (j.equals(j())) {
            return;
        }
        dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_VOLUME_CHANGE, MoatAdEvent.f7441a, this.o));
    }

    public void setVideoListener(VideoTrackerListener videoTrackerListener) {
        this.m = videoTrackerListener;
    }

    @Override // com.moat.analytics.mobile.you.b
    public void stopTracking() {
        try {
            super.stopTracking();
            l();
            if (this.m != null) {
                this.m = null;
            }
        } catch (Exception e) {
            m.a(e);
        }
    }
}
