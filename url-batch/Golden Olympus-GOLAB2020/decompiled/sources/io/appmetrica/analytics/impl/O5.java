package io.appmetrica.analytics.impl;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class O5 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f38049a = CollectionUtils.createSortedListWithoutRepetitions("id", "session_id", "session_type", "number_in_session", "type", "global_number", CrashHianalyticsData.TIME, "event_description");
}
