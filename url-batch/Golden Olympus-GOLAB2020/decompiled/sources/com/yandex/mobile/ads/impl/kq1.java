package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;

/* loaded from: classes3.dex */
public final class kq1 implements Parcelable {
    public static final Parcelable.Creator<kq1> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final int f28307b;

    final class a implements Parcelable.Creator<kq1> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final kq1 createFromParcel(Parcel parcel) {
            return new kq1(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final kq1[] newArray(int i4) {
            return new kq1[i4];
        }
    }

    public kq1(int i4) {
        this.f28307b = (i4 & 2) != 0 ? i4 | 1 : i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r2.hasCapability(16) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Context context) {
        int i4;
        Intent registerReceiver;
        int intExtra;
        if (e()) {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (u82.f32873a >= 24) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null) {
                        try {
                            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                            if (networkCapabilities != null) {
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                }
                if ((this.f28307b & 2) != 0 && connectivityManager.isActiveNetworkMetered()) {
                    i4 = 2;
                    if (c() && ((registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null || ((intExtra = registerReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5))) {
                        i4 |= 8;
                    }
                    if (d()) {
                        Object systemService2 = context.getSystemService("power");
                        systemService2.getClass();
                        PowerManager powerManager = (PowerManager) systemService2;
                        int i5 = u82.f32873a;
                        if (i5 < 23 ? i5 < 20 ? powerManager.isScreenOn() : powerManager.isInteractive() : !powerManager.isDeviceIdleMode()) {
                            i4 |= 4;
                        }
                    }
                    return (f() || context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null) ? i4 : i4 | 16;
                }
            }
            i4 = this.f28307b & 3;
            if (c()) {
                i4 |= 8;
            }
            if (d()) {
            }
            if (f()) {
                return i4;
            }
        }
        i4 = 0;
        if (c()) {
        }
        if (d()) {
        }
        if (f()) {
        }
    }

    public final boolean c() {
        return (this.f28307b & 8) != 0;
    }

    public final boolean d() {
        return (this.f28307b & 4) != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return (this.f28307b & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kq1.class == obj.getClass() && this.f28307b == ((kq1) obj).f28307b;
    }

    public final boolean f() {
        return (this.f28307b & 16) != 0;
    }

    public final int hashCode() {
        return this.f28307b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f28307b);
    }
}
