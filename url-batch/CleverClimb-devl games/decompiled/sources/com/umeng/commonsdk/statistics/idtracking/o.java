package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;

/* compiled from: UMTTZeroTracker.java */
/* loaded from: classes2.dex */
public class o extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9189a = "umtt0";

    /* renamed from: b, reason: collision with root package name */
    private Context f9190b;

    public o(Context context) {
        super(f9189a);
        this.f9190b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
            if (cls != null) {
                return (String) cls.getMethod("getUmtt0", Context.class).invoke(cls, this.f9190b);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
