package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import c1.InterfaceC0289b;
import i1.InterfaceC0543c;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z implements InterfaceC0289b {

    /* renamed from: m, reason: collision with root package name */
    public static z f4534m;

    /* renamed from: d, reason: collision with root package name */
    public Object f4535d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4536e;

    /* renamed from: i, reason: collision with root package name */
    public Object f4537i;

    /* renamed from: l, reason: collision with root package name */
    public Object f4538l;

    public z(int i2) {
        switch (i2) {
            case 2:
                c2.e eVar = new c2.e();
                q1.h hVar = new q1.h(10);
                this.f4535d = new HashSet();
                this.f4536e = eVar;
                this.f4537i = hVar;
                break;
            default:
                this.f4535d = null;
                this.f4536e = null;
                this.f4537i = null;
                this.f4538l = new ArrayDeque();
                break;
        }
    }

    public static synchronized z a() {
        z zVar;
        synchronized (z.class) {
            try {
                if (f4534m == null) {
                    f4534m = new z(0);
                }
                zVar = f4534m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVar;
    }

    public File b(Context context) {
        ((c2.e) this.f4536e).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public boolean c(Context context) {
        if (((Boolean) this.f4537i) == null) {
            this.f4537i = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f4536e).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f4537i).booleanValue();
    }

    public boolean d(Context context) {
        if (((Boolean) this.f4536e) == null) {
            this.f4536e = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f4536e).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f4536e).booleanValue();
    }

    public void e(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((A4.c) this.f4538l) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    @Override // Q5.a
    public Object get() {
        return new g1.j((Executor) ((Q5.a) this.f4535d).get(), (h1.d) ((Q5.a) this.f4536e).get(), (g1.c) ((D0.j) this.f4537i).get(), (InterfaceC0543c) ((Q5.a) this.f4538l).get());
    }
}
