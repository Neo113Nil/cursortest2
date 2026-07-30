package com.anythink.basead.handler;

import com.anythink.core.common.h.y;
import java.util.List;

/* loaded from: classes.dex */
public class ShakeSensorSetting {

    /* renamed from: a, reason: collision with root package name */
    List<Double> f9219a;

    /* renamed from: b, reason: collision with root package name */
    long f9220b;

    /* renamed from: c, reason: collision with root package name */
    private int f9221c;

    /* renamed from: d, reason: collision with root package name */
    private int f9222d;

    /* renamed from: e, reason: collision with root package name */
    private long f9223e;

    public ShakeSensorSetting(y yVar) {
        this.f9222d = 0;
        this.f9223e = 0L;
        this.f9221c = yVar.aK();
        this.f9222d = yVar.aN();
        this.f9219a = yVar.aM();
        this.f9220b = yVar.aL();
        this.f9223e = yVar.Y();
    }

    public long getShakeDetectDurationTime() {
        return this.f9220b;
    }

    public int getShakeStrength() {
        return this.f9222d;
    }

    public List<Double> getShakeStrengthList() {
        return this.f9219a;
    }

    public long getShakeTimeMs() {
        return this.f9223e;
    }

    public int getShakeWay() {
        return this.f9221c;
    }

    public String toString() {
        return "ShakeSensorSetting{shakeWay=" + this.f9221c + ", shakeStrength=" + this.f9222d + ", shakeStrengthList=" + this.f9219a + ", shakeDetectDurationTime=" + this.f9220b + ", shakeTimeMs=" + this.f9223e + '}';
    }
}
