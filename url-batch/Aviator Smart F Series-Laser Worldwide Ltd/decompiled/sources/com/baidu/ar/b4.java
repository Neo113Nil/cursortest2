package com.baidu.ar;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class b4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1776a;

    public b4(Context context) {
        this.f1776a = context;
    }

    public String a() {
        SharedPreferences b8 = b();
        return b8 == null ? "" : b8.getString("fea_res_md5", "");
    }

    public final SharedPreferences b() {
        Context context = this.f1776a;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("fea_res_info", 0);
    }

    public void a(String str) {
        SharedPreferences b8 = b();
        if (b8 == null || b8.edit() == null) {
            return;
        }
        b8.edit().putString("fea_res_md5", str).apply();
    }
}
