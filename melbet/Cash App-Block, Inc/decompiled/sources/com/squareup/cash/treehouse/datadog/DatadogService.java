package com.squareup.cash.treehouse.datadog;

import app.cash.zipline.ZiplineService;
import java.util.Map;

/* loaded from: classes.dex */
public interface DatadogService extends ZiplineService {
    void endSpan(String str, String str2, Map map);

    void reportError(String str, Throwable th);

    void startSpan(String str, String str2, Map map);

    void startTrackingView(String str, String str2, Map map);

    void stopTrackingView(String str, Map map);
}
