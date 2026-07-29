package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;

/* compiled from: UMTTFiveTracker.java */
/* loaded from: classes2.dex */
public class j extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9179a = "umtt5";

    /* renamed from: b, reason: collision with root package name */
    private Context f9180b;

    public j(Context context) {
        super(f9179a);
        this.f9180b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
            if (cls != null) {
                return (String) cls.getMethod("getUmtt5", Context.class).invoke(cls, this.f9180b);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
