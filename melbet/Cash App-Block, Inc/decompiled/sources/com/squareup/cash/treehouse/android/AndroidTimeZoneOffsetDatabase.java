package com.squareup.cash.treehouse.android;

import com.squareup.cash.treehouse.activity.TimeZoneOffsetDatabase;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class AndroidTimeZoneOffsetDatabase implements TimeZoneOffsetDatabase {
    @Override // com.squareup.cash.treehouse.activity.TimeZoneOffsetDatabase
    public final long getTimeZoneOffsetMinutes(double d) {
        return -(TimeZone.getDefault().getOffset((long) d) / 60000);
    }
}
