package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.user.internal.backend.PropertiesObject;
import com.onesignal.user.internal.operations.DeleteTagOperation;
import com.onesignal.user.internal.operations.SetPropertyOperation;
import com.onesignal.user.internal.operations.SetTagOperation;
import g4.AbstractC0476u;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PropertyOperationHelper {
    public static final PropertyOperationHelper INSTANCE = new PropertyOperationHelper();

    private PropertyOperationHelper() {
    }

    public final PropertiesObject createPropertiesFromOperation(SetTagOperation operation, PropertiesObject propertiesObject) {
        i.e(operation, "operation");
        i.e(propertiesObject, "propertiesObject");
        Map<String, String> tags = propertiesObject.getTags();
        LinkedHashMap e02 = tags != null ? AbstractC0476u.e0(tags) : null;
        if (e02 == null) {
            e02 = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = e02;
        linkedHashMap.put(operation.getKey(), operation.getValue());
        return new PropertiesObject(linkedHashMap, propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }

    public final PropertiesObject createPropertiesFromOperation(DeleteTagOperation operation, PropertiesObject propertiesObject) {
        i.e(operation, "operation");
        i.e(propertiesObject, "propertiesObject");
        Map<String, String> tags = propertiesObject.getTags();
        LinkedHashMap e02 = tags != null ? AbstractC0476u.e0(tags) : null;
        if (e02 == null) {
            e02 = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = e02;
        linkedHashMap.put(operation.getKey(), null);
        return new PropertiesObject(linkedHashMap, propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final PropertiesObject createPropertiesFromOperation(SetPropertyOperation operation, PropertiesObject propertiesObject) {
        String obj;
        String obj2;
        i.e(operation, "operation");
        i.e(propertiesObject, "propertiesObject");
        String property = operation.getProperty();
        r4 = null;
        Double d6 = null;
        r4 = null;
        Double d7 = null;
        switch (property.hashCode()) {
            case -2076227591:
                if (property.equals("timezone")) {
                    Map<String, String> tags = propertiesObject.getTags();
                    String language = propertiesObject.getLanguage();
                    Object value = operation.getValue();
                    return new PropertiesObject(tags, language, value != null ? value.toString() : null, propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
                }
                break;
            case -1613589672:
                if (property.equals("language")) {
                    Map<String, String> tags2 = propertiesObject.getTags();
                    Object value2 = operation.getValue();
                    return new PropertiesObject(tags2, value2 != null ? value2.toString() : null, propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
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
                        d7 = Double.valueOf(Double.parseDouble(obj));
                    }
                    return new PropertiesObject(tags3, language2, timezoneId, country, d7, propertiesObject.getLongitude());
                }
                break;
            case 957831062:
                if (property.equals("country")) {
                    Map<String, String> tags4 = propertiesObject.getTags();
                    String language3 = propertiesObject.getLanguage();
                    String timezoneId2 = propertiesObject.getTimezoneId();
                    Object value4 = operation.getValue();
                    return new PropertiesObject(tags4, language3, timezoneId2, value4 != null ? value4.toString() : null, propertiesObject.getLatitude(), propertiesObject.getLongitude());
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
                        d6 = Double.valueOf(Double.parseDouble(obj2));
                    }
                    return new PropertiesObject(tags5, language4, timezoneId3, country2, latitude, d6);
                }
                break;
        }
        return new PropertiesObject(propertiesObject.getTags(), propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }
}
