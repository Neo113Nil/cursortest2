package com.squareup.cash.treehouse.activity;

import app.cash.zipline.ZiplineService;

/* loaded from: classes.dex */
public interface TimeZoneOffsetDatabase extends ZiplineService {
    long getTimeZoneOffsetMinutes(double d);
}
