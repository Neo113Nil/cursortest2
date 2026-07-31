package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.Objects;

/* loaded from: classes.dex */
final class xl2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bp2 f14245a;

    /* synthetic */ xl2(bp2 bp2Var, wk2 wk2Var) {
        this.f14245a = bp2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0053  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        int i7;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i8 = 2;
        int i9 = 5;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i8 = type != 9 ? 8 : 7;
                                }
                                i8 = 5;
                            }
                        }
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i8 = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case c4.w0.f2149o /* 7 */:
                        case c4.w0.f2150p /* 8 */:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i8 = 4;
                            break;
                        case 13:
                            i8 = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i8 = 6;
                            break;
                        case 18:
                            break;
                        case 20:
                            if (n13.f8865a >= 29) {
                                i8 = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i8 = 1;
                }
            } catch (SecurityException unused) {
            }
            i7 = n13.f8865a;
            if (i7 >= 29) {
                vj2.a();
                if (i8 == 5) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        Objects.requireNonNull(telephonyManager);
                        ao2 ao2Var = new ao2(this.f14245a, null);
                        if (i7 < 31) {
                            telephonyManager.listen(ao2Var, 1);
                        } else {
                            telephonyManager.listen(ao2Var, 1048576);
                        }
                        telephonyManager.listen(ao2Var, 0);
                        return;
                    } catch (RuntimeException unused2) {
                    }
                }
            }
            i9 = i8;
            bp2.c(this.f14245a, i9);
        }
        i8 = 0;
        i7 = n13.f8865a;
        if (i7 >= 29) {
        }
        i9 = i8;
        bp2.c(this.f14245a, i9);
    }
}
