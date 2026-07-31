package com.iab.omid.library.startio.adsession.media;

import com.facebook.react.uimanager.ViewProps;
import com.iab.omid.library.startio.utils.d;
import com.iab.omid.library.startio.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17a;
    private final Float b;
    private final boolean c;
    private final Position d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f17a = z;
        this.b = f;
        this.c = z2;
        this.d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f17a);
            if (this.f17a) {
                jSONObject.put("skipOffset", this.b);
            }
            jSONObject.put("autoPlay", this.c);
            jSONObject.put(ViewProps.POSITION, this.d);
            return jSONObject;
        } catch (JSONException e) {
            d.a("VastProperties: JSON error", e);
            return jSONObject;
        }
    }

    public final Position getPosition() {
        return this.d;
    }

    public final Float getSkipOffset() {
        return this.b;
    }

    public final boolean isAutoPlay() {
        return this.c;
    }

    public final boolean isSkippable() {
        return this.f17a;
    }
}
