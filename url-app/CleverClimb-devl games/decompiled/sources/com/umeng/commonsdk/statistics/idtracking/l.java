package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;

/* compiled from: UMTTOneTracker.java */
/* loaded from: classes2.dex */
public class l extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9183a = "umtt1";

    /* renamed from: b, reason: collision with root package name */
    private Context f9184b;

    public l(Context context) {
        super(f9183a);
        this.f9184b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
            if (cls != null) {
                return (String) cls.getMethod("getUmtt1", Context.class).invoke(cls, this.f9184b);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
