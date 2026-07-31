package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.RemoteException;
import com.startapp.sdk.adsbase.remoteconfig.ConnectivityHelperMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class w5 {
    public static final int[] f;

    /* renamed from: a, reason: collision with root package name */
    public final Context f478a;
    public final d4 b;
    public final LinkedList c = new LinkedList();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public v5 e;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            arrayList.add(5);
        }
        if (i >= 27) {
            arrayList.add(6);
        }
        if (i >= 31) {
            arrayList.add(8);
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        f = iArr;
    }

    public w5(Context context, d4 d4Var) {
        this.f478a = context;
        this.b = d4Var;
    }

    public final void a() {
        if (this.d.getAndSet(true)) {
            return;
        }
        try {
            int i = Build.VERSION.SDK_INT;
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f478a.getSystemService("connectivity");
            if (connectivityManager != null) {
                connectivityManager.addDefaultNetworkActiveListener(new u5(this));
                this.b.getClass();
                ConnectivityHelperMetadata p = MetaData.A().p();
                v5 v5Var = null;
                ConnectivityHelperMetadata.Transport a2 = p != null ? p.a() : null;
                if (a2 != null) {
                    if (zh.a(i, a2.a())) {
                        v5Var = new i(this.f478a, connectivityManager);
                    } else if (zh.a(i, a2.b())) {
                        v5Var = new j0(this.f478a, connectivityManager);
                    }
                    if (v5Var != null) {
                        v5Var.b();
                        this.e = v5Var;
                    }
                }
            }
        } catch (Throwable th) {
            n8.a(th);
        }
    }

    public final boolean b() {
        if (m0.a(this.f478a, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f478a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        return activeNetworkInfo.isConnected();
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (!zh.a(th, RemoteException.class)) {
                    n8.a(th);
                }
            }
        }
        return true;
    }

    public final void a(u8 u8Var) {
        synchronized (this.c) {
            if (!this.c.contains(u8Var)) {
                this.c.add(u8Var);
            }
        }
    }

    public static int a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return 0;
        }
        int i = 0;
        for (int i2 : f) {
            try {
                if (networkCapabilities.hasTransport(i2)) {
                    i |= 1 << i2;
                }
            } catch (Throwable unused) {
            }
        }
        return i;
    }
}
