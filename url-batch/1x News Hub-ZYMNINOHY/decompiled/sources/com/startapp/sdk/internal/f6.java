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
    public static final int[] f;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3778a;

    /* renamed from: b, reason: collision with root package name */
    public final k4 f3779b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f3780c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3781d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public e6 f3782e;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            arrayList.add(5);
        }
        if (i3 >= 27) {
            arrayList.add(6);
        }
        if (i3 >= 31) {
            arrayList.add(8);
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
        }
        f = iArr;
    }

    public f6(Context context, k4 k4Var) {
        this.f3778a = context;
        this.f3779b = k4Var;
    }

    public final void a() {
        if (this.f3781d.getAndSet(true)) {
            return;
        }
        try {
            int i3 = Build.VERSION.SDK_INT;
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f3778a.getSystemService("connectivity");
            if (connectivityManager != null) {
                connectivityManager.addDefaultNetworkActiveListener(new d6(this));
                this.f3779b.getClass();
                ConnectivityHelperMetadata q3 = MetaData.E().q();
                e6 e6Var = null;
                ConnectivityHelperMetadata.Transport a3 = q3 != null ? q3.a() : null;
                if (a3 != null) {
                    if (si.a(i3, a3.a())) {
                        e6Var = new C0290i(this.f3778a, connectivityManager);
                    } else if (si.a(i3, a3.b())) {
                        e6Var = new m0(this.f3778a, connectivityManager);
                    }
                    if (e6Var != null) {
                        e6Var.b();
                        this.f3782e = e6Var;
                    }
                }
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    public final boolean b() {
        if (p0.a(this.f3778a, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f3778a.getSystemService("connectivity");
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
        synchronized (this.f3780c) {
            try {
                if (!this.f3780c.contains(k9Var)) {
                    this.f3780c.add(k9Var);
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
        int i3 = 0;
        for (int i4 : f) {
            try {
                if (networkCapabilities.hasTransport(i4)) {
                    i3 |= 1 << i4;
                }
            } catch (Throwable unused) {
            }
        }
        return i3;
    }
}
