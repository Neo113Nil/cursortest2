package com.ironsource;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class li {

    /* renamed from: a, reason: collision with root package name */
    private final C1454e2 f17063a;

    public li(C1454e2 c1454e2) {
        this.f17063a = c1454e2;
    }

    public void a() {
        this.f17063a.a(EnumC1433b2.INIT_SUCCESS, null);
    }

    public void a(int i4, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i4));
        hashMap.put("reason", str);
        this.f17063a.a(EnumC1433b2.INIT_FAILED, hashMap);
    }

    public void a(long j4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        this.f17063a.a(EnumC1433b2.INIT_ENDED, hashMap);
    }

    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2);
        this.f17063a.a(EnumC1433b2.INIT_STARTED, hashMap);
    }
}
