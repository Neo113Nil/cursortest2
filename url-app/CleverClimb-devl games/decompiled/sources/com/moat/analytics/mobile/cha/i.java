package com.moat.analytics.mobile.cha;

import android.view.View;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
abstract class i extends b {

    /* renamed from: ˋॱ, reason: contains not printable characters */
    private int f912;

    /* renamed from: ˏॱ, reason: contains not printable characters */
    private int f913;

    /* renamed from: ͺ, reason: contains not printable characters */
    private int f914;

    /* renamed from: ॱˊ, reason: contains not printable characters */
    private double f915;

    /* renamed from: ॱˋ, reason: contains not printable characters */
    private int f916;

    /* renamed from: ॱˎ, reason: contains not printable characters */
    private int f917;

    /* renamed from: ͺ, reason: contains not printable characters */
    abstract boolean mo1054();

    /* renamed from: ॱˋ, reason: contains not printable characters */
    abstract Integer mo1055();

    /* renamed from: ॱˎ, reason: contains not printable characters */
    abstract boolean mo1056();

    /* renamed from: ॱᐝ, reason: contains not printable characters */
    abstract Integer mo1057();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class c {

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final int f919 = 2;

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final int f920 = 4;

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final int f921 = 3;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final int f922 = 1;

        /* renamed from: ॱ, reason: contains not printable characters */
        public static final int f923 = 5;

        static {
            int[] iArr = {1, 2, 3, 4, 5};
        }
    }

    i(String str) {
        super(str);
        this.f916 = Integer.MIN_VALUE;
        this.f914 = Integer.MIN_VALUE;
        this.f913 = Integer.MIN_VALUE;
        this.f917 = 0;
        this.f912 = c.f922;
        this.f915 = Double.NaN;
    }

    @Override // com.moat.analytics.mobile.cha.b
    /* renamed from: ॱ */
    public final boolean mo1009(Map<String, String> map, View view) {
        try {
            boolean mo1009 = super.mo1009(map, view);
            if (!mo1009) {
                return mo1009;
            }
            this.f861.postDelayed(new Runnable() { // from class: com.moat.analytics.mobile.cha.i.5
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (i.this.mo1054() && !i.this.m1005()) {
                            if (Boolean.valueOf(i.this.m1053()).booleanValue()) {
                                i.this.f861.postDelayed(this, 200L);
                                return;
                            } else {
                                i.this.m1008();
                                return;
                            }
                        }
                        i.this.m1008();
                    } catch (Exception e) {
                        i.this.m1008();
                        o.m1110(e);
                    }
                }
            }, 200L);
            return mo1009;
        } catch (Exception e) {
            a.m994(3, "IntervalVideoTracker", this, "Problem with video loop");
            m1028("trackVideoAd", e);
            return false;
        }
    }

    @Override // com.moat.analytics.mobile.cha.b, com.moat.analytics.mobile.cha.d
    public void stopTracking() {
        try {
            dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_COMPLETE));
            super.stopTracking();
        } catch (Exception e) {
            o.m1110(e);
        }
    }

    @Override // com.moat.analytics.mobile.cha.b
    public void setPlayerVolume(Double d2) {
        super.setPlayerVolume(d2);
        this.f915 = m1003().doubleValue();
    }

    @Override // com.moat.analytics.mobile.cha.b
    /* renamed from: ˎ */
    final JSONObject mo1006(MoatAdEvent moatAdEvent) {
        Integer valueOf;
        if (!moatAdEvent.f833.equals(MoatAdEvent.f829)) {
            valueOf = moatAdEvent.f833;
        } else {
            try {
                valueOf = mo1055();
            } catch (Exception unused) {
                valueOf = Integer.valueOf(this.f913);
            }
            moatAdEvent.f833 = valueOf;
        }
        if (moatAdEvent.f833.intValue() < 0 || (moatAdEvent.f833.intValue() == 0 && moatAdEvent.f834 == MoatAdEventType.AD_EVT_COMPLETE && this.f913 > 0)) {
            valueOf = Integer.valueOf(this.f913);
            moatAdEvent.f833 = valueOf;
        }
        if (moatAdEvent.f834 == MoatAdEventType.AD_EVT_COMPLETE) {
            if (valueOf.intValue() == Integer.MIN_VALUE || this.f914 == Integer.MIN_VALUE || !m1001(valueOf, Integer.valueOf(this.f914))) {
                this.f912 = c.f920;
                moatAdEvent.f834 = MoatAdEventType.AD_EVT_STOPPED;
            } else {
                this.f912 = c.f923;
            }
        }
        return super.mo1006(moatAdEvent);
    }

    /* renamed from: ʻॱ, reason: contains not printable characters */
    final boolean m1053() throws o {
        if (!mo1054() || m1005()) {
            return false;
        }
        try {
            int intValue = mo1055().intValue();
            if (this.f913 >= 0 && intValue < 0) {
                return false;
            }
            this.f913 = intValue;
            if (intValue == 0) {
                return true;
            }
            int intValue2 = mo1057().intValue();
            boolean mo1056 = mo1056();
            double d2 = intValue2;
            Double.isNaN(d2);
            double d3 = d2 / 4.0d;
            double doubleValue = m1003().doubleValue();
            MoatAdEventType moatAdEventType = null;
            if (intValue > this.f916) {
                this.f916 = intValue;
            }
            if (this.f914 == Integer.MIN_VALUE) {
                this.f914 = intValue2;
            }
            if (mo1056) {
                if (this.f912 == c.f922) {
                    moatAdEventType = MoatAdEventType.AD_EVT_START;
                    this.f912 = c.f921;
                } else if (this.f912 == c.f919) {
                    moatAdEventType = MoatAdEventType.AD_EVT_PLAYING;
                    this.f912 = c.f921;
                } else {
                    double d4 = intValue;
                    Double.isNaN(d4);
                    int floor = ((int) Math.floor(d4 / d3)) - 1;
                    if (floor >= 0 && floor < 3) {
                        MoatAdEventType moatAdEventType2 = f851[floor];
                        if (!this.f852.containsKey(moatAdEventType2)) {
                            this.f852.put(moatAdEventType2, 1);
                            moatAdEventType = moatAdEventType2;
                        }
                    }
                }
            } else if (this.f912 != c.f919) {
                moatAdEventType = MoatAdEventType.AD_EVT_PAUSED;
                this.f912 = c.f919;
            }
            boolean z = moatAdEventType != null;
            if (!z && !Double.isNaN(this.f915) && Math.abs(this.f915 - doubleValue) > 0.05d) {
                moatAdEventType = MoatAdEventType.AD_EVT_VOLUME_CHANGE;
                z = true;
            }
            if (z) {
                dispatchEvent(new MoatAdEvent(moatAdEventType, Integer.valueOf(intValue), m1010()));
            }
            this.f915 = doubleValue;
            this.f917 = 0;
            return true;
        } catch (Exception unused) {
            int i = this.f917;
            this.f917 = i + 1;
            return i < 5;
        }
    }
}
