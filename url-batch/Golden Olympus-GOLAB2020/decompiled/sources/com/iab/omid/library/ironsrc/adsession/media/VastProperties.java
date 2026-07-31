package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.utils.d;
import com.iab.omid.library.ironsrc.utils.g;
import com.ironsource.b9;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f14512a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f14513b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14514c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f14515d;

    private VastProperties(boolean z4, Float f4, boolean z5, Position position) {
        this.f14512a = z4;
        this.f14513b = f4;
        this.f14514c = z5;
        this.f14515d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z4, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z4, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f4, boolean z4, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f4), z4, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f14512a);
            if (this.f14512a) {
                jSONObject.put("skipOffset", this.f14513b);
            }
            jSONObject.put("autoPlay", this.f14514c);
            jSONObject.put(b9.h.f15451L, this.f14515d);
            return jSONObject;
        } catch (JSONException e4) {
            d.a("VastProperties: JSON error", e4);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f14515d;
    }

    public Float getSkipOffset() {
        return this.f14513b;
    }

    public boolean isAutoPlay() {
        return this.f14514c;
    }

    public boolean isSkippable() {
        return this.f14512a;
    }
}
