package com.ijinshan.cloudconfig.b;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: CommonConfig.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static a f6679d;

    /* renamed from: a, reason: collision with root package name */
    private final String f6680a = "cloudconfig";

    /* renamed from: c, reason: collision with root package name */
    private Context f6682c = com.ijinshan.cloudconfig.c.a.d();

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f6681b = this.f6682c.getSharedPreferences("cloudconfig", 0);

    public static a a() {
        if (f6679d == null) {
            synchronized (a.class) {
                if (f6679d == null) {
                    f6679d = new a();
                }
            }
        }
        return f6679d;
    }

    private a() {
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor edit = this.f6681b.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public String b(String str, String str2) {
        return this.f6681b.getString(str, str2);
    }

    public void a(String str, Long l) {
        SharedPreferences.Editor edit = this.f6681b.edit();
        edit.putLong(str, l.longValue());
        edit.commit();
    }

    public long a(String str, long j) {
        return this.f6681b.getLong(str, j);
    }
}
