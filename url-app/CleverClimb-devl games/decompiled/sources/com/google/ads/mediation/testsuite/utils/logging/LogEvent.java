package com.google.ads.mediation.testsuite.utils.logging;

import java.util.Map;

/* loaded from: classes.dex */
public interface LogEvent {
    String getEventType();

    Map<String, String> getParameters();
}
