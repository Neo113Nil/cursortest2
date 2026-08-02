package com.squareup.cash.userjourneys.tracker;

import androidx.tracing.Trace;
import com.squareup.cash.cdf.UserJourneyEventMonitors;
import com.squareup.cash.cdf.UserJourneyName;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes.dex */
public final class RealCdfJourneyMap {
    public static final RealCdfJourneyMap INSTANCE = new RealCdfJourneyMap();
    public static final Map eventMonitors;
    public static final LinkedHashMap relevantEndpoints;

    static {
        Map map = UserJourneyEventMonitors.relevantEndpointsByJourneyName;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(Trace.toUserJourneyName((UserJourneyName) entry.getKey()), entry.getValue());
        }
        relevantEndpoints = linkedHashMap;
        eventMonitors = UserJourneyEventMonitors.monitors;
    }
}
