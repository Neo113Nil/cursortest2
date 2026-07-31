package n3;

import java.util.Map;

/* renamed from: n3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548f {
    private final String country;
    private final String language;
    private final Double latitude;
    private final Double longitude;
    private final Map<String, String> tags;
    private final String timezoneId;

    public C0548f() {
        this(null, null, null, null, null, null, 63, null);
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

    public C0548f(Map<String, String> map, String str, String str2, String str3, Double d7, Double d8) {
        this.tags = map;
        this.language = str;
        this.timezoneId = str2;
        this.country = str3;
        this.latitude = d7;
        this.longitude = d8;
    }

    public /* synthetic */ C0548f(Map map, String str, String str2, String str3, Double d7, Double d8, int i7, kotlin.jvm.internal.e eVar) {
        this((i7 & 1) != 0 ? null : map, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : d7, (i7 & 32) != 0 ? null : d8);
    }
}
