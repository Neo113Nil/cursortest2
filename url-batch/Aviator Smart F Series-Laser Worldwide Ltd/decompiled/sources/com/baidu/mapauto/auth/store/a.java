package com.baidu.mapauto.auth.store;

import android.content.Context;
import android.content.SharedPreferences;
import com.baidu.mapauto.auth.base.d;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f7882a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences.Editor f7883b;

    public a(Context context) {
        SharedPreferences sharedPreferences = context == null ? null : context.getSharedPreferences("license_auth", 0);
        this.f7882a = sharedPreferences;
        this.f7883b = sharedPreferences != null ? sharedPreferences.edit() : null;
    }
}
