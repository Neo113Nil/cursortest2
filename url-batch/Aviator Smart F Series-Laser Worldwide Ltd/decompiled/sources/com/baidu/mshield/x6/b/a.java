package com.baidu.mshield.x6.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.baidu.mshield.x6.f.f;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f8500a;

    public a(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("msgzpfc", 4);
            this.f8500a = sharedPreferences;
            sharedPreferences.edit();
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public String a(String str) {
        return this.f8500a.getString(str, "");
    }
}
