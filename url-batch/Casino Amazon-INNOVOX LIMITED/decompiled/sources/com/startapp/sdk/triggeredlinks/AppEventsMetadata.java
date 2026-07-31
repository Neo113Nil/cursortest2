package com.startapp.sdk.triggeredlinks;

import com.startapp.json.TypeInfo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class AppEventsMetadata implements Serializable {
    private static final long serialVersionUID = -5670027899854165615L;

    @TypeInfo(type = HashMap.class)
    private Map<String, String> active;

    @TypeInfo(type = HashMap.class)
    private Map<String, String> inactive;

    @TypeInfo(type = HashMap.class)
    private Map<String, String> launch;

    @TypeInfo(type = HashMap.class, value = PeriodicAppEventMetadata.class)
    private Map<String, PeriodicAppEventMetadata> periodic;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AppEventsMetadata appEventsMetadata = (AppEventsMetadata) obj;
            Map<String, String> map = this.launch;
            Map<String, String> map2 = appEventsMetadata.launch;
            if (map == null ? map2 != null : !map.equals(map2)) {
                return false;
            }
            Map<String, String> map3 = this.active;
            Map<String, String> map4 = appEventsMetadata.active;
            if (map3 == null ? map4 != null : !map3.equals(map4)) {
                return false;
            }
            Map<String, String> map5 = this.inactive;
            Map<String, String> map6 = appEventsMetadata.inactive;
            if (map5 == null ? map6 != null : !map5.equals(map6)) {
                return false;
            }
            Map<String, PeriodicAppEventMetadata> map7 = this.periodic;
            Map<String, PeriodicAppEventMetadata> map8 = appEventsMetadata.periodic;
            if (map7 != null) {
                return map7.equals(map8);
            }
            if (map8 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Map<String, String> map = this.launch;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, String> map2 = this.active;
        int hashCode2 = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, String> map3 = this.inactive;
        int hashCode3 = (hashCode2 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map<String, PeriodicAppEventMetadata> map4 = this.periodic;
        return hashCode3 + (map4 != null ? map4.hashCode() : 0);
    }
}
