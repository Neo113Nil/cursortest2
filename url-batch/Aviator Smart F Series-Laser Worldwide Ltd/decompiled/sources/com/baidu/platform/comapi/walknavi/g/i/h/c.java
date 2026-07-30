package com.baidu.platform.comapi.walknavi.g.i.h;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10053a;

    public c(Context context) {
        this.f10053a = context;
    }

    public void a(String str) {
        b().edit().putString("ar_sdk_version", str).commit();
    }

    public void b(String str) {
        b().edit().putString("so_version", str).commit();
    }

    public String c() {
        return b().getString("so_version", "");
    }

    private SharedPreferences b() {
        return this.f10053a.getSharedPreferences("ar_so_info", 0);
    }

    public String a() {
        return b().getString("ar_sdk_version", "");
    }
}
