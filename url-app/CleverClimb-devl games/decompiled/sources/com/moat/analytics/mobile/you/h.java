package com.moat.analytics.mobile.you;

import android.view.View;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
abstract class h extends c {
    int l;
    private a m;
    private int n;
    private double o;
    private int p;
    private int q;

    enum a {
        UNINITIALIZED,
        PAUSED,
        PLAYING,
        STOPPED,
        COMPLETED
    }

    h(String str) {
        super(str);
        this.p = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.n = Integer.MIN_VALUE;
        this.q = 0;
        this.m = a.UNINITIALIZED;
        this.o = Double.NaN;
    }

    private void t() {
        this.i.postDelayed(new Runnable() { // from class: com.moat.analytics.mobile.you.h.1
            @Override // java.lang.Runnable
            public void run() {
                h hVar;
                try {
                    if (!h.this.n() || h.this.m()) {
                        hVar = h.this;
                    } else {
                        if (Boolean.valueOf(h.this.s()).booleanValue()) {
                            h.this.i.postDelayed(this, 200L);
                            return;
                        }
                        hVar = h.this;
                    }
                    hVar.l();
                } catch (Exception e) {
                    h.this.l();
                    m.a(e);
                }
            }
        }, 200L);
    }

    @Override // com.moat.analytics.mobile.you.c
    JSONObject a(MoatAdEvent moatAdEvent) {
        Integer valueOf;
        if (moatAdEvent.f7442b.equals(MoatAdEvent.f7441a)) {
            try {
                valueOf = o();
            } catch (Exception unused) {
                valueOf = Integer.valueOf(this.n);
            }
            moatAdEvent.f7442b = valueOf;
        } else {
            valueOf = moatAdEvent.f7442b;
        }
        if (moatAdEvent.f7442b.intValue() < 0 || (moatAdEvent.f7442b.intValue() == 0 && moatAdEvent.f7444d == MoatAdEventType.AD_EVT_COMPLETE && this.n > 0)) {
            valueOf = Integer.valueOf(this.n);
            moatAdEvent.f7442b = valueOf;
        }
        if (moatAdEvent.f7444d == MoatAdEventType.AD_EVT_COMPLETE) {
            if (valueOf.intValue() == Integer.MIN_VALUE || this.l == Integer.MIN_VALUE || !a(valueOf, Integer.valueOf(this.l))) {
                this.m = a.STOPPED;
                moatAdEvent.f7444d = MoatAdEventType.AD_EVT_STOPPED;
            } else {
                this.m = a.COMPLETED;
            }
        }
        return super.a(moatAdEvent);
    }

    @Override // com.moat.analytics.mobile.you.c
    public boolean a(Map<String, String> map, View view) {
        try {
            boolean a2 = super.a(map, view);
            if (!a2 || !p()) {
                return a2;
            }
            t();
            return a2;
        } catch (Exception e) {
            p.a(3, "IntervalVideoTracker", this, "Problem with video loop");
            a("trackVideoAd", e);
            return false;
        }
    }

    abstract boolean n();

    abstract Integer o();

    protected boolean p() {
        return true;
    }

    abstract boolean q();

    abstract Integer r();

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:7:0x0010, B:12:0x001f, B:15:0x0024, B:17:0x0037, B:19:0x0044, B:20:0x0046, B:22:0x004c, B:24:0x0050, B:26:0x0056, B:27:0x0058, B:28:0x005a, B:32:0x00a0, B:34:0x00a8, B:36:0x00b9, B:38:0x00be, B:39:0x00ce, B:43:0x005d, B:45:0x0063, B:47:0x006b, B:51:0x0077, B:53:0x0083, B:54:0x008e, B:56:0x0094), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:7:0x0010, B:12:0x001f, B:15:0x0024, B:17:0x0037, B:19:0x0044, B:20:0x0046, B:22:0x004c, B:24:0x0050, B:26:0x0056, B:27:0x0058, B:28:0x005a, B:32:0x00a0, B:34:0x00a8, B:36:0x00b9, B:38:0x00be, B:39:0x00ce, B:43:0x005d, B:45:0x0063, B:47:0x006b, B:51:0x0077, B:53:0x0083, B:54:0x008e, B:56:0x0094), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean s() {
        int intValue;
        a aVar;
        boolean z;
        if (!n() || m()) {
            return false;
        }
        try {
            intValue = o().intValue();
        } catch (Exception unused) {
            int i = this.q;
            this.q = i + 1;
            if (i >= 5) {
            }
        }
        if (this.n >= 0 && intValue < 0) {
            return false;
        }
        this.n = intValue;
        if (intValue == 0) {
            return true;
        }
        int intValue2 = r().intValue();
        boolean q = q();
        double d2 = intValue2;
        Double.isNaN(d2);
        double d3 = d2 / 4.0d;
        double doubleValue = j().doubleValue();
        MoatAdEventType moatAdEventType = null;
        if (intValue > this.p) {
            this.p = intValue;
        }
        if (this.l == Integer.MIN_VALUE) {
            this.l = intValue2;
        }
        if (!q) {
            if (this.m != a.PAUSED) {
                moatAdEventType = MoatAdEventType.AD_EVT_PAUSED;
                aVar = a.PAUSED;
                this.m = aVar;
            }
            if (moatAdEventType != null) {
            }
            if (!z) {
            }
            if (z) {
            }
            this.o = doubleValue;
            this.q = 0;
            return true;
        }
        if (this.m == a.UNINITIALIZED) {
            moatAdEventType = MoatAdEventType.AD_EVT_START;
        } else {
            if (this.m != a.PAUSED) {
                double d4 = intValue;
                Double.isNaN(d4);
                int floor = ((int) Math.floor(d4 / d3)) - 1;
                if (floor > -1 && floor < 3) {
                    MoatAdEventType moatAdEventType2 = g[floor];
                    if (!this.h.containsKey(moatAdEventType2)) {
                        this.h.put(moatAdEventType2, 1);
                        moatAdEventType = moatAdEventType2;
                    }
                }
                z = moatAdEventType != null;
                if (!z && !Double.isNaN(this.o) && Math.abs(this.o - doubleValue) > 0.05d) {
                    moatAdEventType = MoatAdEventType.AD_EVT_VOLUME_CHANGE;
                    z = true;
                }
                if (z) {
                    dispatchEvent(new MoatAdEvent(moatAdEventType, Integer.valueOf(intValue), k()));
                }
                this.o = doubleValue;
                this.q = 0;
                return true;
            }
            moatAdEventType = MoatAdEventType.AD_EVT_PLAYING;
        }
        aVar = a.PLAYING;
        this.m = aVar;
        if (moatAdEventType != null) {
        }
        if (!z) {
            moatAdEventType = MoatAdEventType.AD_EVT_VOLUME_CHANGE;
            z = true;
        }
        if (z) {
        }
        this.o = doubleValue;
        this.q = 0;
        return true;
        int i2 = this.q;
        this.q = i2 + 1;
        return i2 >= 5;
    }

    @Override // com.moat.analytics.mobile.you.c
    public void setPlayerVolume(Double d2) {
        super.setPlayerVolume(d2);
        this.o = j().doubleValue();
    }

    @Override // com.moat.analytics.mobile.you.c, com.moat.analytics.mobile.you.b
    public void stopTracking() {
        try {
            dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_COMPLETE));
            super.stopTracking();
        } catch (Exception e) {
            m.a(e);
        }
    }
}
