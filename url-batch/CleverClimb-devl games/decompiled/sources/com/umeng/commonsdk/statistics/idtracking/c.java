package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* compiled from: IDMD5Tracker.java */
/* loaded from: classes2.dex */
public class c extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9160a = "idmd5";

    /* renamed from: b, reason: collision with root package name */
    private Context f9161b;

    public c(Context context) {
        super("idmd5");
        this.f9161b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getDeviceIdUmengMD5(this.f9161b);
    }
}
