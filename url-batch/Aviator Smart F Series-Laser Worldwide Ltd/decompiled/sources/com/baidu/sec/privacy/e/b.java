package com.baidu.sec.privacy.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.baidu.sec.privacy.f.e;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile b f10656a;

    /* renamed from: b, reason: collision with root package name */
    public static Context f10657b;

    public b(Context context) {
        f10657b = context;
    }

    public static b a(Context context) {
        if (f10656a == null) {
            synchronized (b.class) {
                f10656a = new b(context);
            }
        }
        return f10656a;
    }

    @SuppressLint({"MissingPermission"})
    public NetworkInfo a() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) f10657b.getSystemService("connectivity");
            if (e.a(f10657b, new String[]{"android.permission.ACCESS_NETWORK_STATE"})) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
            return null;
        }
    }
}
