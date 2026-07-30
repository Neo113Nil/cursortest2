package com.baidu.platform.comapi.walknavi.g.i;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10018a;

    public d(Context context) {
        this.f10018a = context;
    }

    public void a(String str, String str2) {
        try {
            a().edit().putString(str, str2).apply();
        } catch (Exception unused) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("saveLocalResourcePath exception");
        }
    }

    public String a(String str) {
        return a().getString(str, "");
    }

    private SharedPreferences a() {
        return this.f10018a.getSharedPreferences("ar_resource_info", 0);
    }
}
