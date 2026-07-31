package com.yandex.mobile.ads.impl;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ai2 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai2() {
        super("Empty version attribute");
        Intrinsics.checkNotNullParameter("Empty version attribute", CrashHianalyticsData.MESSAGE);
    }
}
