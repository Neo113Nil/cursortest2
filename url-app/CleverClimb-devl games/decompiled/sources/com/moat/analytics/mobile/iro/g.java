package com.moat.analytics.mobile.iro;

import android.view.View;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
abstract class g extends d {

    /* renamed from: ˋॱ, reason: contains not printable characters */
    private int f1134;

    /* renamed from: ˏॱ, reason: contains not printable characters */
    private double f1135;

    /* renamed from: ͺ, reason: contains not printable characters */
    private int f1136;

    /* renamed from: ॱˊ, reason: contains not printable characters */
    private int f1137;

    /* renamed from: ॱˋ, reason: contains not printable characters */
    private int f1138;

    /* renamed from: ॱˎ, reason: contains not printable characters */
    private int f1139;

    /* renamed from: ʻॱ, reason: contains not printable characters */
    abstract Integer mo1238();

    /* renamed from: ˋॱ, reason: contains not printable characters */
    abstract Integer mo1240();

    /* renamed from: ॱˊ, reason: contains not printable characters */
    abstract boolean mo1241();

    /* renamed from: ॱˎ, reason: contains not printable characters */
    abstract boolean mo1242();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class a {

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final int f1141 = 3;

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final int f1142 = 4;

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final int f1143 = 1;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final int f1144 = 5;

        /* renamed from: ॱ, reason: contains not printable characters */
        public static final int f1145 = 2;

        static {
            int[] iArr = {1, 2, 3, 4, 5};
        }
    }

    g(String str) {
        super(str);
        this.f1134 = Integer.MIN_VALUE;
        this.f1138 = Integer.MIN_VALUE;
        this.f1136 = Integer.MIN_VALUE;
        this.f1139 = 0;
        this.f1137 = a.f1143;
        this.f1135 = Double.NaN;
    }

    @Override // com.moat.analytics.mobile.iro.d
    /* renamed from: ˋ */
    public final boolean mo1203(Map<String, String> map, View view) {
        try {
            boolean mo1203 = super.mo1203(map, view);
            if (!mo1203) {
                return mo1203;
            }
            this.f1097.postDelayed(new Runnable() { // from class: com.moat.analytics.mobile.iro.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (g.this.mo1241() && !g.this.m1205()) {
                            if (Boolean.valueOf(g.this.m1239()).booleanValue()) {
                                g.this.f1097.postDelayed(this, 200L);
                                return;
                            } else {
                                g.this.m1206();
                                return;
                            }
                        }
                        g.this.m1206();
                    } catch (Exception e) {
                        g.this.m1206();
                        o.m1290(e);
                    }
                }
            }, 200L);
            return mo1203;
        } catch (Exception e) {
            b.m1182(3, "IntervalVideoTracker", this, "Problem with video loop");
            m1196("trackVideoAd", e);
            return false;
        }
    }

    @Override // com.moat.analytics.mobile.iro.d, com.moat.analytics.mobile.iro.c
    public void stopTracking() {
        try {
            dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_COMPLETE));
            super.stopTracking();
        } catch (Exception e) {
            o.m1290(e);
        }
    }

    @Override // com.moat.analytics.mobile.iro.d
    public void setPlayerVolume(Double d2) {
        super.setPlayerVolume(d2);
        this.f1135 = m1207().doubleValue();
    }

    @Override // com.moat.analytics.mobile.iro.d
    /* renamed from: ˋ */
    final JSONObject mo1202(MoatAdEvent moatAdEvent) {
        Integer valueOf;
        if (!moatAdEvent.f1058.equals(MoatAdEvent.f1055)) {
            valueOf = moatAdEvent.f1058;
        } else {
            try {
                valueOf = mo1240();
            } catch (Exception unused) {
                valueOf = Integer.valueOf(this.f1136);
            }
            moatAdEvent.f1058 = valueOf;
        }
        if (moatAdEvent.f1058.intValue() < 0 || (moatAdEvent.f1058.intValue() == 0 && moatAdEvent.f1060 == MoatAdEventType.AD_EVT_COMPLETE && this.f1136 > 0)) {
            valueOf = Integer.valueOf(this.f1136);
            moatAdEvent.f1058 = valueOf;
        }
        if (moatAdEvent.f1060 == MoatAdEventType.AD_EVT_COMPLETE) {
            if (valueOf.intValue() == Integer.MIN_VALUE || this.f1138 == Integer.MIN_VALUE || !m1199(valueOf, Integer.valueOf(this.f1138))) {
                this.f1137 = a.f1142;
                moatAdEvent.f1060 = MoatAdEventType.AD_EVT_STOPPED;
            } else {
                this.f1137 = a.f1144;
            }
        }
        return super.mo1202(moatAdEvent);
    }

    /* renamed from: ʼॱ, reason: contains not printable characters */
    final boolean m1239() throws o {
        if (!mo1241() || m1205()) {
            return false;
        }
        try {
            int intValue = mo1240().intValue();
            if (this.f1136 >= 0 && intValue < 0) {
                return false;
            }
            this.f1136 = intValue;
            if (intValue == 0) {
                return true;
            }
            int intValue2 = mo1238().intValue();
            boolean mo1242 = mo1242();
            double d2 = intValue2;
            Double.isNaN(d2);
            double d3 = d2 / 4.0d;
            double doubleValue = m1207().doubleValue();
            MoatAdEventType moatAdEventType = null;
            if (intValue > this.f1134) {
                this.f1134 = intValue;
            }
            if (this.f1138 == Integer.MIN_VALUE) {
                this.f1138 = intValue2;
            }
            if (mo1242) {
                if (this.f1137 == a.f1143) {
                    moatAdEventType = MoatAdEventType.AD_EVT_START;
                    this.f1137 = a.f1141;
                } else if (this.f1137 == a.f1145) {
                    moatAdEventType = MoatAdEventType.AD_EVT_PLAYING;
                    this.f1137 = a.f1141;
                } else {
                    double d4 = intValue;
                    Double.isNaN(d4);
                    int floor = ((int) Math.floor(d4 / d3)) - 1;
                    if (floor >= 0 && floor < 3) {
                        MoatAdEventType moatAdEventType2 = f1094[floor];
                        if (!this.f1095.containsKey(moatAdEventType2)) {
                            this.f1095.put(moatAdEventType2, 1);
                            moatAdEventType = moatAdEventType2;
                        }
                    }
                }
            } else if (this.f1137 != a.f1145) {
                moatAdEventType = MoatAdEventType.AD_EVT_PAUSED;
                this.f1137 = a.f1145;
            }
            boolean z = moatAdEventType != null;
            if (!z && !Double.isNaN(this.f1135) && Math.abs(this.f1135 - doubleValue) > 0.05d) {
                moatAdEventType = MoatAdEventType.AD_EVT_VOLUME_CHANGE;
                z = true;
            }
            if (z) {
                dispatchEvent(new MoatAdEvent(moatAdEventType, Integer.valueOf(intValue), m1204()));
            }
            this.f1135 = doubleValue;
            this.f1139 = 0;
            return true;
        } catch (Exception unused) {
            int i = this.f1139;
            this.f1139 = i + 1;
            return i < 5;
        }
    }
}
