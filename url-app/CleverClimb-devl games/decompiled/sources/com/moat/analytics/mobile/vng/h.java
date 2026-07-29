package com.moat.analytics.mobile.vng;

import android.view.View;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
abstract class h<PlayerOrIMAAd> extends c<PlayerOrIMAAd> {
    int l;
    private a m;
    private int n;
    private double o;
    private int p;
    private int q;

    protected enum a {
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
        this.o = Double.NaN;
        this.q = 0;
        this.m = a.UNINITIALIZED;
    }

    private void n() {
        this.h.postDelayed(new Runnable() { // from class: com.moat.analytics.mobile.vng.h.1
            @Override // java.lang.Runnable
            public void run() {
                h hVar;
                try {
                    if (h.this.j.get() == null || h.this.i()) {
                        hVar = h.this;
                    } else {
                        if (Boolean.valueOf(h.this.m()).booleanValue()) {
                            h.this.h.postDelayed(this, 200L);
                            return;
                        }
                        hVar = h.this;
                    }
                    hVar.h();
                } catch (Exception e) {
                    h.this.h();
                    m.a(e);
                }
            }
        }, 200L);
    }

    @Override // com.moat.analytics.mobile.vng.c
    protected JSONObject a(MoatAdEvent moatAdEvent) {
        Integer valueOf;
        if (moatAdEvent.f7320b.equals(MoatAdEvent.f7319a)) {
            try {
                valueOf = j();
            } catch (Exception unused) {
                valueOf = Integer.valueOf(this.n);
            }
            moatAdEvent.f7320b = valueOf;
        } else {
            valueOf = moatAdEvent.f7320b;
        }
        if (moatAdEvent.f7320b.intValue() < 0 || (moatAdEvent.f7320b.intValue() == 0 && moatAdEvent.f7322d == MoatAdEventType.AD_EVT_COMPLETE && this.n > 0)) {
            valueOf = Integer.valueOf(this.n);
            moatAdEvent.f7320b = valueOf;
        }
        if (moatAdEvent.f7322d == MoatAdEventType.AD_EVT_COMPLETE) {
            if (valueOf.intValue() == Integer.MIN_VALUE || this.l == Integer.MIN_VALUE || !a(valueOf, Integer.valueOf(this.l))) {
                this.m = a.STOPPED;
                moatAdEvent.f7322d = MoatAdEventType.AD_EVT_STOPPED;
            } else {
                this.m = a.COMPLETED;
            }
        }
        return super.a(moatAdEvent);
    }

    @Override // com.moat.analytics.mobile.vng.c
    public boolean a(Map<String, String> map, PlayerOrIMAAd playerorimaad, View view) {
        try {
            if (!this.e) {
                n();
            }
        } catch (Exception e) {
            m.a(e);
        }
        return super.a(map, playerorimaad, view);
    }

    protected abstract Integer j();

    protected abstract boolean k();

    protected abstract Integer l();

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e A[Catch: Exception -> 0x00d1, TryCatch #0 {Exception -> 0x00d1, blocks: (B:7:0x0012, B:12:0x0021, B:15:0x0026, B:17:0x0039, B:19:0x0042, B:20:0x0044, B:22:0x004a, B:24:0x004e, B:26:0x0054, B:27:0x0056, B:28:0x0058, B:32:0x009e, B:34:0x00a6, B:36:0x00b7, B:38:0x00bc, B:39:0x00cc, B:43:0x005b, B:45:0x0061, B:47:0x0069, B:51:0x0075, B:53:0x0081, B:54:0x008c, B:56:0x0092), top: B:6:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc A[Catch: Exception -> 0x00d1, TryCatch #0 {Exception -> 0x00d1, blocks: (B:7:0x0012, B:12:0x0021, B:15:0x0026, B:17:0x0039, B:19:0x0042, B:20:0x0044, B:22:0x004a, B:24:0x004e, B:26:0x0054, B:27:0x0056, B:28:0x0058, B:32:0x009e, B:34:0x00a6, B:36:0x00b7, B:38:0x00bc, B:39:0x00cc, B:43:0x005b, B:45:0x0061, B:47:0x0069, B:51:0x0075, B:53:0x0081, B:54:0x008c, B:56:0x0092), top: B:6:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00db A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean m() {
        int intValue;
        a aVar;
        boolean z;
        if (this.j.get() == null || i()) {
            return false;
        }
        try {
            intValue = j().intValue();
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
        int intValue2 = l().intValue();
        boolean k = k();
        double d2 = intValue2;
        Double.isNaN(d2);
        double d3 = d2 / 4.0d;
        double a2 = s.a();
        MoatAdEventType moatAdEventType = null;
        if (intValue > this.p) {
            this.p = intValue;
        }
        if (this.l == Integer.MIN_VALUE) {
            this.l = intValue2;
        }
        if (!k) {
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
            this.o = a2;
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
                    MoatAdEventType moatAdEventType2 = f[floor];
                    if (!this.g.containsKey(moatAdEventType2)) {
                        this.g.put(moatAdEventType2, 1);
                        moatAdEventType = moatAdEventType2;
                    }
                }
                z = moatAdEventType != null;
                if (!z && !Double.isNaN(this.o) && Math.abs(this.o - a2) > 0.05d) {
                    moatAdEventType = MoatAdEventType.AD_EVT_VOLUME_CHANGE;
                    z = true;
                }
                if (z) {
                    dispatchEvent(new MoatAdEvent(moatAdEventType, Integer.valueOf(intValue), Double.valueOf(a2)));
                }
                this.o = a2;
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
        this.o = a2;
        this.q = 0;
        return true;
        int i2 = this.q;
        this.q = i2 + 1;
        return i2 >= 5;
    }

    @Override // com.moat.analytics.mobile.vng.c, com.moat.analytics.mobile.vng.b
    public void stopTracking() {
        try {
            dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_COMPLETE));
            p.a("[SUCCESS] ", a() + " stopTracking succeeded for " + e());
        } catch (Exception e) {
            m.a(e);
        }
    }
}
