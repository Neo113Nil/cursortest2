package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.mi;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class AnalyticsCategoryConfig implements Serializable {
    private static final long serialVersionUID = 5410570404581113345L;
    private Double enabled;

    @TypeInfo(parser = FiltersParser.class, type = ArrayList.class, value = AnalyticsCategoryFilterConfig.class)
    private List<AnalyticsCategoryFilterConfig> filters;
    private String firstDelay;
    private Integer flags;
    private Integer priority;
    private Boolean sendViaDb;
    private String ttl;

    public static class FiltersParser extends mi<AnalyticsCategoryFilterConfig> {
        public FiltersParser() {
            super(AnalyticsCategoryFilterConfig.class);
        }
    }

    public final Double a() {
        return this.enabled;
    }

    public final List b() {
        return this.filters;
    }

    public final String c() {
        return this.firstDelay;
    }

    public final Integer d() {
        return this.flags;
    }

    public final Integer e() {
        return this.priority;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnalyticsCategoryConfig analyticsCategoryConfig = (AnalyticsCategoryConfig) obj;
            if (si.a((Object) this.enabled, (Object) analyticsCategoryConfig.enabled) && si.a((Object) this.flags, (Object) analyticsCategoryConfig.flags) && si.a((Object) this.priority, (Object) analyticsCategoryConfig.priority) && si.a((Object) this.sendViaDb, (Object) analyticsCategoryConfig.sendViaDb) && si.a((Object) this.ttl, (Object) analyticsCategoryConfig.ttl) && si.a((Object) this.firstDelay, (Object) analyticsCategoryConfig.firstDelay) && si.a(this.filters, analyticsCategoryConfig.filters)) {
                return true;
            }
        }
        return false;
    }

    public final Boolean f() {
        return this.sendViaDb;
    }

    public final String g() {
        return this.ttl;
    }

    public final int hashCode() {
        Object[] objArr = {this.enabled, this.flags, this.priority, this.sendViaDb, this.ttl, this.firstDelay, this.filters};
        WeakHashMap weakHashMap = si.f4438a;
        return Arrays.deepHashCode(objArr);
    }
}
