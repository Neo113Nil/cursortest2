package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class D7 {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f24339e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public long f24340a;

    /* renamed from: b, reason: collision with root package name */
    public long f24341b;

    /* renamed from: c, reason: collision with root package name */
    public long f24342c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24343d;

    public static D7 a(Context context, Executor executor) {
        String[] strArr = f24339e;
        D7 d72 = new D7();
        d72.f24340a = 0L;
        d72.f24341b = 0L;
        d72.f24342c = -1L;
        d72.f24343d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new C7(d72));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return d72;
    }
}
