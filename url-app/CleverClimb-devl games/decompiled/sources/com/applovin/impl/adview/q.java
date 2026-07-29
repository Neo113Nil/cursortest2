package com.applovin.impl.adview;

import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final int f2622a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2623b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2624c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2625d;
    private final boolean e;
    private final int f;
    private final int g;
    private final int h;
    private final float i;
    private final float j;

    public q(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        jVar.u().b("VideoButtonProperties", "Updating video button properties with JSON = " + com.applovin.impl.sdk.e.f.a(jSONObject, jVar));
        this.f2622a = com.applovin.impl.sdk.e.f.a(jSONObject, "width", 64, jVar);
        this.f2623b = com.applovin.impl.sdk.e.f.a(jSONObject, "height", 7, jVar);
        this.f2624c = com.applovin.impl.sdk.e.f.a(jSONObject, "margin", 20, jVar);
        this.f2625d = com.applovin.impl.sdk.e.f.a(jSONObject, "gravity", 85, jVar);
        this.e = com.applovin.impl.sdk.e.f.a(jSONObject, "tap_to_fade", (Boolean) false, jVar).booleanValue();
        this.f = com.applovin.impl.sdk.e.f.a(jSONObject, "tap_to_fade_duration_milliseconds", TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL, jVar);
        this.g = com.applovin.impl.sdk.e.f.a(jSONObject, "fade_in_duration_milliseconds", TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL, jVar);
        this.h = com.applovin.impl.sdk.e.f.a(jSONObject, "fade_out_duration_milliseconds", TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL, jVar);
        this.i = com.applovin.impl.sdk.e.f.a(jSONObject, "fade_in_delay_seconds", 1.0f, jVar);
        this.j = com.applovin.impl.sdk.e.f.a(jSONObject, "fade_out_delay_seconds", 6.0f, jVar);
    }

    public int a() {
        return this.f2622a;
    }

    public int b() {
        return this.f2623b;
    }

    public int c() {
        return this.f2624c;
    }

    public int d() {
        return this.f2625d;
    }

    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f2622a == qVar.f2622a && this.f2623b == qVar.f2623b && this.f2624c == qVar.f2624c && this.f2625d == qVar.f2625d && this.e == qVar.e && this.f == qVar.f && this.g == qVar.g && this.h == qVar.h && Float.compare(qVar.i, this.i) == 0 && Float.compare(qVar.j, this.j) == 0;
    }

    public long f() {
        return this.f;
    }

    public long g() {
        return this.g;
    }

    public long h() {
        return this.h;
    }

    public int hashCode() {
        return (((((((((((((((((this.f2622a * 31) + this.f2623b) * 31) + this.f2624c) * 31) + this.f2625d) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.i != 0.0f ? Float.floatToIntBits(this.i) : 0)) * 31) + (this.j != 0.0f ? Float.floatToIntBits(this.j) : 0);
    }

    public float i() {
        return this.i;
    }

    public float j() {
        return this.j;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f2622a + ", heightPercentOfScreen=" + this.f2623b + ", margin=" + this.f2624c + ", gravity=" + this.f2625d + ", tapToFade=" + this.e + ", tapToFadeDurationMillis=" + this.f + ", fadeInDurationMillis=" + this.g + ", fadeOutDurationMillis=" + this.h + ", fadeInDelay=" + this.i + ", fadeOutDelay=" + this.j + '}';
    }
}
