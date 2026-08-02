package com.startapp.sdk.ads.external.config;

import c2.n;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.b7;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class ExternalAdConfig implements Serializable {
    public static final b7 Companion = new b7();
    private static final long serialVersionUID = 6500875630965723999L;
    private String dparam;

    @TypeInfo(complex = true)
    private StrategyConfig strategies = new StrategyConfig();

    @TypeInfo(type = HashMap.class, value = AdUnitConfig.class)
    private Map<String, AdUnitConfig> mapping = n.f2638a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !r.a(ExternalAdConfig.class).equals(r.a(obj.getClass()))) {
            return false;
        }
        ExternalAdConfig externalAdConfig = (ExternalAdConfig) obj;
        return si.a((Object) this.strategies, (Object) externalAdConfig.strategies) && si.a(this.mapping, externalAdConfig.mapping) && si.a((Object) this.dparam, (Object) externalAdConfig.dparam);
    }

    public final String getDparam() {
        return this.dparam;
    }

    public final Map<String, AdUnitConfig> getMapping() {
        return this.mapping;
    }

    public final StrategyConfig getStrategies() {
        return this.strategies;
    }

    public int hashCode() {
        Object[] objArr = {this.strategies, this.mapping, this.dparam};
        WeakHashMap weakHashMap = si.f4438a;
        return Arrays.deepHashCode(objArr);
    }

    public final void setDparam(String str) {
        this.dparam = str;
    }

    public final void setMapping(Map<String, AdUnitConfig> map) {
        j.e(map, "<set-?>");
        this.mapping = map;
    }

    public final void setStrategies(StrategyConfig strategyConfig) {
        j.e(strategyConfig, "<set-?>");
        this.strategies = strategyConfig;
    }
}
