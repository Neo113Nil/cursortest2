package com.onesignal.user.internal.properties;

import com.onesignal.common.modeling.h;
import com.onesignal.common.modeling.i;
import java.util.Iterator;
import kotlin.jvm.internal.j;
import org.json.JSONObject;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: com.onesignal.user.internal.properties.a$a, reason: collision with other inner class name */
    public static final class C0083a extends j implements InterfaceC0732a {
        public static final C0083a INSTANCE = new C0083a();

        public C0083a() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final String invoke() {
            return "US";
        }
    }

    public static final class b extends j implements InterfaceC0732a {
        public b() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final h invoke() {
            return new h(a.this, "tags");
        }
    }

    public a() {
        super(null, null, 3, null);
    }

    @Override // com.onesignal.common.modeling.i
    public i createModelForProperty(String property, JSONObject jsonObject) {
        kotlin.jvm.internal.i.e(property, "property");
        kotlin.jvm.internal.i.e(jsonObject, "jsonObject");
        if (!property.equals("tags")) {
            return null;
        }
        h hVar = new h(this, "tags");
        Iterator<String> keys = jsonObject.keys();
        kotlin.jvm.internal.i.d(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            kotlin.jvm.internal.i.b(next);
            String string = jsonObject.getString(next);
            kotlin.jvm.internal.i.d(string, "getString(...)");
            i.setStringProperty$default(hVar, next, string, null, false, 12, null);
        }
        return hVar;
    }

    public final String getCountry() {
        return getStringProperty("country", C0083a.INSTANCE);
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

    public final void setCountry(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        i.setStringProperty$default(this, "country", value, null, false, 12, null);
    }

    public final void setLanguage(String str) {
        i.setOptStringProperty$default(this, "language", str, null, false, 12, null);
    }

    public final void setLocationAccuracy(Float f7) {
        i.setOptFloatProperty$default(this, "locationAccuracy", f7, null, false, 12, null);
    }

    public final void setLocationBackground(Boolean bool) {
        i.setOptBooleanProperty$default(this, "locationBackground", bool, null, false, 12, null);
    }

    public final void setLocationLatitude(Double d7) {
        i.setOptDoubleProperty$default(this, "locationLatitude", d7, null, false, 12, null);
    }

    public final void setLocationLongitude(Double d7) {
        i.setOptDoubleProperty$default(this, "locationLongitude", d7, null, false, 12, null);
    }

    public final void setLocationTimestamp(Long l7) {
        i.setOptLongProperty$default(this, "locationTimestamp", l7, null, false, 12, null);
    }

    public final void setLocationType(Integer num) {
        i.setOptIntProperty$default(this, "locationType", num, null, false, 12, null);
    }

    public final void setOnesignalId(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        i.setStringProperty$default(this, "onesignalId", value, null, false, 12, null);
    }

    public final void setTimezone(String str) {
        i.setOptStringProperty$default(this, "timezone", str, null, false, 12, null);
    }
}
