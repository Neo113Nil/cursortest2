package com.anythink.basead.exoplayer.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.anythink.basead.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8885a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8886b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8887c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8888d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8889e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8890f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8891g = 16;

    /* renamed from: h, reason: collision with root package name */
    private static final int f8892h = 7;
    private static final String i = "Requirements";

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f8893j = null;

    /* renamed from: k, reason: collision with root package name */
    private final int f8894k;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.anythink.basead.exoplayer.scheduler.a$a, reason: collision with other inner class name */
    public @interface InterfaceC0035a {
    }

    private a(int i4, boolean z8, boolean z9) {
        this(i4 | (z8 ? 16 : 0) | (z9 ? 8 : 0));
    }

    private static void e() {
    }

    public final int a() {
        return this.f8894k & 7;
    }

    public final boolean b() {
        return (this.f8894k & 16) != 0;
    }

    public final boolean c() {
        return (this.f8894k & 8) != 0;
    }

    public final int d() {
        return this.f8894k;
    }

    public final String toString() {
        return super.toString();
    }

    public a(int i4) {
        this.f8894k = i4;
    }

    private static boolean a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        if (af.f8503a < 23) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)) ? false : true;
    }

    private boolean b(Context context) {
        int i4;
        boolean z8;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        int i9 = this.f8894k & 7;
        if (i9 == 0) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || ((i4 = af.f8503a) >= 23 && ((activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)))) {
            return false;
        }
        if (i9 == 1) {
            return true;
        }
        if (i9 == 3) {
            return !activeNetworkInfo.isRoaming();
        }
        if (i4 >= 16) {
            z8 = connectivityManager.isActiveNetworkMetered();
        } else {
            int type = activeNetworkInfo.getType();
            z8 = (type == 1 || type == 7 || type == 9) ? false : true;
        }
        if (i9 == 2) {
            return !z8;
        }
        if (i9 == 4) {
            return z8;
        }
        throw new IllegalStateException();
    }

    private boolean c(Context context) {
        if (!b()) {
            return true;
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    private boolean d(Context context) {
        if (!c()) {
            return true;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        int i4 = af.f8503a;
        return i4 >= 23 ? !powerManager.isDeviceIdleMode() : i4 >= 20 ? !powerManager.isInteractive() : !powerManager.isScreenOn();
    }

    private static boolean a(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        if (af.f8503a >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        int type = networkInfo.getType();
        return (type == 1 || type == 7 || type == 9) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0047, code lost:
    
        if (r7.isRoaming() == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0064, code lost:
    
        if (r1 == false) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Context context) {
        boolean z8;
        int i4;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        Intent registerReceiver;
        int intExtra;
        boolean z9;
        int i9 = this.f8894k & 7;
        if (i9 != 0) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && ((i4 = af.f8503a) < 23 || ((activeNetwork = connectivityManager.getActiveNetwork()) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(16)))) {
                if (i9 != 1) {
                    if (i9 != 3) {
                        if (i4 >= 16) {
                            z8 = connectivityManager.isActiveNetworkMetered();
                        } else {
                            int type = activeNetworkInfo.getType();
                            z8 = (type == 1 || type == 7 || type == 9) ? false : true;
                        }
                        if (i9 != 2) {
                            if (i9 != 4) {
                                throw new IllegalStateException();
                            }
                        }
                    }
                    if (z8) {
                        if (!b() || ((registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) != null && ((intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5))) {
                            if (c()) {
                                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                                int i10 = af.f8503a;
                                if (i10 < 23 ? i10 < 20 ? powerManager.isScreenOn() : powerManager.isInteractive() : powerManager.isDeviceIdleMode()) {
                                    z9 = false;
                                    if (!z9) {
                                        return true;
                                    }
                                }
                            }
                            z9 = true;
                            if (!z9) {
                            }
                        }
                    }
                    return false;
                }
            }
            z8 = false;
            if (z8) {
            }
            return false;
        }
        z8 = true;
        if (z8) {
        }
        return false;
    }
}
