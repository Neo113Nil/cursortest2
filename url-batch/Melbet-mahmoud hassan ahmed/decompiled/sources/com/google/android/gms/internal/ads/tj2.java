package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class tj2 implements ij2<rj2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f12238a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f12239b;

    public tj2(dc3 dc3Var, Context context) {
        this.f12238a = dc3Var;
        this.f12239b = context;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<rj2> a() {
        return this.f12238a.E(new Callable() { // from class: com.google.android.gms.internal.ads.sj2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return tj2.this.b();
            }
        });
    }

    final /* synthetic */ rj2 b() {
        int i7;
        boolean z6;
        int i8;
        TelephonyManager telephonyManager = (TelephonyManager) this.f12239b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        y2.t.q();
        int i9 = -1;
        if (a3.g2.f(this.f12239b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f12239b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i7 = type;
                i9 = ordinal;
            } else {
                i7 = -1;
            }
            z6 = connectivityManager.isActiveNetworkMetered();
            i8 = i9;
        } else {
            i7 = -2;
            z6 = false;
            i8 = -1;
        }
        y2.t.q();
        return new rj2(networkOperator, i7, a3.g2.c(this.f12239b), phoneType, z6, i8);
    }
}
