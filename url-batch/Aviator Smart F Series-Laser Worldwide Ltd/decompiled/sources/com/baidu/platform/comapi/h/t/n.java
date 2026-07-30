package com.baidu.platform.comapi.h.t;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class n extends com.baidu.platform.comapi.walknavi.a {

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences.Editor f9296b = null;

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f9295a = com.baidu.platform.comapi.h.t.q.a.a().getSharedPreferences("walknavi_preference", 0);

    public String a(String str, String str2) {
        return this.f9295a.getString(str, str2);
    }

    public boolean b(String str, boolean z7) {
        SharedPreferences.Editor edit = this.f9295a.edit();
        this.f9296b = edit;
        edit.putBoolean(str, z7);
        return this.f9296b.commit();
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
    }

    public boolean a(String str, boolean z7) {
        return this.f9295a.getBoolean(str, z7);
    }

    public boolean b(String str, String str2) {
        SharedPreferences.Editor edit = this.f9295a.edit();
        this.f9296b = edit;
        edit.putString(str, str2);
        return this.f9296b.commit();
    }
}
