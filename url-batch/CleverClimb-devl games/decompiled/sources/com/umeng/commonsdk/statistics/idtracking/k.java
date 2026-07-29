package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;

/* compiled from: UMTTFourTracker.java */
/* loaded from: classes2.dex */
public class k extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9181a = "umtt4";

    /* renamed from: b, reason: collision with root package name */
    private Context f9182b;

    public k(Context context) {
        super(f9181a);
        this.f9182b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
            if (cls != null) {
                return (String) cls.getMethod("getUmtt4", Context.class).invoke(cls, this.f9182b);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
