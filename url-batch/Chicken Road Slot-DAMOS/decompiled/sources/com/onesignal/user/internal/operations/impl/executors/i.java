package com.onesignal.user.internal.operations.impl.executors;

import com.appsflyer.AdRevenueScheme;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {
    public static final i INSTANCE = new i();

    private i() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final uc.f createPropertiesFromOperation(zc.j jVar, uc.f fVar) {
        String obj;
        String obj2;
        jVar.getClass();
        fVar.getClass();
        String property = jVar.getProperty();
        r2 = null;
        Double d10 = null;
        r2 = null;
        Double d11 = null;
        switch (property.hashCode()) {
            case -2076227591:
                if (property.equals("timezone")) {
                    Map<String, String> tags = fVar.getTags();
                    String language = fVar.getLanguage();
                    Object value = jVar.getValue();
                    return new uc.f(tags, language, value != null ? value.toString() : null, fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
                }
                break;
            case -1613589672:
                if (property.equals("language")) {
                    Map<String, String> tags2 = fVar.getTags();
                    Object value2 = jVar.getValue();
                    return new uc.f(tags2, value2 != null ? value2.toString() : null, fVar.getTimezoneId(), fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
                }
                break;
            case -1247204543:
                if (property.equals("locationLatitude")) {
                    Map<String, String> tags3 = fVar.getTags();
                    String language2 = fVar.getLanguage();
                    String timezoneId = fVar.getTimezoneId();
                    String country = fVar.getCountry();
                    Object value3 = jVar.getValue();
                    if (value3 != null && (obj = value3.toString()) != null) {
                        d11 = Double.valueOf(Double.parseDouble(obj));
                    }
                    return new uc.f(tags3, language2, timezoneId, country, d11, fVar.getLongitude());
                }
                break;
            case 957831062:
                if (property.equals(AdRevenueScheme.COUNTRY)) {
                    Map<String, String> tags4 = fVar.getTags();
                    String language3 = fVar.getLanguage();
                    String timezoneId2 = fVar.getTimezoneId();
                    Object value4 = jVar.getValue();
                    return new uc.f(tags4, language3, timezoneId2, value4 != null ? value4.toString() : null, fVar.getLatitude(), fVar.getLongitude());
                }
                break;
            case 1818387834:
                if (property.equals("locationLongitude")) {
                    Map<String, String> tags5 = fVar.getTags();
                    String language4 = fVar.getLanguage();
                    String timezoneId3 = fVar.getTimezoneId();
                    String country2 = fVar.getCountry();
                    Double latitude = fVar.getLatitude();
                    Object value5 = jVar.getValue();
                    if (value5 != null && (obj2 = value5.toString()) != null) {
                        d10 = Double.valueOf(Double.parseDouble(obj2));
                    }
                    return new uc.f(tags5, language4, timezoneId3, country2, latitude, d10);
                }
                break;
        }
        return new uc.f(fVar.getTags(), fVar.getLanguage(), fVar.getTimezoneId(), fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
    }

    public final uc.f createPropertiesFromOperation(zc.d dVar, uc.f fVar) {
        dVar.getClass();
        fVar.getClass();
        Map<String, String> tags = fVar.getTags();
        LinkedHashMap linkedHashMap = tags != null ? new LinkedHashMap(tags) : null;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        linkedHashMap2.put(dVar.getKey(), null);
        return new uc.f(linkedHashMap2, fVar.getLanguage(), fVar.getTimezoneId(), fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
    }

    public final uc.f createPropertiesFromOperation(zc.k kVar, uc.f fVar) {
        kVar.getClass();
        fVar.getClass();
        Map<String, String> tags = fVar.getTags();
        LinkedHashMap linkedHashMap = tags != null ? new LinkedHashMap(tags) : null;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        linkedHashMap2.put(kVar.getKey(), kVar.getValue());
        return new uc.f(linkedHashMap2, fVar.getLanguage(), fVar.getTimezoneId(), fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
    }
}
