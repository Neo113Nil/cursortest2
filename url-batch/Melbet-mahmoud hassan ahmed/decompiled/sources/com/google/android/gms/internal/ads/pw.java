package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
abstract class pw<T> {

    /* renamed from: a, reason: collision with root package name */
    private static final xx f10394a;

    static {
        xx xxVar = null;
        try {
            Object newInstance = ow.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    xxVar = queryLocalInterface instanceof xx ? (xx) queryLocalInterface : new vx(iBinder);
                }
            } else {
                io0.g("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            io0.g("Failed to instantiate ClientApi class.");
        }
        f10394a = xxVar;
    }

    pw() {
    }

    private final T e() {
        xx xxVar = f10394a;
        if (xxVar == null) {
            io0.g("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return b(xxVar);
        } catch (RemoteException e7) {
            io0.h("Cannot invoke local loader using ClientApi class.", e7);
            return null;
        }
    }

    private final T f() {
        try {
            return c();
        } catch (RemoteException e7) {
            io0.h("Cannot invoke remote loader.", e7);
            return null;
        }
    }

    protected abstract T a();

    protected abstract T b(xx xxVar);

    protected abstract T c();

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T d(Context context, boolean z6) {
        boolean z7;
        T e7;
        if (!z6) {
            qw.b();
            if (!bo0.n(context, o3.j.f19861a)) {
                io0.b("Google Play Services is not available.");
                z6 = true;
            }
        }
        boolean z8 = false;
        boolean z9 = z6 | (!(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.c(context, ModuleDescriptor.MODULE_ID)));
        m10.c(context);
        if (!x20.f14005a.e().booleanValue()) {
            if (x20.f14006b.e().booleanValue()) {
                z7 = true;
                z8 = true;
                if (z8) {
                    T f7 = f();
                    if (f7 == null) {
                        if (qw.e().nextInt(j30.f6954a.e().intValue()) == 0) {
                            Bundle bundle = new Bundle();
                            bundle.putString("action", "dynamite_load");
                            bundle.putInt("is_missing", 1);
                            qw.b().i(context, qw.c().f10301f, "gmob-apps", bundle, true);
                        }
                    }
                    e7 = f7 == null ? e() : f7;
                } else {
                    e7 = e();
                    if (e7 == null && !z7) {
                        e7 = f();
                    }
                }
                return e7 != null ? a() : e7;
            }
            z8 = z9;
        }
        z7 = false;
        if (z8) {
        }
        if (e7 != null) {
        }
    }
}
