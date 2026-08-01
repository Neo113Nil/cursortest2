package com.onesignal.user.internal.properties;

import com.appsflyer.AdRevenueScheme;
import com.onesignal.common.modeling.h;
import com.onesignal.common.modeling.i;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends i {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends p implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final h invoke() {
            return new h(a.this, "tags");
        }
    }

    public a() {
        super(null, null, 3, null);
    }

    @Override // com.onesignal.common.modeling.i
    public i createModelForProperty(String str, JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
        if (!Intrinsics.a(str, "tags")) {
            return null;
        }
        h hVar = new h(this, "tags");
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        while (keys.hasNext()) {
            String next = keys.next();
            next.getClass();
            String string = jSONObject.getString(next);
            string.getClass();
            i.setStringProperty$default(hVar, next, string, null, false, 12, null);
        }
        return hVar;
    }

    public final String getCountry() {
        return getStringProperty(AdRevenueScheme.COUNTRY, C0071a.INSTANCE);
    }

    public final String getLanguage() {
        return i.getOptStringProperty$default(this, "language", null, 2, null);
    }

    public final Float getLocationAccuracy() {
        return i.getOptFloatProperty$default(this, "locationAccuracy", null, 2, null);
    }

    public final Boolean getLocationBackground() {
        return i.getOptBooleanProperty$default(this, "locationBackground", null, 2, null);
    }

    public final Double getLocationLatitude() {
        return i.getOptDoubleProperty$default(this, "locationLatitude", null, 2, null);
    }

    public final Double getLocationLongitude() {
        return i.getOptDoubleProperty$default(this, "locationLongitude", null, 2, null);
    }

    public final Long getLocationTimestamp() {
        return i.getOptLongProperty$default(this, "locationTimestamp", null, 2, null);
    }

    public final Integer getLocationType() {
        return i.getOptIntProperty$default(this, "locationType", null, 2, null);
    }

    public final String getOnesignalId() {
        return i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final h getTags() {
        return getMapModelProperty("tags", new b());
    }

    public final String getTimezone() {
        return i.getOptStringProperty$default(this, "timezone", null, 2, null);
    }

    public final void setCountry(String str) {
        str.getClass();
        i.setStringProperty$default(this, AdRevenueScheme.COUNTRY, str, null, false, 12, null);
    }

    public final void setLanguage(String str) {
        i.setOptStringProperty$default(this, "language", str, null, false, 12, null);
    }

    public final void setLocationAccuracy(Float f3) {
        i.setOptFloatProperty$default(this, "locationAccuracy", f3, null, false, 12, null);
    }

    public final void setLocationBackground(Boolean bool) {
        i.setOptBooleanProperty$default(this, "locationBackground", bool, null, false, 12, null);
    }

    public final void setLocationLatitude(Double d10) {
        i.setOptDoubleProperty$default(this, "locationLatitude", d10, null, false, 12, null);
    }

    public final void setLocationLongitude(Double d10) {
        i.setOptDoubleProperty$default(this, "locationLongitude", d10, null, false, 12, null);
    }

    public final void setLocationTimestamp(Long l10) {
        i.setOptLongProperty$default(this, "locationTimestamp", l10, null, false, 12, null);
    }

    public final void setLocationType(Integer num) {
        i.setOptIntProperty$default(this, "locationType", num, null, false, 12, null);
    }

    public final void setOnesignalId(String str) {
        str.getClass();
        i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    public final void setTimezone(String str) {
        i.setOptStringProperty$default(this, "timezone", str, null, false, 12, null);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.user.internal.properties.a$a, reason: collision with other inner class name */
    public static final class C0071a extends p implements Function0 {
        public static final C0071a INSTANCE = new C0071a();

        public C0071a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "US";
        }
    }
}
