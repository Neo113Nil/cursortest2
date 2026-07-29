package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* compiled from: MacTracker.java */
/* loaded from: classes2.dex */
public class f extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9170a = "mac";

    /* renamed from: b, reason: collision with root package name */
    private Context f9171b;

    public f(Context context) {
        super(f9170a);
        this.f9171b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        try {
            return DeviceConfig.getMac(this.f9171b);
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                e.printStackTrace();
            }
            com.umeng.commonsdk.proguard.b.a(this.f9171b, e);
            return null;
        }
    }
}
