package com.squareup.cash.treehouse.analytics;

import app.cash.zipline.ZiplineService;

/* loaded from: classes.dex */
public interface RawAnalyticsService extends ZiplineService {
    void track(GenericEvent genericEvent);
}
