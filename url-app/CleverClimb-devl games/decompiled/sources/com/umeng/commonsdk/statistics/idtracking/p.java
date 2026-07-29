package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

/* compiled from: UOPTracker.java */
/* loaded from: classes2.dex */
public class p extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9191a = "uopdta";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9192b = "uop";

    /* renamed from: c, reason: collision with root package name */
    private Context f9193c;

    public p(Context context) {
        super(f9192b);
        this.f9193c = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.f9193c);
        return sharedPreferences != null ? sharedPreferences.getString(f9191a, "") : "";
    }
}
