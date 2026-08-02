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

/* loaded from: classes.dex */
public final class f6 {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f6894f;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6895a;

    /* renamed from: b, reason: collision with root package name */
    public final k4 f6896b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f6897c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f6898d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public e6 f6899e;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            arrayList.add(5);
        }
        if (i4 >= 27) {
            arrayList.add(6);
        }
        if (i4 >= 31) {
            arrayList.add(8);
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        f6894f = iArr;
    }

    public f6(Context context, k4 k4Var) {
        this.f6895a = context;
        this.f6896b = k4Var;
    }

    public final void a() {
        if (this.f6898d.getAndSet(true)) {
            return;
        }
        try {
            int i4 = Build.VERSION.SDK_INT;
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f6895a.getSystemService("connectivity");
            if (connectivityManager != null) {
                connectivityManager.addDefaultNetworkActiveListener(new d6(this));
                this.f6896b.getClass();
                ConnectivityHelperMetadata q4 = MetaData.E().q();
                e6 e6Var = null;
                ConnectivityHelperMetadata.Transport a3 = q4 != null ? q4.a() : null;
                if (a3 != null) {
                    if (si.a(i4, a3.a())) {
                        e6Var = new C0368i(this.f6895a, connectivityManager);
                    } else if (si.a(i4, a3.b())) {
                        e6Var = new m0(this.f6895a, connectivityManager);
                    }
                    if (e6Var != null) {
                        e6Var.b();
                        this.f6899e = e6Var;
                    }
                }
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    public final boolean b() {
        if (p0.a(this.f6895a, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f6895a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        return activeNetworkInfo.isConnected();
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (!si.a(th, RemoteException.class)) {
                    d9.a(th);
                }
            }
        }
        return true;
    }

    public final void a(k9 k9Var) {
        synchronized (this.f6897c) {
            try {
                if (!this.f6897c.contains(k9Var)) {
                    this.f6897c.add(k9Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return 0;
        }
        int i4 = 0;
        for (int i5 : f6894f) {
            try {
                if (networkCapabilities.hasTransport(i5)) {
                    i4 |= 1 << i5;
                }
            } catch (Throwable unused) {
            }
        }
        return i4;
    }
}
