package com.iab.omid.library.toponad.adsession.media;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.foundation.g.g.a.b;
import com.iab.omid.library.toponad.utils.d;
import com.iab.omid.library.toponad.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f36378a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f36379b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f36380c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f36381d;

    private VastProperties(boolean z8, Float f6, boolean z9, Position position) {
        this.f36378a = z8;
        this.f36379b = f6;
        this.f36380c = z9;
        this.f36381d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z8, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z8, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f6, boolean z8, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f6), z8, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f36378a);
            if (this.f36378a) {
                jSONObject.put("skipOffset", this.f36379b);
            }
            jSONObject.put(NativeAdvancedJsUtils.f18059k, this.f36380c);
            jSONObject.put(b.ab, this.f36381d);
            return jSONObject;
        } catch (JSONException e6) {
            d.a("VastProperties: JSON error", e6);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f36381d;
    }

    public Float getSkipOffset() {
        return this.f36379b;
    }

    public boolean isAutoPlay() {
        return this.f36380c;
    }

    public boolean isSkippable() {
        return this.f36378a;
    }
}
