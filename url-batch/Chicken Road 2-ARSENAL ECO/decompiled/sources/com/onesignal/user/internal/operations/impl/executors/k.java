package com.onesignal.user.internal.operations.impl.executors;

import java.util.LinkedHashMap;
import java.util.Map;
import l5.t;
import n3.C0548f;

/* loaded from: classes.dex */
public final class k {
    public static final k INSTANCE = new k();

    private k() {
    }

    public final C0548f createPropertiesFromOperation(s3.k operation, C0548f propertiesObject) {
        kotlin.jvm.internal.i.e(operation, "operation");
        kotlin.jvm.internal.i.e(propertiesObject, "propertiesObject");
        Map<String, String> tags = propertiesObject.getTags();
        LinkedHashMap v02 = tags != null ? t.v0(tags) : null;
        if (v02 == null) {
            v02 = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = v02;
        linkedHashMap.put(operation.getKey(), operation.getValue());
        return new C0548f(linkedHashMap, propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }

    public final C0548f createPropertiesFromOperation(s3.d operation, C0548f propertiesObject) {
        kotlin.jvm.internal.i.e(operation, "operation");
        kotlin.jvm.internal.i.e(propertiesObject, "propertiesObject");
        Map<String, String> tags = propertiesObject.getTags();
        LinkedHashMap v02 = tags != null ? t.v0(tags) : null;
        if (v02 == null) {
            v02 = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = v02;
        linkedHashMap.put(operation.getKey(), null);
        return new C0548f(linkedHashMap, propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final C0548f createPropertiesFromOperation(s3.j operation, C0548f propertiesObject) {
        String obj;
        String obj2;
        kotlin.jvm.internal.i.e(operation, "operation");
        kotlin.jvm.internal.i.e(propertiesObject, "propertiesObject");
        String property = operation.getProperty();
        r2 = null;
        Double d7 = null;
        r2 = null;
        Double d8 = null;
        switch (property.hashCode()) {
            case -2076227591:
                if (property.equals("timezone")) {
                    Map<String, String> tags = propertiesObject.getTags();
                    String language = propertiesObject.getLanguage();
                    Object value = operation.getValue();
                    return new C0548f(tags, language, value != null ? value.toString() : null, propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
                }
                break;
            case -1613589672:
                if (property.equals("language")) {
                    Map<String, String> tags2 = propertiesObject.getTags();
                    Object value2 = operation.getValue();
                    return new C0548f(tags2, value2 != null ? value2.toString() : null, propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
                }
                break;
            case -1247204543:
                if (property.equals("locationLatitude")) {
                    Map<String, String> tags3 = propertiesObject.getTags();
                    String language2 = propertiesObject.getLanguage();
                    String timezoneId = propertiesObject.getTimezoneId();
                    String country = propertiesObject.getCountry();
                    Object value3 = operation.getValue();
                    if (value3 != null && (obj = value3.toString()) != null) {
                        d8 = Double.valueOf(Double.parseDouble(obj));
                    }
                    return new C0548f(tags3, language2, timezoneId, country, d8, propertiesObject.getLongitude());
                }
                break;
            case 957831062:
                if (property.equals("country")) {
                    Map<String, String> tags4 = propertiesObject.getTags();
                    String language3 = propertiesObject.getLanguage();
                    String timezoneId2 = propertiesObject.getTimezoneId();
                    Object value4 = operation.getValue();
                    return new C0548f(tags4, language3, timezoneId2, value4 != null ? value4.toString() : null, propertiesObject.getLatitude(), propertiesObject.getLongitude());
                }
                break;
            case 1818387834:
                if (property.equals("locationLongitude")) {
                    Map<String, String> tags5 = propertiesObject.getTags();
                    String language4 = propertiesObject.getLanguage();
                    String timezoneId3 = propertiesObject.getTimezoneId();
                    String country2 = propertiesObject.getCountry();
                    Double latitude = propertiesObject.getLatitude();
                    Object value5 = operation.getValue();
                    if (value5 != null && (obj2 = value5.toString()) != null) {
                        d7 = Double.valueOf(Double.parseDouble(obj2));
                    }
                    return new C0548f(tags5, language4, timezoneId3, country2, latitude, d7);
                }
                break;
        }
        return new C0548f(propertiesObject.getTags(), propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }
}
