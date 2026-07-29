package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.youappi.sdk.net.model.VideoEvent;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    private final cz f7927a;

    private dc(cz czVar) {
        this.f7927a = czVar;
    }

    private static void b(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Video volume");
        }
    }

    public static dc a(cs csVar) {
        cz czVar = (cz) csVar;
        dp.a(csVar, "AdSession is null");
        if (!(cw.NATIVE == czVar.f7915a.f7896b)) {
            throw new IllegalStateException("Cannot create VideoEvents for JavaScript AdSession");
        }
        if (!czVar.f7918d) {
            dp.a(czVar);
            if (czVar.f7917c.f7956c == null) {
                dc dcVar = new dc(czVar);
                czVar.f7917c.f7956c = dcVar;
                return dcVar;
            }
            throw new IllegalStateException("VideoEvents already exists for AdSession");
        }
        throw new IllegalStateException("AdSession is started");
    }

    public final void a(db dbVar) {
        dp.a(dbVar, "VastProperties is null");
        dp.a(this.f7927a);
        this.f7927a.f7917c.a("loaded", dbVar.a());
    }

    public final void a(float f, float f2) {
        if (f > 0.0f) {
            b(f2);
            dp.b(this.f7927a);
            JSONObject jSONObject = new JSONObject();
            dm.a(jSONObject, "duration", Float.valueOf(f));
            dm.a(jSONObject, "videoPlayerVolume", Float.valueOf(f2));
            dm.a(jSONObject, "deviceVolume", Float.valueOf(dh.a().f7943a));
            this.f7927a.f7917c.a("start", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Video duration");
    }

    public final void a() {
        dp.b(this.f7927a);
        this.f7927a.f7917c.a("firstQuartile");
    }

    public final void b() {
        dp.b(this.f7927a);
        this.f7927a.f7917c.a("midpoint");
    }

    public final void c() {
        dp.b(this.f7927a);
        this.f7927a.f7917c.a("thirdQuartile");
    }

    public final void d() {
        dp.b(this.f7927a);
        this.f7927a.f7917c.a("complete");
    }

    public final void e() {
        dp.b(this.f7927a);
        this.f7927a.f7917c.a(VideoEvent.EVENT_PAUSE);
    }

    public final void f() {
        dp.b(this.f7927a);
        this.f7927a.f7917c.a(VideoEvent.EVENT_RESUME);
    }

    public final void g() {
        dp.b(this.f7927a);
        this.f7927a.f7917c.a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public final void h() {
        dp.b(this.f7927a);
        this.f7927a.f7917c.a("bufferFinish");
    }

    public final void i() {
        dp.b(this.f7927a);
        this.f7927a.f7917c.a(TJAdUnitConstants.String.VIDEO_SKIPPED);
    }

    public final void a(float f) {
        b(f);
        dp.b(this.f7927a);
        JSONObject jSONObject = new JSONObject();
        dm.a(jSONObject, "videoPlayerVolume", Float.valueOf(f));
        dm.a(jSONObject, "deviceVolume", Float.valueOf(dh.a().f7943a));
        this.f7927a.f7917c.a("volumeChange", jSONObject);
    }
}
