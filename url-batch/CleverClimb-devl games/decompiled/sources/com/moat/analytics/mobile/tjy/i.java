package com.moat.analytics.mobile.tjy;

import org.json.JSONObject;

/* loaded from: classes2.dex */
abstract class i extends f {
    protected k j;
    protected int k;
    protected double l;
    protected int m;
    protected int n;
    private int o;

    public i(String str, a aVar, ap apVar) {
        super(str, aVar, apVar);
        this.m = Integer.MIN_VALUE;
        this.n = Integer.MIN_VALUE;
        this.k = Integer.MIN_VALUE;
        this.l = Double.NaN;
        this.o = 0;
        this.j = k.UNINITIALIZED;
    }

    @Override // com.moat.analytics.mobile.tjy.f
    protected JSONObject a(MoatAdEvent moatAdEvent) {
        Integer valueOf;
        if (moatAdEvent.adPlayhead.equals(MoatAdEvent.TIME_UNAVAILABLE)) {
            try {
                valueOf = f();
            } catch (Exception unused) {
                valueOf = Integer.valueOf(this.k);
            }
            moatAdEvent.adPlayhead = valueOf;
        } else {
            valueOf = moatAdEvent.adPlayhead;
        }
        if (moatAdEvent.adPlayhead.intValue() < 0) {
            valueOf = Integer.valueOf(this.k);
            moatAdEvent.adPlayhead = valueOf;
        }
        if (moatAdEvent.eventType == MoatAdEventType.AD_EVT_COMPLETE) {
            if (valueOf.intValue() == Integer.MIN_VALUE || this.n == Integer.MIN_VALUE || !a(valueOf, Integer.valueOf(this.n))) {
                this.j = k.STOPPED;
                moatAdEvent.eventType = MoatAdEventType.AD_EVT_STOPPED;
            } else {
                this.j = k.COMPLETED;
            }
        }
        return super.a(moatAdEvent);
    }

    @Override // com.moat.analytics.mobile.tjy.f
    protected void b() {
        super.b();
        this.f7283d.postDelayed(new j(this), 200L);
    }

    protected abstract Integer f();

    protected abstract boolean g();

    protected abstract Integer h();

    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:7:0x0012, B:12:0x0021, B:15:0x0026, B:17:0x0039, B:19:0x0042, B:20:0x0044, B:22:0x004a, B:24:0x004e, B:26:0x0054, B:27:0x0056, B:28:0x0058, B:32:0x009d, B:34:0x00a5, B:36:0x00b6, B:38:0x00bb, B:39:0x00cb, B:43:0x005b, B:45:0x0061, B:47:0x0069, B:51:0x0074, B:53:0x0080, B:54:0x008b, B:56:0x0091), top: B:6:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:7:0x0012, B:12:0x0021, B:15:0x0026, B:17:0x0039, B:19:0x0042, B:20:0x0044, B:22:0x004a, B:24:0x004e, B:26:0x0054, B:27:0x0056, B:28:0x0058, B:32:0x009d, B:34:0x00a5, B:36:0x00b6, B:38:0x00bb, B:39:0x00cb, B:43:0x005b, B:45:0x0061, B:47:0x0069, B:51:0x0074, B:53:0x0080, B:54:0x008b, B:56:0x0091), top: B:6:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean i() {
        int i;
        int intValue;
        k kVar;
        boolean z;
        if (this.f.get() != null && !e()) {
            try {
                intValue = f().intValue();
            } catch (Exception unused) {
                i = this.o;
                this.o = i + 1;
                if (i >= 5) {
                }
            }
            if (this.k >= 0 && intValue < 0) {
                return false;
            }
            this.k = intValue;
            if (intValue == 0) {
                return true;
            }
            int intValue2 = h().intValue();
            boolean g = g();
            double d2 = intValue2;
            Double.isNaN(d2);
            double d3 = d2 / 4.0d;
            double d4 = d();
            MoatAdEventType moatAdEventType = null;
            if (intValue > this.m) {
                this.m = intValue;
            }
            if (this.n == Integer.MIN_VALUE) {
                this.n = intValue2;
            }
            if (!g) {
                if (this.j != k.PAUSED) {
                    moatAdEventType = MoatAdEventType.AD_EVT_PAUSED;
                    kVar = k.PAUSED;
                    this.j = kVar;
                }
                if (moatAdEventType != null) {
                }
                if (!z) {
                }
                if (z) {
                }
                this.l = d4;
                this.o = 0;
                return true;
            }
            if (this.j == k.UNINITIALIZED) {
                moatAdEventType = MoatAdEventType.AD_EVT_START;
            } else {
                if (this.j != k.PAUSED) {
                    double d5 = intValue;
                    Double.isNaN(d5);
                    int floor = ((int) Math.floor(d5 / d3)) - 1;
                    if (floor >= 0 && floor < 3) {
                        MoatAdEventType moatAdEventType2 = f7280b[floor];
                        if (!this.f7282c.containsKey(moatAdEventType2)) {
                            this.f7282c.put(moatAdEventType2, 1);
                            moatAdEventType = moatAdEventType2;
                        }
                    }
                    z = moatAdEventType != null;
                    if (!z && !Double.isNaN(this.l) && Math.abs(this.l - d4) > 0.05d) {
                        moatAdEventType = MoatAdEventType.AD_EVT_VOLUME_CHANGE;
                        z = true;
                    }
                    if (z) {
                        dispatchEvent(new MoatAdEvent(moatAdEventType, Integer.valueOf(intValue), Double.valueOf(d4)));
                    }
                    this.l = d4;
                    this.o = 0;
                    return true;
                }
                moatAdEventType = MoatAdEventType.AD_EVT_PLAYING;
            }
            kVar = k.PLAYING;
            this.j = kVar;
            if (moatAdEventType != null) {
            }
            if (!z) {
                moatAdEventType = MoatAdEventType.AD_EVT_VOLUME_CHANGE;
                z = true;
            }
            if (z) {
            }
            this.l = d4;
            this.o = 0;
            return true;
            i = this.o;
            this.o = i + 1;
            if (i >= 5) {
                return true;
            }
        }
        return false;
    }
}
