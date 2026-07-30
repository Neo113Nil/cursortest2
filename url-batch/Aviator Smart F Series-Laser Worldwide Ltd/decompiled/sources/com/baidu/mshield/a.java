package com.baidu.mshield;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f8307a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences.Editor f8308b;

    public a(Context context) {
        try {
            SharedPreferences c8 = com.baidu.mshield.sharedpreferences.a.a(context).c("msgzpfc");
            this.f8307a = c8;
            this.f8308b = c8.edit();
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.c(th.getMessage());
        }
    }

    public boolean a() {
        return this.f8307a.getInt("cloud_sw", 0) == 1;
    }

    public int b() {
        return this.f8307a.getInt("wm_in_ma_cco", 3);
    }

    public void a(String str, int i8) {
        this.f8308b.putInt("wm_in_cco" + str, i8);
        this.f8308b.commit();
    }

    public int a(String str) {
        return this.f8307a.getInt("wm_in_cco" + str, 0);
    }
}
