package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;

/* compiled from: UMTTTwoTracker.java */
/* loaded from: classes2.dex */
public class n extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9187a = "umtt2";

    /* renamed from: b, reason: collision with root package name */
    private Context f9188b;

    public n(Context context) {
        super(f9187a);
        this.f9188b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
            if (cls != null) {
                return (String) cls.getMethod("getUmtt2", Context.class).invoke(cls, this.f9188b);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
