package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;

/* compiled from: UMTTThreeTracker.java */
/* loaded from: classes2.dex */
public class m extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9185a = "umtt3";

    /* renamed from: b, reason: collision with root package name */
    private Context f9186b;

    public m(Context context) {
        super(f9185a);
        this.f9186b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
            if (cls != null) {
                return (String) cls.getMethod("getUmtt3", Context.class).invoke(cls, this.f9186b);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
