package uc;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {
    private final String country;
    private final String language;
    private final Double latitude;
    private final Double longitude;
    private final Map<String, String> tags;
    private final String timezoneId;

    public /* synthetic */ f(Map map, String str, String str2, String str3, Double d10, Double d11, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : map, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : d10, (i3 & 32) != 0 ? null : d11);
    }

    public final String getCountry() {
        return this.country;
    }

    public final boolean getHasAtLeastOnePropertySet() {
        return (this.tags == null && this.language == null && this.timezoneId == null && this.country == null && this.latitude == null && this.longitude == null) ? false : true;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final Map<String, String> getTags() {
        return this.tags;
    }

    public final String getTimezoneId() {
        return this.timezoneId;
    }

    public f(Map<String, String> map, String str, String str2, String str3, Double d10, Double d11) {
        this.tags = map;
        this.language = str;
        this.timezoneId = str2;
        this.country = str3;
        this.latitude = d10;
        this.longitude = d11;
    }

    public f() {
        this(null, null, null, null, null, null, 63, null);
    }
}
