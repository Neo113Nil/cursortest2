package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.core.BuildConfig;
import com.onesignal.user.internal.backend.PropertiesObject;
import com.onesignal.user.internal.operations.DeleteTagOperation;
import com.onesignal.user.internal.operations.SetPropertyOperation;
import com.onesignal.user.internal.operations.SetTagOperation;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PropertyOperationHelper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/onesignal/user/internal/operations/impl/executors/PropertyOperationHelper;", "", "()V", "createPropertiesFromOperation", "Lcom/onesignal/user/internal/backend/PropertiesObject;", "operation", "Lcom/onesignal/user/internal/operations/DeleteTagOperation;", "propertiesObject", "Lcom/onesignal/user/internal/operations/SetPropertyOperation;", "Lcom/onesignal/user/internal/operations/SetTagOperation;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PropertyOperationHelper {
    public static final PropertyOperationHelper INSTANCE = new PropertyOperationHelper();

    private PropertyOperationHelper() {
    }

    public final PropertiesObject createPropertiesFromOperation(SetTagOperation operation, PropertiesObject propertiesObject) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(propertiesObject, "propertiesObject");
        Map<String, String> tags = propertiesObject.getTags();
        LinkedHashMap mutableMap = tags != null ? MapsKt.toMutableMap(tags) : null;
        if (mutableMap == null) {
            mutableMap = new LinkedHashMap();
        }
        Map map = mutableMap;
        map.put(operation.getKey(), operation.getValue());
        return new PropertiesObject(map, propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }

    public final PropertiesObject createPropertiesFromOperation(DeleteTagOperation operation, PropertiesObject propertiesObject) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(propertiesObject, "propertiesObject");
        Map<String, String> tags = propertiesObject.getTags();
        LinkedHashMap mutableMap = tags != null ? MapsKt.toMutableMap(tags) : null;
        if (mutableMap == null) {
            mutableMap = new LinkedHashMap();
        }
        Map map = mutableMap;
        map.put(operation.getKey(), null);
        return new PropertiesObject(map, propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final PropertiesObject createPropertiesFromOperation(SetPropertyOperation operation, PropertiesObject propertiesObject) {
        String obj;
        String obj2;
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(propertiesObject, "propertiesObject");
        String property = operation.getProperty();
        r2 = null;
        Double d = null;
        r2 = null;
        Double d2 = null;
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
                        d2 = Double.valueOf(Double.parseDouble(obj));
                    }
                    return new PropertiesObject(tags3, language2, timezoneId, country, d2, propertiesObject.getLongitude());
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
                        d = Double.valueOf(Double.parseDouble(obj2));
                    }
                    return new PropertiesObject(tags5, language4, timezoneId3, country2, latitude, d);
                }
                break;
        }
        return new PropertiesObject(propertiesObject.getTags(), propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }
}
