package com.dancingbogo.skyrolline.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.dancingbogo.skyrolline.util.n;

/* compiled from: ServiceConfigManager.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static b f4538c;

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f4539a;

    /* renamed from: b, reason: collision with root package name */
    private c f4540b;

    private b(Context context) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            this.f4539a = context.getSharedPreferences("rolling_sky_service_name", 0);
        }
        this.f4540b = new c(context, "rolling_sky_service_name");
    }

    public static b a(Context context) {
        if (f4538c == null) {
            synchronized (b.class) {
                if (f4538c == null) {
                    f4538c = new b(context);
                }
            }
        }
        return f4538c;
    }

    private SharedPreferences a() {
        com.dancingbogo.skyrolline.c.a.d();
        return this.f4539a;
    }

    public long a(String str, long j) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            return a().getLong(str, j);
        }
        return this.f4540b.a(str, j);
    }

    public boolean a(String str, boolean z) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            return a().getBoolean(str, z);
        }
        return this.f4540b.a(str, z);
    }

    public int a(String str, int i) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            return a().getInt(str, i);
        }
        return this.f4540b.a(str, i);
    }

    public String a(String str, String str2) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            return a().getString(str, str2);
        }
        return this.f4540b.a(str, str2);
    }

    public void b(String str, boolean z) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            SharedPreferences.Editor edit = a().edit();
            edit.putBoolean(str, z);
            n.a(edit);
            return;
        }
        this.f4540b.b(str, z);
    }

    public void b(String str, long j) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            SharedPreferences.Editor edit = a().edit();
            edit.putLong(str, j);
            n.a(edit);
            return;
        }
        this.f4540b.b(str, j);
    }

    public void b(String str, int i) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            SharedPreferences.Editor edit = a().edit();
            edit.putInt(str, i);
            n.a(edit);
            return;
        }
        this.f4540b.b(str, i);
    }

    public void b(String str, String str2) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            SharedPreferences.Editor edit = a().edit();
            edit.putString(str, str2);
            n.a(edit);
            return;
        }
        this.f4540b.b(str, str2);
    }
}
