package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.startapp.sdk.adsbase.remoteconfig.AdvertisingIdResolverMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.d3;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.i0;
import com.startapp.sdk.internal.k5;
import com.startapp.sdk.internal.m0;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.o8;
import com.startapp.sdk.internal.zh;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f159a;
    public final k5 b;
    public final d3 c;
    public final ReentrantLock d;
    public final Condition e;
    public final AtomicReference f;
    public volatile boolean g;
    public volatile int h;
    public final double i;
    public int j;

    public b(Context context, k5 k5Var, d3 d3Var) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.d = reentrantLock;
        this.e = reentrantLock.newCondition();
        this.f = new AtomicReference();
        this.g = true;
        this.h = 0;
        this.i = ((Random) zh.d.a()).nextDouble();
        this.f159a = context;
        this.b = k5Var;
        this.c = d3Var;
    }

    public final boolean a(int i) {
        this.c.getClass();
        AdvertisingIdResolverMetadata f = MetaData.A().f();
        if (f == null || !f.c()) {
            f = null;
        }
        return f != null && this.i < f.b() && (f.a() & i) == i;
    }

    public final void b(int i) {
        if (a(i)) {
            int i2 = this.j;
            if ((i2 & i) == i) {
                return;
            }
            this.j = i2 | i;
            n8 n8Var = new n8(o8.e);
            n8Var.d = "AIR";
            n8Var.e = String.valueOf(i);
            n8Var.a();
        }
    }

    public final void a(boolean z) {
        boolean z2 = false;
        try {
            if (this.d.tryLock()) {
                z2 = true;
                this.g = z;
                if (z && this.h == 0) {
                    this.b.newThread(new a(this)).start();
                    this.h = 1;
                }
                this.d.unlock();
            }
        } catch (Throwable th) {
            try {
                if (a(16)) {
                    n8.a(th);
                }
            } finally {
                if (z2) {
                    this.d.unlock();
                }
            }
        }
    }

    public static h0 b(Context context) {
        i0 i0Var;
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            i0Var = new i0();
            try {
                if (context.bindService(intent, i0Var, 1)) {
                    if (!i0Var.b) {
                        IBinder iBinder = (IBinder) i0Var.f268a.take();
                        if (iBinder != null) {
                            i0Var.b = true;
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            try {
                                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                iBinder.transact(1, obtain, obtain2, 0);
                                obtain2.readException();
                                String readString = obtain2.readString();
                                if (readString != null) {
                                    obtain = Parcel.obtain();
                                    obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                        obtain.writeInt(1);
                                        iBinder.transact(2, obtain, obtain2, 0);
                                        obtain2.readException();
                                        boolean z = obtain2.readInt() != 0;
                                        obtain2.recycle();
                                        obtain.recycle();
                                        h0 h0Var = new h0(readString, "DEVICE", z);
                                        int i = m0.f327a;
                                        try {
                                            context.unbindService(i0Var);
                                        } catch (Throwable unused) {
                                        }
                                        return h0Var;
                                    } finally {
                                    }
                                }
                                throw new RemoteException();
                            } finally {
                            }
                        }
                        throw new IllegalStateException();
                    }
                    throw new IllegalStateException();
                }
                throw new AdvertisingIdResolver$InternalException(2048);
            } catch (Throwable th) {
                th = th;
                int i2 = m0.f327a;
                if (i0Var != null) {
                    try {
                        context.unbindService(i0Var);
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i0Var = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        if (r9.f159a.checkSelfPermission("com.google.android.gms.permission.AD_ID") == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
    
        b(4096);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h0 a() {
        h0 h0Var;
        h0 h0Var2 = (h0) this.f.get();
        if (h0Var2 != null) {
            return h0Var2;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            b(1);
            return h0.d;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.d.tryLock(1000L, TimeUnit.MILLISECONDS)) {
                try {
                    if (!this.g) {
                        h0Var = h0.d;
                    } else {
                        if (this.h == 0) {
                            this.b.newThread(new a(this)).start();
                            this.h = 1;
                        }
                        while (this.h != 2) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (elapsedRealtime2 > 1000) {
                                b(2);
                                h0Var = h0.d;
                            } else {
                                this.e.await(1000 - elapsedRealtime2, TimeUnit.MILLISECONDS);
                            }
                        }
                        h0 h0Var3 = (h0) this.f.get();
                        if (h0Var3 == null) {
                            b(4);
                            h0Var3 = h0.d;
                        } else if ("00000000-0000-0000-0000-000000000000".equals(h0Var3.f255a) && Build.VERSION.SDK_INT >= 31) {
                            try {
                            } catch (Throwable th) {
                                if (a(8192)) {
                                    n8.a(th);
                                }
                            }
                        }
                        this.d.unlock();
                        return h0Var3;
                    }
                    return h0Var;
                } finally {
                    this.d.unlock();
                }
            }
            b(8);
            return h0.d;
        } catch (Throwable th2) {
            if (a(32)) {
                n8.a(th2);
            }
            return h0.d;
        }
    }

    public static h0 a(Context context) {
        Object invoke;
        boolean z = false;
        for (Method method : Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getDeclaredMethods()) {
            if ((method.getModifiers() & 8) == 8) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Context.class) {
                    Field[] declaredFields = method.getReturnType().getDeclaredFields();
                    if (declaredFields.length < 2) {
                        continue;
                    } else {
                        int length = declaredFields.length;
                        int i = 0;
                        Field field = null;
                        Field field2 = null;
                        while (true) {
                            if (i < length) {
                                Field field3 = declaredFields[i];
                                if (field3.getType() != String.class) {
                                    if (field3.getType() != Boolean.TYPE) {
                                        continue;
                                    } else if (field2 == null) {
                                        field2 = field3;
                                    }
                                    i++;
                                } else if (field == null) {
                                    field = field3;
                                    i++;
                                }
                            } else if (field != null && field2 != null && (invoke = method.invoke(null, context)) != null) {
                                field.setAccessible(true);
                                String str = (String) field.get(invoke);
                                field2.setAccessible(true);
                                Boolean bool = (Boolean) field2.get(invoke);
                                if (str != null && str.trim().matches("^\\w{8}-(\\w{4}-){3}\\w{12}$")) {
                                    return new h0(str, "APP", Boolean.TRUE.equals(bool));
                                }
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            throw new AdvertisingIdResolver$InternalException(1024);
        }
        throw new AdvertisingIdResolver$InternalException(512);
    }
}
