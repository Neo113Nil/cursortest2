package com.google.ads.mediation.testsuite.utils.logging;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class LaunchEvent implements LogEvent {
    @Override // com.google.ads.mediation.testsuite.utils.logging.LogEvent
    public String getEventType() {
        return "launch";
    }

    @Override // com.google.ads.mediation.testsuite.utils.logging.LogEvent
    public Map<String, String> getParameters() {
        return new HashMap();
    }
}
