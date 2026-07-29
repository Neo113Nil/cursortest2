package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* compiled from: ImeiTracker.java */
/* loaded from: classes2.dex */
public class e extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9168a = "imei";

    /* renamed from: b, reason: collision with root package name */
    private Context f9169b;

    public e(Context context) {
        super("imei");
        this.f9169b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getImeiNew(this.f9169b);
    }
}
